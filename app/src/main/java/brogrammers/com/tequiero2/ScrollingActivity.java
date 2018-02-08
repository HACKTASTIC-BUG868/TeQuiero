package brogrammers.com.tequiero2;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.Arrays;


public class ScrollingActivity extends AppCompatActivity  {
    Button Submit ;
    CheckBox c[] = new CheckBox[25];
    private DatabaseReference mDataBase;
    //  private DatabaseReference mDatabaseget;
    private EditText nametext;
    private EditText emailtext;
    private EditText profile;
    TextView data;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scrolling);// name of intent
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
//        setSupportActionBar(toolbar);
        mDataBase = FirebaseDatabase.getInstance().getReference();


        c[0] = (CheckBox)findViewById(R.id.checkBox);
        c[1] = (CheckBox)findViewById(R.id.checkBox2);
        c[2] = (CheckBox)findViewById(R.id.checkBox3);
        c[3] = (CheckBox)findViewById(R.id.checkBox4);
        c[4] = (CheckBox)findViewById(R.id.checkBox5);
        c[5] = (CheckBox)findViewById(R.id.checkBox6);
        c[6] = (CheckBox)findViewById(R.id.checkBox7);
        c[7] = (CheckBox)findViewById(R.id.checkBox8);
        c[8] = (CheckBox)findViewById(R.id.checkBox9);
        c[9] = (CheckBox)findViewById(R.id.checkBox10);
        c[10] = (CheckBox)findViewById(R.id.checkBox11);
        c[11] = (CheckBox)findViewById(R.id.checkBox12);
        c[12] = (CheckBox)findViewById(R.id.checkBox13);
        c[13] = (CheckBox)findViewById(R.id.checkBox14);
        c[14] = (CheckBox)findViewById(R.id.checkBox15);
        c[15] = (CheckBox)findViewById(R.id.checkBox16);
        c[16] = (CheckBox)findViewById(R.id.checkBox17);
        c[17] = (CheckBox)findViewById(R.id.checkBox18);
        c[18] = (CheckBox)findViewById(R.id.checkBox19);
        c[19] = (CheckBox)findViewById(R.id.checkBox20);
        c[20] = (CheckBox)findViewById(R.id.checkBox21);
        c[21] = (CheckBox)findViewById(R.id.checkBox22);
        c[22] = (CheckBox)findViewById(R.id.checkBox23);
        c[23] = (CheckBox)findViewById(R.id.checkBox24);
        c[24] = (CheckBox)findViewById(R.id.checkBox25);
        nametext = (EditText)findViewById(R.id.nametext);
        emailtext = (EditText)findViewById(R.id.emailtext);
        profile = (EditText)findViewById(R.id.UID);
        Submit = (Button)findViewById(R.id.Submit);

        Submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //   HashMap<String, Object>datamap = new HashMap<String ,Object>();

                int i = 0;
                int match[] = new int[25];
                for(i=0;i<25;i++){
                    if(c[i].isChecked()){
                        match[i]=1;
                        c[i].setChecked(false);
                    }
                    else{
                        match[i] = 0 ;
                    }
                }
                final  String matchingmapasbits = Arrays.toString(match);
                final   String UniqueName = profile.getText().toString().trim();
                // Code to check if Unique Id is already present in firebase , Executing but not getting desired output , hence commented
        /*     mDataBase.addListenerForSingleValueEvent(new ValueEventListener() {
                  @Override
                  public void onDataChange(DataSnapshot dataSnapshot) {
                      if(dataSnapshot.hasChild(UniqueName)){
                          // IT EXSISTS
                          Toast.makeText(ScrollingActivity.this, "The Unique profile name you have added already exsists " +
                                  ", Please give another name ", Toast.LENGTH_LONG).show();
                          profile.setText("");
                      }
                      else{
                          //IT DOESNT EXISTS
                          addData(matchingmapasbits);
                          nametext.setText("");
                          emailtext.setText("");
                          profile.setText("");
                      }
                  }

                  @Override
                  public void onCancelled(DatabaseError databaseError) {

                  }
              });*/
                addData(matchingmapasbits);
                nametext.setText("");
                emailtext.setText("");
                profile.setText("");
             /* datamap.put("Name",name);
              datamap.put("E-MAIl",emaili);
              datamap.put("logic",matchingmapasbits);
              mDataBase.push().setValue(datamap);*/


                // pass the match[] to  firebase and then find the matching percentage
            }
        });

// firebase database data assigning
        // 1. create child object in the root object
        // 2. assign a value to the child object


    }
    public void addData(final String s){
        String UniqueName = profile.getText().toString().trim();
        final String name = nametext.getText().toString().trim();
        final String emaili = emailtext.getText().toString().trim();
        user usertoset = new user(name,emaili,s);
        mDataBase.child("user").child(UniqueName).setValue(usertoset);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_scrolling, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }




}

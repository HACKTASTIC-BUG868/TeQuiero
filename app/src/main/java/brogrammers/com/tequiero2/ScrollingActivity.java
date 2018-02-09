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
import android.widget.RadioButton;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.Arrays;


public class ScrollingActivity extends AppCompatActivity {
    Button Submit ;
    CheckBox c[] = new CheckBox[14];
    private DatabaseReference mDataBase;
    //  private DatabaseReference mDatabaseget;
    private EditText nametext;
    private EditText emailtext;
    private RadioButton malebutton;
    private RadioButton femalebutton;


    //TextView data;

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

        Submit = (Button)findViewById(R.id.Submit);

        Submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //   HashMap<String, Object>datamap = new HashMap<String ,Object>();

                int i = 0;
                int match[] = new int[14];
                for(i=0;i<13;i++){
                    if(c[i].isChecked()){
                        match[i]=1;
                    }
                    else{
                        match[i] = 0 ;
                    }
                }
                final  String matchingmapasbits = Arrays.toString(match);
                //addData(matchingmapasbits);
//                nametext.setText("");
//                emailtext.setText("");
                interestPush(c);
                Toast.makeText(ScrollingActivity.this, "Should work fine", Toast.LENGTH_SHORT).show();


// showProfile() ; // uncomment when searching code done
                // pass the match[] to  firebase and then find the matching percentage
            }
        });

// firebase database data assigning
        // 1. create child object in the root object
        // 2. assign a value to the child object


    }
    public void addData(final String s){
        String Sex;
        if(malebutton.isChecked()){
            Sex = "Male";
            malebutton.setChecked(false);
        }
        else{
            Sex = "Female";
            femalebutton.setChecked(false);
        }
        final String name = nametext.getText().toString().trim();
        String emaili = emailtext.getText().toString().trim();
       // User usertoset = new User(name,emaili,s,Sex);
      //  mDataBase.child("User").child(emaili).setValue(usertoset);
    }
    public void interestPush(CheckBox inp[]){
        for(int i =0 ; i<13 ; i++){

                Helper.log(inp[i].getText().toString());
                Helper.log(Fbase.getDatabaseRef()
                        .child("interests")
                        .child("random")
                        .push().getKey());

        }
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

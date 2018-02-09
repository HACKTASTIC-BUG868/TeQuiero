package brogrammers.com.tequiero2;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.airbnb.lottie.LottieAnimationView;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.ValueEventListener;

public class WelcomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
        final LottieAnimationView animationview = (LottieAnimationView) findViewById(R.id.animation_view);
        animationview.setAnimation("heartbutton.json");
        animationview.loop(true);
        animationview.playAnimation();
        animationview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Your code
                //animationview.pauseAnimation();
                loadApp();

            }
        });
    }

    private void loadApp() {
        User user = AppSharedPrefrence.getInstance(WelcomeActivity.this)
                .getUser();
        if(user != null){
            getDataFromServer(user);
            startActivity(new Intent(WelcomeActivity.this, ScrollingActivity.class));
        }else{
            startActivity(new Intent(WelcomeActivity.this, LoginActivity.class));
        }
    }

    private void getDataFromServer(final User userObject) {
        Fbase.getUserRefrence().child(userObject.getUserId())
                .addListenerForSingleValueEvent(new ValueEventListener() {
                    @Override
                    public void onDataChange(DataSnapshot dataSnapshot) {
                        User user = (User) dataSnapshot.getValue();
                        if(user != null){
                            userObject.setInterestList(user.getInterestList());
                        }
                    }

                    @Override
                    public void onCancelled(DatabaseError databaseError) {
                        Helper.log(databaseError.toString());
                    }
                });
    }
}

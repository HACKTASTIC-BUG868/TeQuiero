package brogrammers.com.tequiero2;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.airbnb.lottie.LottieAnimationView;

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
                startActivity(new Intent(WelcomeActivity.this, MainActivity.class));
            }
        });
    }
}

package brogrammers.com.tequiero2;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.google.android.gms.auth.api.signin.GoogleSignInClient;
import com.google.firebase.auth.FirebaseAuth;

public class HomeActivity extends AppCompatActivity {
    private GoogleSignInClient mGoogleSignInClient;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        Button btnSignOut = findViewById(R.id.sign_out);
        btnSignOut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                signOut();
            }
        });
    }

    public void onClick(View v) {
        Log.e("debug","Signout button clicked");
        switch (v.getId()) {
            // ...
            case R.id.sign_out:
                signOut();
                break;
            // ...
        }
    }
    private void signOut() {
        FirebaseAuth.getInstance().signOut();
        finish();
    }
}

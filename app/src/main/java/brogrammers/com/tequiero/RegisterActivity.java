package brogrammers.com.tequiero;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;

import com.google.firebase.auth.FirebaseAuth;

public class RegisterActivity extends AppCompatActivity {
    // Constants
    public static final String CHAT_PREFS = "ChatPrefs";
    public static final String DISPLAY_NAME_KEY = "username";


    // UI references.
    private AutoCompleteTextView mEmailView;
    private AutoCompleteTextView mUsernameView;
    private EditText mPasswordView;
    private EditText mConfirmPasswordView;

    // Firebase instance variables

    private FirebaseAuth mAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

//        mEmailView = (AutoCompleteTextView) findViewById(R.id.register_email);
//        mPasswordView = (EditText) findViewById(R.id.register_password);
//        mConfirmPasswordView = (EditText) findViewById(R.id.register_confirm_password);
//        mUsernameView = (AutoCompleteTextView) findViewById(R.id.register_username);
//
//        // Keyboard sign in action
//        mConfirmPasswordView.setOnEditorActionListener(new TextView.OnEditorActionListener()
//        {
//            @Override
//            public boolean onEditorAction(TextView textView, int id, KeyEvent keyEvent)
//            {
//                if (id == R.id.register_form_finished || id == EditorInfo.IME_NULL)
//                {
//                    attemptRegistration();
//
//                    return true;
//                }
//                return false;
//            }
//        });
//
//
//        mAuth = FirebaseAuth.getInstance();

    }

    // Executed when Sign Up button is pressed.
//    public void signUp(View v)
//    {
//        attemptRegistration();
//
//    }
//
//    private void attemptRegistration()
//    {
//
//        // Reset errors displayed in the form.
//        mEmailView.setError(null);
//        mPasswordView.setError(null);
//
//        // Store values at the time of the login attempt.
//        String email = mEmailView.getText().toString();
//        String password = mPasswordView.getText().toString();
//
//        boolean cancel = false;
//        View focusView = null;
//
//        // Check for a valid password, if the user entered one.
//        if (!TextUtils.isEmpty(password) && !isPasswordValid(password))
//        {
//            mPasswordView.setError(getString(R.string.error_invalid_password));
//            focusView = mPasswordView;
//            cancel = true;
//        }
//
//        // Check for a valid email address.
//        if (TextUtils.isEmpty(email))
//        {
//            mEmailView.setError(getString(R.string.error_field_required));
//            focusView = mEmailView;
//            cancel = true;
//        } else if (!isEmailValid(email))
//        {
//            mEmailView.setError(getString(R.string.error_invalid_email));
//            focusView = mEmailView;
//            cancel = true;
//        }
//
//        if (cancel)
//        {
//            // There was an error; don't attempt login and focus the first
//            // form field with an error.
//            focusView.requestFocus();
//        } else
//        {
//
//            createfirebaseUser();
//            Toast.makeText(RegisterActivity.this,"Registration Successful",Toast.LENGTH_SHORT).show();
//        }
//    }
//
//    private boolean isEmailValid(String email)
//    {
//
//        return email.contains("@");
//    }
//
//    private boolean isPasswordValid(String password)
//    {
//
//
//        String confirmPassword = mConfirmPasswordView.getText().toString();
//        return (password.equals(confirmPassword) && password.length() >= 6);
//
//
//    }
//
//
//    private void createfirebaseUser()
//    {
//        String email = mEmailView.getText().toString();
//        String password = mPasswordView.getText().toString();
//        mAuth.createUserWithEmailAndPassword(email, password).addOnCompleteListener(this, new OnCompleteListener<AuthResult>()
//        {
//            @Override
//            public void onComplete(@NonNull Task<AuthResult> task)
//            {
//                Log.d("ChatApp", "User Added" + task.isSuccessful());
//
//                if (!task.isSuccessful())
//                {
//                    Log.e("ChatApp", "User creation failed ");
//                    showAlertDialog("User Already registered.");
//                } else
//                {
//                    saveDisplayName();
//                    Intent intent = new Intent(RegisterActivity.this, LoginActivity.class);
//                    finish();
//                    startActivity(intent);
//                }
//            }
//        });
//    }
//
//
//    private void saveDisplayName()
//    {
//        String displayName = mUsernameView.getText().toString();
//        SharedPreferences preferences = getSharedPreferences(CHAT_PREFS, 0);
//        preferences.edit().putString(DISPLAY_NAME_KEY, displayName).apply();
//    }
//
//
//
//    private void showAlertDialog(String message)
//    {
//        new AlertDialog.Builder(this)
//                .setTitle("User Creation Failed")
//                .setMessage(message)
//                .setPositiveButton(android.R.string.ok, null)
//                .setIcon(android.R.drawable.ic_dialog_alert)
//                .show();
//    }
}

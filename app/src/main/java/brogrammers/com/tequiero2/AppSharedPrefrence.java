package brogrammers.com.tequiero2;

import android.content.Context;
import android.content.SharedPreferences;

import com.google.gson.Gson;

/**
 * Created by joshi on 08/02/2018.
 */

public class AppSharedPrefrence {
    private static final String PREF_NAME = "pref_name";
    private static final String PREF_USER = "pref_user";
    private static AppSharedPrefrence mInstance;
    private SharedPreferences mSharedPreferences;

    private AppSharedPrefrence(Context context) {
        mSharedPreferences = context.getSharedPreferences(PREF_NAME, Context.MODE_PRIVATE);

    }

    public static AppSharedPrefrence getInstance(Context context) {
        if(mInstance == null) {
            mInstance = new AppSharedPrefrence(context);
        }
        return mInstance;
    }


    public void saveUser(User userObject) {
        mSharedPreferences.edit().putString(PREF_USER, new Gson().toJson(userObject)).apply();
    }

    public User getUser() {
        try {
            return new Gson().fromJson(mSharedPreferences
                    .getString(PREF_USER, ""), User.class);
        }catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}

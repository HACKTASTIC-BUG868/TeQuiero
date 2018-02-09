package brogrammers.com.tequiero2;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

/**
 * Created by joshi on 08/02/2018.
 */

public class Fbase {
    public static DatabaseReference getDatabaseRef() {
        return FirebaseDatabase.getInstance().getReference("https://tequiro-1c81e.firebaseio.com/");
    }

    public static DatabaseReference getUserRefrence() {
        return FirebaseDatabase.getInstance().getReference().child("User");
    }


}

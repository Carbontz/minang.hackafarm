package reza.minang.hackafarm;

import android.content.Intent;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class Menu_Activity extends AppCompatActivity {

    TextView tvSelamatDatang, tvUser;
    Spinner spListLadang,spUrutanLadang;
    Button btnCheck,btnLogout;
    Bundle bundle;
    FirebaseAuth mAuth;
    FirebaseAuth.AuthStateListener mAuthListener;
    FirebaseUser user = FirebaseAuth.getInstance().getCurrentUser();
    private String TAG;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        tvSelamatDatang = (TextView) findViewById(R.id.tvWelcome);
        tvUser = (TextView) findViewById(R.id.tvUser);
        spListLadang = (Spinner) findViewById(R.id.spListLadang);
        spUrutanLadang = (Spinner) findViewById(R.id.spUrutanLadang);
        btnCheck = (Button) findViewById(R.id.btnCheck);
        btnLogout = (Button) findViewById(R.id.btnLogOut);
        bundle = new Bundle();

        //session code firebase untuk user part 1
        mAuth = FirebaseAuth.getInstance();
        mAuthListener = new FirebaseAuth.AuthStateListener() {
            @Override
            public void onAuthStateChanged(@NonNull FirebaseAuth firebaseAuth) {
                FirebaseUser user = firebaseAuth.getCurrentUser();
                if (user != null) {
                    // User is signed in
                    Log.d(TAG, "onAuthStateChanged:signed_in:" + user.getUid());
                } else {
                    // User is signed out
                    Log.d(TAG, "onAuthStateChanged:signed_out");
                }
            }
        };

        //info user sekarang
        if (user != null) {
            // Name, email address, and profile photo Url
            String name = user.getEmail();
            tvUser.setText(name);

            // The user's ID, unique to the Firebase project. Do NOT use this value to
            // authenticate with your backend server, if you have one. Use
            // FirebaseUser.getToken() instead.
            String uid = user.getUid();
        }



        btnCheck.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String jenisLadang = spListLadang.getSelectedItem().toString();
                String posisiLadang = spUrutanLadang.getSelectedItem().toString();
                Intent pindah = new Intent(getApplicationContext(),Ladang_Activity.class);

                //transfer nilai antar activity
                bundle.putString("ladang",jenisLadang);
                bundle.putString("urutan",posisiLadang);
                pindah.putExtras(bundle);
                startActivity(pindah);
            }
        });

        btnLogout.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                FirebaseAuth.getInstance().signOut();
                startActivity(new Intent(getApplicationContext(), Login_Activity.class));
                finish();
            }
        });
    }

    //session code untuk firebase user part 2
    @Override
    protected void onStart() {
        super.onStart();
        mAuth.addAuthStateListener(mAuthListener);
    }

    @Override
    protected void onStop() {
        super.onStop();
        if (mAuthListener != null) {
            mAuth.removeAuthStateListener(mAuthListener);
        }
    }
}


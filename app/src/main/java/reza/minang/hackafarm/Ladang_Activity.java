package reza.minang.hackafarm;

import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.jjoe64.graphview.GraphView;

public class Ladang_Activity extends AppCompatActivity {

    TextView tvKelembabanUdara,tvKelembabanTanah ,tvHujan,tvStatusHujan,tvKondisiAir,tvStatusAir,tvFoto,tvWaktuFoto;
    ImageView ivLadang;
    Button btnFoto;
    GraphView graphKelembabanUdara,graphKelembabanTanah;
    private String TAG;

    //firebase
    FirebaseAuth mAuth;
    FirebaseAuth.AuthStateListener mAuthListener;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ladang);

        tvKelembabanUdara = (TextView) findViewById(R.id.tvKelembabanUdara);
        tvKelembabanTanah = (TextView) findViewById(R.id.tvKelembabanTanah);
        tvHujan           = (TextView) findViewById(R.id.tvHujan);
        tvStatusHujan     = (TextView) findViewById(R.id.tvStatusHujan);
        tvKondisiAir      = (TextView) findViewById(R.id.tvKondisiAir);
        tvStatusAir       = (TextView) findViewById(R.id.tvStatusAir);
        tvFoto            = (TextView) findViewById(R.id.tvFoto);
        tvWaktuFoto       = (TextView) findViewById(R.id.tvWaktuFoto);
        ivLadang          = (ImageView) findViewById(R.id.ivLadang);
        btnFoto             = (Button) findViewById(R.id.btnFoto);
        graphKelembabanUdara = (GraphView) findViewById(R.id.graphKelembabanUdara);
        graphKelembabanTanah = (GraphView) findViewById(R.id.graphKelembabanTanah);
        
        //firebase code
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


    }

}

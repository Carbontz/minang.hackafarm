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
import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.StorageReference;
import com.jjoe64.graphview.GraphView;
import com.jjoe64.graphview.series.DataPoint;
import com.jjoe64.graphview.series.LineGraphSeries;

public class Ladang_Activity extends AppCompatActivity {

    TextView tvLadang,tvLadangKe,tvKelembabanUdara,tvKelembabanTanah ,tvHujan,tvStatusHujan,tvKondisiAir,tvStatusAir,tvFoto,tvWaktuFoto;
    ImageView ivLadang;
    Button btnFoto;
    GraphView graphKelembabanUdara,graphKelembabanTanah;
    private String TAG;

    //firebase
    FirebaseAuth mAuth;
    FirebaseAuth.AuthStateListener mAuthListener;
    StorageReference mStorageRef;

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
        tvLadang          = (TextView) findViewById(R.id.tvLadang);
        tvLadangKe        = (TextView) findViewById(R.id.tvLadangKe);
        ivLadang          = (ImageView) findViewById(R.id.ivLadang);
        btnFoto             = (Button) findViewById(R.id.btnFoto);
        graphKelembabanUdara = (GraphView) findViewById(R.id.graphKelembabanUdara);
        graphKelembabanTanah = (GraphView) findViewById(R.id.graphKelembabanTanah);

        //contoh
        LineGraphSeries<DataPoint> series = new LineGraphSeries<>(new DataPoint[] {
                new DataPoint(0, 1),
                new DataPoint(1, 5),
                new DataPoint(2, 3),
                new DataPoint(3, 2),
                new DataPoint(4, 6)
        });
        graphKelembabanUdara.addSeries(series);

        //storage foto firebase
        mStorageRef          = FirebaseStorage.getInstance().getReference();

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

        //ambil nilai dari activity sebelumnya dan pasang di atas
        Bundle bundle = getIntent().getExtras();
        String ladang = bundle.getString("ladang");
        String urutan = bundle.getString("urutan");
        tvLadang.setText("Ladang "+ladang);


    }

}

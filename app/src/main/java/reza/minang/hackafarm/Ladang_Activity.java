package reza.minang.hackafarm;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.jjoe64.graphview.GraphView;

import org.w3c.dom.Text;

public class Ladang_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ladang);

        TextView tvKelembabanUdara = (TextView) findViewById(R.id.tvKelembabanUdara);
        TextView tvKelembabanTanah = (TextView) findViewById(R.id.tvKelembabanTanah);
        TextView tvHujan           = (TextView) findViewById(R.id.tvHujan);
        TextView tvStatusHujan     = (TextView) findViewById(R.id.tvStatusHujan);
        TextView tvKondisiAir      = (TextView) findViewById(R.id.tvKondisiAir);
        TextView tvStatusAir       = (TextView) findViewById(R.id.tvStatusAir);
        TextView tvFoto            = (TextView) findViewById(R.id.tvFoto);
        TextView tvWaktuFoto       = (TextView) findViewById(R.id.tvWaktuFoto);
        ImageView ivLadang         = (ImageView) findViewById(R.id.ivLadang);
        Button btnFoto             = (Button) findViewById(R.id.btnFoto);
        GraphView graphKelembabanUdara = (GraphView) findViewById(R.id.graphKelembabanUdara);
        GraphView graphKelembabanTanah = (GraphView) findViewById(R.id.graphKelembabanTanah);

    }
}

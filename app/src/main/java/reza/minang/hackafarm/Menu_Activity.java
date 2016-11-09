package reza.minang.hackafarm;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

public class Menu_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        TextView tvSelamatDatang = (TextView) findViewById(R.id.tvWelcome);
        TextView tvUser = (TextView) findViewById(R.id.tvUser);
        Spinner spListLadang = (Spinner) findViewById(R.id.spListLadang);
        Button btnCheck = (Button) findViewById(R.id.btnCheck);

        btnCheck.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),Ladang_Activity.class));
            }
        });
    }
}

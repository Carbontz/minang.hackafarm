package reza.minang.hackafarm;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import static android.R.attr.animation;

public class Loading_Activity extends AppCompatActivity {

    public Loading_Activity() {
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loading);

        ImageView gambarLoading = (ImageView) findViewById(R.id.ivLoading);
        TextView judulLoading = (TextView) findViewById(R.id.tvJudulLoading);

        //animasi
        Animation animFadein = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_in);

        /*gambarLoading.setAnimation(animFadein);
        judulLoading.setAnimation(animFadein);
        animFadein.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {

            }

            @Override
            public void onAnimationEnd(Animation animation) {
                finish();
                startActivity(new Intent(getApplicationContext(),Login_Activity.class));
            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });
        */

        gambarLoading.setVisibility(View.VISIBLE);
        gambarLoading.startAnimation(animFadein);

        judulLoading.setVisibility(View.VISIBLE);
        judulLoading.startAnimation(animFadein);

        startActivity(new Intent(getApplicationContext(),Login_Activity.class));

    }
}

package digitalsoftware.com.loginfullscreenanimation;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {
    ConstraintLayout bg_gradient;
    AnimationDrawable animationDrawable;
    LinearLayout LL1;

    Animation bottom_to_top;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //load animation
        bottom_to_top = AnimationUtils.loadAnimation(this, R.anim.bottom_to_top);


        //load element
        bg_gradient = (ConstraintLayout) findViewById(R.id.bg_gradient);
        LL1 = (LinearLayout) findViewById(R.id.LL1);

        //run animation
        LL1.startAnimation(bottom_to_top);

        bg_gradient.setBackgroundResource(R.drawable.bg_gradient_animation_gabungan123);
        animationDrawable = (AnimationDrawable) bg_gradient.getBackground();
        animationDrawable.setEnterFadeDuration(3000);
        animationDrawable.setExitFadeDuration(3000);
        animationDrawable.start();

    }

}

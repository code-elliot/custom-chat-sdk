package chat.codebucket.in.activities;

import android.content.Intent;
import android.os.Handler;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import chat.codebucket.in.R;
import chat.codebucket.in.utils.Helper;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        final Helper helper = new Helper(this);
        new Handler().postDelayed(() -> {
            if (!Helper.DISABLE_SPLASH_HANDLER) {
                startActivity(new Intent(SplashActivity.this, helper.getLoggedInUser() != null ? MainActivity.class : VerificationActivity.class));
            }
            Helper.DISABLE_SPLASH_HANDLER = false;
            finish();
        }, 1500);
    }
}

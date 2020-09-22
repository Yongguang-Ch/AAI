package asiacom_americas.com.aai;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import asiacom_americas.com.aai.ui.login.LoginActivity;

public class LauncherActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_launcher);

        Intent activityIntent;
        boolean isLoggedIn= true;
        //Util.getToken() != null
        //go straight to main if a token is stored
        if(isLoggedIn) {
            activityIntent = new Intent(this, AttendanceActivity.class);
        }else{
            activityIntent = new Intent(this, LoginActivity.class);
        }

        startActivity(activityIntent);
        finish();
    }
}
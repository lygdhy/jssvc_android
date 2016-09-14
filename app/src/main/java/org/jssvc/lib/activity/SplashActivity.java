package org.jssvc.lib.activity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import org.jssvc.lib.R;
import org.jssvc.lib.base.BaseActivity;

/**
 * APP启动页面
 */
public class SplashActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        Handler handler = new Handler();
        handler.postDelayed(new splashhandler(), 3000);//静态启动页
    }

    class splashhandler implements Runnable {
        public void run() {
            startActivity(new Intent(context, MainActivity.class));
            finish();
        }
    }
}

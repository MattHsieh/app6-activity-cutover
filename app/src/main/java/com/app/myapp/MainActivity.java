package com.app.myapp;

import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    final static private int LAUNCH_GAME = 0;
    private TextView mTxtResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnLaunchGame = findViewById(R.id.btnLaunchGame);
        btnLaunchGame.setOnClickListener(btnLaunchGameOnClick);

        mTxtResult = findViewById(R.id.txtResult);
    }


    private View.OnClickListener btnLaunchGameOnClick =
            new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent it = new Intent();
            it.setClass(MainActivity.this, GameActivity.class);
            startActivityForResult(it, LAUNCH_GAME);
        }
    };
}

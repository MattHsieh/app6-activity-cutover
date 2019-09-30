package com.app.myapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class GameActivity extends AppCompatActivity {

    private TextView mTxtResult;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);
        mTxtResult = findViewById(R.id.txtResult);
        Button btnCloseGame = findViewById(R.id.btnCloseGame);
        btnCloseGame.setOnClickListener(btnCloseGameOnClick);
    }




    private View.OnClickListener btnCloseGameOnClick = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent it = new Intent();

            Bundle bundle = new Bundle();
            it.putExtras(bundle);

            setResult(RESULT_OK, it);
            finish();
        }
    };
}

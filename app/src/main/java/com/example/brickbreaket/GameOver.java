package com.example.brickbreaket;

import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class GameOver extends AppCompatActivity {

    TextView tvPoints;
    ImageView ivNewHeighest;
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.game_over);
        ivNewHeighest = findViewById(R.id.ivNewHeighest);
        tvPoints=findViewById(R.id.tvPoints);
        int poin = getIntent().getExtras().getInt("poin");
        if (poin == 240){
            ivNewHeighest.setVisibility(View.VISIBLE);
        }
        tvPoints.setText(""+ poin);
    }
    public void restart(View view){
        Intent intent = new Intent(GameOver.this, MainActivity.class);
        startActivity(intent);
        finish();
    }
    public void exit(View view){
        finish();
    }
}

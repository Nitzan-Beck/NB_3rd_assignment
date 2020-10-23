package com.example.nb_3rd_assignment;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<Integer>player1=new ArrayList<>();
        ArrayList<Integer>player2=new ArrayList<>();
    }

    public void proccessGame(View view) {
        Button chooseBtn=(Button) view;
        chooseBtn.setText("X");
        chooseBtn.setBackgroundResource(R.color.XOColor);
        chooseBtn.setEnabled(false);
        int cellNo=0;
        if (chooseBtn.getId()==R.id.btn1) {
            cellNo = 1;
        }
        if (chooseBtn.getId()==R.id.btn2) {
            cellNo = 2;
        }
        if (chooseBtn.getId()==R.id.btn3) {
            cellNo = 3;
        }
        if (chooseBtn.getId()==R.id.btn4) {
            cellNo = 4;
        }
        if (chooseBtn.getId()==R.id.btn5) {
            cellNo = 5;
        }
        if (chooseBtn.getId()==R.id.btn6) {
            cellNo = 6;
        }
        if (chooseBtn.getId()==R.id.btn7) {
            cellNo = 7;
        }
        if (chooseBtn.getId()==R.id.btn8) {
            cellNo = 8;
        }
        if (chooseBtn.getId()==R.id.btn9) {
            cellNo = 9;
        }
    }
}

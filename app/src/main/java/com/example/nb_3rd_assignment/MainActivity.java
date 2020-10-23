package com.example.nb_3rd_assignment;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity {
    ArrayList<Integer> player1 =new ArrayList<>();
    ArrayList<Integer> player2 =new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
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
        player1.add(cellNo);
        if(isGameOver(player1)) {
            displayWinner("User");
        }
    }
    public boolean isGameOver(ArrayList<Integer> player){
        ArrayList<Integer>row1=new ArrayList<>(Arrays.asList(1,2,3));
        ArrayList<Integer>row2=new ArrayList<>(Arrays.asList(4,5,6));
        ArrayList<Integer>row3=new ArrayList<>(Arrays.asList(7,8,9));
        ArrayList<Integer>column1=new ArrayList<>(Arrays.asList(1,4,7));
        ArrayList<Integer>column2=new ArrayList<>(Arrays.asList(2,5,8));
        ArrayList<Integer>column3=new ArrayList<>(Arrays.asList(3,6,9));
        ArrayList<Integer>slant1=new ArrayList<>(Arrays.asList(1,5,9));
        ArrayList<Integer>slant2=new ArrayList<>(Arrays.asList(3,5,7));
        if (player.containsAll(row1)||player.containsAll(row2)||player.containsAll(row3)||player.containsAll(column1)||player.containsAll(column2)||player.containsAll(column3)||player.containsAll(slant1)||player.containsAll(slant2))
            return true;
        else return false;
    }
    private  void displayWinner(String Winner){
        AlertDialog.Builder adb=new AlertDialog.Builder(this);
        adb.setTitle("The winner is:");
        adb.setPositiveButton("Ok",null);
        adb.create().show();
    }

}

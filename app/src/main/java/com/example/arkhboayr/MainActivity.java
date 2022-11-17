package com.example.arkhboayr;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {


    Boolean XO=true;
    Boolean isStarted=true;
    Boolean ret=true;
    Integer count =0;

    Button btn00;
    Button btn01;
    Button btn02;
    Button btn10;
    Button btn11;
    Button btn12;
    Button btn20;
    Button btn21;
    Button btn22;
    Button btnStart;
    TextView outGame;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn00 = (Button)findViewById(R.id.btn00);
        btn01= (Button)findViewById(R.id.btn01);
        btn02 = (Button)findViewById(R.id.btn02);
        btn10 = (Button)findViewById(R.id.btn10);
        btn11 = (Button)findViewById(R.id.btn11);
        btn12 = (Button)findViewById(R.id.btn12);
        btn20 = (Button)findViewById(R.id.btn20);
        btn21 = (Button)findViewById(R.id.btn21);
        btn22 = (Button)findViewById(R.id.btn22);
        btnStart = (Button)findViewById(R.id.btnStart);
        outGame = (TextView) findViewById(R.id.outGame);

    }
    public void onCLick(View v)
    {
        if (isStarted) {


            Button vv = (Button) v;
            if (XO) {
                vv.setText("X");
                outGame.setText("ходит О");

            } else {
                vv.setText("O");
                outGame.setText("ходит Х");
            }
            vv.setEnabled(false);
            XO = !XO;
            if (count==8)
            {
                outGame.setText("Ничья");
            }

            if (btn00.getText().toString() == btn01.getText().toString()&& btn00.getText().toString()==btn02.getText().toString()&&btn00.getText().toString().length()!=0)
            {
                outGame.setText(btn00.getText().toString()+" Выиграл");
                btn00.setBackgroundResource(R.color.purple_700);
                btn01.setBackgroundResource(R.color.purple_700);
                btn02.setBackgroundResource(R.color.purple_700);
                isStarted=!isStarted;
            }
            if (btn10.getText().toString() == btn11.getText().toString()&& btn10.getText().toString()==btn12.getText().toString()&&btn10.getText().toString().length()!=0)
            {
                outGame.setText(btn10.getText().toString()+" Выиграл");
                isStarted=!isStarted;
                btn10.setBackgroundResource(R.color.purple_700);
                btn11.setBackgroundResource(R.color.purple_700);
                btn12.setBackgroundResource(R.color.purple_700);
            }
            if (btn20.getText().toString() == btn21.getText().toString()&& btn20.getText().toString()==btn22.getText().toString()&&btn20.getText().toString().length()!=0)
            {
                outGame.setText(btn20.getText().toString()+" Выиграл");
                isStarted=!isStarted;
                btn20.setBackgroundResource(R.color.purple_700);
                btn21.setBackgroundResource(R.color.purple_700);
                btn22.setBackgroundResource(R.color.purple_700);
            }//
            if (btn00.getText().toString() == btn10.getText().toString()&& btn00.getText().toString()==btn20.getText().toString()&&btn00.getText().toString().length()!=0)
            {
                outGame.setText(btn00.getText().toString()+" Выиграл");
                isStarted=!isStarted;
                btn00.setBackgroundResource(R.color.purple_700);
                btn10.setBackgroundResource(R.color.purple_700);
                btn20.setBackgroundResource(R.color.purple_700);
            }
            if (btn01.getText().toString() == btn11.getText().toString()&& btn01.getText().toString()==btn21.getText().toString()&&btn01.getText().toString().length()!=0)
            {
                outGame.setText(btn01.getText().toString()+" Выиграл");
                isStarted=!isStarted;
                btn01.setBackgroundResource(R.color.purple_700);
                btn11.setBackgroundResource(R.color.purple_700);
                btn21.setBackgroundResource(R.color.purple_700);
            }
            if (btn02.getText().toString() == btn12.getText().toString()&& btn02.getText().toString()==btn22.getText().toString()&&btn02.getText().toString().length()!=0)
            {
                outGame.setText(btn02.getText().toString()+" Выиграл");
                isStarted=!isStarted;
                btn02.setBackgroundResource(R.color.purple_700);
                btn12.setBackgroundResource(R.color.purple_700);
                btn22.setBackgroundResource(R.color.purple_700);
            }//
            if (btn00.getText().toString() == btn11.getText().toString()&& btn00.getText().toString()==btn22.getText().toString()&&btn00.getText().toString().length()!=0)
            {
                outGame.setText(btn00.getText().toString()+" Выиграл");
                isStarted=!isStarted;
                btn00.setBackgroundResource(R.color.purple_700);
                btn11.setBackgroundResource(R.color.purple_700);
                btn22.setBackgroundResource(R.color.purple_700);
            }
            if (btn02.getText().toString() == btn11.getText().toString()&& btn02.getText().toString()==btn20.getText().toString()&&btn02.getText().toString().length()!=0)
            {
                outGame.setText(btn02.getText().toString()+" Выиграл");
                isStarted=!isStarted;
                btn02.setBackgroundResource(R.color.purple_700);
                btn11.setBackgroundResource(R.color.purple_700);
                btn20.setBackgroundResource(R.color.purple_700);
            }

            count++;

        }
    }

    public void onClickStart(View v)
    {

            Intent act = new Intent(this, MainActivity.class);
            startActivity(act);


    }

}
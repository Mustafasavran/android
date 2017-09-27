package com.example.mustafa.tictactoe;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    Button b1,b2,b3,b4,b5,b6,b7,b8,b9;
    String sıra;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sıra="X";

        //butonları tanımlayalım
        b1=(Button) findViewById(R.id.button);
        b2=(Button) findViewById(R.id.button2);
        b3=(Button) findViewById(R.id.button3);
        b4=(Button) findViewById(R.id.button4);
        b5=(Button) findViewById(R.id.button5);
        b6=(Button) findViewById(R.id.button6);
        b7=(Button) findViewById(R.id.button7);
        b8=(Button) findViewById(R.id.button8);
        b9=(Button) findViewById(R.id.button9);
        //butonları dinleyelim

        b1.setOnClickListener(this);
        b2.setOnClickListener(this);
        b3.setOnClickListener(this);
        b4.setOnClickListener(this);
        b5.setOnClickListener(this);
        b6.setOnClickListener(this);
        b7.setOnClickListener(this);
        b8.setOnClickListener(this);
        b9.setOnClickListener(this);


    }
    public void onClick(View v){
        if(b1.getId()==v.getId()){
            b1.setText(sıra);
            b1.setClickable(false);
            b1.setBackgroundColor(Color.GRAY);





        }
        if(b2.getId()==v.getId()){
            b2.setText(sıra);
            b2.setClickable(false);
            b2.setBackgroundColor(Color.GRAY);





        }
        if(b3.getId()==v.getId()){
            b3.setText(sıra);
            b3.setClickable(false);
            b3.setBackgroundColor(Color.GRAY);





        }
        if(b4.getId()==v.getId()){
            b4.setText(sıra);
            b4.setClickable(false);
            b4.setBackgroundColor(Color.GRAY);





        }
        if(b6.getId()==v.getId()){
            b6.setText(sıra);
            b6.setClickable(false);
            b6.setBackgroundColor(Color.GRAY);




        }
        if(b5.getId()==v.getId()){
            b5.setText(sıra);
            b5.setClickable(false);
            b5.setBackgroundColor(Color.GRAY);





        }
        if(b7.getId()==v.getId()){
            b7.setText(sıra);
            b7.setClickable(false);
            b7.setBackgroundColor(Color.GRAY);




        }
        if(b8.getId()==v.getId()){
            b8.setText(sıra);
            b8.setClickable(false);
            b8.setBackgroundColor(Color.GRAY);




        }
        if(b9.getId()==v.getId()){
            b9.setText(sıra);
            b9.setClickable(false);
            b9.setBackgroundColor(Color.GRAY);






        }

        kontrol();
        if(sıra.equals("X"))
            sıra="O";
        else
            sıra="X";






    }
    private void kontrol(){

        if((b1.getText().equals(b2.getText())&&b1.getText().equals(b3.getText())&&!b1.getText().equals(""))
                ||(b4.getText().equals(b5.getText())&&b4.getText().equals(b6.getText())&&!b4.getText().equals(""))||
                (b7.getText().equals(b8.getText())&&b7.getText().equals(b9.getText())&&!b7.getText().equals(""))

                ||(b1.getText().equals(b5.getText())&&b1.getText().equals(b9.getText())&&!b1.getText().equals(""))
                ||(b3.getText().equals(b5.getText())&&b3.getText().equals(b7.getText())&&!b3.getText().equals(""))
                ||(b1.getText().equals(b4.getText())&&b1.getText().equals(b7.getText())&&!b1.getText().equals(""))
                ||(b2.getText().equals(b5.getText())&&b2.getText().equals(b8.getText())&&!b2.getText().equals(""))
                ||(b3.getText().equals(b6.getText())&&b3.getText().equals(b9.getText())&&!b3.getText().equals(""))){

            Toast.makeText(getApplicationContext(),sıra+" kazandı.",Toast.LENGTH_LONG).show();
            b1.setClickable(false);
            b2.setClickable(false);
            b3.setClickable(false);
            b4.setClickable(false);
            b5.setClickable(false);
            b6.setClickable(false);
            b7.setClickable(false);
            b8.setClickable(false);
            b9.setClickable(false);
            b1.setBackgroundColor(Color.GRAY);
            b2.setBackgroundColor(Color.GRAY);
            b3.setBackgroundColor(Color.GRAY);
            b4.setBackgroundColor(Color.GRAY);
            b5.setBackgroundColor(Color.GRAY);
            b6.setBackgroundColor(Color.GRAY);
            b7.setBackgroundColor(Color.GRAY);
            b8.setBackgroundColor(Color.GRAY);
            b9.setBackgroundColor(Color.GRAY);






        }




    }

}

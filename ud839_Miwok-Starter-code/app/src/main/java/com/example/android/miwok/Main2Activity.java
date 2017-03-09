package com.example.android.miwok;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {
Button btn;
    EditText et;
    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Intent intent = getIntent();

        btn=(Button)findViewById(R.id.button2);
        et=(EditText)findViewById(R.id.editText);
        tv=(TextView)findViewById(R.id.textView);


        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String s = et.getText().toString();

                if (s.equals("winter")){
                    tv.setText("WINTER");
                    tv.setBackgroundColor(0xffcccccc);
                }
                else if(s.equals("spring")){
                    tv.setText("SPRING");
                    tv.setBackgroundColor(0xff00ff00);
                }
                else if(s.equals("summer")){
                    tv.setText("SUMMER");
                    tv.setBackgroundColor(0xff0000ff);
                }
                else if(s.equals("autumn")){
                    tv.setText("AUTUMN");
                    tv.setBackgroundColor(0xffffff00);
                }
                else{
                    tv.setText("It's noty season. Try again");
                }



            }
        });

    }
}

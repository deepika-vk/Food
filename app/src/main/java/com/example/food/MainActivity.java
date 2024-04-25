package com.example.food;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

 CheckBox c1,c2,c3,c4;
 Button order;
 TextView output;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       c1=findViewById(R.id.checkBox2);
       c2=findViewById(R.id.checkBox4);
       c3=findViewById(R.id.checkBox);
       c4=findViewById(R.id.checkBox3);
       order=findViewById(R.id.button);
       output=findViewById(R.id.textView2);
       order.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               int Total=0;
               StringBuilder res=new StringBuilder();
               res.append("Your Bill\n");
               if(c1.isChecked()){
                   res.append("Pizza 120");
                   Total+=120;
               }
               if(c2.isChecked()){
                   res.append("Pizza 120");
                   Total+=140;
               }
               if(c3.isChecked()){
                   res.append("Pizza 120");
                   Total+=160;
               }
               if(c4.isChecked()){
                   res.append("Pizza 120");
                   Total+=130;
               }
               res.append("total is"+Total+"\n");
               output.setText(res.toString());
               Toast.makeText(MainActivity.this, "order placed", Toast.LENGTH_SHORT).show();
           }
       });
        }
    }

package com.example.additionui;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    String p;
    String a;
    float z1;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        final EditText ed1 =findViewById(R.id.EditText1);
        Button butn0=findViewById(R.id.Button0);
        Button butn1=findViewById(R.id.Button1);
        Button butn2=findViewById(R.id.Button2);
        Button butn3=findViewById(R.id.Button3);
        Button butn4=findViewById(R.id.Button4);
        Button butn5=findViewById(R.id.Button5);
        Button butn6=findViewById(R.id.Button6);
        Button butn7=findViewById(R.id.Button7);
        Button butn8=findViewById(R.id.Button8);
        Button butn9=findViewById(R.id.Button9);
        Button butn10=findViewById(R.id.Button10);
        Button butn11=findViewById(R.id.Button11);
        Button butn12=findViewById(R.id.Button12);
        Button butn13=findViewById(R.id.Button13);
        Button butn14=findViewById(R.id.Button14);
        Button butn15=findViewById(R.id.Button15);
        Button butn16=findViewById(R.id.Button16);
        butn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText(" ");
            }
        });
        butn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText(ed1.getText()+"1");
            }
        });
        butn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText(ed1.getText()+"2");
            }
        });
        butn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText(ed1.getText()+"3");
            }
        });
        butn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText(ed1.getText()+"+");
                p ="+";
            }
        });
        butn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText(ed1.getText()+"4");
            }
        });
        butn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText(ed1.getText()+"5");
            }
        });
        butn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText(ed1.getText()+"6");
            }
        });
        butn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText(ed1.getText()+"-");
                p="-";
            }
        });
        butn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText(ed1.getText()+"7");
            }
        });
        butn10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText(ed1.getText()+"8");
            }
        });
        butn11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText(ed1.getText()+"9");
            }
        });
        butn12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText(ed1.getText()+"*");
                p="*";
            }
        });
        butn13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText(ed1.getText()+".");
            }
        });
        butn14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText(ed1.getText()+"0");
            }
        });
        butn15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                float a1=0,d=1;
                switch(p)
                {
                    case "+":a= String.valueOf(ed1.getText());
                        a=a.replace("+",":");
                        String s[]=a.split(":");
                        for(int i=0;i<s.length;i++)
                        {
                            z1=Float.parseFloat(s[i]);
                            a1=a1+z1;
                        }

                        ed1.setText(""+a1);
                        break;
                    case "-":a= String.valueOf(ed1.getText());
                        a=a.replace("-",":");
                        String s1[]=a.split(":");
                        a1=Float.parseFloat(s1[0]);
                        for(int i=1;i<s1.length;i++)
                        {

                            z1=Float.parseFloat(s1[i]);
                            a1=a1-z1;
                        }

                        ed1.setText(""+a1);
                        break;
                    case "/":a= String.valueOf(ed1.getText());
                        a=a.replace("/",":");
                        String s2[]=a.split(":");
                        d=Float.parseFloat(s2[0]);
                        for(int i=1;i<s2.length;i++)
                        {

                            z1=Float.parseFloat(s2[i]);
                            d=d/z1;
                        }

                        ed1.setText(""+d);
                        break;
                    case "*":a= String.valueOf(ed1.getText());
                        a=a.replace("*",":");
                        String s3[]=a.split(":");
                        for(int i=0;i<s3.length;i++)
                        {
                            z1=Float.parseFloat(s3[i]);
                            d=z1*d;
                        }

                        ed1.setText(""+d);
                        break;

                    default:ed1.setText("");

                }
            }
        });
        butn16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText(ed1.getText()+"/");
                p="/";
            }
        });
    }
}

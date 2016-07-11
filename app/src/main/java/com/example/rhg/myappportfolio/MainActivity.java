package com.example.rhg.myappportfolio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;
public class MainActivity extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //确定按钮的操作代码
        Button btn1 = (Button) findViewById(R.id.button1);
        Button btn2 = (Button) findViewById(R.id.button2);
        Button btn3 = (Button) findViewById(R.id.button3);
        Button btn4 = (Button) findViewById(R.id.button4);
        Button btn5 = (Button) findViewById(R.id.button5);
        Button btn6 = (Button) findViewById(R.id.button6);
        btn1.setOnClickListener(listener);
        btn2.setOnClickListener(listener);
        btn3.setOnClickListener(listener);
        btn4.setOnClickListener(listener);
        btn5.setOnClickListener(listener);
        btn6.setOnClickListener(listener);

    }

    private OnClickListener listener = new OnClickListener()
    {
        public void onClick(View v)
        {
            Button  btn = (Button)v;
            switch(btn.getId())
            {
                case R.id.button1:
                    Toast.makeText(MainActivity.this, "This button will launch my popular movies app!", Toast.LENGTH_LONG).show();
                    break;
                case R.id.button2:
                    Toast.makeText(MainActivity.this, "This button will launch my stock hawk app!", Toast.LENGTH_LONG).show();
                    break;
                case R.id.button3:
                    Toast.makeText(MainActivity.this, "This button will launch my build it bigger app!", Toast.LENGTH_LONG).show();
                    break;
                case R.id.button4:
                    Toast.makeText(MainActivity.this, "This button will launch my make your app material app!", Toast.LENGTH_LONG).show();
                    break;
                case R.id.button5:
                    Toast.makeText(MainActivity.this, "This button will launch my go ubiquitous app!", Toast.LENGTH_LONG).show();
                    break;
                case R.id.button6:
                    Toast.makeText(MainActivity.this, "This button will launch my capstone app!", Toast.LENGTH_LONG).show();
                    break;
            }
        }
    };


}



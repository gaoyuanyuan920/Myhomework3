package cn.edu.sdwu.android02.home.sn170507180205;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button = (Button) findViewById(R.id.work1);
        //Button button1 = (Button) findViewById(R.id.work2);
        class myclass implements View.OnClickListener {
            @Override
            public void onClick(View view) {
                //界面跳转
                Intent intent = new Intent(MainActivity.this, Ch1Activity.class);
                startActivity(intent);

            }
        }
        Button button1 = (Button) findViewById(R.id.work2);
        button1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                //界面跳转
                Intent intent = new Intent(MainActivity.this, Ch2Activity.class);
                startActivity(intent);
            }
        });

        Button button2 = (Button) findViewById(R.id.work3);
        button1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                //界面跳转
                Intent intent = new Intent(MainActivity.this, Ch3Activity.class);
                startActivity(intent);
            }

        });
    }
}
package com.example.hoomork1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView t1;
//    private TextView t2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        t1=findViewById(R.id.text22);
//        t2=findViewById(R.id.text33);
    }

    public void chang(View view) {
        TextView t4 = (TextView)view;
        t1.setText(t4.getText());


    }

    public void changText(View view) {
        TextView tss = (TextView) view;
//       t1.setText(tss.getText());
       CharSequence s = tss.getText();
        t1.setText("helloo "+s);

    }
}

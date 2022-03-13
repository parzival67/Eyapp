package com.example.activity1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainActivity4 extends AppCompatActivity {
    String arse;
    Button fbutton;
    LinearLayout mylayout = null;
    List<Button> btnList = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        Intent i = getIntent();
        ArrayList<String> utilities = i.getStringArrayListExtra("utils");

        StringBuilder sb = new StringBuilder();
        int j = 0;
        while (j < utilities.size())
        {
            sb.append(utilities.get(j));
            sb.append("");
            j++;
        }
        String res = sb.toString();
        Log.d("res", res);

        Button sbutton = new Button(MainActivity4.this);
        mylayout = (LinearLayout)  findViewById(R.id.mylayout);

        LinearLayout.LayoutParams myParams = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.WRAP_CONTENT
        );
        for(int k = 0; k < utilities.size(); k++) {
            btnList.add(new Button(this));
            btnList.get(btnList.size() - 1).setText(String.valueOf(res.charAt(k)));
            mylayout.addView(btnList.get(btnList.size() - 1), myParams);
        }

        /*fbutton = (Button) findViewById(R.id.fbutton);
        fbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Button sbutton = new Button(MainActivity4.this);
                mylayout = (LinearLayout)  findViewById(R.id.mylayout);

                LinearLayout.LayoutParams myParams = new LinearLayout.LayoutParams(
                        LinearLayout.LayoutParams.MATCH_PARENT,
                        LinearLayout.LayoutParams.WRAP_CONTENT
                );

                sbutton.setText("yeete");

                mylayout.addView(sbutton, myParams);

            }
        });*/

    }
}
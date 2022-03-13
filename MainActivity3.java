package com.example.activity1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.GridLayout;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity3 extends AppCompatActivity {

    GridLayout mainGrid;
    private Button button;
    private List<String> utilities = new ArrayList<String>();
    private Integer tempi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        mainGrid = (GridLayout) findViewById(R.id.mainGrid);

        setToggleEvent(mainGrid);

        button = (Button) findViewById(R.id.button3);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openNextActivity();
            }
        });
    }

    public void openNextActivity() {
        Intent i = new Intent(this, MainActivity4.class);
        i.putStringArrayListExtra("utils", (ArrayList<String>) utilities);
        startActivity(i);
    }

    private void setToggleEvent(GridLayout mainGrid) {
        for (int i = 0; i < mainGrid.getChildCount(); i++) {
            final CardView cardView = (CardView) mainGrid.getChildAt(i);
            tempi = i;
            cardView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (cardView.getCardBackgroundColor().getDefaultColor() == -1) {
                        cardView.setCardBackgroundColor(Color.parseColor("#A8DCD9"));
                        utilities.add(utilind(cardView.getId() - 2131296746));
                        Log.d("tempa", utilind(cardView.getId() - 2131296746));

                    } else {
                        cardView.setCardBackgroundColor(Color.parseColor("#FFFFFF"));
                        utilities.remove(utilind(cardView.getId() - 2131296746));
                        Log.d("tempb", utilind(cardView.getId() - 2131296746));
                    }
                }
            });
        }
    }

    public static String utilind(int i){
        String[] a = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};
        return a[i];
    }

}
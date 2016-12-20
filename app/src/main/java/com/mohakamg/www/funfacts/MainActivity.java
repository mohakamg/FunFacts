package com.mohakamg.www.funfacts;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    private FactBook gfact;
    private String mfact;
    private FactBookBackground gColor;
    private TextView mFactTextView;
    private Button mShowFactButton;
    private RelativeLayout mLayout;
    int mColor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mFactTextView = (TextView) findViewById(R.id.factTextView);
        mShowFactButton = (Button) findViewById(R.id.showFactButton);
        mLayout = (RelativeLayout) findViewById(R.id.mainLayout);

        gfact = new FactBook();
        gColor = new FactBookBackground();
        View.OnClickListener listner = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mfact = gfact.getFact();
                mFactTextView.setText(mfact);
                mColor = gColor.getColor();
                mShowFactButton.setTextColor(mColor);
                mLayout.setBackgroundColor(mColor);
            }
        };
        mShowFactButton.setOnClickListener(listner);

        Toast.makeText(this, "Yay! Enjoy and Learn now ", Toast.LENGTH_LONG).show();
    }


}

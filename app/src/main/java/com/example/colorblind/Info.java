package com.example.colorblind;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;

public class Info extends Activity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.information_layout);
        setupHyperlink();

    }

    private void setupHyperlink() {

        TextView linkTextView = findViewById(R.id.link1);
        linkTextView.setMovementMethod(LinkMovementMethod.getInstance());
        linkTextView.setLinkTextColor(Color.BLACK);

        TextView linkTextView2 = findViewById(R.id.link2);
        linkTextView2.setMovementMethod(LinkMovementMethod.getInstance());
        linkTextView2.setLinkTextColor(Color.BLACK);

        TextView linkTextView3 = findViewById(R.id.link3);
        linkTextView3.setMovementMethod(LinkMovementMethod.getInstance());
        linkTextView3.setLinkTextColor(Color.BLACK);

        TextView linkTextView4 = findViewById(R.id.link4);
        linkTextView4.setMovementMethod(LinkMovementMethod.getInstance());
        linkTextView4.setLinkTextColor(Color.BLACK);

        TextView linkTextView5 = findViewById(R.id.link5);
        linkTextView5.setMovementMethod(LinkMovementMethod.getInstance());
        linkTextView5.setLinkTextColor(Color.BLACK);

        TextView linkTextView6 = findViewById(R.id.link6);
        linkTextView6.setMovementMethod(LinkMovementMethod.getInstance());
        linkTextView6.setLinkTextColor(Color.BLACK);

        TextView linkTextView7 = findViewById(R.id.link7);
        linkTextView7.setMovementMethod(LinkMovementMethod.getInstance());
        linkTextView7.setLinkTextColor(Color.BLACK);

        TextView linkTextView8 = findViewById(R.id.link8);
        linkTextView8.setMovementMethod(LinkMovementMethod.getInstance());
        linkTextView8.setLinkTextColor(Color.BLACK);



    }


}

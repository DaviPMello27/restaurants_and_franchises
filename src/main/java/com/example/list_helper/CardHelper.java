package com.example.list_helper;

import android.content.Context;
import android.graphics.Typeface;
import android.graphics.text.LineBreaker;
import android.os.Build;
import android.widget.TextView;

public class CardHelper {
    public static TextView createCardTitle(String text, Context context){
        TextView textView = new TextView(context);
        textView.setText(text);
        textView.setTypeface(null, Typeface.BOLD);
        textView.setTextSize(18);
        return textView;
    }

    public static TextView createCardSubtitle(String text, Context context){
        TextView textView = new TextView(context);
        textView.setText(text);
        textView.setTypeface(null, Typeface.ITALIC);
        textView.setTextSize(16);
        return textView;
    }

    public static TextView createCardText(String text, Context context){
        TextView textView = new TextView(context);
        textView.setText(text);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            textView.setJustificationMode(LineBreaker.JUSTIFICATION_MODE_INTER_WORD);
        }
        return textView;
    }
}

package com.example.sahildeswal.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by sahildeswal on 14/06/16.
 */
public class CustomItem extends View {
    private final Drawable rotorDrawable;
    private final Drawable rotorDrawable1;
    private final Drawable rotorDrawable2;
    private final Drawable rotorDrawable3;


    public CustomItem(Context context) {
        super(context);
        rotorDrawable = context.getResources().getDrawable(R.drawable.arrow);
        rotorDrawable1 = context.getResources().getDrawable(R.drawable.arrow);
        rotorDrawable2 = context.getResources().getDrawable(R.drawable.arrow);
        rotorDrawable3 = context.getResources().getDrawable(R.drawable.arrow);
    }

    public CustomItem(Context context, AttributeSet attrs) {
        super(context, attrs);
        rotorDrawable = context.getResources().getDrawable(R.drawable.arrow);
        rotorDrawable1 = context.getResources().getDrawable(R.drawable.arrow);
        rotorDrawable2 = context.getResources().getDrawable(R.drawable.arrow);
        rotorDrawable3 = context.getResources().getDrawable(R.drawable.arrow);
    }

    public CustomItem(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);

        rotorDrawable = context.getResources().getDrawable(R.drawable.arrow);
        rotorDrawable1 = context.getResources().getDrawable(R.drawable.arrow);
        rotorDrawable2 = context.getResources().getDrawable(R.drawable.arrow);
        rotorDrawable3 = context.getResources().getDrawable(R.drawable.arrow);

    }

    @Override
        protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        canvas.save();
        rotorDrawable.setBounds(0, 0, rotorDrawable.getIntrinsicWidth(), rotorDrawable.getIntrinsicHeight());
        rotorDrawable.draw(canvas);

        rotorDrawable1.setBounds(300, 0, 300 + rotorDrawable2.getIntrinsicWidth(), rotorDrawable2.getIntrinsicHeight());
        rotorDrawable1.draw(canvas);

        rotorDrawable2.setBounds(600, 0, 600 + rotorDrawable2.getIntrinsicWidth(), rotorDrawable2.getIntrinsicHeight());
        rotorDrawable2.draw(canvas);

        rotorDrawable3.setBounds(900, 0, 900 + rotorDrawable3.getIntrinsicWidth(), rotorDrawable3.getIntrinsicHeight());
        rotorDrawable3.draw(canvas);

        canvas.restore();


    }
}

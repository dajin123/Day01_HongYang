package com.bawei.day01_hongyang;

import android.content.Context;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by ${lushangren} on 2016/11/30.
 */

public class MyView extends View {
    private String mTitleText;
    private int mTitleTextColor;
    private int mTitleTextSize;
    private Circle mCircle;
    private Paint mPaint;

    public MyView(Context context) {
        this(context,null);
    }

    public MyView(Context context, AttributeSet attrs) {
        this(context, attrs,0);
    }

    public MyView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

}

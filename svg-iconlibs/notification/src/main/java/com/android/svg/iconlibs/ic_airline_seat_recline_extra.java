package com.android.svg.iconlibs;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;

import com.android.svg.support.SVGRenderer;

/**
 * AUTO-GENERATED FILE.  DO NOT MODIFY.
 * 
 * This class was automatically generated by the
 * SVG-Generator. It should not be modified by hand.
 */
public class ic_airline_seat_recline_extra extends SVGRenderer {

    public ic_airline_seat_recline_extra(Context context) {
        super(context);
        mAlpha = 1.0f;
        mWidth = dip2px(24.0f);
        mHeight = dip2px(24.0f);
    }

    @Override
    public void render(Canvas canvas, int w, int h, ColorFilter filter) {
        
        final float scaleX = w / 24.0f;
        final float scaleY = h / 24.0f;
        
        mPath.reset();
        mRenderPath.reset();
        
        mFinalPathMatrix.setValues(new float[]{1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f});
        mFinalPathMatrix.postScale(scaleX, scaleY);
        
        mPath.moveTo(5.35f, 5.64f);
        mPath.rCubicTo(-0.9f, -0.64f, -1.12f, -1.88f, -0.49f, -2.79f);
        mPath.rCubicTo(0.63f, -0.9f, 1.88f, -1.12f, 2.79f, -0.49f);
        mPath.rCubicTo(0.9f, 0.64f, 1.12f, 1.88f, 0.49f, 2.79f);
        mPath.rCubicTo(-0.64f, 0.9f, -1.88f, 1.12f, -2.79f, 0.49f);
        mPath.close();
        mPath.moveTo(5.35f, 5.64f);
        mPath.moveTo(16.0f, 19.0f);
        mPath.lineTo(8.93f, 19.0f);
        mPath.rCubicTo(-1.48f, 0.0f, -2.74f, -1.08f, -2.96f, -2.54f);
        mPath.lineTo(4.0f, 7.0f);
        mPath.lineTo(2.0f, 7.0f);
        mPath.rLineTo(1.99f, 9.76f);
        mPath.cubicTo(4.37f, 19.2f, 6.47f, 21.0f, 8.94f, 21.0f);
        mPath.lineTo(16.0f, 21.0f);
        mPath.rLineTo(0f, -2.0f);
        mPath.close();
        mPath.moveTo(16.0f, 19.0f);
        mPath.rMoveTo(0.23f, -4.0f);
        mPath.rLineTo(-4.88f, 0f);
        mPath.rLineTo(-1.03f, -4.1f);
        mPath.rCubicTo(1.58f, 0.89f, 3.28f, 1.54f, 5.15f, 1.22f);
        mPath.lineTo(15.469999f, 9.99f);
        mPath.rCubicTo(-1.63f, 0.31f, -3.44f, -0.27f, -4.69f, -1.25f);
        mPath.lineTo(9.14f, 7.47f);
        mPath.rCubicTo(-0.23f, -0.18f, -0.49f, -0.3f, -0.76f, -0.38f);
        mPath.rCubicTo(-0.32f, -0.09f, -0.66f, -0.12f, -0.99f, -0.06f);
        mPath.rLineTo(-0.02f, 0f);
        mPath.rCubicTo(-1.23f, 0.22f, -2.05f, 1.39f, -1.84f, 2.61f);
        mPath.rLineTo(1.35f, 5.92f);
        mPath.cubicTo(7.16f, 16.98f, 8.39f, 18.0f, 9.83f, 18.0f);
        mPath.rLineTo(6.85f, 0f);
        mPath.rLineTo(3.82f, 3.0f);
        mPath.rLineTo(1.5f, -1.5f);
        mPath.rLineTo(-5.77f, -4.5f);
        mPath.close();
        mPath.moveTo(16.23f, 15.0f);
        
        mRenderPath.addPath(mPath, mFinalPathMatrix);
        if (mFillPaint == null) {
            mFillPaint = new Paint();
            mFillPaint.setStyle(Paint.Style.FILL);
            mFillPaint.setAntiAlias(true);
        }
        mFillPaint.setColor(applyAlpha(-16777216, 1.0f));
        mFillPaint.setColorFilter(filter);
        canvas.drawPath(mRenderPath, mFillPaint);

    }

}
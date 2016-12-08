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
public class ic_notifications_paused extends SVGRenderer {

    public ic_notifications_paused(Context context) {
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
        
        mPath.moveTo(12.0f, 22.0f);
        mPath.rCubicTo(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        mPath.rLineTo(-4.0f, 0f);
        mPath.rCubicTo(0.0f, 1.1f, 0.89f, 2.0f, 2.0f, 2.0f);
        mPath.close();
        mPath.moveTo(12.0f, 22.0f);
        mPath.rMoveTo(6.0f, -6.0f);
        mPath.rLineTo(0f, -5.0f);
        mPath.rCubicTo(0.0f, -3.07f, -1.64f, -5.64f, -4.5f, -6.32f);
        mPath.lineTo(13.5f, 4.0f);
        mPath.rCubicTo(0.0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f);
        mPath.rCubicTo(-0.8299999f, 0.0f, -1.5f, 0.67f, -1.5f, 1.5f);
        mPath.rLineTo(0f, 0.68f);
        mPath.cubicTo(7.63f, 5.36f, 6.0f, 7.93f, 6.0f, 11.0f);
        mPath.rLineTo(0f, 5.0f);
        mPath.rLineTo(-2.0f, 2.0f);
        mPath.rLineTo(0f, 1.0f);
        mPath.rLineTo(16.0f, 0f);
        mPath.rLineTo(0f, -1.0f);
        mPath.rLineTo(-2.0f, -2.0f);
        mPath.close();
        mPath.moveTo(18.0f, 16.0f);
        mPath.rMoveTo(-3.5f, -6.2f);
        mPath.rLineTo(-2.8f, 3.4f);
        mPath.rLineTo(2.8f, 0f);
        mPath.lineTo(14.5f, 15.0f);
        mPath.rLineTo(-5.0f, 0f);
        mPath.rLineTo(0f, -1.8f);
        mPath.rLineTo(2.8f, -3.4f);
        mPath.lineTo(9.5f, 9.799999f);
        mPath.lineTo(9.5f, 8.0f);
        mPath.rLineTo(5.0f, 0f);
        mPath.rLineTo(0f, 1.8f);
        mPath.close();
        mPath.moveTo(14.5f, 9.8f);
        
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
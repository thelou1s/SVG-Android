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
public class ic_update extends SVGRenderer {

    public ic_update(Context context) {
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
        
        mPath.moveTo(21.0f, 10.12f);
        mPath.rLineTo(-6.78f, 0f);
        mPath.rLineTo(2.74f, -2.82f);
        mPath.rCubicTo(-2.73f, -2.7f, -7.15f, -2.8f, -9.88f, -0.1f);
        mPath.rCubicTo(-2.73f, 2.71f, -2.73f, 7.08f, 0.0f, 9.79f);
        mPath.rCubicTo(2.73f, 2.71f, 7.15f, 2.71f, 9.88f, 0.0f);
        mPath.cubicTo(18.32f, 15.65f, 19.0f, 14.08f, 19.0f, 12.1f);
        mPath.rLineTo(2.0f, 0f);
        mPath.rCubicTo(0.0f, 1.98f, -0.88f, 4.55f, -2.64f, 6.29f);
        mPath.rCubicTo(-3.51f, 3.48f, -9.21f, 3.48f, -12.72f, 0.0f);
        mPath.rCubicTo(-3.5f, -3.47f, -3.53f, -9.11f, -0.02f, -12.58f);
        mPath.rCubicTo(3.51f, -3.47f, 9.14f, -3.47f, 12.65f, 0.0f);
        mPath.lineTo(21.0f, 3.0f);
        mPath.rLineTo(0f, 7.12f);
        mPath.close();
        mPath.moveTo(21.0f, 10.12f);
        mPath.moveTo(12.5f, 8.0f);
        mPath.rLineTo(0f, 4.25f);
        mPath.rLineTo(3.5f, 2.08f);
        mPath.rLineTo(-0.72f, 1.21f);
        mPath.lineTo(11.0f, 13.0f);
        mPath.lineTo(11.0f, 8.0f);
        mPath.rLineTo(1.5f, 0f);
        mPath.close();
        mPath.moveTo(12.5f, 8.0f);
        
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
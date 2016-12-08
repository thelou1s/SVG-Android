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
public class ic_bug_report extends SVGRenderer {

    public ic_bug_report(Context context) {
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
        
        mPath.moveTo(20.0f, 8.0f);
        mPath.rLineTo(-2.81f, 0f);
        mPath.rCubicTo(-0.45f, -0.78f, -1.07f, -1.45f, -1.82f, -1.96f);
        mPath.lineTo(17.0f, 4.41f);
        mPath.lineTo(15.59f, 3.0f);
        mPath.rLineTo(-2.17f, 2.17f);
        mPath.cubicTo(12.96f, 5.06f, 12.49f, 5.0f, 12.0f, 5.0f);
        mPath.rCubicTo(-0.49f, 0.0f, -0.96f, 0.06f, -1.41f, 0.17f);
        mPath.lineTo(8.41f, 3.0f);
        mPath.lineTo(7.0f, 4.41f);
        mPath.rLineTo(1.62f, 1.63f);
        mPath.cubicTo(7.88f, 6.55f, 7.26f, 7.22f, 6.81f, 8.0f);
        mPath.lineTo(4.0f, 8.0f);
        mPath.rLineTo(0f, 2.0f);
        mPath.rLineTo(2.09f, 0f);
        mPath.rCubicTo(-0.05f, 0.33f, -0.09f, 0.66f, -0.09f, 1.0f);
        mPath.rLineTo(0f, 1.0f);
        mPath.lineTo(4.0f, 12.0f);
        mPath.rLineTo(0f, 2.0f);
        mPath.rLineTo(2.0f, 0f);
        mPath.rLineTo(0f, 1.0f);
        mPath.rCubicTo(0.0f, 0.34f, 0.04f, 0.67f, 0.09f, 1.0f);
        mPath.lineTo(4.0f, 16.0f);
        mPath.rLineTo(0f, 2.0f);
        mPath.rLineTo(2.81f, 0f);
        mPath.rCubicTo(1.04f, 1.79f, 2.97f, 3.0f, 5.19f, 3.0f);
        mPath.rCubicTo(2.2200003f, 0.0f, 4.15f, -1.21f, 5.19f, -3.0f);
        mPath.lineTo(20.0f, 18.0f);
        mPath.rLineTo(0f, -2.0f);
        mPath.rLineTo(-2.09f, 0f);
        mPath.rCubicTo(0.05f, -0.33f, 0.09f, -0.66f, 0.09f, -1.0f);
        mPath.rLineTo(0f, -1.0f);
        mPath.rLineTo(2.0f, 0f);
        mPath.rLineTo(0f, -2.0f);
        mPath.rLineTo(-2.0f, 0f);
        mPath.rLineTo(0f, -1.0f);
        mPath.rCubicTo(0.0f, -0.34f, -0.04f, -0.67f, -0.09f, -1.0f);
        mPath.lineTo(20.0f, 10.0f);
        mPath.lineTo(20.0f, 8.0f);
        mPath.close();
        mPath.moveTo(20.0f, 8.0f);
        mPath.rMoveTo(-6.0f, 8.0f);
        mPath.rLineTo(-4.0f, 0f);
        mPath.rLineTo(0f, -2.0f);
        mPath.rLineTo(4.0f, 0f);
        mPath.rLineTo(0f, 2.0f);
        mPath.close();
        mPath.moveTo(14.0f, 16.0f);
        mPath.rMoveTo(0.0f, -4.0f);
        mPath.rLineTo(-4.0f, 0f);
        mPath.rLineTo(0f, -2.0f);
        mPath.rLineTo(4.0f, 0f);
        mPath.rLineTo(0f, 2.0f);
        mPath.close();
        mPath.moveTo(14.0f, 12.0f);
        
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
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
public class ic_local_taxi extends SVGRenderer {

    public ic_local_taxi(Context context) {
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
        
        mPath.moveTo(18.92f, 6.01f);
        mPath.cubicTo(18.72f, 5.42f, 18.16f, 5.0f, 17.5f, 5.0f);
        mPath.lineTo(15.0f, 5.0f);
        mPath.lineTo(15.0f, 3.0f);
        mPath.lineTo(9.0f, 3.0f);
        mPath.rLineTo(0f, 2.0f);
        mPath.lineTo(6.5f, 5.0f);
        mPath.rCubicTo(-0.66f, 0.0f, -1.21f, 0.42f, -1.42f, 1.01f);
        mPath.lineTo(3.0f, 12.0f);
        mPath.rLineTo(0f, 8.0f);
        mPath.rCubicTo(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        mPath.rLineTo(1.0f, 0f);
        mPath.rCubicTo(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        mPath.rLineTo(0f, -1.0f);
        mPath.rLineTo(12.0f, 0f);
        mPath.rLineTo(0f, 1.0f);
        mPath.rCubicTo(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        mPath.rLineTo(1.0f, 0f);
        mPath.rCubicTo(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        mPath.rLineTo(0f, -8.0f);
        mPath.rLineTo(-2.08f, -5.99f);
        mPath.close();
        mPath.moveTo(18.92f, 6.01f);
        mPath.moveTo(6.5f, 16.0f);
        mPath.rCubicTo(-0.83f, 0.0f, -1.5f, -0.67f, -1.5f, -1.5f);
        mPath.cubicTo(5.0f, 13.67f, 5.67f, 13.0f, 6.5f, 13.0f);
        mPath.rCubicTo(0.8299999f, 0.0f, 1.5f, 0.67f, 1.5f, 1.5f);
        mPath.cubicTo(8.0f, 15.33f, 7.33f, 16.0f, 6.5f, 16.0f);
        mPath.close();
        mPath.moveTo(6.5f, 16.0f);
        mPath.rMoveTo(11.0f, 0.0f);
        mPath.rCubicTo(-0.83f, 0.0f, -1.5f, -0.67f, -1.5f, -1.5f);
        mPath.rCubicTo(0.0f, -0.8299999f, 0.67f, -1.5f, 1.5f, -1.5f);
        mPath.rCubicTo(0.8299999f, 0.0f, 1.5f, 0.67f, 1.5f, 1.5f);
        mPath.rCubicTo(0.0f, 0.8299999f, -0.67f, 1.5f, -1.5f, 1.5f);
        mPath.close();
        mPath.moveTo(17.5f, 16.0f);
        mPath.moveTo(5.0f, 11.0f);
        mPath.rLineTo(1.5f, -4.5f);
        mPath.rLineTo(11.0f, 0f);
        mPath.lineTo(19.0f, 11.0f);
        mPath.lineTo(5.0f, 11.0f);
        mPath.close();
        mPath.moveTo(5.0f, 11.0f);
        
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
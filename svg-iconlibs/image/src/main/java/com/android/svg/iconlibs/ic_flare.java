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
public class ic_flare extends SVGRenderer {

    public ic_flare(Context context) {
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
        
        mPath.moveTo(7.0f, 11.0f);
        mPath.lineTo(1.0f, 11.0f);
        mPath.rLineTo(0f, 2.0f);
        mPath.rLineTo(6.0f, 0f);
        mPath.rLineTo(0f, -2.0f);
        mPath.close();
        mPath.moveTo(7.0f, 11.0f);
        mPath.rMoveTo(2.17f, -3.24f);
        mPath.lineTo(7.05f, 5.64f);
        mPath.lineTo(5.64f, 7.05f);
        mPath.rLineTo(2.12f, 2.12f);
        mPath.rLineTo(1.41f, -1.41f);
        mPath.close();
        mPath.moveTo(9.17f, 7.76f);
        mPath.moveTo(13.0f, 1.0f);
        mPath.rLineTo(-2.0f, 0f);
        mPath.rLineTo(0f, 6.0f);
        mPath.rLineTo(2.0f, 0f);
        mPath.lineTo(13.0f, 1.0f);
        mPath.close();
        mPath.moveTo(13.0f, 1.0f);
        mPath.rMoveTo(5.36f, 6.05f);
        mPath.rLineTo(-1.41f, -1.41f);
        mPath.rLineTo(-2.12f, 2.12f);
        mPath.rLineTo(1.41f, 1.41f);
        mPath.rLineTo(2.12f, -2.12f);
        mPath.close();
        mPath.moveTo(18.36f, 7.05f);
        mPath.moveTo(17.0f, 11.0f);
        mPath.rLineTo(0f, 2.0f);
        mPath.rLineTo(6.0f, 0f);
        mPath.rLineTo(0f, -2.0f);
        mPath.rLineTo(-6.0f, 0f);
        mPath.close();
        mPath.moveTo(17.0f, 11.0f);
        mPath.rMoveTo(-5.0f, -2.0f);
        mPath.rCubicTo(-1.66f, 0.0f, -3.0f, 1.34f, -3.0f, 3.0f);
        mPath.rCubicTo(0.0f, 1.6599998f, 1.34f, 3.0f, 3.0f, 3.0f);
        mPath.rCubicTo(1.6599998f, 0.0f, 3.0f, -1.34f, 3.0f, -3.0f);
        mPath.rCubicTo(0.0f, -1.6599998f, -1.34f, -3.0f, -3.0f, -3.0f);
        mPath.close();
        mPath.moveTo(12.0f, 9.0f);
        mPath.rMoveTo(2.83f, 7.24f);
        mPath.rLineTo(2.12f, 2.12f);
        mPath.rLineTo(1.41f, -1.41f);
        mPath.rLineTo(-2.12f, -2.12f);
        mPath.rLineTo(-1.41f, 1.41f);
        mPath.close();
        mPath.moveTo(14.83f, 16.24f);
        mPath.rMoveTo(-9.19f, 0.71f);
        mPath.rLineTo(1.41f, 1.41f);
        mPath.rLineTo(2.12f, -2.12f);
        mPath.rLineTo(-1.41f, -1.41f);
        mPath.rLineTo(-2.12f, 2.12f);
        mPath.close();
        mPath.moveTo(5.6400003f, 16.949999f);
        mPath.moveTo(11.0f, 23.0f);
        mPath.rLineTo(2.0f, 0f);
        mPath.rLineTo(0f, -6.0f);
        mPath.rLineTo(-2.0f, 0f);
        mPath.rLineTo(0f, 6.0f);
        mPath.close();
        mPath.moveTo(11.0f, 23.0f);
        
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
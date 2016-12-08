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
public class ic_mouse extends SVGRenderer {

    public ic_mouse(Context context) {
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
        
        mPath.moveTo(13.0f, 1.07f);
        mPath.lineTo(13.0f, 9.0f);
        mPath.rLineTo(7.0f, 0f);
        mPath.rCubicTo(0.0f, -4.08f, -3.05f, -7.44f, -7.0f, -7.93f);
        mPath.close();
        mPath.moveTo(13.0f, 1.07f);
        mPath.moveTo(4.0f, 15.0f);
        mPath.rCubicTo(0.0f, 4.42f, 3.58f, 8.0f, 8.0f, 8.0f);
        mPath.rCubicTo(4.42f, 0.0f, 8.0f, -3.58f, 8.0f, -8.0f);
        mPath.rLineTo(0f, -4.0f);
        mPath.lineTo(4.0f, 11.0f);
        mPath.rLineTo(0f, 4.0f);
        mPath.close();
        mPath.moveTo(4.0f, 15.0f);
        mPath.rMoveTo(7.0f, -13.93f);
        mPath.cubicTo(7.05f, 1.56f, 4.0f, 4.92f, 4.0f, 9.0f);
        mPath.rLineTo(7.0f, 0f);
        mPath.lineTo(11.0f, 1.07f);
        mPath.close();
        mPath.moveTo(11.0f, 1.0699997f);
        
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
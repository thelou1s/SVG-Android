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
public class ic_perm_media extends SVGRenderer {

    public ic_perm_media(Context context) {
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
        
        mPath.moveTo(2.0f, 6.0f);
        mPath.lineTo(0.0f, 6.0f);
        mPath.rLineTo(0f, 5.0f);
        mPath.rLineTo(0.01f, 0f);
        mPath.lineTo(0.0f, 20.0f);
        mPath.rCubicTo(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        mPath.rLineTo(18.0f, 0f);
        mPath.rLineTo(0f, -2.0f);
        mPath.lineTo(2.0f, 20.0f);
        mPath.lineTo(2.0f, 6.0f);
        mPath.close();
        mPath.moveTo(2.0f, 6.0f);
        mPath.rMoveTo(20.0f, -2.0f);
        mPath.rLineTo(-8.0f, 0f);
        mPath.rLineTo(-2.0f, -2.0f);
        mPath.lineTo(6.0f, 2.0f);
        mPath.rCubicTo(-1.1f, 0.0f, -1.99f, 0.9f, -1.99f, 2.0f);
        mPath.lineTo(4.0f, 16.0f);
        mPath.rCubicTo(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        mPath.rLineTo(16.0f, 0f);
        mPath.rCubicTo(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        mPath.lineTo(24.0f, 6.0f);
        mPath.rCubicTo(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        mPath.close();
        mPath.moveTo(22.0f, 4.0f);
        mPath.moveTo(7.0f, 15.0f);
        mPath.rLineTo(4.5f, -6.0f);
        mPath.rLineTo(3.5f, 4.51f);
        mPath.rLineTo(2.5f, -3.01f);
        mPath.lineTo(21.0f, 15.0f);
        mPath.lineTo(7.0f, 15.0f);
        mPath.close();
        mPath.moveTo(7.0f, 15.0f);
        
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
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
public class ic_phone_iphone extends SVGRenderer {

    public ic_phone_iphone(Context context) {
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
        
        mPath.moveTo(15.5f, 1.0f);
        mPath.rLineTo(-8.0f, 0f);
        mPath.cubicTo(6.12f, 1.0f, 5.0f, 2.12f, 5.0f, 3.5f);
        mPath.rLineTo(0f, 17.0f);
        mPath.cubicTo(5.0f, 21.88f, 6.12f, 23.0f, 7.5f, 23.0f);
        mPath.rLineTo(8.0f, 0f);
        mPath.rCubicTo(1.38f, 0.0f, 2.5f, -1.12f, 2.5f, -2.5f);
        mPath.rLineTo(0f, -17.0f);
        mPath.cubicTo(18.0f, 2.12f, 16.88f, 1.0f, 15.5f, 1.0f);
        mPath.close();
        mPath.moveTo(15.5f, 1.0f);
        mPath.rMoveTo(-4.0f, 21.0f);
        mPath.rCubicTo(-0.83f, 0.0f, -1.5f, -0.67f, -1.5f, -1.5f);
        mPath.rCubicTo(0.0f, -0.8299999f, 0.67f, -1.5f, 1.5f, -1.5f);
        mPath.rCubicTo(0.8299999f, 0.0f, 1.5f, 0.67f, 1.5f, 1.5f);
        mPath.rCubicTo(0.0f, 0.8299999f, -0.67f, 1.5f, -1.5f, 1.5f);
        mPath.close();
        mPath.moveTo(11.5f, 22.0f);
        mPath.rMoveTo(4.5f, -4.0f);
        mPath.lineTo(7.0f, 18.0f);
        mPath.lineTo(7.0f, 4.0f);
        mPath.rLineTo(9.0f, 0f);
        mPath.rLineTo(0f, 14.0f);
        mPath.close();
        mPath.moveTo(16.0f, 18.0f);
        
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
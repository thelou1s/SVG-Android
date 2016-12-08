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
public class ic_directions_walk extends SVGRenderer {

    public ic_directions_walk(Context context) {
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
        
        mPath.moveTo(13.5f, 5.5f);
        mPath.rCubicTo(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        mPath.rCubicTo(0.0f, -1.0999999f, -0.9f, -2.0f, -2.0f, -2.0f);
        mPath.rCubicTo(-1.1000004f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
        mPath.rCubicTo(0.0f, 1.0999999f, 0.9f, 2.0f, 2.0f, 2.0f);
        mPath.close();
        mPath.moveTo(13.5f, 5.5f);
        mPath.moveTo(9.8f, 8.9f);
        mPath.lineTo(7.0f, 23.0f);
        mPath.rLineTo(2.1f, 0f);
        mPath.rLineTo(1.8f, -8.0f);
        mPath.rLineTo(2.1f, 2.0f);
        mPath.rLineTo(0f, 6.0f);
        mPath.rLineTo(2.0f, 0f);
        mPath.rLineTo(0f, -7.5f);
        mPath.rLineTo(-2.1f, -2.0f);
        mPath.rLineTo(0.6f, -3.0f);
        mPath.cubicTo(14.8f, 12.0f, 16.8f, 13.0f, 19.0f, 13.0f);
        mPath.rLineTo(0f, -2.0f);
        mPath.rCubicTo(-1.9f, 0.0f, -3.5f, -1.0f, -4.3f, -2.4f);
        mPath.rLineTo(-1.0f, -1.6f);
        mPath.rCubicTo(-0.4f, -0.6f, -1.0f, -1.0f, -1.7f, -1.0f);
        mPath.rCubicTo(-0.3f, 0.0f, -0.5f, 0.1f, -0.8f, 0.1f);
        mPath.lineTo(6.0f, 8.3f);
        mPath.lineTo(6.0f, 13.0f);
        mPath.rLineTo(2.0f, 0f);
        mPath.lineTo(8.0f, 9.6f);
        mPath.rLineTo(1.8f, -0.7f);
        
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
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
public class ic_zoom_out extends SVGRenderer {

    public ic_zoom_out(Context context) {
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
        
        mPath.moveTo(15.5f, 14.0f);
        mPath.rLineTo(-0.79f, 0f);
        mPath.rLineTo(-0.28f, -0.27f);
        mPath.cubicTo(15.41f, 12.59f, 16.0f, 11.11f, 16.0f, 9.5f);
        mPath.cubicTo(16.0f, 5.91f, 13.09f, 3.0f, 9.5f, 3.0f);
        mPath.cubicTo(5.91f, 3.0f, 3.0f, 5.91f, 3.0f, 9.5f);
        mPath.cubicTo(3.0f, 13.09f, 5.91f, 16.0f, 9.5f, 16.0f);
        mPath.rCubicTo(1.61f, 0.0f, 3.09f, -0.59f, 4.23f, -1.57f);
        mPath.rLineTo(0.27f, 0.28f);
        mPath.rLineTo(0f, 0.79f);
        mPath.rLineTo(5.0f, 4.99f);
        mPath.lineTo(20.49f, 19.0f);
        mPath.rLineTo(-4.99f, -5.0f);
        mPath.close();
        mPath.moveTo(15.5f, 14.0f);
        mPath.rMoveTo(-6.0f, 0.0f);
        mPath.cubicTo(7.01f, 14.0f, 5.0f, 11.99f, 5.0f, 9.5f);
        mPath.cubicTo(5.0f, 7.01f, 7.01f, 5.0f, 9.5f, 5.0f);
        mPath.cubicTo(11.99f, 5.0f, 14.0f, 7.01f, 14.0f, 9.5f);
        mPath.cubicTo(14.0f, 11.99f, 11.99f, 14.0f, 9.5f, 14.0f);
        mPath.close();
        mPath.moveTo(9.5f, 14.0f);
        mPath.moveTo(7.0f, 9.0f);
        mPath.rLineTo(5.0f, 0f);
        mPath.rLineTo(0f, 1.0f);
        mPath.lineTo(7.0f, 10.0f);
        mPath.close();
        mPath.moveTo(7.0f, 9.0f);
        
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
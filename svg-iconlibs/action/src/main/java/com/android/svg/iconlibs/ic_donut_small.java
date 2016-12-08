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
public class ic_donut_small extends SVGRenderer {

    public ic_donut_small(Context context) {
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
        
        mPath.moveTo(11.0f, 9.16f);
        mPath.lineTo(11.0f, 2.0f);
        mPath.rCubicTo(-5.0f, 0.5f, -9.0f, 4.79f, -9.0f, 10.0f);
        mPath.rCubicTo(0.0f, 5.21f, 4.0f, 9.5f, 9.0f, 10.0f);
        mPath.rLineTo(0f, -7.16f);
        mPath.rCubicTo(-1.0f, -0.41f, -2.0f, -1.52f, -2.0f, -2.84f);
        mPath.rCubicTo(0.0f, -1.3199997f, 1.0f, -2.43f, 2.0f, -2.84f);
        mPath.close();
        mPath.moveTo(11.0f, 9.16f);
        mPath.moveTo(14.86f, 11.0f);
        mPath.lineTo(22.0f, 11.0f);
        mPath.rCubicTo(-0.48f, -4.75f, -4.0f, -8.53f, -9.0f, -9.0f);
        mPath.rLineTo(0f, 7.16f);
        mPath.rCubicTo(1.0f, 0.3f, 1.52f, 0.98f, 1.86f, 1.84f);
        mPath.close();
        mPath.moveTo(14.86f, 11.0f);
        mPath.moveTo(13.0f, 14.84f);
        mPath.lineTo(13.0f, 22.0f);
        mPath.rCubicTo(5.0f, -0.47f, 8.52f, -4.25f, 9.0f, -9.0f);
        mPath.rLineTo(-7.14f, 0f);
        mPath.rCubicTo(-0.34f, 0.86f, -0.86f, 1.54f, -1.86f, 1.84f);
        mPath.close();
        mPath.moveTo(13.0f, 14.84f);
        
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
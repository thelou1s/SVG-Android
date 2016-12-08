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
public class ic_layers_clear extends SVGRenderer {

    public ic_layers_clear(Context context) {
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
        
        mPath.moveTo(19.81f, 14.99f);
        mPath.rLineTo(1.19f, -0.92f);
        mPath.rLineTo(-1.43f, -1.43f);
        mPath.rLineTo(-1.19f, 0.92f);
        mPath.rLineTo(1.43f, 1.43f);
        mPath.close();
        mPath.moveTo(19.81f, 14.99f);
        mPath.rMoveTo(-0.45f, -4.72f);
        mPath.lineTo(21.0f, 9.0f);
        mPath.rLineTo(-9.0f, -7.0f);
        mPath.rLineTo(-2.91f, 2.27f);
        mPath.rLineTo(7.87f, 7.88f);
        mPath.rLineTo(2.4f, -1.88f);
        mPath.close();
        mPath.moveTo(19.359999f, 10.27f);
        mPath.moveTo(3.27f, 1.0f);
        mPath.lineTo(2.0f, 2.27f);
        mPath.rLineTo(4.22f, 4.22f);
        mPath.lineTo(3.0f, 9.0f);
        mPath.rLineTo(1.63f, 1.27f);
        mPath.lineTo(12.0f, 16.0f);
        mPath.rLineTo(2.1f, -1.63f);
        mPath.rLineTo(1.43f, 1.43f);
        mPath.lineTo(12.0f, 18.54f);
        mPath.rLineTo(-7.37f, -5.73f);
        mPath.lineTo(3.0f, 14.07f);
        mPath.rLineTo(9.0f, 7.0f);
        mPath.rLineTo(4.95f, -3.85f);
        mPath.lineTo(20.73f, 21.0f);
        mPath.lineTo(22.0f, 19.73f);
        mPath.lineTo(3.27f, 1.0f);
        mPath.close();
        mPath.moveTo(3.27f, 1.0f);
        
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
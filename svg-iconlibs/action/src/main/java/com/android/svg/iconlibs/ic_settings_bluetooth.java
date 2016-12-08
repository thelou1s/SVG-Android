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
public class ic_settings_bluetooth extends SVGRenderer {

    public ic_settings_bluetooth(Context context) {
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
        
        mPath.moveTo(11.0f, 24.0f);
        mPath.rLineTo(2.0f, 0f);
        mPath.rLineTo(0f, -2.0f);
        mPath.rLineTo(-2.0f, 0f);
        mPath.rLineTo(0f, 2.0f);
        mPath.close();
        mPath.moveTo(11.0f, 24.0f);
        mPath.rMoveTo(-4.0f, 0.0f);
        mPath.rLineTo(2.0f, 0f);
        mPath.rLineTo(0f, -2.0f);
        mPath.lineTo(7.0f, 22.0f);
        mPath.rLineTo(0f, 2.0f);
        mPath.close();
        mPath.moveTo(7.0f, 24.0f);
        mPath.rMoveTo(8.0f, 0.0f);
        mPath.rLineTo(2.0f, 0f);
        mPath.rLineTo(0f, -2.0f);
        mPath.rLineTo(-2.0f, 0f);
        mPath.rLineTo(0f, 2.0f);
        mPath.close();
        mPath.moveTo(15.0f, 24.0f);
        mPath.rMoveTo(2.71f, -18.29f);
        mPath.lineTo(12.0f, 0.0f);
        mPath.rLineTo(-1.0f, 0f);
        mPath.rLineTo(0f, 7.59f);
        mPath.lineTo(6.41f, 3.0f);
        mPath.lineTo(5.0f, 4.41f);
        mPath.lineTo(10.59f, 10.0f);
        mPath.lineTo(5.0f, 15.59f);
        mPath.lineTo(6.41f, 17.0f);
        mPath.lineTo(11.0f, 12.41f);
        mPath.lineTo(11.0f, 20.0f);
        mPath.rLineTo(1.0f, 0f);
        mPath.rLineTo(5.71f, -5.71f);
        mPath.rLineTo(-4.3f, -4.29f);
        mPath.rLineTo(4.3f, -4.29f);
        mPath.close();
        mPath.moveTo(17.71f, 5.709999f);
        mPath.moveTo(13.0f, 3.83f);
        mPath.rLineTo(1.88f, 1.88f);
        mPath.lineTo(13.0f, 7.59f);
        mPath.lineTo(13.0f, 3.83f);
        mPath.close();
        mPath.moveTo(13.0f, 3.83f);
        mPath.rMoveTo(1.88f, 10.46f);
        mPath.lineTo(13.0f, 16.17f);
        mPath.rLineTo(0f, -3.76f);
        mPath.rLineTo(1.88f, 1.88f);
        mPath.close();
        mPath.moveTo(14.88f, 14.29f);
        
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
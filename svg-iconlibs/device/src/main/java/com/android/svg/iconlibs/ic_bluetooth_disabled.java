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
public class ic_bluetooth_disabled extends SVGRenderer {

    public ic_bluetooth_disabled(Context context) {
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
        
        mPath.moveTo(13.0f, 5.83f);
        mPath.rLineTo(1.88f, 1.88f);
        mPath.rLineTo(-1.6f, 1.6f);
        mPath.rLineTo(1.41f, 1.41f);
        mPath.rLineTo(3.02f, -3.02f);
        mPath.lineTo(12.0f, 2.0f);
        mPath.rLineTo(-1.0f, 0f);
        mPath.rLineTo(0f, 5.03f);
        mPath.rLineTo(2.0f, 2.0f);
        mPath.rLineTo(0f, -3.2f);
        mPath.close();
        mPath.moveTo(13.0f, 5.83f);
        mPath.moveTo(5.41f, 4.0f);
        mPath.lineTo(4.0f, 5.41f);
        mPath.lineTo(10.59f, 12.0f);
        mPath.lineTo(5.0f, 17.59f);
        mPath.lineTo(6.41f, 19.0f);
        mPath.lineTo(11.0f, 14.41f);
        mPath.lineTo(11.0f, 22.0f);
        mPath.rLineTo(1.0f, 0f);
        mPath.rLineTo(4.29f, -4.29f);
        mPath.rLineTo(2.3f, 2.29f);
        mPath.lineTo(20.0f, 18.59f);
        mPath.lineTo(5.41f, 4.0f);
        mPath.close();
        mPath.moveTo(5.41f, 4.0f);
        mPath.moveTo(13.0f, 18.17f);
        mPath.rLineTo(0f, -3.76f);
        mPath.rLineTo(1.88f, 1.88f);
        mPath.lineTo(13.0f, 18.17f);
        mPath.close();
        mPath.moveTo(13.0f, 18.17f);
        
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
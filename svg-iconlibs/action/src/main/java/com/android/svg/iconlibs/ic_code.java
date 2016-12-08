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
public class ic_code extends SVGRenderer {

    public ic_code(Context context) {
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
        
        mPath.moveTo(9.4f, 16.6f);
        mPath.lineTo(4.8f, 12.0f);
        mPath.rLineTo(4.6f, -4.6f);
        mPath.lineTo(8.0f, 6.0f);
        mPath.rLineTo(-6.0f, 6.0f);
        mPath.rLineTo(6.0f, 6.0f);
        mPath.rLineTo(1.4f, -1.4f);
        mPath.close();
        mPath.moveTo(9.4f, 16.6f);
        mPath.rMoveTo(5.2f, 0.0f);
        mPath.rLineTo(4.6f, -4.6f);
        mPath.rLineTo(-4.6f, -4.6f);
        mPath.lineTo(16.0f, 6.0f);
        mPath.rLineTo(6.0f, 6.0f);
        mPath.rLineTo(-6.0f, 6.0f);
        mPath.rLineTo(-1.4f, -1.4f);
        mPath.close();
        mPath.moveTo(14.599999f, 16.6f);
        
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
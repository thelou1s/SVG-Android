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
public class ic_gavel extends SVGRenderer {

    public ic_gavel(Context context) {
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
        
        mPath.moveTo(1.0f, 21.0f);
        mPath.rLineTo(12.0f, 0f);
        mPath.rLineTo(0f, 2.0f);
        mPath.lineTo(1.0f, 23.0f);
        mPath.close();
        mPath.moveTo(1.0f, 21.0f);
        mPath.moveTo(5.245f, 8.07f);
        mPath.rLineTo(2.83f, -2.827f);
        mPath.rLineTo(14.14f, 14.142f);
        mPath.rLineTo(-2.828f, 2.828f);
        mPath.close();
        mPath.moveTo(5.245f, 8.07f);
        mPath.moveTo(12.317f, 1.0f);
        mPath.rLineTo(5.657f, 5.656f);
        mPath.rLineTo(-2.83f, 2.83f);
        mPath.rLineTo(-5.654f, -5.66f);
        mPath.close();
        mPath.moveTo(12.317f, 1.0f);
        mPath.moveTo(3.825f, 9.485f);
        mPath.rLineTo(5.657f, 5.657f);
        mPath.rLineTo(-2.828f, 2.828f);
        mPath.rLineTo(-5.657f, -5.657f);
        mPath.close();
        mPath.moveTo(3.825f, 9.485f);
        
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
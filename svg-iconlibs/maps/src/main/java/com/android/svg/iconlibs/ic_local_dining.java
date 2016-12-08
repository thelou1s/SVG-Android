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
public class ic_local_dining extends SVGRenderer {

    public ic_local_dining(Context context) {
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
        
        mPath.moveTo(8.1f, 13.34f);
        mPath.rLineTo(2.83f, -2.83f);
        mPath.lineTo(3.91f, 3.5f);
        mPath.rCubicTo(-1.56f, 1.56f, -1.56f, 4.09f, 0.0f, 5.66f);
        mPath.rLineTo(4.19f, 4.18f);
        mPath.close();
        mPath.moveTo(8.1f, 13.34f);
        mPath.rMoveTo(6.78f, -1.81f);
        mPath.rCubicTo(1.53f, 0.71f, 3.68f, 0.21f, 5.27f, -1.38f);
        mPath.rCubicTo(1.91f, -1.91f, 2.28f, -4.65f, 0.81f, -6.12f);
        mPath.rCubicTo(-1.46f, -1.46f, -4.2f, -1.1f, -6.12f, 0.81f);
        mPath.rCubicTo(-1.59f, 1.59f, -2.09f, 3.74f, -1.38f, 5.27f);
        mPath.lineTo(3.7f, 19.87f);
        mPath.rLineTo(1.41f, 1.41f);
        mPath.lineTo(12.0f, 14.41f);
        mPath.rLineTo(6.88f, 6.88f);
        mPath.rLineTo(1.41f, -1.41f);
        mPath.lineTo(13.41f, 13.0f);
        mPath.rLineTo(1.47f, -1.47f);
        mPath.close();
        mPath.moveTo(14.880001f, 11.530001f);
        
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
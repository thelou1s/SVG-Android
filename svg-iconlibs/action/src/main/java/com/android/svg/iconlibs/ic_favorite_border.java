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
public class ic_favorite_border extends SVGRenderer {

    public ic_favorite_border(Context context) {
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
        
        mPath.moveTo(16.5f, 3.0f);
        mPath.rCubicTo(-1.74f, 0.0f, -3.41f, 0.81f, -4.5f, 2.09f);
        mPath.cubicTo(10.91f, 3.81f, 9.24f, 3.0f, 7.5f, 3.0f);
        mPath.cubicTo(4.42f, 3.0f, 2.0f, 5.42f, 2.0f, 8.5f);
        mPath.rCubicTo(0.0f, 3.78f, 3.4f, 6.86f, 8.55f, 11.54f);
        mPath.lineTo(12.0f, 21.35f);
        mPath.rLineTo(1.45f, -1.32f);
        mPath.cubicTo(18.6f, 15.36f, 22.0f, 12.28f, 22.0f, 8.5f);
        mPath.cubicTo(22.0f, 5.42f, 19.58f, 3.0f, 16.5f, 3.0f);
        mPath.close();
        mPath.moveTo(16.5f, 3.0f);
        mPath.rMoveTo(-4.4f, 15.55f);
        mPath.rLineTo(-0.1f, 0.1f);
        mPath.rLineTo(-0.1f, -0.1f);
        mPath.cubicTo(7.14f, 14.24f, 4.0f, 11.39f, 4.0f, 8.5f);
        mPath.cubicTo(4.0f, 6.5f, 5.5f, 5.0f, 7.5f, 5.0f);
        mPath.rCubicTo(1.54f, 0.0f, 3.04f, 0.99f, 3.57f, 2.36f);
        mPath.rLineTo(1.87f, 0f);
        mPath.cubicTo(13.46f, 5.99f, 14.96f, 5.0f, 16.5f, 5.0f);
        mPath.rCubicTo(2.0f, 0.0f, 3.5f, 1.5f, 3.5f, 3.5f);
        mPath.rCubicTo(0.0f, 2.89f, -3.14f, 5.74f, -7.9f, 10.05f);
        mPath.close();
        mPath.moveTo(12.1f, 18.55f);
        
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
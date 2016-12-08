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
public class ic_cloud_queue extends SVGRenderer {

    public ic_cloud_queue(Context context) {
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
        
        mPath.moveTo(19.35f, 10.04f);
        mPath.cubicTo(18.67f, 6.59f, 15.64f, 4.0f, 12.0f, 4.0f);
        mPath.cubicTo(9.11f, 4.0f, 6.6f, 5.64f, 5.35f, 8.04f);
        mPath.cubicTo(2.34f, 8.36f, 0.0f, 10.91f, 0.0f, 14.0f);
        mPath.rCubicTo(0.0f, 3.31f, 2.69f, 6.0f, 6.0f, 6.0f);
        mPath.rLineTo(13.0f, 0f);
        mPath.rCubicTo(2.76f, 0.0f, 5.0f, -2.24f, 5.0f, -5.0f);
        mPath.rCubicTo(0.0f, -2.64f, -2.05f, -4.78f, -4.65f, -4.96f);
        mPath.close();
        mPath.moveTo(19.35f, 10.04f);
        mPath.moveTo(19.0f, 18.0f);
        mPath.lineTo(6.0f, 18.0f);
        mPath.rCubicTo(-2.21f, 0.0f, -4.0f, -1.79f, -4.0f, -4.0f);
        mPath.rCubicTo(0.0f, -2.209999f, 1.79f, -4.0f, 4.0f, -4.0f);
        mPath.rLineTo(0.71f, 0f);
        mPath.cubicTo(7.37f, 7.69f, 9.48f, 6.0f, 12.0f, 6.0f);
        mPath.rCubicTo(3.04f, 0.0f, 5.5f, 2.46f, 5.5f, 5.5f);
        mPath.rLineTo(0f, 0.5f);
        mPath.lineTo(19.0f, 12.0f);
        mPath.rCubicTo(1.66f, 0.0f, 3.0f, 1.34f, 3.0f, 3.0f);
        mPath.rCubicTo(0.0f, 1.6599998f, -1.34f, 3.0f, -3.0f, 3.0f);
        mPath.close();
        mPath.moveTo(19.0f, 18.0f);
        
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
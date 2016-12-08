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
public class ic_av_timer extends SVGRenderer {

    public ic_av_timer(Context context) {
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
        
        mPath.moveTo(11.0f, 17.0f);
        mPath.rCubicTo(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        mPath.rCubicTo(0.5500002f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        mPath.rCubicTo(0.0f, -0.54999924f, -0.45f, -1.0f, -1.0f, -1.0f);
        mPath.rCubicTo(-0.5500002f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
        mPath.close();
        mPath.moveTo(11.0f, 17.0f);
        mPath.rMoveTo(0.0f, -14.0f);
        mPath.rLineTo(0f, 4.0f);
        mPath.rLineTo(2.0f, 0f);
        mPath.lineTo(13.0f, 5.08f);
        mPath.rCubicTo(3.39f, 0.49f, 6.0f, 3.39f, 6.0f, 6.92f);
        mPath.rCubicTo(0.0f, 3.87f, -3.13f, 7.0f, -7.0f, 7.0f);
        mPath.rCubicTo(-3.87f, 0.0f, -7.0f, -3.13f, -7.0f, -7.0f);
        mPath.rCubicTo(0.0f, -1.68f, 0.59f, -3.22f, 1.58f, -4.42f);
        mPath.lineTo(12.0f, 13.0f);
        mPath.rLineTo(1.41f, -1.41f);
        mPath.rLineTo(-6.8f, -6.8f);
        mPath.rLineTo(0f, 0.02f);
        mPath.cubicTo(4.42f, 6.45f, 3.0f, 9.05f, 3.0f, 12.0f);
        mPath.rCubicTo(0.0f, 4.97f, 4.02f, 9.0f, 9.0f, 9.0f);
        mPath.rCubicTo(4.97f, 0.0f, 9.0f, -4.03f, 9.0f, -9.0f);
        mPath.rCubicTo(0.0f, -4.9699993f, -4.03f, -9.0f, -9.0f, -9.0f);
        mPath.rLineTo(-1.0f, 0f);
        mPath.close();
        mPath.moveTo(11.0f, 3.0f);
        mPath.rMoveTo(7.0f, 9.0f);
        mPath.rCubicTo(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        mPath.rCubicTo(-0.54999924f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
        mPath.rCubicTo(0.0f, 0.5500002f, 0.45f, 1.0f, 1.0f, 1.0f);
        mPath.rCubicTo(0.54999924f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        mPath.close();
        mPath.moveTo(18.0f, 12.0f);
        mPath.moveTo(6.0f, 12.0f);
        mPath.rCubicTo(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        mPath.rCubicTo(0.5500002f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        mPath.rCubicTo(0.0f, -0.5500002f, -0.45f, -1.0f, -1.0f, -1.0f);
        mPath.rCubicTo(-0.5500002f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
        mPath.close();
        mPath.moveTo(6.0f, 12.0f);
        
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
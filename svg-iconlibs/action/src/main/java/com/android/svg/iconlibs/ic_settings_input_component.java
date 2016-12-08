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
public class ic_settings_input_component extends SVGRenderer {

    public ic_settings_input_component(Context context) {
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
        
        mPath.moveTo(5.0f, 2.0f);
        mPath.rCubicTo(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        mPath.rCubicTo(-0.5500002f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
        mPath.rLineTo(0f, 4.0f);
        mPath.lineTo(1.0f, 6.0f);
        mPath.rLineTo(0f, 6.0f);
        mPath.rLineTo(6.0f, 0f);
        mPath.lineTo(7.0f, 6.0f);
        mPath.lineTo(5.0f, 6.0f);
        mPath.lineTo(5.0f, 2.0f);
        mPath.close();
        mPath.moveTo(5.0f, 2.0f);
        mPath.rMoveTo(4.0f, 14.0f);
        mPath.rCubicTo(0.0f, 1.3f, 0.84f, 2.4f, 2.0f, 2.82f);
        mPath.lineTo(11.0f, 23.0f);
        mPath.rLineTo(2.0f, 0f);
        mPath.rLineTo(0f, -4.18f);
        mPath.rCubicTo(1.16f, -0.41f, 2.0f, -1.51f, 2.0f, -2.82f);
        mPath.rLineTo(0f, -2.0f);
        mPath.lineTo(9.0f, 14.0f);
        mPath.rLineTo(0f, 2.0f);
        mPath.close();
        mPath.moveTo(9.0f, 16.0f);
        mPath.rMoveTo(-8.0f, 0.0f);
        mPath.rCubicTo(0.0f, 1.3f, 0.84f, 2.4f, 2.0f, 2.82f);
        mPath.lineTo(3.0f, 23.0f);
        mPath.rLineTo(2.0f, 0f);
        mPath.rLineTo(0f, -4.18f);
        mPath.cubicTo(6.16f, 18.4f, 7.0f, 17.3f, 7.0f, 16.0f);
        mPath.rLineTo(0f, -2.0f);
        mPath.lineTo(1.0f, 14.0f);
        mPath.rLineTo(0f, 2.0f);
        mPath.close();
        mPath.moveTo(1.0f, 16.0f);
        mPath.moveTo(21.0f, 6.0f);
        mPath.lineTo(21.0f, 2.0f);
        mPath.rCubicTo(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        mPath.rCubicTo(-0.54999924f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
        mPath.rLineTo(0f, 4.0f);
        mPath.rLineTo(-2.0f, 0f);
        mPath.rLineTo(0f, 6.0f);
        mPath.rLineTo(6.0f, 0f);
        mPath.lineTo(23.0f, 6.0f);
        mPath.rLineTo(-2.0f, 0f);
        mPath.close();
        mPath.moveTo(21.0f, 6.0f);
        mPath.rMoveTo(-8.0f, -4.0f);
        mPath.rCubicTo(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        mPath.rCubicTo(-0.5500002f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
        mPath.rLineTo(0f, 4.0f);
        mPath.lineTo(9.0f, 6.0f);
        mPath.rLineTo(0f, 6.0f);
        mPath.rLineTo(6.0f, 0f);
        mPath.lineTo(15.0f, 6.0f);
        mPath.rLineTo(-2.0f, 0f);
        mPath.lineTo(13.0f, 2.0f);
        mPath.close();
        mPath.moveTo(13.0f, 2.0f);
        mPath.rMoveTo(4.0f, 14.0f);
        mPath.rCubicTo(0.0f, 1.3f, 0.84f, 2.4f, 2.0f, 2.82f);
        mPath.lineTo(19.0f, 23.0f);
        mPath.rLineTo(2.0f, 0f);
        mPath.rLineTo(0f, -4.18f);
        mPath.rCubicTo(1.16f, -0.41f, 2.0f, -1.51f, 2.0f, -2.82f);
        mPath.rLineTo(0f, -2.0f);
        mPath.rLineTo(-6.0f, 0f);
        mPath.rLineTo(0f, 2.0f);
        mPath.close();
        mPath.moveTo(17.0f, 16.0f);
        
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
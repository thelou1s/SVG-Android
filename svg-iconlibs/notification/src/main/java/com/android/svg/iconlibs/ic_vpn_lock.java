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
public class ic_vpn_lock extends SVGRenderer {

    public ic_vpn_lock(Context context) {
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
        
        mPath.moveTo(22.0f, 4.0f);
        mPath.rLineTo(0f, -0.5f);
        mPath.cubicTo(22.0f, 2.12f, 20.88f, 1.0f, 19.5f, 1.0f);
        mPath.cubicTo(18.12f, 1.0f, 17.0f, 2.12f, 17.0f, 3.5f);
        mPath.lineTo(17.0f, 4.0f);
        mPath.rCubicTo(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
        mPath.rLineTo(0f, 4.0f);
        mPath.rCubicTo(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        mPath.rLineTo(5.0f, 0f);
        mPath.rCubicTo(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        mPath.lineTo(23.0f, 5.0f);
        mPath.rCubicTo(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        mPath.close();
        mPath.moveTo(22.0f, 4.0f);
        mPath.rMoveTo(-0.8f, 0.0f);
        mPath.rLineTo(-3.4f, 0f);
        mPath.rLineTo(0f, -0.5f);
        mPath.rCubicTo(0.0f, -0.94f, 0.76f, -1.7f, 1.7f, -1.7f);
        mPath.rCubicTo(0.94000053f, 0.0f, 1.7f, 0.76f, 1.7f, 1.7f);
        mPath.lineTo(21.200003f, 4.0f);
        mPath.close();
        mPath.moveTo(21.2f, 4.0f);
        mPath.rMoveTo(-2.28f, 8.0f);
        mPath.rCubicTo(0.04f, 0.33f, 0.08f, 0.66f, 0.08f, 1.0f);
        mPath.rCubicTo(0.0f, 2.08f, -0.8f, 3.97f, -2.1f, 5.39f);
        mPath.rCubicTo(-0.26f, -0.81f, -1.0f, -1.39f, -1.9f, -1.39f);
        mPath.rLineTo(-1.0f, 0f);
        mPath.rLineTo(0f, -3.0f);
        mPath.rCubicTo(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        mPath.lineTo(7.0f, 13.0f);
        mPath.rLineTo(0f, -2.0f);
        mPath.rLineTo(2.0f, 0f);
        mPath.rCubicTo(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        mPath.lineTo(10.0f, 8.0f);
        mPath.rLineTo(2.0f, 0f);
        mPath.rCubicTo(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        mPath.lineTo(14.0f, 3.46f);
        mPath.rCubicTo(-0.95f, -0.3f, -1.95f, -0.46f, -3.0f, -0.46f);
        mPath.cubicTo(5.48f, 3.0f, 1.0f, 7.48f, 1.0f, 13.0f);
        mPath.rCubicTo(0.0f, 5.52f, 4.48f, 10.0f, 10.0f, 10.0f);
        mPath.rCubicTo(5.52f, 0.0f, 10.0f, -4.48f, 10.0f, -10.0f);
        mPath.rCubicTo(0.0f, -0.34f, -0.02f, -0.67f, -0.05f, -1.0f);
        mPath.rLineTo(-2.03f, 0f);
        mPath.close();
        mPath.moveTo(18.92f, 12.0f);
        mPath.moveTo(10.0f, 20.93f);
        mPath.rCubicTo(-3.95f, -0.49f, -7.0f, -3.85f, -7.0f, -7.93f);
        mPath.rCubicTo(0.0f, -0.62f, 0.08f, -1.21f, 0.21f, -1.79f);
        mPath.lineTo(8.0f, 16.0f);
        mPath.rLineTo(0f, 1.0f);
        mPath.rCubicTo(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        mPath.rLineTo(0f, 1.93f);
        mPath.close();
        mPath.moveTo(10.0f, 20.93f);
        
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
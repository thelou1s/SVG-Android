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
public class ic_cake extends SVGRenderer {

    public ic_cake(Context context) {
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
        
        mPath.moveTo(12.0f, 6.0f);
        mPath.rCubicTo(1.11f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        mPath.rCubicTo(0.0f, -0.38f, -0.1f, -0.73f, -0.29f, -1.03f);
        mPath.lineTo(12.0f, 0.0f);
        mPath.rLineTo(-1.71f, 2.97f);
        mPath.rCubicTo(-0.19f, 0.3f, -0.29f, 0.65f, -0.29f, 1.03f);
        mPath.rCubicTo(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        mPath.close();
        mPath.moveTo(12.0f, 6.0f);
        mPath.rMoveTo(4.6f, 9.99f);
        mPath.rLineTo(-1.07f, -1.07f);
        mPath.rLineTo(-1.08f, 1.07f);
        mPath.rCubicTo(-1.3f, 1.3f, -3.58f, 1.31f, -4.89f, 0.0f);
        mPath.rLineTo(-1.07f, -1.07f);
        mPath.rLineTo(-1.09f, 1.07f);
        mPath.cubicTo(6.75f, 16.64f, 5.88f, 17.0f, 4.96f, 17.0f);
        mPath.rCubicTo(-0.73f, 0.0f, -1.4f, -0.23f, -1.96f, -0.61f);
        mPath.lineTo(3.0f, 21.0f);
        mPath.rCubicTo(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        mPath.rLineTo(16.0f, 0f);
        mPath.rCubicTo(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        mPath.rLineTo(0f, -4.61f);
        mPath.rCubicTo(-0.56f, 0.38f, -1.23f, 0.61f, -1.96f, 0.61f);
        mPath.rCubicTo(-0.92f, 0.0f, -1.79f, -0.36f, -2.44f, -1.01f);
        mPath.close();
        mPath.moveTo(16.6f, 15.99f);
        mPath.moveTo(18.0f, 9.0f);
        mPath.rLineTo(-5.0f, 0f);
        mPath.lineTo(13.0f, 7.0f);
        mPath.rLineTo(-2.0f, 0f);
        mPath.rLineTo(0f, 2.0f);
        mPath.lineTo(6.0f, 9.0f);
        mPath.rCubicTo(-1.66f, 0.0f, -3.0f, 1.34f, -3.0f, 3.0f);
        mPath.rLineTo(0f, 1.54f);
        mPath.rCubicTo(0.0f, 1.08f, 0.88f, 1.96f, 1.96f, 1.96f);
        mPath.rCubicTo(0.52f, 0.0f, 1.02f, -0.2f, 1.38f, -0.57f);
        mPath.rLineTo(2.14f, -2.13f);
        mPath.rLineTo(2.13f, 2.13f);
        mPath.rCubicTo(0.74f, 0.74f, 2.03f, 0.74f, 2.77f, 0.0f);
        mPath.rLineTo(2.14f, -2.13f);
        mPath.rLineTo(2.13f, 2.13f);
        mPath.rCubicTo(0.37f, 0.37f, 0.86f, 0.57f, 1.38f, 0.57f);
        mPath.rCubicTo(1.08f, 0.0f, 1.96f, -0.88f, 1.96f, -1.96f);
        mPath.lineTo(20.990002f, 12.0f);
        mPath.cubicTo(21.0f, 10.34f, 19.66f, 9.0f, 18.0f, 9.0f);
        mPath.close();
        mPath.moveTo(18.0f, 9.0f);
        
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
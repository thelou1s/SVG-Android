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
public class ic_recent_actors extends SVGRenderer {

    public ic_recent_actors(Context context) {
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
        
        mPath.moveTo(21.0f, 5.0f);
        mPath.rLineTo(0f, 14.0f);
        mPath.rLineTo(2.0f, 0f);
        mPath.lineTo(23.0f, 5.0f);
        mPath.rLineTo(-2.0f, 0f);
        mPath.close();
        mPath.moveTo(21.0f, 5.0f);
        mPath.rMoveTo(-4.0f, 14.0f);
        mPath.rLineTo(2.0f, 0f);
        mPath.lineTo(19.0f, 5.0f);
        mPath.rLineTo(-2.0f, 0f);
        mPath.rLineTo(0f, 14.0f);
        mPath.close();
        mPath.moveTo(17.0f, 19.0f);
        mPath.moveTo(14.0f, 5.0f);
        mPath.lineTo(2.0f, 5.0f);
        mPath.rCubicTo(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
        mPath.rLineTo(0f, 12.0f);
        mPath.rCubicTo(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        mPath.rLineTo(12.0f, 0f);
        mPath.rCubicTo(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        mPath.lineTo(15.0f, 6.0f);
        mPath.rCubicTo(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        mPath.close();
        mPath.moveTo(14.0f, 5.0f);
        mPath.moveTo(8.0f, 7.75f);
        mPath.rCubicTo(1.24f, 0.0f, 2.25f, 1.01f, 2.25f, 2.25f);
        mPath.cubicTo(10.25f, 11.24f, 9.24f, 12.25f, 8.0f, 12.25f);
        mPath.cubicTo(6.76f, 12.25f, 5.75f, 11.24f, 5.75f, 10.0f);
        mPath.cubicTo(5.75f, 8.76f, 6.76f, 7.75f, 8.0f, 7.75f);
        mPath.close();
        mPath.moveTo(8.0f, 7.75f);
        mPath.moveTo(12.5f, 17.0f);
        mPath.rLineTo(-9.0f, 0f);
        mPath.rLineTo(0f, -0.75f);
        mPath.rCubicTo(0.0f, -1.5f, 3.0f, -2.25f, 4.5f, -2.25f);
        mPath.rCubicTo(1.5f, 0.0f, 4.5f, 0.75f, 4.5f, 2.25f);
        mPath.lineTo(12.5f, 17.0f);
        mPath.close();
        mPath.moveTo(12.5f, 17.0f);
        
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
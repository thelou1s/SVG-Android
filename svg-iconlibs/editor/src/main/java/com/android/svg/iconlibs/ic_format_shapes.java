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
public class ic_format_shapes extends SVGRenderer {

    public ic_format_shapes(Context context) {
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
        
        mPath.moveTo(23.0f, 7.0f);
        mPath.lineTo(23.0f, 1.0f);
        mPath.rLineTo(-6.0f, 0f);
        mPath.rLineTo(0f, 2.0f);
        mPath.lineTo(7.0f, 3.0f);
        mPath.lineTo(7.0f, 1.0f);
        mPath.lineTo(1.0f, 1.0f);
        mPath.rLineTo(0f, 6.0f);
        mPath.rLineTo(2.0f, 0f);
        mPath.rLineTo(0f, 10.0f);
        mPath.lineTo(1.0f, 17.0f);
        mPath.rLineTo(0f, 6.0f);
        mPath.rLineTo(6.0f, 0f);
        mPath.rLineTo(0f, -2.0f);
        mPath.rLineTo(10.0f, 0f);
        mPath.rLineTo(0f, 2.0f);
        mPath.rLineTo(6.0f, 0f);
        mPath.rLineTo(0f, -6.0f);
        mPath.rLineTo(-2.0f, 0f);
        mPath.lineTo(21.0f, 7.0f);
        mPath.rLineTo(2.0f, 0f);
        mPath.close();
        mPath.moveTo(23.0f, 7.0f);
        mPath.moveTo(3.0f, 3.0f);
        mPath.rLineTo(2.0f, 0f);
        mPath.rLineTo(0f, 2.0f);
        mPath.lineTo(3.0f, 5.0f);
        mPath.lineTo(3.0f, 3.0f);
        mPath.close();
        mPath.moveTo(3.0f, 3.0f);
        mPath.rMoveTo(2.0f, 18.0f);
        mPath.lineTo(3.0f, 21.0f);
        mPath.rLineTo(0f, -2.0f);
        mPath.rLineTo(2.0f, 0f);
        mPath.rLineTo(0f, 2.0f);
        mPath.close();
        mPath.moveTo(5.0f, 21.0f);
        mPath.rMoveTo(12.0f, -2.0f);
        mPath.lineTo(7.0f, 19.0f);
        mPath.rLineTo(0f, -2.0f);
        mPath.lineTo(5.0f, 17.0f);
        mPath.lineTo(5.0f, 7.0f);
        mPath.rLineTo(2.0f, 0f);
        mPath.lineTo(7.0f, 5.0f);
        mPath.rLineTo(10.0f, 0f);
        mPath.rLineTo(0f, 2.0f);
        mPath.rLineTo(2.0f, 0f);
        mPath.rLineTo(0f, 10.0f);
        mPath.rLineTo(-2.0f, 0f);
        mPath.rLineTo(0f, 2.0f);
        mPath.close();
        mPath.moveTo(17.0f, 19.0f);
        mPath.rMoveTo(4.0f, 2.0f);
        mPath.rLineTo(-2.0f, 0f);
        mPath.rLineTo(0f, -2.0f);
        mPath.rLineTo(2.0f, 0f);
        mPath.rLineTo(0f, 2.0f);
        mPath.close();
        mPath.moveTo(21.0f, 21.0f);
        mPath.moveTo(19.0f, 5.0f);
        mPath.lineTo(19.0f, 3.0f);
        mPath.rLineTo(2.0f, 0f);
        mPath.rLineTo(0f, 2.0f);
        mPath.rLineTo(-2.0f, 0f);
        mPath.close();
        mPath.moveTo(19.0f, 5.0f);
        mPath.rMoveTo(-5.27f, 9.0f);
        mPath.rLineTo(-3.49f, 0f);
        mPath.rLineTo(-0.73f, 2.0f);
        mPath.lineTo(7.89f, 16.0f);
        mPath.rLineTo(3.4f, -9.0f);
        mPath.rLineTo(1.4f, 0f);
        mPath.rLineTo(3.41f, 9.0f);
        mPath.rLineTo(-1.63f, 0f);
        mPath.rLineTo(-0.74f, -2.0f);
        mPath.close();
        mPath.moveTo(13.73f, 14.0f);
        mPath.rMoveTo(-3.04f, -1.26f);
        mPath.rLineTo(2.61f, 0f);
        mPath.lineTo(12.0f, 8.91f);
        mPath.rLineTo(-1.31f, 3.83f);
        mPath.close();
        mPath.moveTo(10.69f, 12.74f);
        
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
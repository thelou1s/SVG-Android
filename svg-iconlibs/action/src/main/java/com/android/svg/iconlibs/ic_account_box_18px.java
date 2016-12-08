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
public class ic_account_box_18px extends SVGRenderer {

    public ic_account_box_18px(Context context) {
        super(context);
        mAlpha = 1.0f;
        mWidth = dip2px(18.0f);
        mHeight = dip2px(18.0f);
    }

    @Override
    public void render(Canvas canvas, int w, int h, ColorFilter filter) {
        
        final float scaleX = w / 18.0f;
        final float scaleY = h / 18.0f;
        
        mPath.reset();
        mRenderPath.reset();
        
        mFinalPathMatrix.setValues(new float[]{1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f});
        mFinalPathMatrix.postScale(scaleX, scaleY);
        
        mPath.moveTo(15.0f, 2.0f);
        mPath.lineTo(3.0f, 2.0f);
        mPath.rCubicTo(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
        mPath.rLineTo(0f, 12.0f);
        mPath.rCubicTo(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        mPath.rLineTo(12.0f, 0f);
        mPath.rCubicTo(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        mPath.lineTo(16.0f, 3.0f);
        mPath.rCubicTo(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        mPath.close();
        mPath.moveTo(15.0f, 2.0f);
        mPath.moveTo(9.0f, 4.75f);
        mPath.rCubicTo(1.24f, 0.0f, 2.25f, 1.01f, 2.25f, 2.25f);
        mPath.cubicTo(11.25f, 8.24f, 10.24f, 9.25f, 9.0f, 9.25f);
        mPath.cubicTo(7.76f, 9.25f, 6.75f, 8.24f, 6.75f, 7.0f);
        mPath.cubicTo(6.75f, 5.76f, 7.76f, 4.75f, 9.0f, 4.75f);
        mPath.close();
        mPath.moveTo(9.0f, 4.75f);
        mPath.moveTo(13.5f, 14.0f);
        mPath.rLineTo(-9.0f, 0f);
        mPath.rLineTo(0f, -0.75f);
        mPath.rCubicTo(0.0f, -1.5f, 3.0f, -2.25f, 4.5f, -2.25f);
        mPath.rCubicTo(1.5f, 0.0f, 4.5f, 0.75f, 4.5f, 2.25f);
        mPath.lineTo(13.5f, 14.0f);
        mPath.close();
        mPath.moveTo(13.5f, 14.0f);
        
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
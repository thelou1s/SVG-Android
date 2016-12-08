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
public class ic_more extends SVGRenderer {

    public ic_more(Context context) {
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
        
        mPath.moveTo(22.0f, 3.0f);
        mPath.lineTo(7.0f, 3.0f);
        mPath.rCubicTo(-0.69f, 0.0f, -1.23f, 0.35f, -1.59f, 0.88f);
        mPath.lineTo(0.0f, 12.0f);
        mPath.rLineTo(5.41f, 8.11f);
        mPath.rCubicTo(0.36f, 0.53f, 0.97f, 0.89f, 1.66f, 0.89f);
        mPath.lineTo(22.0f, 21.0f);
        mPath.rCubicTo(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        mPath.lineTo(24.0f, 5.0f);
        mPath.rCubicTo(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        mPath.close();
        mPath.moveTo(22.0f, 3.0f);
        mPath.moveTo(9.0f, 13.5f);
        mPath.rCubicTo(-0.83f, 0.0f, -1.5f, -0.67f, -1.5f, -1.5f);
        mPath.rCubicTo(0.0f, -0.8299999f, 0.67f, -1.5f, 1.5f, -1.5f);
        mPath.rCubicTo(0.8299999f, 0.0f, 1.5f, 0.67f, 1.5f, 1.5f);
        mPath.rCubicTo(0.0f, 0.8299999f, -0.67f, 1.5f, -1.5f, 1.5f);
        mPath.close();
        mPath.moveTo(9.0f, 13.5f);
        mPath.rMoveTo(5.0f, 0.0f);
        mPath.rCubicTo(-0.83f, 0.0f, -1.5f, -0.67f, -1.5f, -1.5f);
        mPath.rCubicTo(0.0f, -0.8299999f, 0.67f, -1.5f, 1.5f, -1.5f);
        mPath.rCubicTo(0.8299999f, 0.0f, 1.5f, 0.67f, 1.5f, 1.5f);
        mPath.rCubicTo(0.0f, 0.8299999f, -0.67f, 1.5f, -1.5f, 1.5f);
        mPath.close();
        mPath.moveTo(14.0f, 13.5f);
        mPath.rMoveTo(5.0f, 0.0f);
        mPath.rCubicTo(-0.83f, 0.0f, -1.5f, -0.67f, -1.5f, -1.5f);
        mPath.rCubicTo(0.0f, -0.8299999f, 0.67f, -1.5f, 1.5f, -1.5f);
        mPath.rCubicTo(0.8299999f, 0.0f, 1.5f, 0.67f, 1.5f, 1.5f);
        mPath.rCubicTo(0.0f, 0.8299999f, -0.67f, 1.5f, -1.5f, 1.5f);
        mPath.close();
        mPath.moveTo(19.0f, 13.5f);
        
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
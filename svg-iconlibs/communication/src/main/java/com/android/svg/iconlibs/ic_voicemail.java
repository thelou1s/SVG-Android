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
public class ic_voicemail extends SVGRenderer {

    public ic_voicemail(Context context) {
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
        
        mPath.moveTo(18.5f, 6.0f);
        mPath.cubicTo(15.46f, 6.0f, 13.0f, 8.46f, 13.0f, 11.5f);
        mPath.rCubicTo(0.0f, 1.33f, 0.47f, 2.55f, 1.26f, 3.5f);
        mPath.lineTo(9.74f, 15.0f);
        mPath.rCubicTo(0.79f, -0.95f, 1.26f, -2.17f, 1.26f, -3.5f);
        mPath.cubicTo(11.0f, 8.46f, 8.54f, 6.0f, 5.5f, 6.0f);
        mPath.cubicTo(2.46f, 6.0f, 0.0f, 8.46f, 0.0f, 11.5f);
        mPath.cubicTo(0.0f, 14.54f, 2.46f, 17.0f, 5.5f, 17.0f);
        mPath.rLineTo(13.0f, 0f);
        mPath.rCubicTo(3.04f, 0.0f, 5.5f, -2.46f, 5.5f, -5.5f);
        mPath.cubicTo(24.0f, 8.46f, 21.54f, 6.0f, 18.5f, 6.0f);
        mPath.close();
        mPath.moveTo(18.5f, 6.0f);
        mPath.rMoveTo(-13.0f, 9.0f);
        mPath.cubicTo(3.57f, 15.0f, 2.0f, 13.43f, 2.0f, 11.5f);
        mPath.cubicTo(2.0f, 9.57f, 3.57f, 8.0f, 5.5f, 8.0f);
        mPath.cubicTo(7.4300003f, 8.0f, 9.0f, 9.57f, 9.0f, 11.5f);
        mPath.cubicTo(9.0f, 13.43f, 7.43f, 15.0f, 5.5f, 15.0f);
        mPath.close();
        mPath.moveTo(5.5f, 15.0f);
        mPath.rMoveTo(13.0f, 0.0f);
        mPath.rCubicTo(-1.93f, 0.0f, -3.5f, -1.57f, -3.5f, -3.5f);
        mPath.cubicTo(15.0f, 9.57f, 16.57f, 8.0f, 18.5f, 8.0f);
        mPath.cubicTo(20.43f, 8.0f, 22.0f, 9.57f, 22.0f, 11.5f);
        mPath.cubicTo(22.0f, 13.43f, 20.43f, 15.0f, 18.5f, 15.0f);
        mPath.close();
        mPath.moveTo(18.5f, 15.0f);
        
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
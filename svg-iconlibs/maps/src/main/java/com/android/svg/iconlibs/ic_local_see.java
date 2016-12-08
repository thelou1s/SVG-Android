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
public class ic_local_see extends SVGRenderer {

    public ic_local_see(Context context) {
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
        
        mPath.moveTo(12.0f, 12.0f);
        mPath.rMoveTo(-3.2f, 0.0f);
        mPath.cubicTo(8.797845f, 11.32294f, 9.010624f, 10.662354f, 9.407545f, 10.113839f);
        mPath.cubicTo(9.804466f, 9.565325f, 10.365412f, 9.156681f, 11.009204f, 8.947047f);
        mPath.cubicTo(11.652996f, 8.737413f, 12.347005f, 8.737413f, 12.990797f, 8.947047f);
        mPath.cubicTo(13.634589f, 9.156681f, 14.195535f, 9.565325f, 14.592456f, 10.113839f);
        mPath.cubicTo(14.989377f, 10.662354f, 15.202156f, 11.32294f, 15.200001f, 12.0f);
        mPath.cubicTo(15.200262f, 12.6758375f, 14.986411f, 13.334693f, 14.589291f, 13.881549f);
        mPath.cubicTo(14.19217f, 14.428405f, 13.631834f, 14.835645f, 12.98909f, 15.044539f);
        mPath.cubicTo(12.346347f, 15.253435f, 11.653655f, 15.253435f, 11.010912f, 15.044539f);
        mPath.cubicTo(10.368168f, 14.835645f, 9.807832f, 14.428405f, 9.410711f, 13.881549f);
        mPath.cubicTo(9.013591f, 13.334693f, 8.79974f, 12.6758375f, 8.800001f, 12.0f);
        
        mRenderPath.addPath(mPath, mFinalPathMatrix);
        if (mFillPaint == null) {
            mFillPaint = new Paint();
            mFillPaint.setStyle(Paint.Style.FILL);
            mFillPaint.setAntiAlias(true);
        }
        mFillPaint.setColor(applyAlpha(-16777216, 1.0f));
        mFillPaint.setColorFilter(filter);
        canvas.drawPath(mRenderPath, mFillPaint);
        mPath.reset();
        mRenderPath.reset();
        
        mFinalPathMatrix.setValues(new float[]{1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f});
        mFinalPathMatrix.postScale(scaleX, scaleY);
        
        mPath.moveTo(9.0f, 2.0f);
        mPath.lineTo(7.17f, 4.0f);
        mPath.lineTo(4.0f, 4.0f);
        mPath.rCubicTo(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
        mPath.rLineTo(0f, 12.0f);
        mPath.rCubicTo(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        mPath.rLineTo(16.0f, 0f);
        mPath.rCubicTo(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        mPath.lineTo(22.0f, 6.0f);
        mPath.rCubicTo(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        mPath.rLineTo(-3.17f, 0f);
        mPath.lineTo(15.0f, 2.0f);
        mPath.lineTo(9.0f, 2.0f);
        mPath.close();
        mPath.moveTo(9.0f, 2.0f);
        mPath.rMoveTo(3.0f, 15.0f);
        mPath.rCubicTo(-2.76f, 0.0f, -5.0f, -2.24f, -5.0f, -5.0f);
        mPath.rCubicTo(0.0f, -2.7600002f, 2.24f, -5.0f, 5.0f, -5.0f);
        mPath.rCubicTo(2.7600002f, 0.0f, 5.0f, 2.24f, 5.0f, 5.0f);
        mPath.rCubicTo(0.0f, 2.7600002f, -2.24f, 5.0f, -5.0f, 5.0f);
        mPath.close();
        mPath.moveTo(12.0f, 17.0f);
        
        mRenderPath.addPath(mPath, mFinalPathMatrix);
        mFillPaint.setColor(applyAlpha(-16777216, 1.0f));
        mFillPaint.setColorFilter(filter);
        canvas.drawPath(mRenderPath, mFillPaint);

    }

}
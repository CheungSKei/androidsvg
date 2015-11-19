package com.svgtest.com;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.AttributeSet;
import android.util.Log;
import android.widget.ImageView;

/**
 *
 * Created by Tony.Cheung on 2015/11/15.
 */
public class svgCode extends ImageView{

    private Path mPath1,mPath2;
    private Paint mPaint1;
    private Matrix mMatrix,mMatrix2;
    private float mScale = 1.0f;

    public svgCode(Context context) {
        super(context, null);
        mPath1 = new Path();
        mPath2 = new Path();
        mPaint1 = new Paint();
        mPaint1.setColor(Color.parseColor("#ff253642"));
        mPaint1.setStrokeWidth(1.0F);
        mMatrix = new Matrix();
        mMatrix2 = new Matrix();
    }

    public svgCode(Context context, AttributeSet attrs) {
        super(context, attrs,0);
        mPath1 = new Path();
        mPath2 = new Path();
        mPaint1 = new Paint();
        mPaint1.setColor(Color.parseColor("#ff253642"));
        mPaint1.setStrokeWidth(1.0F);
        mMatrix = new Matrix();
        mMatrix2 = new Matrix();
    }

    public void setScale(float value){
        mScale = value;
        invalidate();
    }

    @Override
    protected void onDraw(Canvas canvas) {
        long curentTime = System.nanoTime();
        Log.e("SVGCode", String.format("startRender: %sns", curentTime));
        mMatrix.reset();
        mMatrix.setValues(new float[]{1.3333334f * mScale, 0.0f, 0.0f, 0.0f, 1.3333334f * mScale, 0.0f, 0.0f, 0.0f, 1.0f});
        canvas.concat(mMatrix);
        canvas.save();
        mMatrix2.reset();
        mMatrix2.setValues(new float[]{0.1f, 0.0f, 0.0f, 0.0f, -0.1f, 72.0f, 0.0f, 0.0f, 1.0f});
        canvas.concat(mMatrix2);
        canvas.save();
        mPath1.moveTo(0.0f, 360.0f);
        mPath1.lineTo(0.0f, 0.0f);
        mPath1.lineTo(360.0f, 0.0f);
        mPath1.lineTo(720.0f, 0.0f);
        mPath1.lineTo(720.0f, 360.0f);
        mPath1.lineTo(720.0f,720.0f);
        mPath1.lineTo(360.0f,720.0f);
        mPath1.lineTo(0.0f,720.0f);
        mPath1.lineTo(0.0f, 360.0f);
        mPath1.moveTo(335.0f, 640.0f);
        mPath1.cubicTo(426.0f, 555.0f, 403.0f, 456.0f, 271.0f, 365.0f);
        mPath1.cubicTo(188.0f, 308.0f, 160.0f, 267.0f, 160.0f, 205.0f);
        mPath1.cubicTo(160.0f, 146.0f, 189.0f, 99.0f, 240.0f, 73.0f);
        mPath1.lineTo(284.0f, 50.0f);
        mPath1.lineTo(242.0f, 50.0f);
        mPath1.cubicTo(130.0f, 50.0f, 50.0f, 129.0f, 50.0f, 239.0f);
        mPath1.cubicTo(50.0f, 304.0f, 62.0f, 333.0f, 115.0f, 401.0f);
        mPath1.cubicTo(177.0f, 480.0f, 186.0f, 507.0f, 162.0f, 539.0f);
        mPath1.cubicTo(142.0f, 567.0f, 95.0f, 579.0f, 77.0f, 561.0f);
        mPath1.cubicTo(71.0f,555.0f,62.0f,550.0f,58.0f,550.0f);
        mPath1.cubicTo(29.0f,550.0f,87.0f,622.0f,139.0f,650.0f);
        mPath1.cubicTo(193.0f, 680.0f, 299.0f, 674.0f, 335.0f, 640.0f);
        mPath1.moveTo(551.0f, 538.0f);
        mPath1.cubicTo(558.0f, 518.0f, 574.0f, 499.0f, 594.0f, 490.0f);
        mPath1.cubicTo(636.0f, 469.0f, 670.0f, 416.0f, 670.0f, 369.0f);
        mPath1.lineTo(670.0f, 330.0f);
        mPath1.lineTo(626.0f, 330.0f);
        mPath1.cubicTo(598.0f, 330.0f, 559.0f, 341.0f, 518.0f, 360.0f);
        mPath1.cubicTo(482.0f, 377.0f, 433.0f, 394.0f, 409.0f, 399.0f);
        mPath1.lineTo(365.0f, 407.0f);
        mPath1.lineTo(405.0f, 425.0f);
        mPath1.cubicTo(465.0f, 451.0f, 500.0f, 479.0f, 500.0f, 500.0f);
        mPath1.cubicTo(500.0f, 524.0f, 521.0f, 570.0f, 531.0f, 570.0f);
        mPath1.cubicTo(535.0f, 570.0f, 544.0f, 555.0f, 551.0f, 538.0f);
        mPath1.moveTo(511.0f, 343.0f);
        mPath1.cubicTo(541.0f, 326.0f, 583.0f, 308.0f, 605.0f, 305.0f);
        mPath1.cubicTo(627.0f, 301.0f, 651.0f, 293.0f, 658.0f, 287.0f);
        mPath1.cubicTo(676.0f, 273.0f, 673.0f, 247.0f, 655.0f, 254.0f);
        mPath1.cubicTo(646.0f, 257.0f, 620.0f, 253.0f, 597.0f, 245.0f);
        mPath1.cubicTo(531.0f,222.0f,516.0f,226.0f,475.0f,276.0f);
        mPath1.cubicTo(433.0f,327.0f,373.0f,359.0f,322.0f,360.0f);
        mPath1.cubicTo(300.0f,360.0f,291.0f,364.0f,296.0f,371.0f);
        mPath1.cubicTo(300.0f,379.0f,329.0f,381.0f,380.0f,378.0f);
        mPath1.cubicTo(442.0f, 374.0f, 467.0f, 368.0f, 511.0f, 343.0f);
        mPath1.moveTo(401.0f, 317.0f);
        mPath1.cubicTo(456.0f, 280.0f, 480.0f, 236.0f, 480.0f, 169.0f);
        mPath1.cubicTo(480.0f, 118.0f, 483.0f, 111.0f, 503.0f, 104.0f);
        mPath1.cubicTo(528.0f, 97.0f, 560.0f, 71.0f, 560.0f, 58.0f);
        mPath1.cubicTo(560.0f, 54.0f, 505.0f, 50.0f, 438.0f, 50.0f);
        mPath1.lineTo(315.0f, 50.0f);
        mPath1.lineTo(346.0f, 69.0f);
        mPath1.cubicTo(391.0f, 96.0f, 410.0f, 128.0f, 410.0f, 176.0f);
        mPath1.cubicTo(410.0f, 229.0f, 374.0f, 275.0f, 322.0f, 290.0f);
        mPath1.cubicTo(290.0f, 298.0f, 278.0f, 296.0f, 238.0f, 276.0f);
        mPath1.cubicTo(211.0f, 264.0f, 190.0f, 256.0f, 190.0f, 260.0f);
        mPath1.cubicTo(190.0f,274.0f,233.0f,322.0f,254.0f,330.0f);
        mPath1.cubicTo(296.0f, 347.0f, 365.0f, 341.0f, 401.0f, 317.0f);
        mPath1.moveTo(340.0f, 255.0f);
        mPath1.cubicTo(380.0f, 234.0f, 396.0f, 183.0f, 376.0f, 137.0f);
        mPath1.cubicTo(359.0f, 95.0f, 335.0f, 80.0f, 285.0f, 80.0f);
        mPath1.cubicTo(213.0f, 80.0f, 176.0f, 155.0f, 212.0f, 226.0f);
        mPath1.cubicTo(232.0f, 268.0f, 290.0f, 281.0f, 340.0f, 255.0f);
        canvas.drawPath(mPath1, mPaint1);
        canvas.restore();
        canvas.save();
        mPath2.moveTo(266.0f, 194.0f);
        mPath2.cubicTo(246.0f, 175.0f, 261.0f, 140.0f, 290.0f, 140.0f);
        mPath2.cubicTo(319.0f, 140.0f, 334.0f, 175.0f, 314.0f, 194.0f);
        mPath2.cubicTo(295.0f, 214.0f, 285.0f, 214.0f, 266.0f,194.0f);
        canvas.drawPath(mPath2, mPaint1);
        canvas.restore();
        canvas.restore();
        long endTime = System.nanoTime();
        Log.e("SVGCode", String.format("endRender: %sns", endTime));
        Log.e("SVGCode", String.format("useTime: %sns", endTime - curentTime));
        super.onDraw(canvas);
    }

}

package com.example.animationexample;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.os.Bundle;
import android.view.View;

public class canvasExample extends AppCompatActivity {
    ExampleCanvas exampleCanvas;
    ExampleCanvas1 excan1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_canvas_example);
       exampleCanvas = new ExampleCanvas(this);
       excan1=new ExampleCanvas1(this);
       setContentView(exampleCanvas);
       setContentView(excan1);
    }
}


class ExampleCanvas1 extends View{


    public ExampleCanvas1(Context context) {
        super(context);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Paint paint1=new Paint();
        paint1.setStyle(Paint.Style.FILL);
        paint1.setColor(Color.GREEN);
        canvas.drawPaint(paint1);
        paint1.setStyle(Paint.Style.FILL);
        paint1.setColor(Color.BLUE);
        paint1.setTextSize(100);

        canvas.drawText("Welcome", 500,500, paint1);
        paint1.setStyle(Paint.Style.STROKE);
        paint1.setColor(Color.BLUE);
        canvas.drawRect(50,50,200,200,paint1);


    }
}

class ExampleCanvas extends View {

    public ExampleCanvas(Context context) {
        super(context);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Paint paint = new Paint();
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(Color.RED);
        canvas.drawPaint(paint);
        paint.setAntiAlias(false);
        paint.setColor(Color.BLUE);
        canvas.drawCircle(50, 50, 50, paint);

        paint.setColor(Color.GREEN);
        canvas.drawRect(100, 100, 200, 500, paint);
       // canvas.rotate(-45);

        paint.setStyle(Paint.Style.FILL);
        paint.setColor(Color.GREEN);
        paint.setTextSize(80);
        canvas.drawText("Android", 300, 180, paint);

    }
}
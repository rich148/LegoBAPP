package com.share2pley.share2pleyapp.Model;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.widget.ProgressBar;

/**
 * 
 * @author Marijn Otte
 * 
 *         This class is used for the progressbar with as text the percentage.
 */
public class TextProgressBar extends ProgressBar {
	private String text;
	private final Paint textPaint;

	public TextProgressBar(Context context) {
		super(context);
		text = "100%";
		textPaint = new Paint();
		textPaint.setColor(Color.WHITE);
		textPaint.setTextSize(30);
	}

	public TextProgressBar(Context context, AttributeSet attrs) {
		super(context, attrs);
		text = "100%";
		textPaint = new Paint();
		textPaint.setColor(Color.WHITE);
		textPaint.setTextSize(30);
	}

	public TextProgressBar(Context context, AttributeSet attrs, int defStyle) {
		super(context, attrs, defStyle);
		text = "100%";
		textPaint = new Paint();
		textPaint.setColor(Color.WHITE);
		textPaint.setTextSize(30);
	}

	@SuppressLint("DrawAllocation")
	@Override
	protected synchronized void onDraw(Canvas canvas) {
		// First draw the regular progress bar, then custom draw our text
		super.onDraw(canvas);
		Rect bounds = new Rect();
		textPaint.getTextBounds(text, 0, text.length(), bounds);
		int x = getWidth() / 2 - bounds.centerX();
		int y = getHeight() / 2 - bounds.centerY();
		canvas.drawText(text, x, y, textPaint);
	}

	public synchronized void setText(String text) {
		this.text = text;
		drawableStateChanged();
	}

	public void setTextColor(int color) {
		textPaint.setColor(color);
		drawableStateChanged();
	}
}

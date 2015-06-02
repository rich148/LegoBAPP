package com.share2pley.share2pleyapp.Model;

import android.content.Context;


public class Brick {
	private int mSource;
	private int mAmount;

	
	
	public Brick(int source, int amount, Context context){
		mSource = source;
		mAmount = amount;
	}
	
	public int getAmount(){
		return mAmount;
	}
	
	public int getSource(){
		return mSource;
	}
	
	public void setAmount(int newamount){
		mAmount = newamount;
	}
	
	public String toString(){
		return mAmount + "x";
	}
	

	
	
	

	
	
}
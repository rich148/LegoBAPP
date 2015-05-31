package com.share2pley.share2pleyapp.Model;

import java.lang.reflect.Field;
import java.util.ArrayList;

import android.content.Context;

import com.share2pley.share2pleyapp.R;

//Lab with all sets
public class SetLab {

	private Context context;
	private ArrayList<Set> mSetList;
	private String[] mFileNameArray;
	private String[] mNameArrayFullLength;
	private String[] mTypeArray;
	private String[] mAgesArray;
	private static SetLab sSetLab;
	private Context mContext;


	private SetLab(Context context){
		mContext = context;
		mNameArrayFullLength = context.getResources().getStringArray(R.array.nameStringsArray);
		mTypeArray = context.getResources().getStringArray(R.array.typeStringsArray);
		mAgesArray = context.getResources().getStringArray(R.array.ageStringsArray);
		mFileNameArray = new String[]{"Speelhuis","hetgrotebos","","","","","","","","","","","","","",""};
		mSetList =  new ArrayList<Set>();

		for (int i=0; i<16; i++) {
			mSetList.add(new Set(mFileNameArray[i],context));
		}
	}

	public static SetLab get(Context context){
		if (sSetLab == null){
			sSetLab = new SetLab(context);
		}
		return sSetLab;
	}

	public Set getSet(int index){
		return mSetList.get(index); 
	}

	public int getAmount(){
		return mSetList.size();
	}

	public String getRealString(int i) {
		return mNameArrayFullLength[i];
	}
	
	//return the type of the set
	public String getType(int i) {
		return mTypeArray[i/2];
	}
	
	//returns only the infant age when it's Duplo
	public String getAge(int i) {
		if (i<2) {
			return mAgesArray[0];
		}
		else {
			return mAgesArray[1];
		}
	}



}
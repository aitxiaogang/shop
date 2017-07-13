package com.xiaogang.shop.util;

import java.util.Random;

public class NumberUtil {
	
	private static Random random = new Random();
	
	public static Integer randomNum(Integer range){
		int nextInt = random.nextInt(range);
		return nextInt;
	}
	
	public static Integer randomNum(Integer range,Integer min){
		int nextInt = random.nextInt(range);
		while(true){
			if(nextInt >= min){
				return nextInt;
			}else{
				nextInt = random.nextInt(range);
			}
		}
	}
	
	public static Integer randomNumLessThat(Integer range,Integer max){
		int nextInt = random.nextInt(range);
		while(true){
			if(nextInt < max){
				return nextInt;
			}else{
				nextInt = random.nextInt(range);
			}
		}
	}
	
	public static Integer randomNum(Integer range,Integer min,Integer max){
		int nextInt = random.nextInt(range);
		while(true){
			if(nextInt >= min && nextInt <= max){
				return nextInt;
			}else{
				nextInt = random.nextInt(range);
			}
		}
	}
	
	private NumberUtil(){}
}

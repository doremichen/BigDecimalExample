package com.adam.app;

import java.math.BigDecimal;

public class Example2 {

	public static void main(String[] args) {
		
		double a = 3.16552;
		double b = new BigDecimal(String.valueOf(a))
						.setScale(1, BigDecimal.ROUND_DOWN)
						.doubleValue();
		
		System.out.println("正浮點數靠近0到小數點第一位: " + b);
		double c = -3.18552;
		double d = new BigDecimal(String.valueOf(c))
						.setScale(1, BigDecimal.ROUND_DOWN)
						.doubleValue();
		
		System.out.println("負浮點數靠近0到小數點第一位: " + d);
	}

}

/*
 * ===========================================================================
 * 
 * Revision history
 * 
 * ===========================================================================
 */

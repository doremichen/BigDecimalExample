package com.adam.app;

import java.math.BigDecimal;

public class Example4 {

	public static void main(String[] args) {

		double a = 3.19552;
		double b = new BigDecimal(String.valueOf(a))
						.setScale(1, BigDecimal.ROUND_FLOOR)
						.doubleValue();
		
		System.out.println("正浮點數向負無限大到小數點第一位: " + b);
		double c = -3.11552;
		double d = new BigDecimal(String.valueOf(c))
						.setScale(1, BigDecimal.ROUND_FLOOR)
						.doubleValue();
		
		System.out.println("負浮點數向負無限大到小數點第一位: " + d);
	}

}

/*
 * ===========================================================================
 * 
 * Revision history
 * 
 * ===========================================================================
 */

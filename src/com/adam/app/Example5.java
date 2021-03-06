package com.adam.app;

import java.math.BigDecimal;

public class Example5 {

	public static void main(String[] args) {

		double a = 3.16552;
		double b = new BigDecimal(String.valueOf(a))
						.setScale(1, BigDecimal.ROUND_HALF_UP)
						.doubleValue();
		
		System.out.println("正浮點數四捨五入到小數點第一位: " + b);
		double c = -3.13552;
		double d = new BigDecimal(String.valueOf(c))
						.setScale(1, BigDecimal.ROUND_HALF_UP)
						.doubleValue();
		
		System.out.println("負浮點數四捨五入到小數點第一位: " + d);
	}

}

/*
 * ===========================================================================
 * 
 * Revision history
 * 
 * ===========================================================================
 */

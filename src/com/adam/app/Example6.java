package com.adam.app;

import java.math.BigDecimal;

public class Example6 {

	public static void main(String[] args) {

		double a = 3.35111;
		String b = new BigDecimal(Double.toString(a))
						.setScale(1, BigDecimal.ROUND_HALF_DOWN)
						.toString();
		
		System.out.println("正浮點數四捨五考慮到小數點第一位: " + b);
		double c = -3.35000000;
		String d = new BigDecimal(String.valueOf(c))
						.setScale(1, BigDecimal.ROUND_HALF_DOWN)
						.toString();
		
		System.out.println("負浮點數四捨五考慮到小數點第一位: " + d);
	}

}

/*
 * ===========================================================================
 * 
 * Revision history
 * 
 * ===========================================================================
 */

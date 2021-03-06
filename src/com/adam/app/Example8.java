package com.adam.app;

import java.math.BigDecimal;

public class Example8 {

	public static void main(String[] args) {

		double a = 3.25111;
		String b = new BigDecimal(Double.toString(a))
						.setScale(5, BigDecimal.ROUND_UNNECESSARY)
						.toString();
		
		System.out.println("正浮點數無須捨入模式: " + b);
		System.out.println("===========================");
		double c = -3.2553;
		String d = new BigDecimal(String.valueOf(c))
						.setScale(2, BigDecimal.ROUND_UNNECESSARY)
						.toString();
		
		System.out.println("負浮點數無須捨入模式: " + d);
	}

}

/*
 * ===========================================================================
 * 
 * Revision history
 * 
 * ===========================================================================
 */

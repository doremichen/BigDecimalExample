package com.adam.app;

import java.math.BigDecimal;

public class Example3 {

	public static void main(String[] args) {

		double a = 3.12552;
		double b = new BigDecimal(String.valueOf(a))
						.setScale(1, BigDecimal.ROUND_CEILING)
						.doubleValue();
		
		System.out.println("タ疊翴计タ礚计翴材: " + b);
		double c = -3.19552;
		double d = new BigDecimal(String.valueOf(c))
						.setScale(1, BigDecimal.ROUND_CEILING)
						.doubleValue();
		
		System.out.println("璽疊翴计タ礚计翴材: " + d);
		
	}

}

/*
 * ===========================================================================
 * 
 * Revision history
 * 
 * ===========================================================================
 */

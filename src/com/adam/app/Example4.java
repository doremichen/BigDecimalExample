package com.adam.app;

import java.math.BigDecimal;

public class Example4 {

	public static void main(String[] args) {

		double a = 3.19552;
		double b = new BigDecimal(String.valueOf(a))
						.setScale(1, BigDecimal.ROUND_FLOOR)
						.doubleValue();
		
		System.out.println("タ疊翴计璽礚计翴材: " + b);
		double c = -3.11552;
		double d = new BigDecimal(String.valueOf(c))
						.setScale(1, BigDecimal.ROUND_FLOOR)
						.doubleValue();
		
		System.out.println("璽疊翴计璽礚计翴材: " + d);
	}

}

/*
 * ===========================================================================
 * 
 * Revision history
 * 
 * ===========================================================================
 */

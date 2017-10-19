package com.adam.app;

import java.math.BigDecimal;

public class Example8 {

	public static void main(String[] args) {

		double a = 3.25111;
		String b = new BigDecimal(Double.toString(a))
						.setScale(5, BigDecimal.ROUND_UNNECESSARY)
						.toString();
		
		System.out.println("タ疊翴计礚斗彼家Α: " + b);
		System.out.println("===========================");
		double c = -3.2553;
		String d = new BigDecimal(String.valueOf(c))
						.setScale(2, BigDecimal.ROUND_UNNECESSARY)
						.toString();
		
		System.out.println("璽疊翴计礚斗彼家Α: " + d);
	}

}

/*
 * ===========================================================================
 * 
 * Revision history
 * 
 * ===========================================================================
 */

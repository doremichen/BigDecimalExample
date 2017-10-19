package com.adam.app;

import java.math.BigDecimal;

public class Example5 {

	public static void main(String[] args) {

		double a = 3.16552;
		double b = new BigDecimal(String.valueOf(a))
						.setScale(1, BigDecimal.ROUND_HALF_UP)
						.doubleValue();
		
		System.out.println("タ疊翴计彼き计翴材: " + b);
		double c = -3.13552;
		double d = new BigDecimal(String.valueOf(c))
						.setScale(1, BigDecimal.ROUND_HALF_UP)
						.doubleValue();
		
		System.out.println("璽疊翴计彼き计翴材: " + d);
	}

}

/*
 * ===========================================================================
 * 
 * Revision history
 * 
 * ===========================================================================
 */

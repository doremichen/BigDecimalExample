package com.adam.app;

import java.math.BigDecimal;

public class Example6 {

	public static void main(String[] args) {

		double a = 3.35111;
		String b = new BigDecimal(Double.toString(a))
						.setScale(1, BigDecimal.ROUND_HALF_DOWN)
						.toString();
		
		System.out.println("タ疊翴计彼きσ納计翴材: " + b);
		double c = -3.35000000;
		String d = new BigDecimal(String.valueOf(c))
						.setScale(1, BigDecimal.ROUND_HALF_DOWN)
						.toString();
		
		System.out.println("璽疊翴计彼きσ納计翴材: " + d);
	}

}

/*
 * ===========================================================================
 * 
 * Revision history
 * 
 * ===========================================================================
 */

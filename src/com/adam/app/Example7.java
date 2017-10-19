package com.adam.app;

import java.math.BigDecimal;

public class Example7 {

	public static void main(String[] args) {

		double a = 3.25111;
		String b = new BigDecimal(Double.toString(a))
						.setScale(1, BigDecimal.ROUND_HALF_EVEN)
						.toString();
		
		System.out.println("タ疊翴计彼せきσ納计翴材: " + b);
		double c = -3.25000;
		String d = new BigDecimal(String.valueOf(c))
						.setScale(1, BigDecimal.ROUND_HALF_EVEN)
						.toString();
		
		System.out.println("璽疊翴计彼せきσ納计翴材: " + d);
		
		double e = -3.35000;
		String f = new BigDecimal(String.valueOf(e))
						.setScale(1, BigDecimal.ROUND_HALF_EVEN)
						.toString();
		
		System.out.println("璽疊翴计彼せきσ納计翴材: " + f);
	}

}

/*
 * ===========================================================================
 * 
 * Revision history
 * 
 * ===========================================================================
 */

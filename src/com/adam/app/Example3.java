package com.adam.app;

import java.math.BigDecimal;

public class Example3 {

	public static void main(String[] args) {

		double a = 3.12552;
		double b = new BigDecimal(String.valueOf(a))
						.setScale(1, BigDecimal.ROUND_CEILING)
						.doubleValue();
		
		System.out.println("���B�I�ƦV���L���j��p���I�Ĥ@��: " + b);
		double c = -3.19552;
		double d = new BigDecimal(String.valueOf(c))
						.setScale(1, BigDecimal.ROUND_CEILING)
						.doubleValue();
		
		System.out.println("�t�B�I�ƦV���L���j��p���I�Ĥ@��: " + d);
		
	}

}

/*
 * ===========================================================================
 * 
 * Revision history
 * 
 * ===========================================================================
 */

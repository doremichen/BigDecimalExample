package com.adam.app;

import java.math.BigDecimal;

public class Example1 {

	public static void main(String[] args) {
		
		double a = 3.13552;
		double b = new BigDecimal(String.valueOf(a))
						.setScale(1, BigDecimal.ROUND_UP)
						.doubleValue();
		
		System.out.println("���B�I�ƻ���0��p���I�Ĥ@��: " + b);
		double c = -3.14552;
		double d = new BigDecimal(String.valueOf(c))
						.setScale(1, BigDecimal.ROUND_UP)
						.doubleValue();
		
		System.out.println("�t�B�I�ƻ���0��p���I�Ĥ@��: " + d);

	}

}

/*
 * ===========================================================================
 * 
 * Revision history
 * 
 * ===========================================================================
 */

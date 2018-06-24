package com.design.template;

public class TestTemplate {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String exp = "818";
		String opt = "1";
//		AbstractCalculator calculate = new PlusCalculate();
		AbstractCalculator calculate = new SubtractCalculate();
		int result = calculate.calculate(exp, opt);
		System.out.println("½á¹ûÊÇ:" + result);

	}

}

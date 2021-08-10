package week1.day2;

public class MyCalculator {
	public static void main(String[] args) {
		Calculator myCalc=new Calculator();
		int add = myCalc.add(400,500,700);
		int subtract = myCalc.subtract(500,400);
		double multiplication=myCalc.multiplication(4,12);
		float division=myCalc.division(5000000,100000);
		
		System.out.println("sum:" + add);
		System.out.println("Subtraction:" + subtract);
		System.out.println("Product:" + multiplication);
		System.out.println("Division:" + division);
		
		
		
		
	}

}

package week1.day2;

public class Calculator {
	public int add(int num1,int num2,int num3)
	{
		int sum =num1+num2+num3;
		return sum;
	}
	public int subtract(int num1,int num2)
	{
		int sub=num1-num2;
		return sub;
	}
	public double multiplication(double num1,double num2)
	{
		double product=num1*num2;
		return product;
	}
	public float division(float num1,float num2)
	{
		float divide=num1/num2;
		return divide;
	}
	public static void main(String[] args) {
		Calculator obj=new Calculator();
		int sumOfNum=obj.add(55,66,100);
		System.out.println("Sum of three numbers is: "+sumOfNum);
		int subof=obj.subtract(78,10);
		System.out.println("subtraction of two numbers is:" + subof);
		double mul=obj.multiplication(750000,10000000);
		System.out.println("Product of two numbers is:" + mul);
		float div=obj.division(100000000,10000000);
		System.out.println("Division of two numbers is:" + div);
		
		
	}

}

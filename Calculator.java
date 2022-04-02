package week3.day1;

public class Calculator {

	public int add (int NumOne, int NumTwo) {
		return NumOne+NumTwo;
		}
	
	public int add (int NumOne, int NumTwo, int NumThree) {
		return NumOne+NumTwo+NumThree;
		}
	
		public int sub (int NumOne, int NumTwo) {
			return NumOne-NumTwo;
		}
		
		public double sub (double NumOne, double NumTwo) {
			return NumOne-NumTwo;
		}
		
		public int mul (int NumOne, int NumTwo) {
			return NumOne*NumTwo;
		}
		
		public double mul (int NumOne, double NumTwo) {
			return NumOne*NumTwo;
		}
		
		public int div (int NumOne, int NumTwo) {
			return NumOne/NumTwo;
		}
		
		public double div (double NumOne, double NumTwo) {
			return NumOne/NumTwo;
		}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator ca = new Calculator();
		System.out.println("Sum of 3 Numbers is " +  + ca.add(2,5,9));
		System.out.println("Sum of 2 Numbers is " +  + ca.add(2,5));
		System.out.println("Subtraction of 2 int Numbers is " +  + ca.sub(12,5));
		System.out.println("Subtraction of 2 double Numbers is " +  + ca.sub(12.9,5.7));
		System.out.println("Product of 2 int Numbers is " +  + ca.mul(17,9));
		System.out.println("Product of 1 int and 1 double Number is " +  + ca.mul(10,5.1));
		System.out.println("Division of 2 int Numbers is " +  + ca.div(12,5));
		System.out.println("Division of 2 double Numbers is " +  + ca.div(125.6,5.0));
	}

}
//Create a Calculator class with below methods:
//- 2 methods for add. 1 method with 2 int args. 1 method with 3 int args
//- 2 methods for multiply. 1 method with 2 int args. 1 method with 1 int and 1 double
//- 2 methods for subtract - 1 method with 2 int args. 1 method with 2 double args
//- 2 methods for divide - 1 method with 2 int args. 1 method with 2 double args
//
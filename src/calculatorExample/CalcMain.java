package calculatorExample;

public class CalcMain {

	public static void main(String[] args) 
	{
		// This is how we create ab object
		// new->> java keyword which creates an object
		Calculator calc = new Calculator();
		
		calc.add(2, 6);
		System.out.println(calc.add(2, 6));

	}

}

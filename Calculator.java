

	import java.util.Scanner; //This imports the Java Scanner
	public class Calculator { //This is the class of my project (Calculator)
	   public static void main (String [] args) { //This is the entrance of the program
	   
	   double a, b; //numbers a & b are the two variables
	   
	   String operator; //operator is the program for the +,-,*,/
	   
	   System.out.println("Calculator On"); //Main screen, outputs "Calculator On"
	   System.out.println("For addition, press +"); //prints out message for "For addition, press +"
	   System.out.println("For subtraction, press -"); //prints out message for "For subtraction, press -"
	   System.out.println("For multiplication, press *"); //prints out message for "For multiplication, press *"
	   System.out.println("For division, press /");//prints out message for "For division, press /"
	   
	   Scanner input= new Scanner(System.in); //Scanner is a class for the input of the keyboard
	   operator = input.nextLine(); //nextline will return a string value, string value is assigned to inV
	   
	   //This is the error checking system
	   System.out.println(operator); 
	     if (!operator.equals("+") && // this string checks if the inV is "+"
	         !operator.equals("-") && // this string checks if the inV is "-"
	         !operator.equals("*") && // this strings check if the inV is "*"
	         !operator.equals("/") ) // this strings check if the inV is "/"
	    	 	System.out.println("Error: Please use the given numbers"); //Prints out Error if the operator is not +,-,*,/
	   
	   if (operator.equals("+")) //If the operator is +, then you must enter numbers for the operation +
	   { 
	       System.out.print("Enter the first number: "); //Prints out "Enter the first number:"
	       a = input.nextDouble(); //a is the first number you input
	       System.out.print("Enter the second number: "); // Prints out "Enter the second number"
	       b = input.nextDouble(); //b is the second number you input
	       System.out.println( a + " + " + b + " = "+ (a + b)); //Prints out your a Value "+" your b value "=" answer
	   }
	   
	   if (operator.equals("-")) //If the operator is -, then you must enter numbers for the operation -
	   {
	       System.out.print ("Enter the first number: ");//Prints out "Enter the first number:"
	       a = input.nextDouble();//a is the first number you input
	       System.out.print("Enter the second number: ");// Prints out "Enter the second number"
	       b = input.nextDouble();//b is the second number you input
	       System.out.println( a + " - " + b + " = "+ (a - b));//Prints out your a Value "-" your b value "=" answer
	   }
	   
	   if (operator.equals("*")) //If the operator is *, then you must enter numbers for the operation *
	   {
	       System.out.print ("Enter the first number: ");//Prints out "Enter the first number:"
	       a = input.nextDouble();//a is the first number you input
	       System.out.print("Enter the second number: ");//Prints out "Enter the second number:"
	       b = input.nextDouble();//b is the second number you input
	       System.out.println( a + " / " + b + " = "+ (a / b));//Prints out your a Value "*" your b value "=" answer
	   }
	   
	   if (operator.equals("/")) //If the operator is /, then you must enter numbers for the operation /
	   {
	       System.out.print ("Enter the first number: ");//Prints out "Enter the first number:"
	       a = input.nextDouble();//a is the first number you input
	       System.out.print("Enter the second number: ");//Prints out "Enter the second number:"
	       b = input.nextDouble();//b is the second number you input
	       System.out.println( a + " x " + b + " = "+ (a * b));//Prints out your a Value "/" your b value "=" answer
	   }
	   
	 
	   
	  }
	 }
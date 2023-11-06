import java.util.*;
public class Challenge0203 
{

	public static void main(String[] args)
	{
		System.out.print("Enter the value for Feet");
		Scanner key = new Scanner(System.in);
		double feet = key.nextInt();
		double meter = (feet * 0.305); 
		System.out.println(feet + " is equal to " + meter +" meters");
		
		
	}

}

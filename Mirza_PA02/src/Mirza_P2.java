import java.util.Scanner;
import java.util.Arrays;

public class Mirza_P2 
{
	private int weight;
	  private int height;
	  private int answer;
	  private float total;

	  public void readUserData()
	  {
	    Scanner input = new Scanner(System.in);

	    System.out.print("Enter 1 for weight in pounds or 2 for weight in kilograms: ");
	    this.answer = input.nextInt();

	    if(answer == 1)
	    {
	      System.out.print("Please enter your weight in pounds: ");
	      this.weight = input.nextInt();

	      System.out.print("Please enter your height in inches: ");
	      this.height = input.nextInt();
	    }
	    else if(answer == 2)
	    {
	      System.out.print("Please enter your weight in kilograms: ");
	      this.weight = input.nextInt();

	      System.out.print("Please enter your height in meters: ");
	      this.height = input.nextInt();
	    }
	  }
	  public void calculateBmi()
	  {
	    float num = this.weight;
	    float denom = this.height;
	    if(this.answer == 1)
	    {
	      num = num *= 703;
	      denom = denom *= denom;
	      this.total = num /= denom;
	    }
	    else if(this.answer == 2)
	    {
	      denom = denom *= denom;
	      this.total = num /= denom;
	    }
	  }
	  public void displayBmi()
	  {
	    System.out.print("Your calculated BMI is ");
	    System.out.printf("%.1f", this.total);
	    System.out.println();
	    System.out.println();
	    System.out.println("Here are the BMI Categories: ");
	    System.out.println("Underweight = <18.5");
	    System.out.println("Normal weight = 18.5-24.9");
	    System.out.println("Overweight = 25-29.9");
	    System.out.println("Obesity = BMI of 30 or greater");
	  }

	  public static void main(String[] args)
	  {
	    Mirza_P2 app = new Mirza_P2();
	    app.readUserData();
	    app.calculateBmi();
	    app.displayBmi();
	  }

}

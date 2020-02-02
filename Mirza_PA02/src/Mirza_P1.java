import java.util.Scanner;
import java.util.Arrays;

public class Mirza_P1 
{
	// this method encrypts the entered data
	public static void encrypt(String user)
	  {
	    int [] data = new int [4];
	    for(int i = 0; i < 4; i++)
	    {
	      data[i] = Integer.parseInt(user.charAt(i) + "");
	      data[i] = data[i] += 7;
	      data[i] = data[i] % 10;
	    }
	    int [] swap = new int [4];
	    swap[0] = data[2];
	    swap[1] = data[3];
	    swap[2] = data[0];
	    swap[3] = data[1];

	    for(int i = 0; i < 4; i++)
	    {
	      System.out.printf(" " + swap[i]);
	    }
	    System.out.print("\n");
	  }
	// This method decrypts the entered data
	  public static void decrypt(String again)
	  {
	    int [] info = new int [4];
	    int [] swapAgain = new int [4];

	    for(int i = 0; i < 4; i++)
	    {
	      info[i] = Integer.parseInt(again.charAt(i) + "");
	    }
	    swapAgain[0] = info[2];
	    swapAgain[1] = info[3];
	    swapAgain[2] = info[0];
	    swapAgain[3] = info[1];

	    for(int i = 0; i < 4; i++)
	    {
	      if(swapAgain[i] > 6)
	      {
	    	  swapAgain[i] -= 7;
	      }
	      else
	      {
	    	  swapAgain[i] +=3; 
	      }
	      
	      System.out.printf(" " + swapAgain[i]);
	    }
	    System.out.print("\n");
	  }
	  public static void main(String[] args)
	  {
	    Scanner input = new Scanner(System.in);

	    System.out.print("Enter the data to encrypt up to 4 integers: ");
	    String dataUser = input.nextLine();

	    int count = 0;

	    for(int i = 0; i < dataUser.length(); i++)
	    {
	      if(dataUser.charAt(i) != ' ')
	        count++;
	    }
	    if (count > 4 || count < 4)
	    {
	      System.out.print("Enter the data up to 4 integers: ");
	      dataUser = input.nextLine();
	    }
	    encrypt(dataUser);

	    System.out.print("Enter the data to decrypt up to 4 integers: ");
	    String moreData = input.nextLine();

	    int x = 0;

	    for(int i = 0; i < moreData.length(); i++)
	    {
	      if(moreData.charAt(i) != ' ')
	        x++;
	    }
	    if (x > 4 || x < 4)
	    {
	      System.out.print("Enter the data to decrypt up to 4 integers: ");
	      moreData = input.nextLine();
	    }
	    decrypt(moreData);
	  }
}

package Deane_01;
import java.util.Scanner;
public class Encryption {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int userNum, digitOne, digitTwo, digitThree, digitFour;
	
		Scanner scnr = new Scanner (System.in);
		
		//User input
		System.out.print("Please enter a 4 digit integer to encrypt: ");
		userNum = scnr.nextInt();
		
		while (userNum>9999) {  //Force user to put 4 digit
		
		System.out.print("Please enter a 4 digit integer: ");
		userNum = scnr.nextInt();      //Using 1234 as sample.
		}
		
		//ENCRYPTION CODE
		digitFour = (((userNum%10) + 7)%10);    //mod 10 each token 
		userNum = userNum/10;           // shifts one digit to the right so it becomes remainder ex. 123 
		
		digitThree= (((userNum%10) +7)%10);
		userNum = userNum/10;           //ex. 12 remaining
		
		digitTwo = (((userNum%10) + 7)%10);
		userNum = userNum/10;           //ex. digit 1 remaining		       
		            
		digitOne = ((userNum + 7)%10);
		
		       //SWAP DIGITS 
		       int temp = digitOne;
		       digitOne = digitThree;
		       digitThree = temp;
		       temp = digitTwo;
		       digitTwo = digitFour;
		       digitFour = temp;
		       
		       //PRINTING ENCRYPTED DIGIT
		       System.out.println(digitOne +""+ digitTwo +""+ digitThree +""+ digitFour);
				

	}

}

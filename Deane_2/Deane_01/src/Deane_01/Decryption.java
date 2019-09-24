package Deane_01;
import java.util.Scanner;
public class Decryption {

	public static void main(String[] args) {
		
		int digitOne, digitTwo, digitThree, digitFour, userNum;
	
		Scanner scnr = new Scanner (System.in);
		
		//User input
		System.out.print("Please enter a 4 digit integer to decrypt: ");
		userNum = scnr.nextInt(); 
		 //Force user to put 4 digit
		while (userNum>9999) { 
		
		System.out.print("Please enter a 4 digit integer: ");
		userNum = scnr.nextInt();      
		}
		
		//DECRYPT
				digitFour = ((userNum%10) +3)%10;
				userNum = userNum/10;
		       digitThree= ((userNum%10) +3)%10;		       
		       userNum = userNum/10; 
               digitTwo = ((userNum%10) +3)%10;
		       userNum = userNum/10;            
               digitOne = (userNum +3)%10;
		       int tmp;
		       tmp = digitOne;
		       digitOne = digitThree;
		       digitThree = tmp; 
		       tmp = digitTwo;
		       digitTwo = digitFour;
		       digitFour = tmp;
		       System.out.println(digitOne +""+ digitTwo +""+ digitThree +""+ digitFour);
				

	}

}

import java.util.Scanner;
public class rating {

	public static void main(String[] args) {
        double avgrate1=0,avgrate2=0,avgrate3=0,avgrate4=0,avgrate5=0;
        double[] avg = new double[5];
        double sumrate1=0,sumrate2=0,sumrate3=0,sumrate4=0,sumrate5=0;
        double highest,lowest;
        int responses = 0;
 
        Scanner scanner = new Scanner(System.in);
        String question= "yes";
        String MaxTopic;
        String MinTopic;
        int rating; 
 
        String[] topics = { "Science", "Travel", "History", "Mechanical Engineering", "Family" };
 
        int[][] ratings = new int[5][10];
 
        while ((question.equals("Yes"))||(question.equals("yes"))) {
 
            for (int x = 0; x < topics.length; x++) {
                System.out.println(
                        "How important " + topics[x] + " is to you? (1 = least important, 10 = most important)");
                rating = scanner.nextInt();               
                scanner.nextLine();
                ratings[x][rating - 1]++;
 
            }
                
            System.out.println("Are there are any more responses? Enter Yes or No.");
            question = scanner.nextLine();
            responses++;
        }

            for (int i = 0; i < 10; i++) {
                sumrate1 += ratings[0][i] * (i+1);
            }
            highest = sumrate1;
            lowest = sumrate1;
            MaxTopic = topics[0];
            MinTopic = topics[0];
            avgrate1 = sumrate1 / responses;
            
            
            
            for (int i = 0; i < 10; i++) {
                sumrate2 += ratings[1][i] * (i+1);
            }
     
            if (highest < sumrate2) {
            	highest = sumrate2;
                MaxTopic = topics[1];
            }
     
            if (lowest > sumrate2) {
            	lowest = sumrate2;
                MinTopic = topics[1];
            }
            
            avgrate2 = sumrate2 / responses;
     
            for (int i = 0; i < 10; i++) {
                sumrate3 += ratings[2][i] * (i+1);
            }
            if (highest < sumrate3) {
            	highest = sumrate3;
                MaxTopic = topics[2];
     
            }
     
            if (lowest > sumrate3) {
            	lowest = sumrate3;
                MinTopic = topics[2];
     
            }
            
            avgrate3 = sumrate3 / responses;
     
            for (int i = 0; i < 10; i++) {
                sumrate4 += ratings[3][i] * (i+1);
            }
            if (highest < sumrate4) {
            	highest = sumrate4;
                MaxTopic = topics[3];
     
            }
     
            if (lowest > sumrate4) {
            	lowest = sumrate4;
                MinTopic = topics[3];
     
            }
            avgrate4 = sumrate4 / responses;
            
            for (int i = 0; i < 10; i++) {
                sumrate5 += ratings[4][i] * (i+1);
            }
            if (highest < sumrate5) {
            	highest = sumrate5;
                MaxTopic = topics[4];
     
            }
     
            if (lowest > sumrate5) {
            	lowest = sumrate5;
                MinTopic = topics[4];            
	}
            
            avgrate5 = sumrate5 / responses;
            avg[0] = avgrate1;
            avg[1] = avgrate2;
            avg[2] = avgrate3;
            avg[3] = avgrate4;
            avg[4] = avgrate5;
            for (int i=1;i<11;i++) {
            	System.out.print(i+"\t");
            }
            System.out.println("Average Rating");
            
            for(int i=0;i<5;i++) {
            	for(int j=0;j<10;j++) {
            		System.out.printf("%d ", ratings[i][j]);
            	}
            }
            
     
}
	}



import java.util.Scanner;
public class Votes {
	public static void main(String[] args) {
		System.out.println("\n\n********* Main Menu *********\n");            
        System.out.println("\nElection Day Vote Counting Program");     
        System.out.println ("Please enter the number of votes: ");
		Scanner scan = new Scanner(System. in );
		int chars = Integer. parseInt ((scan.nextLine()));
		System.out.println ("Please enter the Candidates: ");
		String votes = scan.nextLine();
		
		if(chars > 0 && chars < 16) {
			int voteA = 0;
			int voteB = 0;
			for(int i = 0; i < chars; i++){
				if(votes.charAt(i)=='A'){
					voteA++;
				}
				else if(votes.charAt(i)=='B'){
					voteB++;
				}
			}
			if(voteA == voteB) {
				System. out .println("Tie!");
				System.out.println("We have two Candidates with name as A and B \n" +  "The candidates A  got " + voteA + " votes.\n " + "The candidates A  got " + voteB + " votes: ");

				System.out.println ("Total votes for Polly is: " + votes.length());
			}
			else if(voteA > voteB) {
				System.out.println("We have two Candidates with name as A and B \n" + "The candidates B  got " + voteB + " votes.\n" +  "The candidates A  got maximum votes: " + voteA);
				System.out.println ("Total votes for Polly is: " + votes.length());
			}
			else {
				System.out.println("We have two Candidates with name as A and B \n" + "The candidates A  got " + voteA + " votes: " +  "The candidates A  got maximum votes: " + voteB);
				System.out.println ("Total votes for Polly is: " + votes.length());
			}
		}
	}
}


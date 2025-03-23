import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the round number for game play: ");
        int n = sc.nextInt();

        int userScore = 0;
        int computerScore = 0;
        System.out.println("Select one Character in R and S, P.");
        for(int i=0;i<n;i++){
            System.out.print("Enter the User Choice is: ");
            String select = sc.next();

            // R--> ROCK
            // P--> PAPER
            // S-->SCISSOR
            String[] game = {"R", "P", "S"};
            int randomIndex = (int)(Math.random()* game.length);

            System.out.println("User chose: " + select);
            System.out.println("Computer chose: " + game[randomIndex]);

            if((game[randomIndex].equals("R") && select.equals("P")) ||
                    (game[randomIndex].equals("P") && select.equals("S")) ||
                    (game[randomIndex].equals("S") && select.equals("R"))){
                userScore++;
            }else if((game[randomIndex].equals("P") && select.equals("R")) ||
                    (game[randomIndex].equals("S") && select.equals("P")) ||
                    (game[randomIndex].equals("R") && select.equals("S"))){
                computerScore++;
            }
        }

        if(userScore == computerScore){
            System.out.println("Match is draw.");
            System.out.println("User Score is " + userScore);
            System.out.print("Computer Score is " + computerScore);
        }else if(userScore>computerScore){
            System.out.println("Match winner is user.");
            System.out.println("User Score is " + userScore);
            System.out.print("Computer Score is " + computerScore);
        }else{
            System.out.println("Computer is winner");
            System.out.println("User Score is " + userScore);
            System.out.print("Computer Score is " + computerScore);
        }

        sc.close();
    }
}

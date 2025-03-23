import java.util.Scanner;

public class Main {
    public static  void main(String[] args){
//        System.out.print("Hello");
        Scanner sc = new Scanner(System.in);
        // who choice the computer toss ---> yaa user toss select and yaa computer head and tail choice.
        String[] computerChoice = {"India", "Aus"};
        int indexComputerChoice = (int)(Math.random() * computerChoice.length);

        System.out.println("Computer Choice is who to choice the Head and Tail: " + computerChoice[indexComputerChoice]);

        String[] toss = {"Head", "Tail"};
        int tossIndex = (int)(Math.random() * toss.length);

        if(computerChoice[indexComputerChoice].equals("India")){
            System.out.print("India Select the one toss Head and Tail: ");
            String userTossChoice = sc.next();

            System.out.println("India choice the toss select the: " + userTossChoice);

            if(userTossChoice.equals(toss[tossIndex])){
                System.out.println("India toss win " + toss[tossIndex]);
                // Who the choice for match in first bat and ball;
                System.out.print("India choice the one Bat and Ball: ");
                String indiaChoice = sc.next();
                System.out.println("India choice the after toss win: " + indiaChoice);
                if(indiaChoice.equals("Bat")){
                    System.out.println("India first Bat.");
                    System.out.println("Australia First Ball.");
                }else if(indiaChoice.equals("Ball")){
                    System.out.println("Australia First Bat.");
                    System.out.println("India First Ball.");
                }
            }else{
                System.out.println("Australia toss win " + toss[tossIndex]);
                String[] choiceBatAndBall = {"Bat", "Ball"};
                int batAndBallIndex = (int)(Math.random() * choiceBatAndBall.length);
                System.out.println("Australia after toss the win select the Bat and Ball: " + choiceBatAndBall[batAndBallIndex]);
                if(choiceBatAndBall[batAndBallIndex].equals("Bat")){
                    System.out.println("Australia First Bat.");
                    System.out.println("India First Ball.");
                }else if(choiceBatAndBall[batAndBallIndex].equals("Ball")){
                    System.out.println("India first Bat.");
                    System.out.println("Australia First Ball.");
                }
            }

        }else if(computerChoice[indexComputerChoice].equals("Aus")){
            String[] australiaChoice = {"Head", "Tail"};
            int australiaChoiceIndex = (int)(Math.random() * australiaChoice.length);

            System.out.println("Australia choice the toss: " + australiaChoice[australiaChoiceIndex]);

            if(australiaChoice[australiaChoiceIndex].equals(toss[tossIndex])){
                System.out.println("Australia toss win " + australiaChoice[australiaChoiceIndex]);

                String[] ballAndBatChoice = {"Bat", "Ball"};
                int ballBatIndex = (int)(Math.random() * ballAndBatChoice.length);
                System.out.println("Australia after toss the win select the Bat and Ball: " + ballAndBatChoice[ballBatIndex]);
                if(ballAndBatChoice[ballBatIndex].equals("Bat")){
                    System.out.println("Australia First Bat.");
                    System.out.println("India First Ball.");
                }else{
                    System.out.println("India first Bat.");
                    System.out.println("Australia First Ball.");
                }

            }else{
                System.out.println("India toss win " + toss[tossIndex]);
                System.out.print("India choice the one Bat and Ball: ");
                String indiaChoice = sc.next();
                System.out.println("India choice the after toss win: " + indiaChoice);
                if(indiaChoice.equals("Bat")){
                    System.out.println("India first Bat.");
                    System.out.println("Australia First Ball.");
                }else if(indiaChoice.equals("Ball")){
                    System.out.println("Australia First Bat.");
                    System.out.println("India First Ball.");
                }
            }
        }

        //hello
    }
}
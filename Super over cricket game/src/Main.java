import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // who chooses the toss - computer or user
        // who choice the computer toss ---> yaa user toss select and yaa computer head and tail choice.
        String[] computerChoice = {"India", "Aus"};
        int indexComputerChoice = (int)(Math.random() * computerChoice.length);

        System.out.println("Computer Choice is who to choose the Head and Tail: " + computerChoice[indexComputerChoice]);

        String[] toss = {"Head", "Tail"};
        int tossIndex = (int)(Math.random() * toss.length);

        int indiaScore = 0;
        int ausScore = 0;
        int totalWicket = 2;
        String firstBattingTeam = "";
        String secondBattingTeam = "";
        int firstInningsScore = 0;

        if(computerChoice[indexComputerChoice].equals("India")) {
            System.out.print("India Select the one toss Head or Tail: ");
            String userTossChoice = sc.next();

            System.out.println("India choice the toss select the: " + userTossChoice);

            if(userTossChoice.equals(toss[tossIndex])) {
                System.out.println("India toss win " + toss[tossIndex]);
                // Who chooses bat or ball first
                // Who the choice for match in first bat and ball;
                System.out.print("India choice the one Bat or Ball: ");
                String indiaChoice = sc.next();
                System.out.println("India choice after toss win: " + indiaChoice);
                if(indiaChoice.equalsIgnoreCase("Bat")) {
                    System.out.println("India first Bat.");
                    System.out.println("Australia First Ball.");
                    firstBattingTeam = "India";
                    secondBattingTeam = "Australia";
                } else if(indiaChoice.equalsIgnoreCase("Ball")) {
                    System.out.println("Australia First Bat.");
                    System.out.println("India First Ball.");
                    firstBattingTeam = "Australia";
                    secondBattingTeam = "India";
                }
            } else {
                System.out.println("Australia toss win " + toss[tossIndex]);
                String[] choiceBatAndBall = {"Bat", "Ball"};
                int batAndBallIndex = (int)(Math.random() * choiceBatAndBall.length);
                System.out.println("Australia after toss the win select the Bat and Ball: " + choiceBatAndBall[batAndBallIndex]);
                if(choiceBatAndBall[batAndBallIndex].equals("Bat")) {
                    System.out.println("Australia First Bat.");
                    System.out.println("India First Ball.");
                    firstBattingTeam = "Australia";
                    secondBattingTeam = "India";
                } else if(choiceBatAndBall[batAndBallIndex].equals("Ball")) {
                    System.out.println("India first Bat.");
                    System.out.println("Australia First Ball.");
                    firstBattingTeam = "India";
                    secondBattingTeam = "Australia";
                }
            }
        } else if(computerChoice[indexComputerChoice].equals("Aus")) {
            String[] australiaChoice = {"Head", "Tail"};
            int australiaChoiceIndex = (int)(Math.random() * australiaChoice.length);

            System.out.println("Australia choice the toss: " + australiaChoice[australiaChoiceIndex]);

            if(australiaChoice[australiaChoiceIndex].equals(toss[tossIndex])) {
                System.out.println("Australia toss win " + australiaChoice[australiaChoiceIndex]);

                String[] ballAndBatChoice = {"Bat", "Ball"};
                int ballBatIndex = (int)(Math.random() * ballAndBatChoice.length);
                System.out.println("Australia after toss the win select the Bat and Ball: " + ballAndBatChoice[ballBatIndex]);
                if(ballAndBatChoice[ballBatIndex].equals("Bat")) {
                    System.out.println("Australia First Bat.");
                    System.out.println("India First Ball.");
                    firstBattingTeam = "Australia";
                    secondBattingTeam = "India";
                } else {
                    System.out.println("India first Bat.");
                    System.out.println("Australia First Ball.");
                    firstBattingTeam = "India";
                    secondBattingTeam = "Australia";
                }
            } else {
                System.out.println("India toss win " + toss[tossIndex]);
                System.out.print("India choice the one Bat or Ball: ");
                String indiaChoice = sc.next();
                System.out.println("India choice after toss win: " + indiaChoice);
                if(indiaChoice.equalsIgnoreCase("Bat")) {
                    System.out.println("India first Bat.");
                    System.out.println("Australia First Ball.");
                    firstBattingTeam = "India";
                    secondBattingTeam = "Australia";
                } else if(indiaChoice.equalsIgnoreCase("Ball")) {
                    System.out.println("Australia First Bat.");
                    System.out.println("India First Ball.");
                    firstBattingTeam = "Australia";
                    secondBattingTeam = "India";
                }
            }
        }

        // First Innings
        System.out.println("\n----------FIRST INNINGS----------");
        System.out.println(firstBattingTeam + " is batting");
        System.out.println(secondBattingTeam + " is bowling");
        firstInningsScore = playInnings(firstBattingTeam, totalWicket, sc);

        // Second Innings
        System.out.println("\n----------SECOND INNINGS----------");
        System.out.println(secondBattingTeam + " needs " + (firstInningsScore + 1) + " to win");
        System.out.println(secondBattingTeam + " is batting");
        System.out.println(firstBattingTeam + " is bowling");
        int secondInningsScore = playInnings(secondBattingTeam, totalWicket, sc);

        // Match Result
        System.out.println("\n----------MATCH RESULT----------");
        System.out.println(firstBattingTeam + ": " + firstInningsScore);
        System.out.println(secondBattingTeam + ": " + secondInningsScore);

        if (secondInningsScore > firstInningsScore) {
            int wicketsRemaining = totalWicket - getWicketsFallen(secondBattingTeam);
            System.out.println(secondBattingTeam + " wins by " + wicketsRemaining + " wickets");
        } else if (secondInningsScore < firstInningsScore) {
            System.out.println(firstBattingTeam + " wins by " + (firstInningsScore - secondInningsScore) + " runs");
        } else {
            System.out.println("Match Tied!");
        }

        sc.close();
    }

    private static int playInnings(String battingTeam, int totalWickets, Scanner sc) {
        String[] runs = {"0", "1", "2", "3", "4", "6", "W"};
        int score = 0;
        int wickets = 0;
        int overs = 1;

        System.out.println("\nPress Enter to continue for " + battingTeam + "'s innings");

        for (int over = 1; over <= overs; over++) {
            System.out.println("\nOver " + over + ":");
            for (int ball = 1; ball <= 6; ball++) {
                System.out.println("Press Enter for next ball...");
                sc.nextLine();

                int runsIndex = (int)(Math.random() * runs.length);
                String result = runs[runsIndex];

                System.out.print("Ball " + ball + ": ");

                if (result.equals("W")) {
                    wickets++;
                    System.out.println("Wicket!");
                    if (wickets >= totalWickets) {
                        System.out.println("All out!");
                        return score;
                    }
                } else {
                    int runScored = Integer.parseInt(result);
                    score += runScored;
                    if (runScored == 4) {
                        System.out.println("4 runs - FOUR!");
                    } else if (runScored == 6) {
                        System.out.println("6 runs - SIX!");
                    } else {
                        System.out.println(result + " runs");
                    }
                }

                // score
                System.out.println(battingTeam + ": " + score + "/" + wickets);
            }
        }

        return score;
    }

    private static int getWicketsFallen(String team) {
        return 0;
    }
}
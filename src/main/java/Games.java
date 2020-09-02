import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Games {

    public void playRockPaperScissors(String playerPlay) {
        // 1 = rock; 2 = paper; 3 = scissors
        int CPUPlay =  ThreadLocalRandom.current().nextInt(1 ,4);
        playerPlay = playerPlay.toLowerCase();
        switch (CPUPlay) {
            case 1:
                System.out.println("I choose rock!");
                switch(playerPlay) {
                    case "rock":
                        System.out.println("We tied!");
                        return;
                    case "paper":
                        System.out.println("You won!");
                        return;
                    case "scissors":
                        System.out.println("I won!");
                        return;
                    default:
                        System.out.println("You didn't choose a real option! Guess we'll play again some other time.");
                        return;
                }
            case 2:
                System.out.println("I choose paper!");
                switch(playerPlay) {
                    case "rock":
                        System.out.println("I won!");
                        return;
                    case "paper":
                        System.out.println("We tied!");
                        return;
                    case "scissors":
                        System.out.println("You won!");
                        return;
                    default:
                        System.out.println("You didn't choose a real option! Guess we'll play again some other time.");
                        return;
                }
            case 3:
                System.out.println("I choose scissors!");
                switch(playerPlay) {
                    case "rock":
                        System.out.println("You won!");
                        return;
                    case "paper":
                        System.out.println("I won!");
                        return;
                    case "scissors":
                        System.out.println("We tied!");
                        return;
                    default:
                        System.out.println("You didn't choose a real option! Guess we'll play again some other time.");
                        return;
                }
            default:
                System.out.println("I made a mistake, I'll play another time.");
        }
    }

    public void mathGame() {
        Scanner scanner = new Scanner(System.in);
        int num1 = ThreadLocalRandom.current().nextInt(1, 11);
        int num2 = ThreadLocalRandom.current().nextInt(1, 11);
        System.out.println(num1 + " + " + num2);
        int answer;
        try {
            answer = scanner.nextInt();
        }
        catch (Exception e) {
            System.out.println("That isn't even a number!");
            scanner.next();
            return;
        }
        System.out.println((answer == num1 + num2) ? "Correct!" : "Wrong! Work on your math...");
    }
}

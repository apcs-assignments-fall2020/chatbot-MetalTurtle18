import java.util.Scanner;

public class MyMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Games games = new Games();

        // Name
        System.out.println("What is your name? ");
        String name = scanner.next();
        System.out.println("Hello, " + name + "!");

        // Favorite animal
        System.out.println("What's your favorite animal? ");
        String animal = scanner.next();
        System.out.println("Oh cool, I also like " + animal + "s!");

        // Favorite food
        System.out.println("What is your favorite food? ");
        String food = scanner.next();
        System.out.println("I don't like " + food + ", but that's ok.");

        // Favorite number
        System.out.println("What is your favorite number? ");
        try {
            int number = scanner.nextInt();
            System.out.println((number % 2 == 0) ? "Cool. I like even numbers too!" : "Cool. I like odd numbers too!");
        }
        catch(Exception e) {
            System.out.println("That's not a number!");
            scanner.next();
        }

        // Rock, Paper, Scissors
        System.out.println("Let's play rock, paper, scissors! Enter your choice: ");
        games.playRockPaperScissors(scanner.next());
        System.out.println("That was a fun game.");

        // Math quiz
        System.out.println("Lets test your math skills. Answer this problem without a calculator:");
        games.mathGame();
        System.out.println("That was another fun game.");

        // Goodbye
        System.out.println("Bye, " + name + "!");
        scanner.close();
    }
}

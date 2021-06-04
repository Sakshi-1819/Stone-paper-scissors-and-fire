import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String r = "rock";
        String p = "paper";
        String s = "scissors";
        String f = "fire";

        String[] plays = {r,p,s,f};

        boolean quit = false;

        String comPlay;
        String yourPlay;

        int index;

        while(!quit) {
            System.out.println("DO your play: (rock/paper/scissors/fire)");

            yourPlay = scanner.nextLine();

            index = random.nextInt(4);
            comPlay = plays[index];

            System.out.println("Your play: " + yourPlay + "      Computer's play: " + comPlay);


            if (yourPlay.equals(comPlay)) {
                System.out.println("Tie");
            }else if(yourPlay.equals(r) && comPlay.equals(p))
            {
                System.out.println("Computer Wins!");
            }
            else if(yourPlay.equals(r) && comPlay.equals(s))
            {
                 System.out.println("You Win!");
            }
            else if(yourPlay.equals(r) && comPlay.equals(f))
            {
                System.out.println("Computer Wins!");
            }
            else if(yourPlay.equals(p) && comPlay.equals(r))
            {
                 System.out.println("You Win!");
            }
            else if(yourPlay.equals(p) && comPlay.equals(s))
            {
                System.out.println("Computer Wins!");
            }
            else if(yourPlay.equals(p) && comPlay.equals(f))
            {
                System.out.println("Computer Wins!");
            }else if(yourPlay.equals(s) && comPlay.equals(r))
            {
                System.out.println("Computer Wins!");
            }
            else if(yourPlay.equals(s) && comPlay.equals(p))
            {
                System.out.println("You Win!");
            }
            else if(yourPlay.equals(s) && comPlay.equals(f))
            {
                System.out.println("Computer Wins!");
            }
            else if(yourPlay.equals(f) && comPlay.equals(r))
            {
                System.out.println("You Win!");
            }
            else if(yourPlay.equals(f) && comPlay.equals(p))
            {
                System.out.println("You Win!");
            }
            else if(yourPlay.equals(f) && comPlay.equals(s))
            {
                System.out.println("You Win!");
            }
            else {
                System.out.println("Invalid Play");
            }
            System.out.println();
            System.out.println();
        }

    }
}

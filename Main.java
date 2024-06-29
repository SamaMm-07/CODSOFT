import java.util.Random;
import java.util.Scanner;

public class Task1 {

    public static void main(String args[]) {
        Random rand = new Random();
        Scanner s = new Scanner(System.in);
        NumGame game = new NumGame();

        int rand_num = rand.nextInt(1, 100);
        //System.out.println("num= " + rand_num);

        System.out.println("Choose from the following how would you like to play:\n 1.Put a limit for the number of trials\n 2.Unlimited trials");
        int num = s.nextInt();

        if (num == 1) {
            System.out.println("Define the maximum number of trails:");
            int numOfTrails = s.nextInt();
            game.limitedTrails(numOfTrails , rand_num);
        }
        else if (num == 2) {
            game.unlimitedTrails(rand_num);
        }
        else {
            System.out.println("ERROR!!\n Choose again the preferred method");
            while (num != 1 || num != 2) {
                System.out.println("Choose from the following how would you like to play:\n 1.Put a limit for the number of trials\n 2.Unlimited trials");
                num = s.nextInt();
            }
        }
    }
}

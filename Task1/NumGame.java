import java.util.Scanner;
public class NumGame {
    Scanner sc = new Scanner(System.in);
    public void limitedTrails(int num , int rand_num){

        System.out.println("Trail 1:");
        System.out.print("Enter your guess(1-100):");
        int guess = sc.nextInt();

        int count = 1;

        for(int i = 2 ; i<= num ; i++){
            count++;
            System.out.println("Trial " + count + ":");
            if(guess > rand_num + 20){
                System.out.println("Your guess is too much bigger");
            }
            else if(guess > rand_num + 10){
                System.out.println("Your guess is a bit bigger");
            }
            else if(guess > rand_num){
                System.out.println("Your guess is bigger");
            }
            else if(guess < rand_num - 20){
                System.out.println("Your guess is too much smaller");
            }
            else if(guess < rand_num - 10){
                System.out.println("Your guess is a bit smaller");
            }
            else if(guess < rand_num){
                System.out.println("Your guess is smaller");
            }

            System.out.print("Enter your guess again(1-100):");
            guess = sc.nextInt();
        }
        if(guess == rand_num){
            if(count == 1){
                System.out.println("Congratulation!! \n You have guessed the number correctly from the first time");
            }
            else{
                System.out.println("You have guessed the number correctly from \"the " + count + "th time\"");
            }
        }
        else{
            System.out.println("You have reached your limit on trails\n     ---GAME OVER!!---");
        }


    }

    public void unlimitedTrails(int rand_num){

        System.out.println("Trail 1:");
        System.out.print("Enter your guess(1-100):");
        int guess = sc.nextInt();

        int count = 1;

        while(guess != rand_num){
            count++;
            System.out.println("Trial " + count + ":");
            if(guess > rand_num + 20){
                System.out.println("Your guess is too much bigger");
            }
            else if(guess > rand_num + 10){
                System.out.println("Your guess is a bit bigger");
            }
            else if(guess > rand_num){
                System.out.println("Your guess is bigger");
            }
            else if(guess < rand_num - 20){
                System.out.println("Your guess is too much smaller");
            }
            else if(guess < rand_num - 10){
                System.out.println("Your guess is a bit smaller");
            }
            else if(guess < rand_num){
                System.out.println("Your guess is smaller");
            }

            System.out.print("Enter your guess again(1-100):");
            guess = sc.nextInt();
        }
        if(count == 1){
            System.out.println("Congratulation!! \n You have guessed the number correctly from the first time");
        }
        else{
            System.out.println("You have guessed the number correctly from \"the " + count + "th time\"");
        }


    }
}

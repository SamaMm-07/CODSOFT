import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        System.out.println("Enter number of subjects:");
        int subjects = s.nextInt();

        float total = 0;

        for(int i=1 ; i<=subjects ; i++){
            System.out.print("Enter the mark(out of 100) of subject " + i + ":");
            float mark = s.nextFloat();
            total += mark;
        }
        float average = total/subjects;

        System.out.println("Total marks= " + total);
        System.out.println("Average marks= " + average);
        System.out.print("Overall Grade: ");

        if(average<=100 && average>=85)
            System.out.println("A");
        else if(average<85 && average>=70)
            System.out.println("B");
        else if(average<70 && average>=55)
            System.out.println("C");
        else if(average<55 && average>=50)
            System.out.println("D");
        else if(average<50 && average>=0)
            System.out.println("F");
        else
            System.out.println("ERROR!!\nTRY AGAIN AND RE-ENTER YOUR MARKS...");
    }
}
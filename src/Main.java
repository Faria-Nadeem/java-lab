import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
      Scanner sc = new Scanner(System.in);

        System.out.print("Enter total marks of subject no 1: ");
        marks1 = sc.nextInt();

        System.out.print("Enter total marks of subject no 2: ");
        marks2 = sc.nextInt();

        System.out.print("Enter total marks of subject no 3: ");
        marks3 = sc.nextInt();

        System.out.print("Enter total marks of subject no 4: ");
        marks4 = sc.nextInt();

        System.out.print("Enter total marks of subject no 5: ");
        marks5 = sc.nextInt();

        int total_marks  = marks1 + marks2 + marks3 + marks4 + marks5;

        System.out.print("Enter obtained marks of subject no 1: ");
        ob_marks1 = sc.nextInt();

        System.out.print("Enter obtained marks of subject no 2: ");
        ob_marks2 = sc.nextInt();

        System.out.print("Enter obtained marks of subject no 3: ");
        ob_marks3 = sc.nextInt();

        System.out.print("Enter obtained marks of subject no 4: ");
        ob_marks4 = sc.nextInt();

        System.out.print("Enter obtained marks of subject no 5: ");
        ob_marks5 = sc.nextInt();

        int obtained_marks = ob_marks1 + ob_marks2 + ob_marks3 + ob_marks4 + ob_marks5;

        float percentage = ((obtained_marks / total_marks) * 100)f;
        System.out.println(percentage);
    }
}
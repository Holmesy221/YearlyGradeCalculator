import java.util.Scanner;

public class GradeCalculator {


    public static void main(String args[]) {

        Scanner scanner = new Scanner(System.in);
        int a;
        int b;
        int c;
        int d;
        int e;
        int f;
        double average = 0;


        System.out.println("Welcome to the grade calculator.");
        System.out.println("Option one: Year 2 + 3 final mark");
        System.out.println("Option two: Year 3 final mark");

        System.out.println("For option one please enter the number '1' ");
        System.out.println("For option two please enter the number '2' ");
        System.out.println();


        switch (scanner.nextInt()) {

            case 1:
                System.out.println("You choose option one");
                break;

            case 2:

        System.out.println("Enter your first module mark: ");
        a = scanner.nextInt();

        System.out.println("Enter your second mark: ");
        b = scanner.nextInt();

        System.out.println("Enter your third mark: ");
        c = scanner.nextInt();

        System.out.println("Enter your fourth mark: ");
        d = scanner.nextInt();

        System.out.println("Enter your fifth mark: ");
        e = scanner.nextInt();

        System.out.println("Enter your sixth mark: ");
        f = scanner.nextInt();

        int sum = a + b + c + d + e + f;

        average = (double) sum / 6;

        System.out.println("Your yearly mark is: " + average);
        break;
    }

    }


    }




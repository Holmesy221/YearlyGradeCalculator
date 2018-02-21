import java.util.Scanner;

public class GradeCalculator {



    //TODO: clean up code - make global vars.



    public static void yearTwoAndThree() {
        Scanner scanner = new Scanner(System.in);
        int a, b, c, d, e, f, g, h, i, j, k;
        double average = 0;
        System.out.println("You choose option one");
        System.out.println("Enter 120 credits of the best marks for year 2");

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

        System.out.println("Now enter 100 credits worth of the best marks for year 3");

        System.out.println("Enter your first mark: ");
        g = scanner.nextInt();
        System.out.println("Enter your second mark: ");
        h = scanner.nextInt();

        System.out.println("Enter your third mark: ");
        i = scanner.nextInt();
        System.out.println("Enter your fourth mark: ");
        j = scanner.nextInt();
        System.out.println("Enter your fifth mark: ");
        k = scanner.nextInt();

        int sum = a + b + c + d + e + f + g + h + i + j + k;
        average = (double) sum / 11;

        System.out.println("Your final mark is: " + average);

    }


    public static void yearThree(){
        Scanner scanner = new Scanner(System.in);
        int a, b, c, d, e, f, g, h, i, j, k;
        double average = 0;


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



    }




    public static void main(String args[]) {

        Scanner scanner = new Scanner(System.in);



        System.out.println("Welcome to the grade calculator.");
        System.out.println("Option one: Year 2 + 3 final mark");
        System.out.println("Option two: Year 3 final mark");

        System.out.println("For option one please enter the number '1' ");
        System.out.println("For option two please enter the number '2' ");
        System.out.println();


        switch (scanner.nextInt()) {

            case 1:

           yearTwoAndThree();

                break;

            case 2:

               yearThree();
                break;
        }
    }

}



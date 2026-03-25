import java.util.*;


class Function {
    public static void printMyName (String name) {
        System.out.println(name);
        return;
    }

    public static int printsum (int a, int b) {
        int sum = a + b;
        System.out.println("Sum of two number is = " + sum);
        return 1;
    }

    public static int printmul ( int c, int d) {
        int mul = c * d;
        System.out.println("multiplication of two number is = " +mul);
        return 1;
    }

    public static int printFactorial(int e) {
        int factorial = 1;
        if ( e < 0) {
            System.out.println("Invalid Number");
            return 1;
        }
        for ( int i = e; i >= 1; i--) {
            factorial = factorial * i;
        }
        System.out.println(factorial);
        return 1;
    }

    public static int printTable(int f) {
        for ( int i = 1; i <= 10; i++) {
            System.out.println(f + " * " + i + " = " + f * i);
        }
        return 1;
    }

    public static void main (String[] args) {

        System.out.println("1. Print Your name");
        System.out.println("2. Addition");
        System.out.println("3. Multiplication");
        System.out.println("4. Factorial");
        System.out.println("5. For Table");
        System.out.println("6. Exit");

        System.out.println("Enter Your Choice");
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();

        switch ( choice ) {
            case 1:
                System.out.println("Enter your name");                
                Scanner ak0 = new Scanner (System.in);
                String name = ak0.nextLine();
                printMyName(name);
                break;

            case 2:
                System.out.println("Enter two Number");
                Scanner ak1 = new Scanner (System.in);
                int a = ak1.nextInt();
                int b = ak1.nextInt();
                printsum(a,b);
                break;
                
            case 3:
                System.out.println("Enter two Number");
                Scanner ak2 = new Scanner (System.in);
                int c = ak2.nextInt();
                int d = ak2.nextInt();
                printmul ( c , d );
                break;

            case 4:
                System.out.println("Enter a Number");
                Scanner ak3 = new Scanner (System.in);
                int e = ak3.nextInt();
                printFactorial(e);
                break;
            
            case 5:
                System.out.println("Enter a Number");
                Scanner ak4 = new Scanner(System.in);
                int f = ak4.nextInt();
                printTable(f);
                break;

            case 6:
                exit(0);
                break;

            default :
            System.out.println("invalid Choice");
        }
    }
}
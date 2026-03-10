import java.util.*;

class Loops {
    public static void main(String[] args) {
        System.out.println("How For loops work");
        for( int counter = 0; counter <= 10; counter ++ ) {
            System.out.print(counter + "\t");
        }

        System.out.print("\n\n");

        System.out.println("How while loops work");
        int k = 0;
        while (k <=10) {
            System.out.print(k + "\t");
            k++;
        }

// print sum of n numbers

        System.out.print("\n\n");
        System.out.print("Enter a number to print sum of n numbers : ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(); 
        
        int sum = 0;
        for ( int j = 0; j <=a; j++) {
            sum = sum + j;
        }
        System.out.println(sum);


// to print the table
System.out.print("\n");
System.out.print("Enter a number For printing a table : ");
Scanner ak = new Scanner(System.in);
int b = ak.nextInt();
for (int i = 1; i <= 10; i++) {
    System.out.println(b + " * " + i + " = " +b*i);
}
    }
}
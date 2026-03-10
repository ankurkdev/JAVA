import java.util.*;

class Condition{
    public static void main(String[] args){
        System.out.println("Enter your age: ");
        Scanner sc =  new Scanner(System.in);
        int age = sc.nextInt();
        if (age >= 18) {
            System.out.println("You are an adult");

        } else{
            System.out.println("You are not an adult");
        }

// For Even or Odd number

        System.out.println("Enter a number: ");
        Scanner ak = new Scanner(System.in);
        int num = ak.nextInt();
        if (num %2 ==0) {
            System.out.println("Even number");
        } else {
            System.out.println("odd number");
        }


// greatest of three numbers

System.out.println("Enter three numbers: ");
Scanner ak1 = new Scanner(System.in);
int num1 = ak1.nextInt();
int num2 = ak1.nextInt();
int num3 = ak1.nextInt();
if ( num1 > num2 && num1 > num3) {
    System.out.println(num1 + " is greater");
} else{
    if( num3 > num2 ){
        System.out.println(num3 + " is greater");
    } else {
        System.out.println(num2 + " is greater");
    }
}
    }
}
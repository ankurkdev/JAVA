import java.util.*;

class Pattern{
    public static void main(String[] args) {
     
     Scanner sc = new Scanner(System.in);
     int a = sc.nextInt();

      Scanner sc1 = new Scanner(System.in);
     int b = sc1.nextInt();


     for ( int i = 0; i < a; i++) {
         for( int j = 0; j < b; j++) {
             System.out.print("*" );
         }
        System.out.println();
      }   

     for ( int i = 1; i <= a; i++) {
        for( int j = 1; j <= b; j++) {
            if ( i == 1 || j == 1 || i == a || j == b){
               System.out.print("*");
            } else {
                System.out.print(" ");
            }
        }
        System.out.println();
    }


    
 }
}
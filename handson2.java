import java.util.Scanner;

public class handson2 {
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        int x, z, y=0;

    while (y < 3){
        System.out.println ("Enter the age:  ");
        x = sc.nextInt ();
        System.out.println ("Enter the weight:  ");
        z = sc.nextInt ();

        if (x >= 18 && z >= 50) {
            System.out.println ("You are eligible to donate blood");
        }
        else if ( x < 18 ) {
            System.out.println ("Age must be greater than equal 18");
        }
        else if (z < 50){
            System.out.println ("You are not eligible to donate blood");
        }
        y++;
    }
    }
}

import java.util.Scanner;

public class handson {
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        int x, y=0;

        while (y < 3)   {

            System.out.print ("Enter a number:  ");
            x = sc.nextInt();
               

            if (x>0){
                System.out.println("Positive number");
            }
            else if (x<0){
                System.out.println ("Negative number");
            }
            else {
                System.out.println ("The number is zero");
            }

            y++;
        }
    }
}

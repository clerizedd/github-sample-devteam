import java.util.Scanner;
public class handson3 {
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        int y=0;
        String x;
        String a = "java";
        String b = "java string";

    while (y < 3){
        System.out.print ("Enter a String: ");
        x = sc.nextLine() ;
        if (x == a) {
            System.out.println ("Java is the best programming language");        }
        else if (x == b){
            System.out.println ("This is an example of Java Switch using String");      }
        else {
            System.out.println ("Sorry, please enter the different word");        }
 
        }
        y++;
    }
}

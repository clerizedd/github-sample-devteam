import java.util.Scanner;
public class handson3 {
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);    
        int y=0;
                while (y<3){  
            System.out.print ("Enter a String: ");
        String input = sc.nextLine ();      
       switch (input){
            case "java":
            System.out.println ("Java is the best programming language");
            break;
            
            case "java string":
            System.out.println ("This is an example for Java Switch using String");
            break;

            default:
            System.out.println ("Sorry, please enter the different word"); 
        }
        y++;
    }
    }
}

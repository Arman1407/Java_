/**
 * taskAdd03
 */
import java.util.Scanner;
public class task#add3 {

    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("int a number of Nombre triangulaire: ");
        int i = iScanner.nextInt();
        System.out.printf("Nombre triangulaire: %d\n", giveMeNumber(i));
        iScanner.close();
    }
    public static int giveMeNumber(int a){
        return (a * (a + 1)) / 2; 
    }
    
}
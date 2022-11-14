/*


*/
 

/**
 *
 * @author mehme
 */
import java.util.Scanner;
public class hw21  {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("DEGER GİR");
        int x = input.nextInt();
        for (int i = 1; i <= x; i++) {
            int y =x%i;
            if(y==0){
                System.out.println(i+" tam bölenidir");
                
            }
            
        }
            
        }
        
       
    
    
}


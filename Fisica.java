import java.util.Scanner;
package camadaosi;  

/**
 *
 * @author Sistemas
 */
public class Fisica {
    private String Dado;

    public Fisica() {
    }
    
    Fisica f = new Fisica();
    
    private void Fisica(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite um dado");
        Dado = scan.nextLine();
    }
    
}

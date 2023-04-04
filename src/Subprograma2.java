
import java.util.Scanner;
/**
 *
 * @author elias
 */
public class Subprograma2 {
    
    public static void main(String[] args) {
        String fraSe, fraSeFin;
        
        Scanner leerF = new Scanner(System.in);
        do
        {            
            System.out.println("Ingrese una frase que termine en . : ");
            fraSe = leerF.nextLine();
        } while (!fraSe.endsWith("."));
     fraSeFin =reeM(fraSe);
        System.out.println(fraSeFin);
    }

    public static String reeM(String fraSe) {
        String aux;
        aux="";

        for (int i = 0; i < fraSe.length(); i++)
        {
            switch(fraSe.substring(i,i+1))
            {
               case "a":
                case "A":
                    aux += "@";
                    break;
                case "e":
                case "E":
                    aux += "#";
                    break;
                case "i":
                case "I":
                    aux += "$";
                    break;
                case "o":
                case "O":
                    aux += "%";
                    break;
                case "u":
                case "U":
                    aux +="*";
                    break;
                default:
                    aux += fraSe.substring(i, i + 1);
            }
            
        }
       return aux;
    }
}

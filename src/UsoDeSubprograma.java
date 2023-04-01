
import java.util.Scanner;


/**
 * Escribir un programa que procese una secuencia de caracteres ingresada por
 * teclado y terminada en punto, y luego codifique la palabra o frase ingresada
 * de la siguiente manera: cada vocal se reemplaza por el carácter que se indica
 * en la tabla y el resto de los caracteres (incluyendo a las vocales acentuadas)
 * se mantienen sin cambios.
 * a e i o u
 *
 * @ # $ % *
 *
 * Realice un subprograma que reciba una secuencia de caracteres y retorne la
 * codificación correspondiente. Utilice la estructura “según” para la
 * transformación. Por ejemplo, si el usuario ingresa: 
 * Ayer, lunes, salimos a las once y 10. 
 * La salida del programa debería ser: 
 * @y#r, l*n#s, s@l$m%s @ l@s %nc# y 10.
 *
 * @author elias
 */
public class UsoDeSubprograma {

    public static void main(String[] args) {
        
        String fraSe;
        Scanner leerF= new Scanner(System.in);
        System.out.println("Ingrese una frase: ");
        fraSe = leerF.nextLine();
        reeM(fraSe);
      
        
        
    
    }
    public static void reeM(String fraSe){
    String rA,rE,rI,rO,rU,fraFin;
      rA=fraSe.replace('a', '@');
      
      rE=rA.replace('e', '#');
      
      rI=rE.replace('i', '$');
      
      rO=rI.replace('u', '%');
      
      rU=rO.replace('o', '*');
      
      fraFin=rU;
      System.out.println(fraFin);
     
        }
        
    
}

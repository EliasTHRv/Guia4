
import java.util.Scanner;


/**
 Diseñe una función que pida el nombre y la edad de N personas e imprima los 
 * datos de las personas ingresadas por teclado e indique si son mayores o 
 * menores de edad. Después de cada persona, el programa debe preguntarle al
 * usuario si quiere seguir mostrando personas y frenar cuando el usuario 
 * ingrese la palabra “No”.
 * @author elias
 */
public class Ejercicio2 {
    public static void main(String[] args){
        String noMbre;
        int eDad, nPer,i;
        Scanner leerN= new Scanner(System.in);
        System.out.println("Introduzca la cantidad de personas: ");
        nPer=leerN.nextInt();
        i=1;
        
        
        
        do {            
            i++;
            
            
        } while (i<=nPer);
    }
    
    public static void lista(String noMbre, int eDad,int nPer){
    
        for (int i = 0; i < nPer; i++) {
            
        }
    }
    
}

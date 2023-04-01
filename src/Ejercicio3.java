
import com.sun.source.tree.IfTree;
import java.util.Scanner;

/**
 * Crea una aplicación que a través de una función nos convierta una cantidad de
 * euros introducida por teclado a otra moneda, estas pueden ser a dólares,
 * yenes o libras. La función tendrá como parámetros, la cantidad de euros y la
 * moneda a convertir que será una cadena, este no devolverá ningún valor y
 * mostrará un mensaje indicando el cambio (void). El cambio de divisas es: 0.86
 * libras es un 1 € 1.28611 $ es un 1 € 129.852 yenes es un 1 €
 *
 * @author elias
 */
public class Ejercicio3 {

    public static void main(String[] args) {
        int euRo, moNeda;
        double doLar, liBra, yEn;

        Scanner leerE = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de Euros: ");
        euRo = leerE.nextInt();

        do {
            
            System.out.println("A que moneda desea convertir?");
            System.out.println("Libras -> 1");
            System.out.println("Dolares -> 2");
            System.out.println("Yenes -> 3");
            System.out.println("Finalizar -> 4");
            moNeda = leerE.nextInt();
            liBra = converL(moNeda, euRo);
            doLar = converD(moNeda, euRo);
            yEn = converY(moNeda, euRo);

            switch (moNeda) {
                case 1:
                    System.out.println(liBra);
                    break;
                case 2:
                    System.out.println(doLar);
                    break;
                case 3:
                    System.out.println(yEn);
                    break;
            }
        } while (moNeda != 4 && moNeda<4);

    }

    public static double converL(int moNeda, int euRo) {
        double cL;
        cL = 0.86 * euRo;
        return cL;
    }

    public static double converD(int moNeda, int euRo) {
        double cD;
        cD = 1.28611 * euRo;
        return cD;
    }

    public static double converY(int moNeda, int euRo) {
        double cY;
        cY = 129.852 * euRo;
        return cY;
    }

}

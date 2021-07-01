
package attcamisa;

import java.util.Scanner;

/**
 *
 * @author Victor
 */
public class AttCamisa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double valcamp, valcamm, valcamg, quantcamp, quantcamm, quantcamg, p,
                m, g,valend;
       valcamp = 10;
       valcamm = 12;
       valcamg = 15;      
        System.out.println("Quantidade de camisetas pequenas:");
        quantcamp = teclado.nextInt();
        System.out.println("Quantidade de camisetas medias:");
        quantcamm = teclado.nextInt();
        System.out.println("Quantidade de camisetas grandes:");
        quantcamg = teclado.nextInt();       
        if(quantcamp > 5){
            p = (valcamp * quantcamp) * 0.055;
        }else{
            p = valcamp * quantcamp;
        }
        if(quantcamm > 5){
            m = (valcamm * quantcamm) * 0.055;
        }else{
            m = valcamm * quantcamm;
        }
        if(quantcamg > 5){
            g = (valcamg * quantcamg) * 0.055;
        }else{
            g = valcamg * quantcamg;
        }        
        valend = p + m + g;       
        System.out.println("O total arrecadado na venda foi de R$"+valend);
    }
    
}

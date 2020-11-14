/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema3;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author macbookair
 */
public class Problema3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        //2. impuesto de Alemania, d[0,n] <-- 20
        double impuesto_de_Alemania = 20;
        //3. impuesto de Japón, d[0,n] <-- 30
        double impuesto_de_Japón = 30;
        //4. impuesto de Italia, d[0,n] <-- 15
        double impuesto_de_Italia = 15;
        //5. impuesto de USA, d[0,n] <-- 8
        double impuesto_de_USA = 8;
        String marca;
        String origen;
        //7. precio de venta, d[0,n]
        double precio_de_venta;
        //8. impuesto por pagar, d[0,n]
        double impuesto_por_pagar;
        
        //8. Escribir "Ingrese la marca del vehículo"
        System.out.println("Ingrese la marca del vehículo");
        //8. Lea marca
        marca = entrada.nextLine();
        //9. Escribir "Ingrese el origen del vehículo"
        System.out.println("Ingrese el origen del vehículo");
        //9. Lea origen
        origen = entrada.nextLine();
        //10. Escribir "Ingrese el precio de venta"
        System.out.println("Ingrese el precio de venta");
        //10. Lea precio_de_venta
        precio_de_venta = entrada.nextDouble();
        
        //10. Si el origen es en Alemania = 20
        if(impuesto_de_Alemania = 20){ 
            //11. impuesto por pagar <-- precio de venta + impuesto de Alemania
            impuesto_por_pagar = precio_de_venta + impuesto_de_Alemania;
        } else {
            //12. Si el origen es en Japón = 30
            if(impuesto_de_Japón = 30){
                //13. impuesto por pagar <-- precio de venta + impuesto de Japón
                impuesto_por_pagar = precio_de_venta + impuesto_de_Japón;
            }else{ 
                //13.Si el origen es en Italia = 15
                if(impuesto_de_Italia = 15){
                    //14. impuesto por pagar <-- precio de venta + impuesto de
                    //Italia
                    impuesto_por_pagar = precio_de_venta + impuesto_de_Italia;
                    
                }else{
                    //15. Si el origen es en USA = 8
                    if(impuesto_de_USA = 8){
                        //16. impuesto por pagar <-- precio de venta + impuesto
                        // de USA
                        impuesto_por_pagar = precio_de_venta + impuesto_de_USA;
                        
                    }
                }
            }
            //16. Escribir "El precio de venta es:" + precio de venta
            //17. Escribir "El impuesto por pagar es:" + impuesto por pagar
            System.out.printf("El precio de venta es: %.2\n"
                    + "El impuesto por pagar es: %.2f\n",
                    precio_de_venta,
                    impuesto_por_pagar);
        }
        
        
        
        
        
    }
    
}

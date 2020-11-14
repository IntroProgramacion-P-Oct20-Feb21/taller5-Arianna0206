/*1.Inicio
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema1;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author macbookair
 */
public class Problema1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        //2. costo por kilovatio/hora, d[0,n]
        double costo_por_kilovatio_hora;
        //3. número de kilovatios consumidos en el mes, d[0,n]
        double número_de_kilovatios_consumidos_en_el_mes;
        //4. valor de la planilla, d[0,n]
        double valor_de_la_planilla;
        //5. edad, d[0,n]
        int edad;
        //6. descuento, d[0,n]
        double descuento;
        //7. porcentaje, d[0,n]
        double porcentaje = 10;
        
        //8. Escribir "Ingrese el costo por kilovatio/hora"
        System.out.println("Ingrese el costo por kilovatio/hora");
        //8. Lea costo por kilovatio/hora
        costo_por_kilovatio_hora = entrada.nextDouble();
        //9. Escribir "Ingrese el número de kilovatios consumidos en el mes"
        System.out.println("Ingrese el número de kilovatios consumidos "
                + "en el mes");
        //9. Lea número de kilovatios consumidos en el mes
        número_de_kilovatios_consumidos_en_el_mes = entrada.nextDouble();
        //10. Escribir "Ingrese la edad de la persona"
        System.out.println("Igrese la edad de la persona");
        //10. Lea edad
        edad = entrada.nextInt();
        
        //11. Si edad > 65 entonces 
        if (edad> 65) { 
            //12.valor de la planilla <-- costo por kilovatio/hora * número de 
            //kilovatios consumidos en el mes
            valor_de_la_planilla = costo_por_kilovatio_hora * 
                    número_de_kilovatios_consumidos_en_el_mes;
            //13. descuento <-- (porcentaje * valor_de_la_planilla)/100
            descuento = (porcentaje * valor_de_la_planilla)/100;
            //14. valor de la planilla <-- valor de planilla - descuento
            valor_de_la_planilla = valor_de_la_planilla - descuento;
            }
        
        //15. Escribir "El valor de la planilla es:" + valor de la planilla
        System.out.printf("El valor de la planilla es: %.2f/n ");
        
        
        
        
    }
    
}

package org.chamale.main;
/**
 *
 * @author Edwar
 */
public class OperacionesCalc {
    public void suma(int numero1, int numero2){
        int res = numero1 + numero2;
        System.out.println("El resultado de la suma es: " + res);
    }
    public void resta(int numero1, int numero2){
        int res = numero1 - numero2;
        System.out.println("El resultado de la resta es: " + res);
    }
    public void multiplicacion(int numero1, int numero2){
        int res = numero1 * numero2;
        System.out.println("El resultado de la multiplicación es: " + res);
    }
    public void division(int numero1, int numero2){
        if(numero2 == 0){
            System.out.println("Error no se puede dividir en cero");
        } else{
            int res = numero1 / numero2;
            System.out.println("El resultado de la divición es: " + res);
        }
    }
}

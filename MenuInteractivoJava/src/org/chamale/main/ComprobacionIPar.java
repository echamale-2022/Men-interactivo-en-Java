package org.chamale.main;
/**
 *
 * @author Edwar
 */
public class ComprobacionIPar {
    public void comprobar(int numero){
        int resultado;
        resultado = numero % 2;
        if(resultado == 0){
            System.out.println("El numero es par: " + numero);
        } else{
            System.out.println("El numero es impar: " + numero);
        }
    }
}

package org.chamale.main;
import java.util.Scanner;
/**
 *
 * @author Edwar
 */
public class MenuInteractivoJava {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    OperacionesCalc oCalc = new OperacionesCalc();
    ComprobacionIPar cIpar = new ComprobacionIPar();
    int numero1, numero2, opc, calc;
    String opcion = null;
    do{
        System.out.println("********************");
        System.out.println("* Menú de opciones *");
        System.out.println("********************");
        System.out.println("1.  Numero par o impar");
        System.out.println("2.  Calculadora");
        System.out.println("Elija la opcion que desea");
        opc = sc.nextInt();
            switch(opc){
                case 1: // numero par o impar
                    System.out.println("Ingrese un numero");
                    numero1 = sc.nextInt();
                    cIpar.comprobar(numero1);
                    System.out.println("Desea hacer otra operacion (si / no)");
                    opcion = sc.next();
                break;
                case 2: // calculadora
                    System.out.println("***************");
                    System.out.println("* Calculadora *");
                    System.out.println("***************");
                    System.out.println("1.  Suma");
                    System.out.println("2.  Resta");
                    System.out.println("3.  Multiplicación");
                    System.out.println("4.  División");
                    System.out.println("Elija la opcion que desea");
                    calc = sc.nextInt();
                        switch(calc){
                            case 1:
                                System.out.println("Ingrese el primer numero");
                                numero1 = sc.nextInt();
                                System.out.println("Ingrese el segundo numero");
                                numero2 = sc.nextInt();
                                oCalc.suma(numero1, numero2);
                                System.out.println("Desea hacer otra operacion (si / no)");
                                opcion = sc.next();
                            break;
                            case 2:
                                System.out.println("Ingrese el primer numero");
                                numero1 = sc.nextInt();
                                System.out.println("Ingrese el segundo numero");
                                numero2 = sc.nextInt();
                                oCalc.resta(numero1, numero2);
                                System.out.println("Desea hacer otra operacion (si / no)");
                                opcion = sc.next();
                            break;
                            case 3:
                                System.out.println("Ingrese el primer numero");
                                numero1 = sc.nextInt();
                                System.out.println("Ingrese el segundo numero");
                                numero2 = sc.nextInt();
                                oCalc.multiplicacion(numero1, numero2);
                                System.out.println("Desea hacer otra operacion (si / no)");
                                opcion = sc.next();
                            break;
                            case 4:
                                System.out.println("Ingrese el primer numero");
                                numero1 = sc.nextInt();
                                System.out.println("Ingrese el segundo numero");
                                numero2 = sc.nextInt();
                                oCalc.division(numero1, numero2);
                                System.out.println("Desea hacer otra operacion (si / no)");
                                opcion = sc.next();
                            break;
                            default:
                                System.out.println("No es ninguna opcion");
                                System.out.println("Desea hacer otra operacion (si / no)");
                                opcion = sc.next();
                        }// switch #2
                default:
                    System.out.println("No es ninguna opcion");
                    System.out.println("Desea hacer otra operacion (si / no)");
                    opcion = sc.next();
            }// switch #1
    }while(opcion.equals("si"));
    }
    
}

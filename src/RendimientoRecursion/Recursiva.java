package RendimientoRecursion;

import java.util.stream.IntStream;

public class Recursiva {
    public static void main(String[] args) {
        System.out.println("Suma iterativa: "+sumaIterativa(5));
        System.out.println("Suma Recursiva: "+sumaRecursiva(5));
        System.out.println("Suma funcional: "+sumaFuncional(5));
        //tailRecursion(5);
        //headRecursion(5);
        System.out.println("Factorial interativo: "+factorialIterativo(5));
        System.out.println("Factorial recursivo: "+factorialRecursivo(5));
        System.out.println("Factorial funcional: "+factorialFuncional(5));
    }
    public static int sumaIterativa(int max){
        int resultado = 0;
        for(int i = 0; i <= max; i++){
            resultado +=i;
        }
        return resultado;
    }
    public static int sumaRecursiva(int numero){
        if(numero==1){
            return 1;
        }
         return numero + sumaIterativa(numero-1);
    }
    /**existen dos tipos de tipos de recursividad de cola(tail) y de cabeza (head)
     * Cola(tail): es lo ultimo que se ejecuta es la llamada de la funcion asi misma.
     * Cabeza(head): es lo primero que se ejecuta es la funcion recursiva.
     */
    public static void tailRecursion(int valor){
        if(valor==0){
            return;
        }
        System.out.println(valor);
        tailRecursion(valor-1);
        //5,4,3,2,1
    }
    public static void headRecursion(int valor){
        if (valor == 0) {
            return;
        }
        headRecursion(valor-1);
        System.out.println(valor);
        //1,2,3,4,5
    }
    public static int sumaFuncional(int numero){
        //5 + 4 + 3 + 2 +1
        return IntStream.rangeClosed(1,numero)
                .reduce(0,(a,b)->a+b);
    }
    //otros ejemplos
    public static int factorialIterativo(int numero){
        int resultado = 1;
        for (int i = 1; i <= numero; i++){
            resultado*=i;
        }
        return resultado;
    }
    public static  int factorialRecursivo(int numero){
        if(numero==1){
            return 1;
        }
        return numero*factorialIterativo(numero-1);
    }
    public static int factorialFuncional(int numero){
        return IntStream.rangeClosed(1,numero)
                .reduce(1,(a,b)->a*b);
    }
}

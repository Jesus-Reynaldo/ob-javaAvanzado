package ProgramcionFuncional;

public class Main {
    private static  int contador=0;
    public static void main(String[] args) {
    double result =suma(1,2);
    double result2 =suma(1,2);
        System.out.println(result+" "+result2);
        System.out.println(contador);
    }

    public static double suma(int a, int b){
        /**
         * las funciones puras no pueden tener efectos colaterales(cambio que puede afectar)
         * si se modifica las variables fuera de la funcion deja de ser pura
         * o llamado a otra funcion
         */
        double sumador= Math.random();
        return (double) a+(double)b+sumador;
    }
    public static int multiplicacion(int a,int b){
        return a*b;
    }
}

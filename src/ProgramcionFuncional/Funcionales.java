package ProgramcionFuncional;

import java.util.ArrayList;
import java.util.function.Function;

public class Funcionales {

    private Function<String,String> toMayus= (x)->x.toUpperCase();//Funcion de alto nivel
    private Function<Integer,Integer> sumador=(x)->x.sum(x,x);
    private ArrayList<String> listaArray;

    public void pruebas(){
        saluda(toMayus,"Reynaldo");
        System.out.println(toMayus.apply("Jesus"));
        System.out.println(sumador.apply(5));
    }
    public void saluda(Function<String,String> miFuncion, String nombre){
        miFuncion.apply(nombre);
    }
}

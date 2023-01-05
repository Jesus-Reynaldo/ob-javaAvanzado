package funcional;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Function;
import java.util.stream.Stream;

public class HigherOrder {

    public static void main(String[] args) {
        Funcionales f = new Funcionales();
        f.pruebas();
        ArrayList<String> nombres = new ArrayList<String>();
        nombres.add("Paco");
        nombres.add("Pepe");
        nombres.add("Juan");
        for(String n : nombres){
            System.out.println(n);
        }
        //mediante la programacion funcional
        nombres.stream().forEach(System.out::println);
        nombres.stream().forEach((x)-> System.out.println(x));
        Stream<String> valores=nombres.stream()
                .map((x)->x.toUpperCase())
                .filter(x->x.startsWith("P"));
        valores.forEach((x)-> System.out.println(x));

        int[]numeros={1,2,3,4,5,6,7,8,9,10};
        var stNumeros= Arrays.stream(numeros);
        //stNumeros.forEach(x-> System.out.println(x));
        var resulto =stNumeros
                .map(x->x*2)
                .filter(x->x%2==0)
                .reduce(0,(x,y)->{
                    System.out.println("x es "+x+" y es "+y);
                    return x + y;
                });
        System.out.println("Mi suma de pares es: "+resulto );
        //resulto.forEach((x)-> System.out.println(x));
    }

    public static String toMayuscula(String nombre){//Esto es un metodo pero hace lo mismo de la funcuin de alto nivel
        //los metodos son imperativo
        return nombre.toUpperCase();
    }
}

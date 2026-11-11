package Ordenamiento;

import java.util.ArrayList;
import java.util.List;

public class Ordenamiento {
    public static void ordenar(List<Integer> lista) { // Integer para el tipo de dato int
        int n = lista.size(); // Valor de los elemntos en la lista

        for (int i = 1 ; i < n; i++){
            int valorActual = lista.get(i);
            int j = i-1;

            while ((j >= 0 && lista.get(j) > valorActual)) {
                lista.set(j+1, lista.get(j));
                j = j - 1;
            }

            lista.set(j+1, valorActual);
        }
    }

    public static void main(String args[]){
    
        List<Integer> lista = new ArrayList<>();        
        
        lista.add(905);
        lista.add(210);
        lista.add(550);
        lista.add(102);
        lista.add(443);

        System.out.println("Lista ordenada " + lista);
        ordenar(lista);
        System.out.println("Lista ordenada " + lista);
    }
}
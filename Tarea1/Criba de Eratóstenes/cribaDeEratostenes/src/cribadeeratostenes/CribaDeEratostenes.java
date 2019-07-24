/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cribadeeratostenes;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author EADE IT
 */
public class CribaDeEratostenes {

    public static ArrayList tamano;
    public static int n;
    public static int agregar = 2;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        InputStreamReader input = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(input);
        System.out.println("Ingresar Numero");
        n = Integer.parseInt(br.readLine());
        tamano = new ArrayList();
        int[] tamanoreal = new int[n];
        for (int i = 2; i <= n; i++) {
            tamano.add(i);
        }

        for(int i = 0; i < tamano.size(); i++){
              int j  = (Integer) tamano.get(i);
            if(j%2 == 0){
                if(j != 2){
                tamano.remove(i);
                }
            }
        }
        int j  = (Integer) tamano.get(0);
        while(j*j <= n){
          for(int i = 0; i < tamano.size(); i++){
              int k  = (Integer) tamano.get(i);
            if(k%j == 0 ){
                tamano.remove(i);                
            }
        } 
          j = (Integer) tamano.get(0);
        }
            
        System.out.println("El listado de numeros primos de "+n+" es: ");
        tamano.forEach(System.out::println);


    }

}

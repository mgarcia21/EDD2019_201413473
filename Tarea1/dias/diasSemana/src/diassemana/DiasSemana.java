/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diassemana;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author EADE IT
 */
public class DiasSemana {

    static int dia, mes, ano, anoCadena;
    static int A, B, C, D, E, R;
    static String[] dias = {"Domingo", "lunes", "Martes", "Miercoles", "Jueves","Viernes","Sabado"};
    static String Ano, cadenaAno;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        A = 0;
        B = 0;
        C = 0;
        D = 0;
        E = 0;


        InputStreamReader input = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(input);
        System.out.println("Insertar Dia: (en numero)");
        dia = Integer.parseInt(br.readLine());
        System.out.print("Insertar Mes (En Numero): ");
        mes = Integer.parseInt(br.readLine());
        System.out.print("Insertas Año: ");
        Ano = br.readLine();
        cadenaAno = "" + Ano.charAt(2) + Ano.charAt(3);
        ano = Integer.parseInt(Ano);
        if (ano >= 1700 && ano < 1800) {
            A = 5;
        } else if (ano >= 1800 && ano < 1900) {
            A = 3;
        } else if (ano >= 1900 && ano < 2000) {
            A = 1;
        } else if (ano >= 2000 && ano < 2100) {
            A = 0;
        } else if (ano >= 2100 && ano < 2200) {
            A = -2;
        } else if (ano >= 220 && ano < 3000) {
            A = -4;
        }

        anoCadena = Integer.parseInt(cadenaAno);
        B = anoCadena + (anoCadena / 4);

        if ((ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0 && ano % 100 == 0)) {
            if (mes < 3) {
                C = -1;
            }
        } else {
            C = 0;
        }

        switch (mes) {
            case 01:
                D = 6;
                break;
            case 02:
                D = 2;
                break;
            case 03:
                D = 2;
                break;
            case 04:
                D = 5;
                break;
            case 05:
                D = 0;
                break;
            case 06:
                D = 3;
                break;
            case 07:
                D = 5;
                break;
            case 8:
                D = 1;
                break;
            case 9:
                D = 4;
                break;
            case 10:
                D = 6;
                break;
            case 11:
                D = 2;
                break;
            case 12:
                D = 4;
                break;
        }
        E = dia;
        R = (A + B + C + D + E);

        do {
            R = R-7;
        } while (R > 6);

        System.out.println(dias[R]);
        
    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class arreglos {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int numeroObjetivo;
        numeroObjetivo = Integer.parseInt(JOptionPane.showInputDialog("ingresa numero objetivo"));
        int resultado = 0;
        int n = Integer.parseInt(JOptionPane.showInputDialog("ingresa cuantos numeros quieres"));
        int numeros[] = new int[n];

        for (int a = 0; a < n; a++) {

            System.out.println("ingrese los numeros");
            numeros[a] = sc.nextInt();
        }
        for (int i = 0; i < numeros.length; i++) {
                for (int j = 0; j < numeros.length; j++) {
                    for (int x = 0; x < numeros.length; x++) {
                        resultado = numeros[i] + numeros[j];
                        resultado -= numeros[x];
                        if (resultado == numeroObjetivo) {
                            System.out.print(numeros[i] + " + ");
                            System.out.print(numeros[j] + " - ");
                            System.out.println(numeros[x] + " = " + numeroObjetivo);
                            System.out.println("---------------");
                        } else {

                        }
                    }
                }
            }

    }

}

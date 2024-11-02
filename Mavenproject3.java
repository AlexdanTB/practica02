/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject3;

import java.util.Scanner;

/**
 *
 * @author ItsqmetEstudiantes
 */
public class Mavenproject3 {

    public static void main(String[] args) {
    //Ejercicio 4    
        double calificacion;
        Scanner ingresocal = new Scanner(System.in);
        System.out.println("Ingresar calificacion");
        
        calificacion = ingresocal.nextDouble();
        if (calificacion > 90 && calificacion <= 100){
            System.out.println("La calificacion del alumno es A");
        }else if (calificacion >= 80 && calificacion <= 89){
            System.out.println("La calificacion del  alumno es B");
        }else if (calificacion >= 70 && calificacion <= 79){
            System.out.println("La calificacion del  alumno es C");
        }else if (calificacion >= 60 && calificacion <= 69){
            System.out.println("La calificacion del  alumno es D");
        }else if (calificacion < 60){
            System.out.println("La calificacion del  alumno es F");
        }
    // EJERCICIO 7
        double precio;
        double descuento;
        
        System.out.println("Ingresar el precio del producto");
        precio = ingresocal.nextDouble();
        
        if (precio >= 100){
        descuento = precio - (precio * 0.20);
            System.out.println("Aplicado descuento del 20%, el valor final es $"+descuento);
        }else{
        descuento = precio - (precio * 0.10);
            System.out.println("Aplicado descuento del 10%, el valor final es $"+descuento);

        }
        
    
    }
}

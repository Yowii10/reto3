package Ejercicios;

import java.time.LocalDate;
import java.util.Scanner;

import util.Funciones;

public class Reolucion {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		LocalDate fecha1 = Funciones.dimeFecha("Introduce una fecha dd/MM/yyyy", sc);
		LocalDate fecha2;
		
		do {
			
		fecha2 = Funciones.dimeFecha("Introduce una segunda fecha dd/MM/yyyy", sc);
		
		}while (!fecha1.isBefore(fecha2));
		
		
		
		System.out.println(Ejercicio2.calcDias(fecha1, fecha2));
		
		
		
		
		
		}

	}


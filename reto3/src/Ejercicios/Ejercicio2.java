package Ejercicios;

import java.time.LocalDate;
import java.time.chrono.ChronoLocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

import util.Funciones;

public class Ejercicio2 {
	
	public static LocalDate dias (Scanner sc) {
		
	Scanner s = new Scanner(System.in);
	LocalDate fecha1 = Funciones.dimeFecha("Introduce una fecha dd/MM/yyyy", sc);
	LocalDate fecha2= null;
	
	do {
		
	fecha2 = Funciones.dimeFecha("Introduce una segunda fecha dd/MM/yyyy", sc);
	
	}while (fecha1.isBefore(fecha2));
	return fecha2;
	
	
	}

	public static double calcDias (LocalDate fecha1, LocalDate fecha2) {
		
		int diasTotal = 0;

		int meses = (int) ChronoUnit.MONTHS.between(fecha1, fecha2);

		fecha2 = LocalDate.of(fecha2.getYear(),fecha2.getMonth(),1);
		int contador_dias=0;
		while(fecha1.isBefore(fecha2)) {

			contador_dias =  fecha1.lengthOfMonth();

			fecha1 = fecha1.plusMonths(1);

			diasTotal = diasTotal+contador_dias;

		}

		double mediaDias = diasTotal/meses;

		System.out.println(mediaDias+" es la media de dias");
		return mediaDias;

		
	}
	
	
		
}

package activdad_6;

import java.util.Scanner;

public class Ejercicio_17 {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 System.out.println(" Ingrese numero que desea saber su tabla de multiplicar ");
		 int numero=sc.nextInt();
		 
		  
		 int i = 1; // contador para la tabla de multiplicar.Enicializo el bucle en 1
		
		 while ( i <= 10  ) {
			 System.out.println(numero + " x " + i + " = " + (numero * i));
			 i++;
		 }
		 
		
	}

}

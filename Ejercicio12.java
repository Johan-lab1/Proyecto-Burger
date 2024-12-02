package actividad_5;

import java.util.Scanner;

public class Ejercicio12 {

	public static void main(String[] args) {
		// Se va a calcular el precio de una hamburguesa:
		Scanner sc = new Scanner (System.in);
		// Variables
		int precio = 0, peso, patatas = 0, ilimitada, refresco = 0, basicos;
		
		System.out.println(" Que burger deseas ? ");
		
		System.out.println(" 1-Burger 100gr, 2-Burger 200gr, 3-Burger 300gr ");
		peso = sc.nextInt();
		
		System.out.println(" Quieres bebida Ilimitada ? ( 1-SI, 0-NO )");
		ilimitada = sc.nextInt();
		if ( ilimitada == 0 ) {
			System.out.println(" Quieres un refrezco ? ( 0-no, 1-agua, 2-coca, 3-cerve )");
			refresco = sc.nextInt();
		}
		System.out.println(" Cuantos ingredientes basicos quieres ?");
		basicos = sc.nextInt();
		System.out.println(" Cuantos ingredientes deluxe quieres ?");
		double deluxe = sc.nextDouble();
		if ( peso == 2 || peso == 3 ) {
			System.out.println(" Te llevas patatas pequeñas gratis  ( Deseas ampliar a medianas (1€), 1-SI, 0-NO ? )");
			if ( patatas == 1 ) {
				precio +=1;
			} else {
				System.out.println(" llevas patatas pequeñas ");
		}
			// Precios de las burger 1, 2 y 3
			
			if ( peso == 1 ) {
				precio += 3;
				
			} else if ( peso == 2  ) {
					precio+=5;
					
			} else if ( peso == 3 ) {
					precio+=7;
			}
				
			// bebida ilimitada en funcion a los pesos de las hamburguesas !
				
				if ( peso == 3 ) {// Bebida a mitad de precio con burger 300gr
					precio +=1.75;
				} else {
					precio+=3.5;
				}
		} else // Si quiere refresco en vez de bebida ilimitada.
		
			if ( refresco == 1 ) {
				precio+=1; // precio Agua
			} else if ( refresco == 2 ) {
				precio+=2;// precio CocaCola.
			} else if  ( refresco == 3 ) {
				precio+=2.5;// precio Cerveza
			}
		
		// Le sumo los basicos*0.5+deluxce.
		
			
		 precio += basicos * 0.5; // Ingredientes básicos
	        precio += deluxe * 1;    // Ingredientes deluxe

		if ( peso == 2 || peso == 3 ) {
			System.out.println("¿Deseas ampliar a patatas medianas (1€)? (1 - SI, 0 - NO)");
            patatas = sc.nextInt();
            
            if (patatas == 1) {
                precio += 1; // Patatas medianas
            } else {
                System.out.println("Llevas patatas pequeñas gratis");
            }
        }
		System.out.println(" El precio de su Burger es :" + precio);
		if ( precio > 12 ) {
			System.out.println(" Se lleva un llavero de regalo !");
		}
		
		
		
		
		
		
		
		
		
	}

}

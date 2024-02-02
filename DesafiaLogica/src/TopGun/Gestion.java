package TopGun;

import java.util.Scanner;

public class Gestion {

	public static void main(String[] args) {

		// Creación de 3 objetos de la clase Piloto con datos predefinidos
		Piloto maverick = new Piloto(1, "Pete Maverick", 10000, "Capitan");
		Piloto phoenix = new Piloto(2, "Natasha Phoenix", 3000, "Teniente");
		Piloto rooster = new Piloto(3, "Bradley Rooster", 3500, "Teniente");

	
		// Solicitud de datos de 2 nuevos pilotos al usuario
		Scanner scan = new Scanner(System.in);
		
		System.out.println("\nPILOTOS NUEVOS:");
		System.out.println("- - - - - - - - - - - - - - - - - - - -");
		
		System.out.print("Introduzca el nombre del piloto 4: ");
		String nombrePiloto4 = scan.nextLine();
		System.out.print("Introduzca las horas de vuelo del piloto 4: ");
		int horasVueloPiloto4 = scan.nextInt();		
		System.out.print("\nIntroduzca el rango del piloto 4: ");
		String rangoPiloto4 = scan.nextLine();
		Piloto piloto4 = new Piloto(4, nombrePiloto4, horasVueloPiloto4, rangoPiloto4);
		
		System.out.print(" ");
		
		System.out.println("- - - - - - - - - - - - - - - - - - - -");
		System.out.println("Introduzca el nombre del piloto 5: ");
		String nombrePiloto5 = scan.nextLine();		
		System.out.println("Introduzca las horas de vuelo del piloto 5: ");
		int horasVueloPiloto5 = scan.nextInt();		
		System.out.println("Introduzca el rango del piloto 5: ");
		String rangoPiloto5 = scan.nextLine();
		Piloto piloto5 = new Piloto(5, nombrePiloto5, horasVueloPiloto5, rangoPiloto5);

		// Muestra la información de los pilotos Maverick y Rooster
		System.out.println("\nINFORMACIÓN DEL PILOTO MAVERICK");
		System.out.println("- - - - - - - - - - - - - - - - - - - -");
		maverick.mostrarPiloto();
		System.out.println("\nINFORMACIÓN DEL PILOTO ROOSTER");
		System.out.println("- - - - - - - - - - - - - - - - - - - -");
		rooster.mostrarPiloto();

		// Mostrar información de los 2 pilotos creados por el usuario
		System.out.println("\nINFORMACIÓN DEL PILOTO 4:");
		piloto4.mostrarPiloto();
		System.out.println("\nINFORMACIÓN DEL PILOTO 5:");
		piloto5.mostrarPiloto();

		// Crear de 3 objetos Avion: 1 de entrenamiento y 2 de combate
		Avion avion1 = new Entrenamiento(1, "T-38 Talon", 2, maverick, true);
		Avion avion2 = new Combate(2, "F-14 Tomcat", 1, phoenix, true);
		Avion avion3 = new Combate(3, "F-16 Fighting Falcon", 1, rooster, false);

		// Solicitud de datos de 2 nuevos aviones de entrenamiento al usuario
		System.out.println("\nAVIONES NUEVOS:");
		System.out.println("- - - - - - - - - - - - - - - - - - - -");
		
		System.out.println("Introduzca el modelo del avión de entrenamiento 2: ");
		String modeloAvion4 = scan.nextLine();
		System.out.println("Introduzca la capacidad del avión de entrenamiento 3: ");
		int capacidadAvion4 = scan.nextInt();
		System.out.println("Introduzca el nombre del piloto para el avión de entrenamiento 4: ");
		String nombrePilotoAvion4 = scan.nextLine();
		Piloto pilotoAvion4 = new Piloto(6, nombrePilotoAvion4, 0, "Teniente");
		Avion avion4 = new Avion(4, modeloAvion4, capacidadAvion4, pilotoAvion4);

		System.out.println("Introduzca el modelo del avión de entrenamiento 5: ");
		String modeloAvion5 = scan.nextLine();
		System.out.println("Introduzca la capacidad del avión de entrenamiento 5: ");
		int capacidadAvion5 = scan.nextInt();
		System.out.println("Introduzca el nombre del piloto para el avión de entrenamiento 5: ");
		String nombrePilotoAvion5 = scan.nextLine();
		Piloto pilotoAvion5 = new Piloto(7, nombrePilotoAvion5, 2, "Teniente");
		Avion avion5 = new Avion(5, modeloAvion5, capacidadAvion5, pilotoAvion5);

		// Mostrar información de todos los aviones
		System.out.println("\nINFORMACIÓN DE LOS AVIÓNES:");
		System.out.println("- - - - - - - - - - - - - - - - - - - -");
		avion1.mostrarAvion();
		avion2.mostrarAvion();
		avion3.mostrarAvion();
		avion4.mostrarAvion();
		avion5.mostrarAvion();
	}
}           
        
        
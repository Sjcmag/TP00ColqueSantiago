package ar.edu.unju.edm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import ar.edu.unju.edm.model.Calculadora;
import ar.edu.unju.edm.model.Estudiante;

@SpringBootApplication
public class Tp00ColqueSantiagoApplication {

	public static void main(String[] args) {
		SpringApplication.run(Tp00ColqueSantiagoApplication.class, args);
		String nombre = "Santiago";
		System.out.println("hola edm,dice:  "+ nombre + " " + darNombre());
		
		Estudiante unEstudiante = new Estudiante();
		unEstudiante.setDni("44949761");
		unEstudiante.setApellido("Colque");
		System.out.println("El Estuadiante" +unEstudiante.getApellido()+"Dice Hola" );
		
		@SuppressWarnings("unused")
		Calculadora miCalculadora= new Calculadora(8,2);
		int suma=miCalculadora.suma();
		System.out.println("la suma es: "+suma);
		
		
		System.out.println("la resta es: "+ miCalculadora.resta());
		
		System.out.println("la multiplicaion es: "+ miCalculadora.multiplicar());
		
		System.out.println("la potencia es: "+ miCalculadora.potencia());
		
		System.out.println("la raiz n es: "+ miCalculadora.raiz());
		
		double dividir = miCalculadora.dividir();
		if(dividir==0) {
			System.out.println("el divisor tiene que ser mayor a 0" );
		}
		else {
			System.out.println("la division es: "+dividir);
		}
	

		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	public static String darNombre() {
		String nuevonombre="Colque";
		return nuevonombre;
		
		
	}

}

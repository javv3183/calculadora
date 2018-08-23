package parcialp2;

import java.util.Scanner;

public class ejecutable {

	public static void main(String[] args) {
		String Name;
		int age, i, PI[];
		float Peso, Altura;
		boolean ME[];
		char Sexo;
		ME = new boolean[4];
		PI = new int[4];
		Scanner scan = new Scanner(System.in);
		
	System.out.print("Ingrese su nombre: ");
		Name = scan.next();
	System.out.print("Ingrese su edad: ");
		age = scan.nextInt();
	System.out.print("Ingrese su sexo (H/M): ");
		Sexo = scan.next(".").charAt(0);
	System.out.print("Ingrese su Peso (kg): ");
		Peso = scan.nextFloat();
	System.out.print("Ingrese su Altura (m): ");
		Altura = scan.nextFloat();
		
		
		personas P1 = new personas();
		personas P2 = new personas(Name, age, Sexo);
		personas P3 = new personas ();
		
		P1.generaCedula();
		P2.generaCedula();
		P3.generaCedula();
		
		P3.setNombre("MARIA");
		P3.setEdad(15);
		P3.setSexo('M');
		P3.setPeso((float) 54.12);
		P3.setAltura((float) 1.49);
		
		PI[1]=P1.CalcularIMC();
		PI[2]=P2.CalcularIMC();
		PI[3]=P3.CalcularIMC();
		
		i=1;
		System.out.println("\nPeso de las personas:");
		while (i<=3) {
			if (PI[i]==-1)
				System.out.println("La persona "+i+" esta por debajo de su peso");
			else if (PI[i]==1)
				System.out.println("La persona "+i+" esta en sobrepeso");
			else if (PI[i]==0)
				System.out.println("La persona "+i+" esta en su peso normal");
			i++;
		}
		
		ME[1]=P1.esMayordeEdad();
		ME[2]=P2.esMayordeEdad();
		ME[3]=P3.esMayordeEdad();
		
		i=1;
		System.out.println("\n edad de las personas(mayor o menor):");
		while (i<=3) {
			if (ME[i]==true)
				System.out.println("La persona "+i+" es mayor de edad");
			else if (ME[i]==false)
				System.out.println("La persona "+i+" es menor de edad");
			i++;
		}
	
		System.out.println("\nPersona 1:\n"+P1.toString());
		System.out.println("\nPersona 2:\n"+P2.toString());
		System.out.println("\nPersona 3:\n"+P3.toString());
		
		scan.close();
	}

}
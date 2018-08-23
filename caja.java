package taller1;
import java.util.Locale;
import java.util.Scanner;

public class caja {

		private static Scanner scanner;

public static void main(String[] args) {
			
			String Nom = " ",continuar, Ape = " " ;
			int sel = 0; double cant = 0;
			
			cuentab MC = new cuentab (Nom, Ape, cant);
			scanner = new Scanner(System.in);
			Scanner scan = scanner.useLocale(Locale.US);
			
			do {
			System.out.println("cuenta de banco\n");
			System.out.print("¿Que desea realizar?\n1. Iniciar Cuenta\n2. Ingresar dinero a la cuenta\n3. Retirar dinero de la Cuenta\n4. Mostrar la Informacion de la Cuenta\n\nSeleccione: ");
			sel = scan.nextInt();
		switch(sel) {
			case 1:
				System.out.print("\nIngrese el nombre y apellido del representante de la Cuenta: ");
				Nom = scan.next();
				Ape = scan.next();
				MC.setTitular(Nom, Ape);
				System.out.print("Ingrese el saldo que posee la cuenta: ");
				cant = scan.nextDouble();
				MC.setCant(cant);
				break;
			case 2:
				if (Nom.equals(" ") && Ape.equals(" ")&& cant==0)
					System.out.println("No ha iniciado la cuenta");
				else {
					System.out.print("\nIngrese la cantidad a ingresar: ");
					cant = scan.nextDouble();
					MC.Ingresar(cant);
					}
				break;
			case 3:
				if (Nom.equals(" ") && Ape.equals(" ")&& cant==0)
					System.out.println("No ha iniciado la cuenta");
				else {
					System.out.print("\nIngrese la cantidad a retirar: ");
					cant = scan.nextDouble();
					MC.Retirar(cant);
					}
				break;
			case 4:
				if (Nom.equals(" ") && Ape.equals(" ")&& cant==0)
					System.out.println("No ha iniciado la cuenta");
				else {
				Ape = MC.getApeTitular();
				Nom = MC.getNTitular();
				cant = MC.getCant();
				MC.getString();
				}
				break;
			default:
				System.out.println("Seleccion Invalida");
				break;
			}
			System.out.print("\n regresar al menu (S/N):");
			continuar=scan.next();
			} while (continuar.equals("S")||continuar.equals("s")||continuar.equals("Si")||continuar.equals("si")||continuar.equals("SI")||continuar.equals("sI"));
			scan.close();
			
		}


		}

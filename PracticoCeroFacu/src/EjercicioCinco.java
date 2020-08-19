import java.util.Scanner;


public class EjercicioCinco {
		static Scanner scanner=new Scanner(System.in);
		//funci�n para resolver el m�ximo com�n divisor de los dos valores ingresados
		static int mcd (int n1, int n2) {
			if(n2==0) {
				return n1;
			}
			else {
				return mcd(n2, n1%n2);
			}
		}
		
		//funci�n para determinar los dos valores random
		static int randomNumber (int min, int max) {
			int x1 = (int) ((int)(Math.random()*((max-min)+1))+min);
			return x1;
		}
		
		
		
		//m�todo de las opciones que el usuaria eligir�
		static void menu( int option) {
			switch(option) {
			case 1:
				System.out.println("----------------------------------");
				System.out.println("Debe ingresar los numeros en orden");
				System.out.println("----------------------------------");
				System.out.println("Ingrese el primer n�mero");
				int n1 = scanner.nextInt();
				System.out.println("Ingrese el segundo n�mero");
				int n2 = scanner.nextInt();
				if (0<=n1 && 0<=n2) {
					mcd(n1, n2);
					int sol=mcd(n1,n2);
					System.out.println("El m.c.d de los valores ingresados es: "+sol);
					}
				else {
					System.out.println("El n�mero que ingreso no es positivo o entero");
				}
				break;
			case 2:
				 n1 = randomNumber(1,100000);
				 n2 = randomNumber(1,100000);
				 mcd(n1,n2);
				 int sol=mcd(n1,n2);
					System.out.println("El m.c.d de los valores "+n1+" y "+n2+" es: "+sol);
				break;
			default:
				System.out.println("A ingresado una opci�n inv�lida");
			}
		}
		
		
		//Men� de opciones para el usuario
		public static void main (String args[]) {
			String inicio=null;
			do {
				System.out.println("Bienvenido para encontrar el m�ximo com�n divisor de dos n�meros enteros positivos");
				System.out.println("�De que manera quiere operar?");
				System.out.println("1 - Ingresando los 2 n�meros para operar");
				System.out.println("2 - N�meros y operaciones al azar");
				int option = scanner.nextInt();
				menu(option);
				System.out.println("----------------------------------------");
				System.out.println("Si desea volver al Inicio, coloque Si");
				System.out.println("Sino ingrese cualquier letra");
				inicio = scanner.next();
				inicio = inicio.toUpperCase();
		}while (inicio.equals("SI"));
		System.out.println("Saliendo del programa");
		}
}

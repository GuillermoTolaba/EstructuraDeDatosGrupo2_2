import java.util.Scanner;

public class EjercicioSeis {
	static Scanner scanner=new Scanner(System.in);
	
	//m�todo booleano que resuelve si el valor ingresado es perfecto o no
	public static boolean perfect (float n) {
		 long cont=0;//Se utiliza para la suma de los divisores
		 	for (int i = 1 ; i < n; i++) {
		 			if (n % i == 0) {
		 				cont=cont+i;
		 				if(cont==n) {
		 					return true;
		 					}
		 				}
	          	}
		 return false;
		 }
	
	//Interacci�n con el usuario
	public static void main (String args[]) {
		String volver=null;
		do {
			System.out.println("Bienvenido, para determinar si su n�mero es perfecto,");
			System.out.println("debe ingresar dicho n�mero a continuaci�n");
			float n = scanner.nextFloat();
			perfect(n);
			System.out.println(perfect(n)? n+" es perfecto":n+" no es perfecto");
			System.out.println("----------------------------------------");
			System.out.println("Si desea volver al Inicio, coloque Si");
			System.out.println("Sino ingrese cualquier letra");
			volver = scanner.next();
			volver = volver.toUpperCase();
		}while(volver.equals("SI"));
		System.out.println("Saliendo del programa");
	}	
}

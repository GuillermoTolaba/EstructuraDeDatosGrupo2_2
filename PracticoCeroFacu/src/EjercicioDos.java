import java.util.Scanner;


public class EjercicioDos {
	static Scanner scanner=new Scanner(System.in);
	
	//m�todo que devuelve un valor random positivo para evitar el error mat�matico de dividir por cero
	static float randomNumber (float min, float max) {
		float x1 = (float) ((float)(Math.random()*((max-min)+1))+min);
		return x1;
	}
	
	// m�todo que devuelve el �ndice del arreglo arithmetic para operaciones random
	static int select () {
		int x2 = (int) (Math.random() * 4);
		return x2;
	}
	
	// m�todo que realiza al ingresar la variable s (operador aritm�tico)
	public static void operacion (float a, float b, char s) {
		switch(s) {
		case '+':
			System.out.println("El resultado de "+a+" + "+b+" es igual a: "+(a+b));
			break;
		case '-':
			System.out.println("El resultado de "+a+" - "+b+" es igual a: "+(a-b));
			break;
		case '*':
			System.out.println("El resultado de "+a+" * "+b+" es igual a: "+(a*b));
			break;
		case '/':
			if(b!=0) {
				System.out.println("El resultado de "+a+" / "+b+" es igual a: "+(a/b));
			}
			else {System.out.println("Error, no se puede dividir por 0");}
			break;
		default : {System.out.println("El operador que usted ingreso es inv�lido");}
		}
	}
	
	// m�todo que realiza las acciones de acuerdo a la opcion que eligi� el usuario
	static void menu(int option) {
		char[] arithmetic= {'+','-','*','/'};
		switch(option) {
		case 1:
			System.out.println("Ingrese el n�mero a");
			float a = scanner.nextFloat();
			System.out.println("Ingrese el n�mero b");
			float b = scanner.nextFloat();
			System.out.println("Qu� operaci�n desea hacer: +, -, *, /");
			char s = scanner.next().charAt(0);
			operacion(a,b,s);
			break;
		case 2:
			 a = randomNumber(1,100000);
			 b = randomNumber(1,100000);
			 s = arithmetic[select()];
			 operacion(a,b,s);
			 break;
		default:
			System.out.println("A ingresado una opci�n inv�lida");
		}
	}
	
	//Menu de Opciones
	public static void main (String args[]) {
		String inicio=null;
		do {
			System.out.println("Bienvenido a Operaciones");
			System.out.println("�De qu� manera quiere operar?");
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

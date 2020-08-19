import java.util.Scanner;
public class EjercicioUno {
	static Scanner scanner=new Scanner(System.in);
	// Inicio del m�todo quadrant para determinar los dos valores ingresados
	static void quadrant (double numx, double numy) {
	  if(numx!=0 && numy!=00) {
		if (numx>0 && numy>0) {
			System.out.println("El punto exacto ("+numx+","+numy+"), est� en el Primer cuadrante");
		}
		else {
			if(numx<0 && numy>0) {
				System.out.println("El punto exacto ("+numx+","+numy+"), est� en el Segundo cuadrante");
			}
			else {
				if (numx<0 && numy<0) {
					System.out.println("El punto exacto ("+numx+","+numy+"), est� en el Tercer cuadrante");
				}
				else {
					if(numx>0 && numy<0) {
						System.out.println("El punto exacto ("+numx+","+numy+"), est� en el Cuarto cuadrante");
					}
					else {
						
					}
				}
			}
		}
	  }
	}
	//Inicio del m�todo points para aquel punto que se encuentre en uno de los Ejes de Ordenadas o Abscisas
		static void points (double numx, double numy) {
			if(numx==0) {
				if (numy>0) {
					System.out.println("El punto exacto ("+numx+","+numy+"), est� en el Eje de las Ordenadas Positivas");
				}
				else {
					if(numy<0) {
						System.out.println("El punto exacto ("+numx+","+numy+"), est� en el Eje de las Ordenadas Negativas");
					}
					else {System.out.println("El punto exacto ("+numx+","+numy+"), est� en el Punto de Origen");}
				}
			}
			if (numy==0) {
				if(numx>0) {
					System.out.println("El punto exacto ("+numx+","+numy+"), est� en el Eje de las Abscisas Positivas");
				}
				else {
					if (numx<0) {
						System.out.println("El punto exacto ("+numx+","+numy+"), est� en el Eje de las Abscisas Negativas");
					}
					else {}
				}
			}
		}
		//Inicio del menu
	public static void main(String args[]) {
		String repetir=null;
		do {
		System.out.println("Bienvenido al programa");
		System.out.println("Para saber en que cuadrante del plano cartesiano X-Y");
		System.out.println("Se encuentra su punto, debe ingresar el n�mero X y el n�mero Y");
		System.out.println("---------------------------------");
		System.out.println("Ingrese el n�mero X");
		double numx=scanner.nextDouble();
		System.out.println("Ingrese el n�mero Y");
		double numy=scanner.nextDouble();
		quadrant(numx,numy);
		points(numx,numy);
		System.out.println("********************************");
		System.out.println("Desea conocer el cuadrante de otro punto exacto? Si/No");
		repetir=scanner.next();
		repetir=repetir.toUpperCase();
		} while (repetir.equals("SI"));
		System.out.println("Saliendo....");
	}
}

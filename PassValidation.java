
import java.util.Scanner;

import javax.swing.JOptionPane;


public class PassValidation {
public static Scanner leer= new Scanner(System.in);	
public static Password usuario =new Password(8,"");	
	

	public static void main(String[] args)  {
		// TODO Auto-generated method stub

	int op=0;
		


	
	do {
		
	
		System.out.println("*********MENU******************************");
		System.out.println("* 1.-INGRESAR CONTRASE�A MANUAL           *");
		System.out.println("* 2- GENERAR UNA CONTARSE�A ALEATORIA     *");
		System.out.println("* 3.-CAMBIAR LA LONGITUD DE LA CONTRASE�A *");
		System.out.println("* 4.-SALIR                                *");
		System.out.println("*******************************************");
		System.out.print("Elegir OPcion: ");
		op= leer.nextInt();
		
	
		if (op==1) {
			 IngresoManual();
		}else if (op==2) {
			IngresoAleatorio();
		}else if (op==3) {
			cambiarLongitud();
		}else if (op==4){
			System.out.println("Gracias Ha salido del programa . Saliendo.......");
	
		}else {System.out.println("INTRODUZCA UNA OPCION VALIDA");}
		

	} while (op!=4);
	

	


}

	
		
	
	public static  void IngresoManual() {
		String contra="";	
		
		//contra= JOptionPane.showInputDialog(null,"Ingrese una Contrase�a");
		System.out.print("INGRESE LA CONTRASE�A (Min 3 Mayusculas 2 Minuscula 5 NUMEROS--FUERTE  : ");
		contra=leer.next();
		Password usuario =	new Password(8,contra);
		System.out.println("LA CONTRASE�A ES: "+ usuario.getContrasena());
		System.out.println("");
		
		if (usuario.esFuerte()==true) {
			System.out.println("SU CONTRASE�A ES FUERTE");
		}else {	System.out.println("SU CONTRASE�A ES DEBIL");   }
		System.out.println("--------------------------------------------");
		System.out.println("");
	}
	
	
	public static void IngresoAleatorio() {
		

		System.out.println("SU CONTRASE�A GENERADA ES: " + usuario.generarPassword());
		
		if (usuario.esFuerte()==true) {
			System.out.println("SU CONTRASE�A ES FUERTE");
		}else {	System.out.println("SU CONTRASE�A ES DEBIL");   }
		System.out.println("");
		
	}
	
	
	public static void cambiarLongitud() {
		
		System.out.print("INGRESE LA NUEVA LONGITUD: ");
		int longit =leer.nextInt();
		usuario.setLongitud(Math.abs(longit-usuario.getLongitud()));
	}
	
	
	
}

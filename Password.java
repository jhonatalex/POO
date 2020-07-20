

public class Password {

	  //Atributos
		int longitud;
		String contrasena;
		
	// VARIABLES
	public static String NUMEROS = "0123456789";
	public static String MAYUSCULAS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	public static String MINUSCULAS = "abcdefghijklmnopqrstuvwxyz";
 
	
	//por defecto
	public Password() {
	
		//this.longitud = 8;
	}
	
	
	//Contructor
	
	public  Password (int longitud, String contrasena ) {
		super();
		this.longitud=longitud;
		this.contrasena=contrasena;
		
	}
	
	//METODOS
	public  boolean esFuerte() {
		int mayus=0; //CONTADOR MAYUSCULA 
		int minus = 0; // CONTADOR MINUSCULA
	    int num=0;		//CONTADOR DE NUMEROS
	    boolean estado=false;
	    
			for (int i = 0; i <contrasena.length(); i++) {
				
					if(Character.isUpperCase(contrasena.charAt(i))) { //VERIFICO SI ES MAYUSCULA
						mayus++;
					}
					else if(Character.isLowerCase(contrasena.charAt(i))) { //VERIFICO SI ES MINUSCULA
						minus++;
					}
					else if(Character.isDigit(contrasena.charAt(i))){  //VERIFCO SI ES NUMERO
						num++;
					}
			} //end for
		
			if (mayus>2 && minus>1 && num>=5) { //VERIFICO CUANTOS DIGITOS HAY DE CADA TIPO
					estado=true;
			}else {
				
				if(mayus<=2) {
					System.out.println("FALTA EN SU CONTRASEÑA : "+Math.abs(mayus-2)+" MAYÚSCULAS");
				}
				if(minus<=1) {
					System.out.println("FALTA EN SU CONTRASEÑA : "+Math.abs(minus-1)+" MINÚSCULAS");
				}
				if(num<5) {
					System.out.println("FALTA EN SU CONTRASEÑA : "+Math.abs(num-4)+" NÚMEROS");
				}
				estado=false;
			}
				
			
		
		return estado;
		
}//cierre Metodo
	
	
	
	public String generarPassword() {
		
				
		
		for (int i = 0; i <this.longitud; i++) {
			
			int orden = (int)(Math.random()*3); //GENERA NUMEROS RANDON DEL 0-2
				if (orden==1) {
					char letra = MAYUSCULAS.charAt((int) (Math.random()*MAYUSCULAS.length()));
					contrasena+= String.valueOf(letra);  //GUARDA 1 Mayuscula
				
				}else if(orden==2) {
					char letra = MINUSCULAS.charAt((int) (Math.random()*MINUSCULAS.length()));
					contrasena+= String.valueOf(letra); //GUARDA 1 Minuscula
			
				}else {
					char letra = NUMEROS.charAt((int) (Math.random()*NUMEROS.length()));
					contrasena+= String.valueOf(letra); //GUARDA 1 Numero
				}
					
				
						
		
		}//end for
		return contrasena;
	}
	
		
	// GETTERS AND SETTERS  AUTOMATIC
	
	public int getLongitud() {
		return longitud;
	}


	public void setLongitud(int longitud) {
		this.longitud = longitud;
		System.out.println("SE HA CAMBIADO LA LONGITUD DE CONTRASEÑA ");
	}


	public String getContrasena() {
		return contrasena;
	}



	
	
	
	
	
	
	
}

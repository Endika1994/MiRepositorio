package poo;

public class Pruebas {

	public static void main(String[] args) {
		//Usuario us;
		Usuario us = new Usuario();
		//us.setEmail("endika@vazquez");
		//us.setPass("contra");
		System.out.println(us.getEmail());
		System.out.println(us.getPass());
		
		us.cambiarPass("sad");
		
		System.out.println(us.datosCompletos());
		System.out.println(us.datosCompletos("coma"));
		System.out.println(us.datosCompletos("corchetes"));
	}

}

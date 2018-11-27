package javase;

import java.util.ArrayList;
import java.util.Scanner;

public class HolaMundo {

	public static void main(String[] args) {
		System.out.println("Hola Mundo");
		
//		TIPOS PRIMITIVOS
		
		//Enteros
		@SuppressWarnings("unused")
		byte b; //8 bits
		@SuppressWarnings("unused")
		short s; //16 bits
		int i; //32 bits
		@SuppressWarnings("unused")
		long l;//64 bits
		
		i=5;
		System.out.println("El valor de i es: " + i);
		
//		Coma flotante
		@SuppressWarnings("unused")
		float f; // 32 bits
		double d;//64 bits
		d= 5.3E7;// Nunca comparar igualdad entre numeros de coma flotantes
		System.out.println(d);
		
//		Booleano, solo pueden valer TRUE o FALSE
		@SuppressWarnings("unused")
		boolean bool;
		bool=true;// false
//		Caracter
		@SuppressWarnings("unused")
		char c;
		c = '1';
//		Fin de primitivos(8)
//		Clases equivalentes a los tipos primitivos
//		Byte, short, integer, long, float, double, boolean, character
		
//		OPERADORES
//		Matematicos + - * / %
		
		int resto = 5%3; //El resto de dividir 5%3 es 2
		System.out.println(resto);
		
//		Comparaciones: ==, !=, <, >, <=, >=
		int x = 5;
		System.out.println(x==3);
		System.out.println(x);
		
//		Operadores logicos: &&, ||
		System.out.println(!(1 <= x && x <=10));
		System.out.println(1 > x || x >10);
		
//		Comparadores de asignacion: =, +=, -=, */, /=...
		int y = x= 2;
		y +=5;// y = y+5
		
//		Incremento y decremento
		y=1;
		System.out.println(++y);//PREincremento
		System.out.println(y++);//POSTincremento
		
//		Operador condicional ? :
		
		boolean datoBooleano = false;
		System.out.println(datoBooleano ? "VERDADERO" : "FALSO");
		
		int num1 = 5, num2 = 6;
		int max = num1>num2 ?num1:num2;
		System.out.println(max);
		
		//Sentencias de control
		
		boolean estaArrancado = false;
		
		if(estaArrancado) {
			System.out.println("Verdadero");
		}else {
			System.out.println("Falso");
		}
		
//		ARRAYS
		String[] text = new String[2];
		text[0]="Texto1";
		text[1]="Texto2";
		
		for(i=0;i<text.length;i++) {
			System.out.println(text[i]);
		}
		for(String texto: text) {// JAVA5
			System.out.println(texto);
		}
		
		char[][] tablero = new char[8][8];
		tablero[0][0] = 'T';
		for(x = 0; x < tablero.length; x++) {
			System.out.println();
			for(y=0; y<tablero[x].length;y++) {
				System.out.println(tablero[x][y]);
			}
		}
	
//		Leer de teclado
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce tu email: ");
		String email = sc.nextLine();
		
		System.out.println(email);
		sc.close();
		
//		Conversiones
		String sEntero = "5";
		int entero = Integer.parseInt(sEntero);
		
		long largo = 5L;
		String sLargo = String.valueOf(largo); //"" + largo; <-- APAÑO GUARRO
		
		float fVariable = 5.3F;
		String sVariable = String.valueOf(fVariable);
	}
	
	
//	Colecciones
	ArrayList<String> textos = new ArrayList<>();
	
	
	
	

}


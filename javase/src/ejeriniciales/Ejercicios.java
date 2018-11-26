package ejeriniciales;
import java.util.*;

public class Ejercicios {

	public static void main(String[] args) {
//		 Programa Java que lea dos números enteros por teclado y los muestre por pantalla.
//		int n1,n2;
		Scanner sc = new Scanner(System.in);
		
//		System.out.println("Introduce un numero");
//		n1 = sc.nextInt();
//		System.out.println("Introduce otro");
//		n2 = sc.nextInt();
//		
//		System.out.println("LOs numeros introducidos son: " +n1 + " y " + n2);
		
//		  Programa Java que lea un nombre y muestre por pantalla:
		
//		String nombre;
//		System.out.println("Introduce un nombre");
//		nombre = sc.nextLine();
//		
//		System.out.println("El nombre introducido es: "+nombre);
		
		
//		  Escribe un programa Java que lee un número entero por teclado y obtiene y muestra por pantalla el doble y el triple de ese número.
		
//		int n1,nDoble, nTriple;
//		System.out.println("Introduce un numero");
//		n1 = sc.nextInt();
//		
//		nDoble = n1*2;
//		nTriple = n1*3;
//		
//		System.out.println("Has introducido el numero: " + n1);
//		System.out.println("El doble es: " + nDoble);
//		System.out.println("Y el triple: " + nTriple);

////		Programa que lea una cantidad de grados centígrados y la pase a grados Fahrenheit. 
//		La fórmula correspondiente para pasar deF, gr grados centígrados a fahrenheit es:
//			F = 32 + ( 9 * C / 5)
		
//		double gradosC, gradosF;
//		
//		System.out.println("Introduce los grados centigrados: ");
//		gradosC = sc.nextDouble();
//		gradosF = 32 + ( 9 * gradosC / 5);
//		
//		System.out.println("Has introducido estos grados centigrados: " + gradosC);
//		System.out.println("Pasado a Fahrenheit, son: " + gradosF);
		
//		Programa que lee por teclado el valor del radio de una circunferencia y calcula y muestra por pantalla la longitud y el área de la circunferencia. 
//		Longitud de la circunferencia = 2*PI*Radio, Area de la circunferencia = PI*Radio^2
		
//		double radio,longitud,area;
//		System.out.println("Introduce el valor del radio: ");
//		radio = sc.nextDouble();
//		
//		longitud = 2*Math.PI*radio;
//		area = Math.PI * Math.pow(radio, 2);
//		
//		System.out.println("El valor del radio introducido es: " + radio);
//		System.out.println("Su longitud es: " + longitud);
//		System.out.println("Su area es: " + area);
		
//		Programa que pase una velocidad en Km/h a m/s. La velocidad se lee por teclado.
	
//		double velocidad, velocm;
//		
//		System.out.println("Introduce la velocidad:");
//		velocidad = sc.nextDouble();
//		velocm = velocidad*1000/3600;
//		
//		System.out.println("La velocidad en M/S es: " + velocm);
		
//		Programa lea la longitud de los catetos de un triángulo rectángulo y calcule la longitud de la hipotenusa según el teorema de Pitágoras.
		
//		double cateto1, cateto2, hiplong;
//		
//		System.out.println("Introduce el primer cateto:");
//		cateto1 = sc.nextDouble();
//		
//		System.out.println("Introduce el segundo cateto:");
//		cateto2 = sc.nextDouble();
//		
//		hiplong = Math.sqrt(Math.pow(cateto1,2)+ Math.pow(cateto2, 2));
//		
//		System.out.println("La hipotenusa es: " + hiplong);
		
//		Programa Java que lea un número entero por teclado y calcule si es par o impar.
		
//		int n1;
//		System.out.println("Introduce el numero:");
//		n1 = sc.nextInt();
//		
//		if(n1%2==0) {
//			System.out.println("Es par");
//		}else {
//			System.out.println("es impar");
//		}
		
		//Programa que lea un número entero y muestre si el número es múltiplo de 10.
		
//		int n1;
//		System.out.println("Introduce el numero:");
//		n1 = sc.nextInt();
//		
//		if(n1%10==0) {
//			System.out.println("Es multiplo de 10");
//		}else {
//			System.out.println("no es multiplo de 10");
//		}
		
		
		//Programa que lea dos números por teclado y muestre el resultado de la división del primer número por el segundo. Se debe comprobar que el divisor no puede ser cero.
		
//		int n1,n2;
//		
//		System.out.println("Introduce el primer numero:");
//		n1 = sc.nextInt();
//		
//		System.out.println("Introduce el segundo numero:");
//		n2 = sc.nextInt();
//		
//		if(n2==0) {
//			System.out.println("El divisor no puede ser cero");
//		}else {
//			System.out.println("El resultado de la division es: " + n1/n2);
//		}

		
//		Calcular el mayor de tres números enteros en Java.
		
//		int n1,n2,n3;
//		
//		System.out.println("Introduce el primer numero:");
//		n1 = sc.nextInt();
//		
//		System.out.println("Introduce el segundo numero:");
//		n2 = sc.nextInt();
//		
//		System.out.println("Introduce el tercer numero:");
//		n3 = sc.nextInt();
//		
//		if (n1 > n2) {
//            if (n1 > n3) {
//                System.out.println("El mayor es: " + n1);
//            } else {
//                System.out.println("el mayor es: " + n3);
//            }
//        } else if (n2 > n3) {
//            System.out.println("el mayor es: " + n2);
//        } else {
//            System.out.println("el mayor es: " + n3);
//        }
			
//		Programa que lea una variable entera mes y compruebe si el valor corresponde a un mes de 30 días, de 31 o de 28. Supondremos que febrero tiene 28 días.
//		Se mostrará además el nombre del mes. Se debe comprobar que el valor introducido esté comprendido entre 1 y 12.
		
//		int mes;
//		
//		System.out.println("Introduce el mes:");
//		mes = sc.nextInt();
//		
//		if(mes> 1 || mes < 12) {
//			switch(mes) {
//				case 1 : System.out.println("Enero");
//				break;
//				case 2 : System.out.println("Febrero");
//				break;
//				case 3 : System.out.println("Marzo");
//				break;
//				case 4 : System.out.println("Abril");
//				break;
//				case 5 : System.out.println("Marzo");
//				break;
//				case 6 : System.out.println("Junio");
//				break;
//				case 7 : System.out.println("Julio");
//				break;
//				case 8 : System.out.println("Agosto");
//				break;
//				case 9 : System.out.println("Septiembre");
//				break;
//				case 10 : System.out.println("Octubre");
//				break;
//				case 11 : System.out.println("Noviembre");
//				break;
//				case 12 : System.out.println("Diciembre");
//				break;
//				
//			}
//		}
//		
//		if(mes == 4 || mes == 6 || mes == 9 || mes == 11) {
//			System.out.println("El mes es de 30 dias");
//		}else if(mes == 2) {
//			System.out.println("El mes es de 28 dias");
//		}else {
//			System.out.println("El mes es de 31 dias");
//		}
		
//		Intercambio de variables
		
//		int a, b, inter;
//		
//		System.out.println("Introduce el a: ");
//		a = sc.nextInt();
//		
//		System.out.println("Introduce el b: ");
//		b = sc.nextInt();
//		
//		inter = a;
//		a = b;
//		b= inter;
//		
//		System.out.println("Ahora el a: " + a + " y el b es: "+ b);
		
//		Mostrar la tabla de multiplicar de un numero
		
//		int numul;
//		System.out.println("Introduce el numero");
//		numul = sc.nextInt();
//		System.out.println("Esta es la tabla de multiplcar de: " + numul);
//		for(int i=1; i<=10; i++) {
//			System.out.println(numul + "*" + i + "=" + numul*i);
//		}
//		
//		
		
		
//		EJERCICIOS ARRAY y ARRAYLIST
		
//		Rellenar array de 10 numeros por teclado
//		
//		int i;
//		int[] numeros = new int[10];
//		
//		for(i=0; i<10; i++) {
//			System.out.println("Numeros: ");
//			numeros[i] = sc.nextInt();
//		}
		
//		Programa que lee por teclado la nota de los alumnos de una clase y calcula la nota media del grupo. 
//		También muestra los alumnos con notas superiores a la media. El número de alumnos se lee por teclado.
		
//		int numAlum;
//		double suma=0, media;
//		
//		do {
//			System.out.println("Numero de alumnos: ");
//			numAlum = sc.nextInt();
//		}while(numAlum<=0);
//		
//		
//		double[] notAlum = new double[numAlum];
//		
//		for(int i=0; i< notAlum.length;i++) {
//			System.out.println("La nota " + (i+1) +  " del alumno: ");
//			notAlum[i] = sc.nextInt();
//		}
//		
//		
//		for(int i=0; i < notAlum.length; i++) {
//			suma = suma+notAlum[i];
//		}
//		
//		media = suma/notAlum.length;
//		
//		System.out.println("La suma de todas las notas es: " + suma);
//		System.out.println("La nota media es:  " + media);
//		
//		
//		System.out.println("Las notas superiores a la media ");
//		for(int i=0; i<notAlum.length;i++) {
//			if(notAlum[i]>media) {
//				System.out.println("Alumno " + (i+1) + " Nota: " + notAlum[i]);
//			}
//		}
		
		
		
		
		
		
		
		
		sc.close();
		
	}

}

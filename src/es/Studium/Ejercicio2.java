package es.Studium;
import java.util.*;
public class Ejercicio2
{
	public static void main(String[] args)
	{
		try
		{
			int numero1, numero2;
			Scanner teclado = new Scanner(System.in);
			System.out.println("Escriba un número entero: ");
			numero1=teclado.nextInt();
			System.out.println("Escriba otro número entero: ");
			numero2=teclado.nextInt();
			teclado.close();
			double resultado;
			resultado=(double)numero1/(double)numero2;
			System.out.println(resultado);
		}
		catch(ArithmeticException err)
		{
			System.out.println("El divisor no puede ser 0");
		}
		catch(InputMismatchException err)
		{
			System.out.println("No se ha introducido un número entero...");
		}
		
	}
}
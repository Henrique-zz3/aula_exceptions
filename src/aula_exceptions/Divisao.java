package aula_exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Divisao {

	static Scanner ler = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int dividendo, divisor;
		
		try {
			
			
			System.out.println("Digite o Dividendo: ");
			dividendo = ler.nextInt();
					
			System.out.println("Digite o Divisor: ");
			divisor = ler.nextInt();
					
			divide(dividendo, divisor);
				
		}catch(InputMismatchException exc) {
			System.err.println("Exceção: " + exc);
			System.out.println("Tipagem errada, apenas número inteiros");
			
		}catch(ArithmeticException exc) {
			System.err.println("Exceção: " + exc);
			System.out.println("Não pode dividir por 0");
			
		}finally{
			System.out.println("Divisão concluída!");
			
		}
			
		
	}

	public static void divide(int dividendo, int divisor) {
		System.out.println("Divisão = " + (dividendo / divisor));
	}

}

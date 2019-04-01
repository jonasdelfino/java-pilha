import java.util.InputMismatchException;
import java.util.Scanner;
public class CapturandoExececoes {
	
	public static int divide(int numerador, int denominador) throws ArithmeticException{
		return numerador / denominador;

	}
	
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		boolean continua = true;
		
		do {
			try {
				System.out.print("Numerador: ");
				int numerador = sc.nextInt();
				
				System.out.println("Denominador: ");
				int denominador = sc.nextInt();
				
				int resultado = divide(numerador, denominador);
				System.out.println("Resultado: " + resultado);
				
				continua = false;
			} catch (InputMismatchException error1 ) {
				System.out.println("N�o � permitido inserir letras, informe apenas n�meros inteiros!");
				sc.nextLine(); //descarta a entrada errada do us�rio
				
			} catch (ArithmeticException error2) {
				System.out.println("O n�mero do divisor deve ser diferente de 0!");
			}
		} while (continua);
		
		
		
	}
	
}

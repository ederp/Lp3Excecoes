package ex1;

import java.util.Scanner;

public class VerificaArgumentos {
	
	public static void leArgumento(int a) throws ArithmeticException, NegativoException, PequenoException, GrandeException{
		if(a < 0) throw new NegativoException();
		if(a >= 0 && a <=1000) throw new PequenoException();
		if(a > 10000) throw new GrandeException();
		System.out.println(a/0);
	}

	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("Digite um número qualquer: ");
			int a = sc.nextInt();
			leArgumento(a);
			sc.close();
		}catch(ArithmeticException e) {
			System.out.println("Divisão por zero: "+e.toString());
		}catch (PequenoException| GrandeException| NegativoException e) {
			System.out.println(e.getMessage()); 
		}catch(Exception e) {
			System.out.println(e.toString());
		}finally {
			System.out.println("Finalizada a execução do método 'leArgumento'");
		}
	}

	@SuppressWarnings("serial")
	public static class NegativoException extends NumberFormatException{
		@Override
		public String getMessage() {
			return "Erro: Argumento negativo";
		}
	}
	
	@SuppressWarnings("serial")
	public static class PequenoException extends NumberFormatException{
		@Override
		public String getMessage() {
			return "Erro: Argumento deve ser maior que 1000";
		}
	}
	
	@SuppressWarnings("serial")
	public static class GrandeException extends NumberFormatException{
		@Override
		public String getMessage() {
			return "Erro: Argumento muito grande";
		}
		
	}
}

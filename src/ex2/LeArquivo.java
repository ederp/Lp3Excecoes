package ex2;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class LeArquivo {

	public static void main(String[] args){
		try(Scanner sc1 = new Scanner(new FileReader( "nome.txt"));
			Scanner sc2 = new Scanner(new FileReader("sobrenome.txt"))){
			System.out.println("Nome completo: "+sc1.next() +" "+ sc2.next());
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		}
	}

}

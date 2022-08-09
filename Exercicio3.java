package loops;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		boolean infoValida = false;

		do {
			System.out.println ("Informe nome");
			String nome = scan.next();
			if (nome.length()>= 3){
				infoValida = true;
			}else {
				System.out.println ("É necessário informar mais de 3 caracteres para validar NOME");
				System.out.println("Tente novamente! ");
				
			}
		}while (!infoValida);
		
		do {
		System.out.println ("Informe idade");
		int idade = scan.nextInt();
		if (idade >= 0 && idade <=150) {
			infoValida= true;
		} else {
			System.out.println ("É considerado idade válida de 0-150 anos");
			System.out.println("Tente novamente! ");
		}
		
		} while (!infoValida);
		
		do {
			System.out.println ("Informe seu salário");
			double salario = scan.nextDouble();
			if (salario >= 1) {
				infoValida = true;
			} else {
				System.out.println ("O salário tem que ser maior que Zero");
				System.out.println("Tente novamente! ");
			}
			
		}while (!infoValida);
		
		do {
			System.out.println ("Digite F para sexo FEMININO e M para o sexo MASCULINO");	
			String sexo = scan.next();
			if (sexo.equalsIgnoreCase("f") || 
					sexo.equalsIgnoreCase("m")) {
				infoValida = true;
			}else {
				System.out.println (" digite F para feminino ");
				System.out.println (" digite M para masculino ");
				System.out.println("Tente novamente! ");
			}
			
		}while (!infoValida);
		
		do {
			System.out.println ("Digite 'S' para SOLTEIRO,'C' para CASADO, 'V' para VIÚVO, 'D' para DIVORCIADO ");	
			String estadoCivil = scan.next();
			if (estadoCivil.equalsIgnoreCase("s") || 
					estadoCivil.equalsIgnoreCase("c") ||
					estadoCivil.equalsIgnoreCase("v") || 
					estadoCivil.equalsIgnoreCase("d")) {
				infoValida = true;
			}else {
				System.out.println (" Informe os valores corretos para o Estado Civil ");
				System.out.println("Tente novamente! ");
			}
			
		}while (!infoValida);
		
		System.out.println (" Seus dados foram cadastrados com sucesso!! ");
	}

}

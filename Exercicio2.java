package loops;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		 Scanner scan = new Scanner (System.in);
		 
		 boolean senhaValida = false;

		do {
		 System.out.println ("Informe o nome do USUÁRIO");
		 String  usuario = scan.next();
		 System.out.println ("Informe a SENHA");
		 String  senha = scan.next();
		 		 
		 if (usuario.equalsIgnoreCase(senha)){ // equals é utilizado para comparar o valor do objeto (case sensitive)
			 senhaValida = false;
			 System.out.println  ("Senha não pode ser igual ao valor informado em USUÁRIO");
			 System.out.println  ("Digite uma nova senha válida");
			 
		 } else {
			 senhaValida= true;
			 System.out.println ("Cadastro registrada com sucesso!");
			 System.out.println (usuario);
		 }
		 }while (!senhaValida); 
		}			
}

/*Faça um programa que leia o nome de usuário e senha e não aceite a senha igual ao nome de usuário, mostrando uma 
 * mensagem de erro e voltando a pedir as informações
 */

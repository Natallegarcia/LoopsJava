package loops;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		
		boolean notaValida= false;
		
		do {
			
			System.out.println ("Informe uma nota entre 1 e 10");
			
			float nota = scan.nextFloat();
			
			if ( nota >= 1 && nota <=10) {
				notaValida= true;
				System.out.println ("Nota válida!! STATUS: Registrada   " + nota);
			}else {
				// notaValida= false
				System.out.println ("Informe um valor válido! Status: PENDENTE");
				System.out.println ("Digite a nota novamente.");
			} 
			}while (!notaValida);
			
		}
/* Faça um programa que peça uma nota, entre zero e dez. Mostre uma mensagem caso o valor seja inválido e continue 
 * pedindo até que o usuário informe um valor válido.
 */
 
}

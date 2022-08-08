package loops;

public class For {

	public static void main(String[] args) {
		for (int i=0; i <11 ; i++) { // primeiro passo declarar a variavel do contador. 2° condição/ expressão booleana. 3° declarar o incremento ou decremento do contador
			System.out.println ("Valor de i: " + i);	
	
	}
		for (int i=10; i >0 ; i--) { // primeiro passo declarar a variavel do contador. 2° condição/ expressão booleana. 3° declarar o incremento ou decremento do contador
			System.out.println ("Valor de i: " + i);	
		}
	
	// Loop FOR com mais de uma variável (para a declaraçao de muitas variáveis dentro do FOR é necessário usar apenas a virgula ,)
		
		for (int i = 0, j = 10; i < j; i++, j--) {
			System.out.println ("i tem valor: " +i + " e j tem valor: " +j);
		}
		// For com partes Ausentes 
		
		int count = 0;
		for ( ; count < 10; ) {
			System.out.println ("Valor de count: " + count);
			count += 2; // incrementar o valor 
		}
	
		/* Loop FOR sem corpo
		 O Loop FOR sem corpo é muito utilizado quando queremos SOMAR VALORES*/
		
			int soma = 0;
			for (int i =1; i < 5; soma += i++); {
				System.out.println("O valor da soma é: " + soma);
			}
			
			
		 
	
	
	
}
}

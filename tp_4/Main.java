package tp_4;

public class Main {
	
	public static void main(String[] args) {
		Arrays arrays = new Arrays();
		
		// Inicializa os vetores
		
		arrays.setArrayANaPosicao(1, 0);
		arrays.setArrayANaPosicao(2, 1);
		arrays.setArrayANaPosicao(3, 2);
		arrays.setArrayANaPosicao(4, 3);
		arrays.setArrayANaPosicao(5, 4);
		arrays.setArrayANaPosicao(6, 5);
		arrays.setArrayANaPosicao(7, 6);
		arrays.setArrayANaPosicao(8, 7);
		arrays.setArrayANaPosicao(9, 8);
		arrays.setArrayANaPosicao(10, 9);
		
		
		arrays.setArrayBNaPosicao(10, 0);
		arrays.setArrayBNaPosicao(9, 1);
		arrays.setArrayBNaPosicao(8, 2);
		arrays.setArrayBNaPosicao(7, 3);
		arrays.setArrayBNaPosicao(6, 4);
		arrays.setArrayBNaPosicao(5, 5);
		arrays.setArrayBNaPosicao(4, 6);
		arrays.setArrayBNaPosicao(3, 7);
		arrays.setArrayBNaPosicao(2, 8);
		arrays.setArrayBNaPosicao(1, 9);
		
		// Exemplo 1: dividi dois números que não resultam em 0
		
		try {
			int resultado1 = arrays.calcula(20, 5);
			if(resultado1 == 0) {
				System.out.println("Exemplo 1: ");
				throw new ExcecaoDivisaoResultadoZero();
			} else {
				System.out.println("Exemplo 1: ");
				System.out.println("O resultado desta divisão é: " + resultado1);
			};
		} catch(ExcecaoDivisaoResultadoZero error) {
			System.out.println(error.getMessage());
		}
		
		// Exemplo 2: dividi dois números que o resultado é 0
		
		try {
			int resultado2 = arrays.calcula(0, 5);
			if(resultado2 == 0) {
				System.out.println("Exemplo 2: ");
				throw new ExcecaoDivisaoResultadoZero();
			} else {
				System.out.println("Exemplo 2: ");
				System.out.println("O resultado desta divisão é: " + resultado2);
			};
		} catch(ExcecaoDivisaoResultadoZero error) {
			System.out.println(error.getMessage());
		}
		
		try {
			int[] arrayResultante = arrays.calculaDivisaoArrays(arrays.getArrayA(), arrays.getArrayB());
			
			System.out.println("Efetuando a divisão...");
			
			for (int i = 0; i < arrayResultante.length; i++) {
				if (arrayResultante[i] == 0) {
					System.out.println("Posição: " + i);
					throw new ExcecaoDivisaoResultadoZero();
				} else {
					System.out.println("Posição: " + i);
					System.out.println("O resultado desta divisão é: " + arrayResultante[i]);
				}
			}
		} catch(ExcecaoDivisaoResultadoZero error) {
			System.out.println(error.getMessage());
		} finally {
			System.out.println("Valores utilizados...");
			
			for (int i = 0; i < arrays.getArrayA().length; i++) {
				System.out.println("Posição: " + i);
				System.out.println("Os valores para a e b foram " + arrays.getArrayA()[i] + " , " + arrays.getArrayB()[i] + " , respectivamente");
			}
		}
		

	}
}

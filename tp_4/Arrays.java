package tp_4;

public class Arrays {
	private int[] arrayA = new int[10];
	private int[] arrayB = new int[10];
	
	public void setArrayANaPosicao(int valor, int posicao) {
		try {
			this.arrayA[posicao] = valor;
			System.out.println("O valor " + valor + " foi fixado ao array A com sucesso!");
		} catch(ArrayIndexOutOfBoundsException error) {
			System.out.println("O índice está fora da amplitude do vetor!");
		}
		
	}
	
	public void setArrayBNaPosicao(int valor, int posicao) {
		try {
			this.arrayB[posicao] = valor;
			System.out.println("O valor " + valor + " foi fixado ao array B com sucesso!");
		} catch(ArrayIndexOutOfBoundsException error) {
			System.out.println("O índice está fora da amplitude do vetor!");
		}
		
	}
	
	public void setArrayA(int[] arrayA) {
		this.arrayA = arrayA;
	}
	
	public void setArrayB(int[] arrayB) {
		this.arrayB = arrayB;
	}
	
	public int[] getArrayA() {
		return arrayA;
	}
	
	public int[] getArrayB() {
		return arrayB;
	}
	
	public int calcula(int a, int b) throws ExcecaoDivisaoResultadoZero {
		int resultado = 0;
		
		try {
			
			resultado = a/b;
			
		} catch(ArithmeticException error) {
			System.out.println("Não é possível dividir por 0!");
		}
		
		return resultado;
		
	}
	
	public int[] calculaDivisaoArrays(int[] arrayB, int[] arrayA) throws ExcecaoDivisaoResultadoZero {
		int[] arrayResultante = new int[10];
		
		for (int i = 0; i < arrayB.length; i++) {
			
				arrayResultante[i] = calcula(arrayA[i], arrayB[i]);
			
		}
		
		return arrayResultante;
	}
}

public class Principal {

	public static void main(String[] args) {		
		int[] vetor = {1, 2, 3, 4, 5};
		Contexto contexto = new Contexto(new BubbleSort());
		contexto.organizar(vetor);
		contexto = new Contexto(new QuickSort());
		contexto.organizar(vetor);		
	}

}
package algo_1;

public class algo1 {

	public static void main(String[] args) {
		solution s = new solution();
		int[] A = { 3, 4, 4, 6, 1, 4, 4 };
		
		int [] Coupteur = new int[5];
		Coupteur =s.solution_Algo1(5, A);

		for (int i = 0; i<Coupteur.length ; i++) {
			System.out.println(Coupteur[i]);

		}
	}

}

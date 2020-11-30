package algo_1;

public class solution {

	public int[] solution_Algo1(int N, int[] A) {
		int[] Coupteur = new int[N];

		int max_compteur = 0;
		for (int i = 0; i < A.length; i++)

		{

			if (A[i] == N + 1) {
				for (int k = 0; k < N; k++)
					Coupteur[k] = max_compteur;
			       }

			if ((A[i] <= N) && (A[i] >= 1)) {
				Coupteur[A[i] - 1] += 1;
				if (Coupteur[A[i] - 1] > max_compteur)
					max_compteur = Coupteur[A[i] - 1];
			}

		}

		return Coupteur;
	}

}

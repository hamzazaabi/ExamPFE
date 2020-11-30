package algo2;

public class solution_Algo2 {
	public int numer_way(int a)

	{
		
		int[] A = new int[a];
		
		A[0] = 1;
		A[1] = 1;
		for (int i =2; i < a ; i++) {
			A[i] = A[i-1] + A[i-2];
		
		}

		return A[a-1] ;

	}

	public int[] solution_Alg2(int[] A, int[] B) {
		int[] Coupteur = new int[A.length];
		for(int i =0 ;i<A.length;i++)
		{
			Coupteur[i]= numer_way(A[i]+1)%(2* numer_way(B[i]+1));
		}

		return Coupteur;
	}
}

public static class VectorHelper
 {
	/**
	*Permet de trier le vecteur d'entiers donné en paramètre
	*/
	static void TrierVecteur(int[] arr) 
	{	 
		int n = arr.length;	 
		int temp = 0;  
		for(int i=0; i < n; i++)
		{	
			for(int j=1; j < (n-i); j++)
			{	
				if(arr[j-1] > arr[j])
				{  
					temp = arr[j-1];  
					arr[j-1] = arr[j];	 
					arr[j] = temp;	 
				}	  
			}	
		}
	}
	/**
	*Inverse l'ordre des éléments du vecteur donné en paramètre.
	*/
	static void InverserVecteur(int[] nums)
	{
		int i = 0;
		int j = nums.size()-1;
		while (i < j) {
		int temp = nums.get(i);
		nums.set( i, nums.get(j));
		nums.set( j, temp);
		i++; j--;
	}
	/**
	*Somme deux vecteurs de même taille. Lève une exception InvalidParameterException si les vecteurs
	*sont de tailles différentes.
	*/
	static void SommerVecteurs(int[] v1, int[] v2) throws InvalidParameterException
	{
		if(v1.length != v2.length)
		{
			throw new InvalidParameterException();
		}
		for(i=0; i<v1.length; i++)
			v2[i] += v1[i];
	}
}

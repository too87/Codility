import java.util.Arrays;

public class cyclicRotate{

	public static void main(String[] args) {
		int[] s =new int[] {5,9,2,4};
		System.out.println(Arrays.toString(Solution(s,5)));
		// System.out.println(s.length);
	}

	public static int[] Solution (int[] A, int K){

		// int size = A.length;
		// int[] ans = new int[size];
		// int pos=0;
		// if(K==size) return A;
	 //    if((size==0)||(K>=size)) return A;
		// for(int i=0;i<K;i++){
		// 	ans[i] = A[size-K+i];
		// }

		// int j=0;
		// for(int i=K; i<size;i++){
		// 	ans[i]=A[j];
		// 	j++;
		// }

		// return ans;
		int size = A.length;
		//int[] ans = new int[size];
       for(int i=0; i<K;i++){
			for(int j = A.length-1; j > 0; j--){
				int temp = A[j];
				A[j] = A[j-1];
				A[j-1] = temp;
				
			}
		}
		return A;

	}
}
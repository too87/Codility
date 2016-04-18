import java.util.Arrays;
public class oddOccurrenceInArray { 
	public static void main(String[] args) {
		int[] s =new int[] {4,2,2,3,6,6,3};
		System.out.println("MAIN: "+solution(s));
	}
	public static int solution(int[] A){

		Arrays.sort(A);
		int ans =0;
		int size = A.length;
		// int max = A[0];
		
		// for(int i=1; i<A.length; i++){
		// 	if(A[i] >max) max=A[i];
			
		// }
		// long[] temp = new long[max+1];
		
		// for(int j=0; j<A.length; j++){
		// 	temp[A[j]]+=1;
		
		// }
	
		// for(int j=0; j<temp.length; j++){
		// 	if(temp[j]>0 && temp[j]%2==1){
		// 		return j;
		// 	}
		// }
		if(size==1) return A[0];
		int i =0;
		boolean found = false;
		if(size>2){
			while(i<size-1){
				if(A[i]==A[i+1]){
					i++;
				}
				else{
					found = true;
					return A[i];
				}
				i++;
			}
			if(found == false) return A[A.length-1];
		}
		return ans;
	}
	 

}
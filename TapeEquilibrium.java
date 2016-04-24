public class TapeEquilibrium {
    public int solution(int[] A) {
        int[] first = new int[A.length];
        int[] second = new int[A.length];
        //int pivot = 1;
        int sum =0;
        for(int i=0; i<A.length-1; i++){
            sum += A[i];
            first[i] = sum;
            //pivot++;
            //System.out.println(sum);
        }
        int sum1 =0;
        for(int i=A.length-1; i>0; i--){
            sum1 += A[i];
            second[i-1] = sum1;
            //pivot++;
            //System.out.println(sum1);
        }
        int ans =9999;
        for(int i=0; i<A.length-1; i++){
            int temp = Math.abs(first[i]-second[i]);
            ans=Math.min(ans,temp);
            //System.out.println(first[i]+"' "+second[i]);
        }
        
        return ans;
    }
}
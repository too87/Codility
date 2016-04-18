public class binarygap {
   
    public static int solution(int N){
    	String a = Integer.toString(13,2);
    	int pre =0; int post=0;
    	int current = 0;
    	int max= 0 ;
    	boolean flag = false;
    	int i = N;
    	while(i>0){
    		if((i&1) == 1){ //1&1=1 otherwise 0
    			if(flag == false) 
    				flag=true;
    			else{
    				max=Math.max(current,max);
    			}
    			current =0;
    		}
    		else
    			current +=1;
    		i=i>>1; //shift to the right 1 bit
    	}
    	
    	return max;
		
    }
	public static void main(String [] args)

	{
		
		System.out.println(solution(1041));

	

	}
}

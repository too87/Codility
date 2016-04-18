public class FrogJmp{
	public int solution(int X, int Y, int D){
			double ans = Math.ceil((double)(Y-X)/D);
			return (int)ans;
	}
	public static void main(String[] args) {
		System.out.println(solution(10,85,30));
	}
}
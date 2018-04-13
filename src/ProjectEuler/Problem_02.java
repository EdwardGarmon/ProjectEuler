package ProjectEuler;

public class Problem_02 extends Problem {

	public void solve() {
		float n1;
		float n2;
		float n3;
		float sum;
		n1= 1;
		n2 =1;
		n3 = 0;
		sum = 0;

		while (n3 < 4000000) {
			n3 = n2 + n1;
			if(n3%2==0) {
				sum+=n3;
			}
			n1 = n2;
			n2 = n3;
		}
		System.out.println(sum);
	}
	//answer:4613732
}

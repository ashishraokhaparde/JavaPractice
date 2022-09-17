package ark.interview;

public class FactorialRecursion {
public static void main(String[] args) {
	

	
	System.out.println(fact(6));

}
static int fact (int n) {
	if(n==0)
		return 1;
	else {
		return n  = n * fact(n-1); 
	}
}
}

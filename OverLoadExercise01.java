public class OverLoadExercise01{
	public static void main(String[] args){
		Method m = new Method();
		int sq = m.m(2);
		System.out.println(sq);
		int product = m.m(2, 3);
		System.out.println(product);
		m.m("good job");

		int max = m.max(2, 3);
		double max1 = m.max(2.2, 3.3);
		double max2 = m.max(1.1, 2.1, 3.1);
		System.out.println("max = " + max + " max1 = " + max1 + " max2 = " + max2);
	}
}

class Method{

public int m(int n){
	int n3 = n * n;
	return n3;
	}
public int m(int n1, int n2){
	int multiply = n1 * n2;
	return multiply;
	}
public String m(String str){
	System.out.println(str);
	return str;
	}

public int max(int a, int b){
	return a > b ? a : b;
	}

public double max(double a1, double a2){
	return a1 > a2 ? a1 : a2;
	}

public double max(double x, double y, double z){
	double max2 = x > y ? x : y;
	return max2 > z ? max2 : z; 
	}
}
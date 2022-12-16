//使用递归的方式求出斐波那契数1,1,2,3,5,8,13...给一个整数n，求出它的值
public class RecursionEx01{
	public static void main(String[] args){
		CC c = new CC();
		int res = c.fibonacci(7);
		if(res != -1){
			System.out.println("res=" + res);
		}
		
	}
}

class CC{
	public int fibonacci(int n){
		if(n >= 1){
			if(n == 1 || n == 2){
			return 1;
			} else {
			return fibonacci(n - 1) + fibonacci(n - 2);
			}
		} else {
			System.out.println("error, pls input a num more than 1");
			return -1;
		}
		
	}
}
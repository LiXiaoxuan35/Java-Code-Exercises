//编写类AA，有一个方法，判断一个数为奇或偶，返回Boolean
public class MethodEx01{
	public static void main(String[] args){
		AA a = new AA();
		/*if(a.isOdd(1)){
			System.out.println("is odd");
		} else {
			System.out.println("is even");
		}*/
		a.printChar(4, 4, '=');
	}
}
class AA{
	public boolean isOdd(int num){
		if(num % 2 != 0){
			return true;
		} else {
			return false;
		}

		public void printChar(int row, int column, char c){
			for (int i = 0; i < row; i++){
				for(int j = 0; j < column; j++){
					System.out.print(c);
				}
				System.out.println();
			}
		}
	}
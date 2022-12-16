/*猴子吃桃，有一堆桃子，第10天的时候还剩1个，
猴子每天吃总数的一半加一个，求第1天桃子数量
先求第9天的数量，(1+1)*2=4
第8天，(4+1)*2=10
由此可得，第n天数量=(前一天数量+1)*2
*/
public class RecursionEx02{
	public static void main(String[] args){
		PP p1 = new PP();
		int day = 9;
		int peachnum = p1.peach(day);
		if(peachnum != -1){
			System.out.println("when it's day" + day + "\tnum of peach=" + peachnum);
		}
	}
}

class PP{
	public int peach(int day){
		if(day == 10){
			return 1;
		} else if(day >= 1 && day <= 10){
			return (peach(day+1)+1)*2;
		} else {
			System.out.println("input number between 1 and 10");
			return -1;
		}
	}
}
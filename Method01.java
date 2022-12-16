public class Method01{
	public static void main(String[] args){
		//如果不调用方法，是不会输出的
		//先创建对象，然后调用方法
		Person p1 = new Person();
		p1.speak();//调用方法
		p1.cal01();
		p1.cal02(5);//表示n=5时，计算sum
		int returnRes = p1.getsum(10, 20);//把getsum的结果返回给returnRes
	}
}


class Person{
	String name;
	int age;
	public void speak(){
		//1.public表示方法是公开的
		//2.void表示方法没有返回值
		//3.speak()是方法名，()里是形参列表
		//4.{}方法体，可以执行想要的功能
		System.out.println("我是一个好人");
	}
	public void cal01(){
		int sum = 0;
		for(int i = 1; i <= 1000; i++){
			sum += i;
		}
		System.out.println("sum=" + sum);
	}
	public void cal02(int n){
		//int n表示当前有一个形参n, 可以接收用户输入
		for(int i = 1; i <= n; i++){
			sum += i;
		}
		System.out.println("cal02 sum=" + sum);
	}
	public int getsum(int num1, int num2){
		int res = num1 + num2;
		return res;
		/*1.public表示此方法公开
		  2.int表示方法执行后返回一个int值
		  3.getsum是方法名
		  4.(int num1, int num2)有两个形参来接收用户输入
		  5.return res表示把res的值返回，返回给调用它的地方
		*/
	}
}
public class Method01{
	public static void main(String[] args){
		//��������÷������ǲ��������
		//�ȴ�������Ȼ����÷���
		Person p1 = new Person();
		p1.speak();//���÷���
		p1.cal01();
		p1.cal02(5);//��ʾn=5ʱ������sum
		int returnRes = p1.getsum(10, 20);//��getsum�Ľ�����ظ�returnRes
	}
}


class Person{
	String name;
	int age;
	public void speak(){
		//1.public��ʾ�����ǹ�����
		//2.void��ʾ����û�з���ֵ
		//3.speak()�Ƿ�������()�����β��б�
		//4.{}�����壬����ִ����Ҫ�Ĺ���
		System.out.println("����һ������");
	}
	public void cal01(){
		int sum = 0;
		for(int i = 1; i <= 1000; i++){
			sum += i;
		}
		System.out.println("sum=" + sum);
	}
	public void cal02(int n){
		//int n��ʾ��ǰ��һ���β�n, ���Խ����û�����
		for(int i = 1; i <= n; i++){
			sum += i;
		}
		System.out.println("cal02 sum=" + sum);
	}
	public int getsum(int num1, int num2){
		int res = num1 + num2;
		return res;
		/*1.public��ʾ�˷�������
		  2.int��ʾ����ִ�к󷵻�һ��intֵ
		  3.getsum�Ƿ�����
		  4.(int num1, int num2)�������β��������û�����
		  5.return res��ʾ��res��ֵ���أ����ظ��������ĵط�
		*/
	}
}
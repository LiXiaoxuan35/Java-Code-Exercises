public class VarParExer{
	public static void main(String[] args){
		HspMethod hm = new HspMethod();
		System.out.println(hm.showScore("Milan", 90.1, 98.0));
	}
}

class HspMethod{
	public String showScore(String name, double... score){
		double sumScore = 0;
		for(int i = 0; i < score.length; i++){
			sumScore += score[i];
		}
		return name + "的" + score.length + "门成绩为 " + sumScore;
	}

}
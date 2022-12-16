public class Maze{
	public static void main(String[] args){
		/*
		使用二维数组来显示迷宫，int[][] maze = new int[8][7];
		第一行和最后一行有障碍，第一列和最后一列有障碍
		用1表示障碍，0表示通行
		*/
		int[][] maze = new int[8][7];
		for(int i = 0; i < 7; i++){
			maze[0][i] = 1;
			maze[7][i] = 1;
		}

		for(int j = 0; j < 8; j++){
			maze[j][0] = 1;
			maze[j][6] = 1;
		}
		maze[3][1] = 1;
		maze[3][2] = 1;

		for(int i = 0; i < 8; i++){
			for(int j = 0; j < 7; j++){
				System.out.print(maze[i][j]);
			}
		System.out.println("");
		}
		T t1 = new T();
		t1.findWay(maze, 1, 1);

		System.out.println("\n====找路情况====");
		for(int i = 0; i < 8; i++){
			for(int j = 0; j < 7; j++){
				System.out.print(maze[i][j]);
			}
			System.out.println("");
		}
	}
}

class T {
	public boolean findWay(int[][] maze, int i, int j){
	/* 0表示无障碍物，1表示有障碍物，2表示已测试可通行，3表示已测试不可通行
	   findWay是找到出路的方法
	   i和j表示小鼠的横纵坐标，初始坐标为（1，1）
	   在终点，也即出口处时，找路成功，也就是说maze[6][5] = 2时，返回true就可以
	   探测策略，右->下->左->上，有16种，不同策略得出路径不同
	*/
		if(maze[6][5] == 2){
			return true;
		} else {
			if(maze[i][j] == 0){//此处无障碍物，待测试
				//假定maze[i][j] == 2;也就是这条路是通行的
				maze[i][j] = 2;
				//右->下->左->上
				if(findWay(maze, i, j+1)){
					return true;
				} else if(findWay(maze, i+1, j)){
					return true;
				} else if(findWay(maze, i, j-1)){
					return true;
				} else if(findWay(maze, i-1, j)){
					return true;
				} else {
					maze[i][j] = 3;
					return false;
				}
		} else {//要么等于1，要么等于2或3
				return false;
			}
		}
	}
}
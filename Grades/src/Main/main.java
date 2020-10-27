package Main;
//
import java.util.Arrays;

import Main.Average;
import Main.Read;
import Main.Read_Interface;
import Main.Sort;
import Main.Sort_Interface;

public class main {
	static String name = "D:\\test.txt";
	public static void main(String[] args) {
		
		// 读取出成绩文件
				Read_Interface rei = new Read();
				String data[][] = rei.reader(name);
				// 计算平均值与最大值
				Average_Interface wri = new Average();
				String avenum = wri.ave(data);
				System.out.println(avenum);
				Max_Interface res = new Max();
				String maxnum = res.max(data);
				System.out.println(maxnum);

				// 计算总成绩并且按总成绩排序
				Sort_Interface si = new Sort();
				double[] sumGrade = si.getSumGrage(data);
				// for(double i :sumGrade){
				// System.out.println(i);
				// }
				System.out.println();
				String[][] str = si.sort_Sum(sumGrade, data);
				System.out.println("排序后的名单为：");
				prinAttr(str);
		
		
	}
	
	public static void prinAttr(String[][] data) {
		for (int i = 0; i < data.length; i++) {
			System.out.println(Arrays.toString(data[i]));
		}
	}
	
	
}

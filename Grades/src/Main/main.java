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
		
		// ��ȡ���ɼ��ļ�
				Read_Interface rei = new Read();
				String data[][] = rei.reader(name);
				// ����ƽ��ֵ�����ֵ
				Average_Interface wri = new Average();
				String avenum = wri.ave(data);
				System.out.println(avenum);
				Max_Interface res = new Max();
				String maxnum = res.max(data);
				System.out.println(maxnum);

				// �����ܳɼ����Ұ��ܳɼ�����
				Sort_Interface si = new Sort();
				double[] sumGrade = si.getSumGrage(data);
				// for(double i :sumGrade){
				// System.out.println(i);
				// }
				System.out.println();
				String[][] str = si.sort_Sum(sumGrade, data);
				System.out.println("����������Ϊ��");
				prinAttr(str);
		
		
	}
	
	public static void prinAttr(String[][] data) {
		for (int i = 0; i < data.length; i++) {
			System.out.println(Arrays.toString(data[i]));
		}
	}
	
	
}

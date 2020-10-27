package Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Main.Average;
import Main.Average_Interface;
import Main.Max;
import Main.Read;
import Main.Read_Interface;

class test {

	@Test
	void test() {
		String name = "D:\\test.txt";
		Read_Interface rei = new Read();
		String data[][] = rei.reader(name);
		// 计算平均值与最大值
		Average_Interface wri = new Average();
		String avenum = wri.ave(data);
	
		System.out.println(avenum);
		Max max = new Max();
		String maxnum = max.max(data);
		System.out.println(maxnum);
		}

}

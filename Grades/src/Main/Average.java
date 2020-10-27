package Main;

public class Average implements Average_Interface {
	
	Average_Interface ati;
	public void set_Average_Interface(Average_Interface ati) {
		this.ati = ati;
	}
	

		public String ave(String[][] str) {
		String [][]array = str;
		double avedatamath = 0;
		double avedatacha = 0;
		double avedataeng = 0;
		double num;
		//数学
		num = 0;
		for(int i = 0;i<array.length;i++) {
			num = Integer.parseInt(array[i][2]) + num;
			avedatamath = num/array.length;
		}
		//语文
		num = 0;
		for(int i = 0;i<array.length;i++) {
			num = Integer.parseInt(array[i][3]) + num;
			avedatacha = num/array.length;
		}
		//英语
		num = 0;
		for(int i = 0;i<array.length;i++) {
			num = Integer.parseInt(array[i][4]) + num;
			avedataeng = num/array.length;
		}
		return"数学平均分为"+avedatamath+",语文平均分为"+avedatacha+",英语平均分为"+avedataeng;
	}
}

package Main;

public class Max implements Max_Interface {
	
	Max_Interface res;
	public void set_Max_Interface(Max_Interface res) {
		this.res = res;
	}
	
	public String max(String[][] str) {
		String [][]array = str;
		int tempmath = 0;
		int tempcha = 0;
		int tempeng = 0;
		//��ѧ
		for(int i = 0;i<array.length;i++) {
			if(tempmath< Integer.parseInt(array[i][2])) {
				tempmath = Integer.parseInt(array[i][2]);
			}
			
		}
		//����
		for(int i = 0;i<array.length;i++) {
			if(tempcha< Integer.parseInt(array[i][2])) {
				tempcha = Integer.parseInt(array[i][2]);
			}
			
		}
		//Ӣ��
		for(int i = 0;i<array.length;i++) {
			if(tempeng< Integer.parseInt(array[i][2])) {
				tempeng = Integer.parseInt(array[i][2]);
			}
			
		}
		return"��ѧ��߷�Ϊ"+tempmath+",������߷�Ϊ"+tempcha+",Ӣ����߷�Ϊ"+tempeng;
	}
}
//

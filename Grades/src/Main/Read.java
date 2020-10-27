package Main;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

import Main.Read_Interface;

public class Read implements Read_Interface {

	Read_Interface rti;
	public void set_ReadTxt_Interface(Read_Interface rti) {
		this.rti = rti;
	}
	
	public String[][] reader(String name) {
		
		String[][] ss = new String[4][4];//��ά�����ȡ�ɼ�
		try {
			File file = new File(name);
			InputStreamReader input = new InputStreamReader(new FileInputStream(file));
			BufferedReader bf = new BufferedReader(input);
			// ���ж�ȡ�ַ���
			String[] words3 = bf.readLine().split("\\,");
			String[] words4 = bf.readLine().split("\\,");
			String[] words5 = bf.readLine().split("\\,");
			String[] words6 = bf.readLine().split("\\,");
			ss[0] = words3;
			ss[1] = words4;
			ss[2] = words5;
			ss[3] = words6;
			
			bf.close();
			input.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

		return ss;	
	}
}



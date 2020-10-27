package Test;

import org.easymock.EasyMock;
import org.junit.jupiter.api.Test;

import Main.Average;
import Main.Average_Interface;
import Main.Read;


public class testsort {
	
		@Test
		public void testSort() {
			Read rt = new Read();
			String name  = "D:\\test.txt";
			String str[][] = rt.reader(name);
			

			Average_Interface am=EasyMock.createMock(Average_Interface.class);
			Average_Interface am_real=new Average();
			//Max_Interface ri=EasyMock.createMock(Max_Interface.class);
			//Max_Interface ri_real=new Max();
	    	EasyMock.expect(am.ave(str)).andReturn(am_real.ave(str));
	    	EasyMock.replay(am);
	}
}

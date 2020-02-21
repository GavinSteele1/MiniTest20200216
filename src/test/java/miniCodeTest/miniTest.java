package miniCodeTest;


import org.junit.jupiter.api.Test;
/**
 * 
 * @author wangxiaomin
 * @date 2020Äê2ÔÂ17ÈÕ
 * 
 * 
 * 
 */
class miniTest {

	@Test
	void test() {
		int arr[] = {2,3};
		char[] cs0 = getChars(arr[0]);
		char[] cs1 = getChars(arr[1]);
		for(int i = 0;i<cs0.length;i++) {
			char c1= cs0[i];
			for(int j = 0;j<cs1.length;j++) {
				char c2= cs1[j];
				System.out.print(c1+""+c2+" ");
			}
		}
	}
	
	public char[] getChars(int num) {
		if(num<2||num>9) {
			return null;
		}
		switch(num) {
			case 2:return new char[] {'a','b','c'};
			case 3:return new char[] {'d','e','f'};
			case 4:return new char[] {'g','h','i'};
			case 5:return new char[] {'j','k','l'};
			case 6:return new char[] {'m','n','o'};
			case 7:return new char[] {'p','q','r','s'};
			case 8:return new char[] {'t','u','v'};
			case 9:return new char[] {'w','x','y','z'};
		}
		return null;
	}

}

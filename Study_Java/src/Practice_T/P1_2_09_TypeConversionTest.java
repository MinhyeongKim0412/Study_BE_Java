//Example 1-2, 09: 형변환(묵시적, 명시적)의 예시입니다.
package Practice_T;

public class P1_2_09_TypeConversionTest {
	
	byte bNum1 =10;
	int iNum1 = bNum1;
	
	int iNum2 = 20;
	float fNum = iNum2;
	
	int iNum3 = 40;
	byte bNum2 = (byte)iNum2;
	
	double dNum = 3.14;
	int iNum4 = (int)dNum;
	

	public static void main(String[] args) {
		
		double dNum = 1.2;
		float fNum = 0.9F;
	  //float fNum = 0.9 -> This is the wrong way.\
		
		int iNum1 = (int)dNum + (int)fNum;
		int iNum2 = (int)(dNum + fNum);
		
		System.out.println(iNum1);
		System.out.println(iNum2);
	
	
	}

}

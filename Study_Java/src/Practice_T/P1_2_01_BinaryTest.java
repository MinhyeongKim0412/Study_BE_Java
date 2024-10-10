//Example 1-2, 01: This is an output for expressing various integers according to the decimal number method. 

package Practice_T;

public class P1_2_01_BinaryTest {

	public static void main(String[] args)
	{
		int num = 10;      //10진수(decimal number)
		int bNum = 0B1010; //2진수(binary number)
		int oNum = 012;    //8진수(octal number)
		int xNum = 0XA;    //16진수(hexadecimal)
		
		System.out.println(num);
		System.out.println(bNum);
		System.out.println(oNum);
		System.out.println(xNum);
		//All result values ​​are output as "10".
	}

}

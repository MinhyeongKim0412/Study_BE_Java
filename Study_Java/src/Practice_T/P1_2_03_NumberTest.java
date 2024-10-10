//Example 1-2, 03: This is an error to watch out for when specifying the variable type of integer data. (int, long)

package Practice_T;

public class P1_2_03_NumberTest {

	public static void main(String[] args) {
		
		//int iValue = 12345678900; -> This is the wrong way. (Int is a 32-bit integer, so the range of positive numbers that can be expressed is smaller than the assignment value, so an error occurs.)
		//long iValue2 = 12345678900; -> This is the wrong way. (The part about registering it as a long type is correct, but the data type of the substitution value must be specified by adding 'L' at the end of the number.)
		long iValue3 = 12345678900L;
		
		//System.out.println(iValue);
		//System.out.println(iValue2);
		System.out.println(iValue3);
	}

}

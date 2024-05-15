//Example 1-2, 08: This is how to declare constants. (Please refer to the concept section for examples of situations where constants are used, efficient advantages of using them, etc.)

package Practice_T;

public class P1_2_08_ConstantTest {

	public static void main(String[] args) {
		
		//(1) Declare a constant.
		final int Num_MIN;
		
		//(*Cannot be used without initializing the value.)
		// System.out.println(Num_MIN); -> This is the wrong way.
		
		//(2) Declaration, initialization, and call of the MIN constant.
		Num_MIN = 0;
		System.out.println(Num_MIN);
		
		//(3) Declaration and initialization of the MAX constant.
		final int Num_MAX = 100;
		System.out.println(Num_MAX);
		
		//(*A new value cannot be assigned after initialization.)
		//Num_MAX = 10000; -> This is the wrong way.
	}

}

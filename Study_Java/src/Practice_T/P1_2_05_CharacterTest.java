//Example 1-2, 05: Declaration and use of character variables. (char, String)

package Practice_T;

public class P1_2_05_CharacterTest {

	public static void main(String[] args) {
		
		char ch1 = 'A';
		System.out.println(ch1);        //char -> char (English)//A
		System.out.println((int)ch1);   //char -> int (ASCII Table)//65
		
	    char ch2 = 66;
		System.out.println(ch2);        //When numbers are entered, they are recognized as (ASCII Table) and characters are output.
		int ch3 = 67;
		System.out.println(ch3);        //int -> int //67
		System.out.println((char)ch3); //int -> char (ASCII Table)//C
		
		char ch4 = '한';
		char ch5 = '\uD55C';
		System.out.println(ch4);       //char -> char (Korean)//한
		System.out.println(ch5);       //(unicode) -> char
		
		String sMessage = "Hello!";
		System.out.println(sMessage);
	}

}

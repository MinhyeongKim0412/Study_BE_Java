package Practice_T;

public class P1_2_10_TypeConversionTest_String {

	public static void main(String[] args)
	
	{
	String str = "123";
	    
	    byte bValue = Byte.parseByte(str);
	    System.out.println("[Byte로 형변환된 문자열입니다: " + bValue + "]");
	    
	    int iValue = Integer.parseInt(str);
	    System.out.println("[Int로 형변환된 문자열입니다: " + iValue + "]");
	    
	String str2 = "3.14";
	
	    double dValue2 = Double.parseDouble(str2);
	    System.out.println("[Double로 형변환된 문자열입니다: " + dValue2 + "]");
	    
    String strBool = "true";
    
	    boolean boValue = Boolean.parseBoolean(strBool);
	    System.out.println("[Bool으로 형변환된 문자열입니다: " + boValue + "]");
		}
}

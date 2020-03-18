package TDD;

public class RemoveCharacterInString {

	public String removeString(String str)
	{
	String str1="";
	if(str.charAt(0)=='A' && str.charAt(1)=='A')
	{
	str1=charRemoveAt(str,0);
	str1=charRemoveAt(str1,0);
	}
	else if(str.charAt(0)=='A')
	{
	str1=charRemoveAt(str,0);
	}
	else if(str.charAt(1)=='A')
	{
	str1=charRemoveAt(str,1);
	}
	else
	{
	str1=str;
	}
	return str1;
	}
	 public static String charRemoveAt(String str, int p) {  
	              return str.substring(0, p) + str.substring(p + 1);  
	           } 
}

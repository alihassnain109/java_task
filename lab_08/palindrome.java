public  class palindrome{
	public static boolean isPalindrome(String str){
	  str = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
int start =0, end=str.length()-1;
while(start<end){
	if (str.charAt(start++) != str.charAt(end--)) return false;

	}
	return true;
}
public static void main (String[]args){
	String input="A Man ,A plan ,A canal :panama";
	System.out.println("Is palindrome "+isPalindrome(input));
}
}
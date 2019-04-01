/**
 * Given two numbers as strings.
 *  The numbers may be very large (may not fit in long long int), the task is to find sum of these two numbers.

Examples:

Input  : str1 = "3333311111111111", 
         str2 =   "44422222221111"
Output : 3377733333332222

Input  : str1 = "7777555511111111", 
         str2 =    "3332222221111"
Output : 7780887733332222

 * @author vivedula
 *
 */
class SumLargeNumbers 
	{ 
	// Function for finding sum of larger numbers  
	static String findSum(String str1, String str2)  
	{  
	    // Before proceeding further, make sure length  
	    // of str2 is larger.  
	    if (str1.length() > str2.length()){  
	        String t = str1; 
	        str1 = str2; 
	        str2 = t; 
	    } 
	  
	    // Take an empty String for storing result  
	    String str = "";  
	  
	    // Calculate lenght of both String  
	    int n1 = str1.length(), n2 = str2.length();  
	  
	    // Reverse both of Strings 
	    str1=new StringBuilder(str1).reverse().toString(); 
	    str2=new StringBuilder(str2).reverse().toString(); 
	  
	    int carry = 0;  
	    for (int i = 0; i < n1; i++)  
	    {  
	        // Do school mathematics, compute sum of  
	        // current digits and carry  
	        int sum = ((int)(str1.charAt(i) - '0') +  
	                    (int)(str2.charAt(i) - '0') + carry);  
	        str += (char)(sum % 10 + '0');  
	  
	        // Calculate carry for next step  
	        carry = sum / 10;  
	    }  
	  
	    // Add remaining digits of larger number  
	    for (int i = n1; i < n2; i++)  
	    {  
	        int sum = ((int)(str2.charAt(i) - '0') + carry);  
	        str += (char)(sum % 10 + '0');  
	        carry = sum / 10;  
	    }  
	  
	    // Add remaining carry  
	    if (carry > 0)  
	        str += (char)(carry + '0');  
	  
	    // reverse resultant String 
	    str = new StringBuilder(str).reverse().toString(); 
	  
	    return str;  
	}  
	  
	// Driver code  
	public static void main(String[] args)  
	{  
	    String str1 = "12";  
	    String str2 = "198111";  
	    System.out.println(findSum(str1, str2));  
	}  
	} 

import java.util.*;
import java.lang.*;

public class FacebookDecoder
{  
    /*Find number of ways given data can be decoded
    * where a=1, b=2,...z=26.
      if data = "123" answer = 3 ("abc","lc","aw")
    */
    public static int numWays(String data){
        int[] memo = new int[data.length()+1];
        for(int i=0;i<memo.length;i++){
            memo[i] = -1;
        }
        return helper(data,data.length(),memo);    
    }
    public static int helper(String data, int k, int[] memo){
        int result;
        
       //System.out.println("calling k="+k+" data="+data);
        if(k==0)
            return 1;
        
       //System.out.println("data.charAt(data.length()-k)="+data.charAt(data.length()-k));   
        if(data.charAt(data.length()-k)=='0')
            return 0;
        
       //System.out.println("memo[k]="+memo[k]);
        if(memo[k]!=-1)
            return memo[k];
        
        result = helper(data,k-1,memo);
       
       //check additional conditions
        if( k>=2 && (Integer.parseInt(data.substring(data.length()-k,data.length()-k+2))<27)){
            result += helper(data,k-2,memo);
        }
        memo[k] = result;
        return result;
         
    }
    public static void main(String args[])
    {
        System.out.println("Hello, World!");
        System.out.println(numWays("1234"));
        
    }
}



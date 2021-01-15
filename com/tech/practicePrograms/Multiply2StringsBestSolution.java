/*
Facebook interview question of multiplying 2 strings

Best solution --> to mulitply the way we do mathematically

  24 
 x 2
 ----
  048 --> [0,4,8] , return 48 by appending non-Zeros to StringBuilder
  
  here logic is to have array of size (n1.length + n2.length)
  
  then store 8 at the last index, and move from right to left
  and persist the data.
  
  Exactly the way we do with actual Maths
  
  No reverse logic needed
 
*/
public class Multiply2StringsBestSolution {
   
   public static void main(String args[]){
      
     System.out.println(multiply("2","2"));
      
   }
    public static String multiply(String num1, String num2) {
        if (num1.equals("0") || num2.equals("0")) {
            return "0";
        }
        int m = num1.length();
        int n = num2.length();
        int[] pos = new int[m + n];
        for (int i = m - 1; i >= 0; i--) { // Go from right to left
            for (int j = n - 1; j >= 0; j--) { // Go from righ to left
                int mul = (num1.charAt(i) - '0') * (num2.charAt(j) -'0');
                int p1 = i + j;
                int p2 = i + j + 1;
                int sum = mul + pos[p2];
                pos[p1] += sum / 10;
                pos[p2] = sum % 10;
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int p : pos) {
            if (!(sb.length() == 0 && p ==0)) {
                sb.append(p);
            }
        }
        return sb.toString();
    }
}

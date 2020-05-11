/** 
Represent given time in words
Sample Input 0

5
47

Sample Output 0

thirteen minutes to six

Sample Input 1

3
00

Sample Output 1

three o' clock

Sample Input 2

7
15

Sample Output 2

quarter past seven



**/


import java.util.*;
class TimeinWords {
    public static void main(String args[]) {
        int h = 5;
        int m = 47;
        findTimeInWords(h, m);
    }

    static String findTimeInWords(int h, int m) {
        String result = "";
        Map<Integer, String> map = new HashMap<Integer,String>();
        map.put(00, "o' clock");
        map.put(01, "one minute");
        map.put(02, "two minutes");
        map.put(03, "three minutes");
        map.put(04, "four minutes");
        map.put(05, "five minutes");
        map.put(06, "six minutes");
        map.put(07, "seven minutes");
        map.put(8, "eight minutes");
        map.put(9, "nine minutes");
        map.put(10, "ten minutes");
        map.put(11, "eleven minute");
        map.put(12, "twelve minute");
        map.put(13, "thriteen minute");
        map.put(14, "fourteen minute");
        map.put(15, "quarter past");
        map.put(16, "sixteen minute");
        map.put(17, "seventeen minutes");
        map.put(18, "eighteen minutes");
        map.put(19, "nineteen minutes");
        map.put(20, "twenty minutes");
        map.put(21, "twenty one minutes");
        map.put(22, "twenty two minutes");
        map.put(23, "twenty three minutes");
        map.put(24, "twenty four minutes");
        map.put(25, "twenty five minutes");
        map.put(26, "twenty six minutes");
        map.put(27, "twenty seven minutes");
        map.put(28, "twenty eight minutes");
        map.put(29, "twenty nine minutes");
        map.put(30, "half past");
        map.put(31, "twenty nine minutes to"); map.put(32, "twenty eight minutes to"); map.put(33, "twenty seven minutes to"); 
        map.put(34, "twenty six minutes to"); map.put(35, "twenty five minutes to");
        map.put(36, "twenty four minutes to"); map.put(37, "twenty three minutes to"); map.put(38, "twenty two minutes to"); 
        map.put(39, "twenty one minutes to"); map.put(40, "twenty minutes to"); 
        map.put(41, "nineteen minutes to"); map.put(42, "eighteen minutes to"); map.put(43, "seventeen minutes to"); 
        map.put(44, "sixteen minutes to"); map.put(45, "quarter to");
        map.put(46, "fourteen minutes to"); map.put(47, "thirteen minutes to"); map.put(48, "twelve minutes to"); 
        map.put(49, "eleven minutes to"); map.put(50, "ten minutes to");
        map.put(51, "nine minutes to"); map.put(52, "eight minutes to"); map.put(53, "seven minutes to"); 
        map.put(54, "six minutes to"); map.put(55, "five minutes to");
        map.put(56, "four minutes to"); map.put(57, "three minutes to"); 
        map.put(58, "two minutes to"); map.put(59, "one minute to"); //map.put(30, "half past");
        int hour = 0;
        for(int i=0;i<12;i++){
            if(h==i){
                 hour = i;
                 break;
            }
        }
        Map<Integer,String> map2 = new HashMap<Integer, String>();
        map2.put(1,"one");
        map2.put(2,"two");
        map2.put(3,"three");
        map2.put(4,"four");
        map2.put(5,"five");
        map2.put(6,"six");
        map2.put(7,"seven");
        map2.put(8,"eight");
        map2.put(9,"nine");
        map2.put(10,"ten");
        map2.put(11,"eleven");
        map2.put(12,"twelve");
        // 5:15 --> quarter past five

        

        if(m>30){
            hour++;
        }

        String hours = map2.get(hour);
        String minutes = map.get(m);
        


        if(minutes.equals(map.get(0)) ){
            result+=hours+ " "+ minutes;
            return result;
        }
        
        result+=minutes+" "+hours;
        
        System.out.print(result);

        return result;
    }
}

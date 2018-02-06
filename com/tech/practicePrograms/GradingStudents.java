/**
 * At HackerLand University, a passing grade is any grade 40 points or higher on a 100 point scale. 
 * Sam is a professor at the university and likes to round each student’s grade according to the following rules:

    If the difference between the grade and the next higher multiple of 5 is less than 3, round to the next higher multiple of 5
    If the grade is less than 38, don’t bother as it’s still a failing grade

Automate the rounding process then round a list of grades and print the results.

Input Format

First Line

    integer
        : number of students

Next lines

    integer
        : individual grades

Output Format

Print lines, each with the rounded value of a student’s grade in input order.

Sample Input 0

4
73
67
38
33

Sample Output 0

75
67
40
33
 */
import java.util.Scanner;
	public class GradingStudents {

	    static int[] solve(int[] grades){
	        int diff = 0;
	        for(int i=0; i < grades.length; i++){ 
	        	int iteration = 0;
			if(grades[i] < 38) {
				grades[i] = grades[i];
			} else{
				while(grades[i]%5 !=0 && iteration <=3){
					++grades[i];
					++iteration;
				}
				
				if(iteration >= 3){
					grades[i] = grades[i]-iteration;
				} else{
					grades[i] = grades[i];
				}
			}
	      }
			return grades;
	    }

	    public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        int n = in.nextInt();
	        int[] grades = new int[n];
	        for(int grades_i=0; grades_i < n; grades_i++){
	            grades[grades_i] = in.nextInt();
	        }
	        int[] result = solve(grades);
	        for (int i = 0; i < result.length; i++) {
	            System.out.print(result[i] + (i != result.length - 1 ? "\n" : ""));
	        }
	        System.out.println("");
	        

	    }
	}
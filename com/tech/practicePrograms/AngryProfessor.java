import java.util.Scanner;
public class AngryProfessor {
	private static Scanner scan = new Scanner(System.in);
	public static void main(String args[]){
		
		
		//System.out.println("Enter the number of students and the cancellation threshold");
		int noOfTestcases = scan.nextInt();
		for(int i=0;i<noOfTestcases; i++){
		int noOfStudents = scan.nextInt();
		int cancellationThreshold = scan.nextInt();
		printCancellationStatus(noOfStudents, cancellationThreshold);
		}
	}

	private static boolean printCancellationStatus(int noOfStudents,
			int cancellationThreshold) {
		int counter =0;
		int[] array = new int[noOfStudents];
		for(int i=0;i<noOfStudents; i++){
			array[i] = scan.nextInt();
		}
	
		for(int j=0;j<array.length;j++){
			if(array[j] <=0){
				counter++;
			}
		}
		if(counter >= cancellationThreshold){
			System.out.println("Class cancelled: NO");
			return true;
			
		}
		System.out.println("Class cancelled: YES");
		return false;
		
	}

}

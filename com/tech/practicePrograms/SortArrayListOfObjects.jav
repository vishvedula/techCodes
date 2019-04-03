import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class SortArrayListOfObjects {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Employee emp1 = new Employee(14);
		Employee emp2 = new Employee(15);
		Employee emp3 = new Employee(16);
		Employee emp4 = new Employee(02);
		Employee emp5 = new Employee(20);
		Employee emp6 = new Employee(18);
		Employee emp7 = new Employee(13);
		Employee emp8 = new Employee(12);
		List<Employee> list = new ArrayList<Employee>();
		list.add(emp1);
		list.add(emp2);
		list.add(emp3);
		list.add(emp4);
		list.add(emp5);
		list.add(emp6);
		list.add(emp7);
		list.add(emp8);
		Collections.sort(list);
		for(Employee id: list){
			System.out.println(id);
	   }
	}

}

class Employee implements Comparable<Employee>{
	private int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	Employee(int id){
		this.id = id;
	}


	@Override
	public int compareTo(Employee o1) {
		int compareId=((Employee)o1).getId();
        /* For Ascending order*/
        return this.id-compareId;
        
        /* For Descending order do like this */
       // return compareId-this.id;
		
	}
	
	 @Override
	    public String toString() {
	        return "[ id=" + id + " ]";
	    }
	
}

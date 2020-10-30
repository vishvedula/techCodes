import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
 * UseCase : I would have 2 list's with Emp objects
 * Emp would have Empid and EmpImpact references
 * I have to return boolean based on the comparison done on the EmpImpact values, where the Empid's are same and not in same 
 * order for the lists.
 */
public class ListComparison {

	@SuppressWarnings("unused")
	public static void main(String args[]) {
		List<Emp> list1 = new ArrayList<Emp>();
		list1.add(new Emp(1, 0));
		list1.add(new Emp(2,4));
		list1.add(new Emp(3,-1));
		list1.add(new Emp(4,4));
		list1.add(new Emp(5,8));
		
		
		List<Emp> list2 = new ArrayList<Emp>();
		list2.add(new Emp(5,8));
		list2.add(new Emp(2,4));
		list2.add(new Emp(3,1));
		list2.add(new Emp(1, 0));
		list2.add(new Emp(4,4));
		
		boolean b = isEqual(list1, list2);

	}
	
	private static boolean isEqual(List<Emp> emp1, List<Emp> emp2){
		boolean result = false;
		if(emp1.size() == emp2.size()){
			
			
			// logic for  checking if the 2 lists are identical based on the values
			// Get values from Map values.
			for (int i = 0; i < emp1.size(); i++) {
				for (Emp e : emp1) {
					for(Emp e1: emp2){
						if(e.getEmpid() == e1.getEmpid()){
							 result = (e.getEmpImpact()==e1.getEmpImpact()?true:false);
							 if(result){
								 continue;
							 }else{
								 System.out.println("false, the 2 lists are NOT identical wrt EmpImpacts for the common EmpId's");
								 return false;
							 }
						}
					}
					
				}
			}
			
		}
		if(result){
			System.out.println("true,  the 2 lists are identical wrt EmpImpacts for the common EmpId's");
			return true;
		} else{
			return false;
		}
		
	}

}
	

	class Emp {
		private int Empid;
		private int EmpImpact;
		
		public Emp(int Empid, int EmpImpact) {
			this.Empid = Empid;
			this.EmpImpact = EmpImpact;
		}
		
		
		public int getEmpid() {
			return Empid;
		}

		public void setEmpid(int empid) {
			Empid = empid;
		}

		public int getEmpImpact() {
			return EmpImpact;
		}

		public void setEmpImpact(int empImpact) {
			EmpImpact = empImpact;
		}
		
		public String toString(){
	        return "EmpId: "+this.Empid+"-- EmpImpact: "+this.EmpImpact;
	    }
	}


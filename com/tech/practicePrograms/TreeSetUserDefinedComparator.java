package com.tech.practicePrograms;
import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;


public class TreeSetUserDefinedComparator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Set<Emp> aSet = new TreeSet<Emp>(new EmpComparatorName());
		aSet.add(new Emp("a",1));
		aSet.add(new Emp("b",8));
		aSet.add(new Emp("c",5));
		aSet.add(new Emp("d",4));
		aSet.add(new Emp("e",3));
		aSet.add(new Emp("f",2));
		aSet.add(new Emp("f",2));
		System.out.println("Comparing based on Name");
		for(Emp e: aSet){
			System.out.println(e);
		}
		System.out.println("===========================");
		Set<Emp> aSet1 = new TreeSet<Emp>(new EmpComparatorNum());
		aSet1.add(new Emp("a",1));
		aSet1.add(new Emp("b",8));
		aSet1.add(new Emp("c",5));
		aSet1.add(new Emp("d",4));
		aSet1.add(new Emp("e",3));
		aSet1.add(new Emp("f",2));
		aSet1.add(new Emp("f",2));
		System.out.println("Comparing based on Number");
		for(Emp e: aSet1) {
			System.out.println(e);
		}
	}
}
	class Emp{
		private String name;
		private int num;
		
		Emp(String name, int num) {
			this.name = name;
			this.num = num;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getNum() {
			return num;
		}
		public void setNum(int num) {
			this.num = num;
		}
		public String toString(){
	        return "Name: "+this.name+"-- Salary: "+this.num;
	    }
		
	}
	
	class EmpComparatorName implements Comparator<Emp>{
		@Override
		public int compare(Emp e1, Emp e2){
			return e1.getName().compareTo(e2.getName());
		}
	}

	class EmpComparatorNum implements Comparator<Emp>{
		@Override
		public int compare(Emp e1, Emp e2){
			if(e1.getNum() > e2.getNum())
				return 1;
			else
				return -1;
		}
	}

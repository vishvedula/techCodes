package com.tech.practicePrograms;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class ArrayListComparator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List<Emp> aList = new ArrayList<Emp>();
		aList.add(new Emp("a", 1000));
		aList.add(new Emp("b", 2000));
		aList.add(new Emp("c", 3000));
		aList.add(new Emp("d", 4000));
		aList.add(new Emp("e", 5000));
		aList.add(new Emp("e", 7000));
		aList.add(new Emp("f", 8000));
		
		Collections.sort(aList, new EmpComparator());
		for(Emp e: aList){
            System.out.println(e);
        }
	}
}

class EmpComparator implements Comparator<Emp> {
	@Override
	public int compare(Emp e1, Emp e2) {
		if (e1.getSalary() > e2.getSalary()) {
			return 1;
		} else
			return -1;
	}
}

 class Emp {
	private String name;
	private int salary;

	public Emp(String name, int salary) {
		this.name = name;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String toString(){
        return "Name: "+this.name+"-- Salary: "+this.salary;
    }

}

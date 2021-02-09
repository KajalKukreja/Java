/*
Problem Statement -
https://www.hackerrank.com/challenges/java-sort/problem
*/

package hackerrank;

import java.util.*;

//Renaming Student class to Student1 since I already have same class in my package
//Change it to Student for solving hackerrank question
class Student1 {
	private int id;
	private String fname;
	private double cgpa;
	
	public Student1(int id, String fname, double cgpa) {
		super();
		this.id = id;
		this.fname = fname;
		this.cgpa = cgpa;
	}
	
	public int getId() {
		return id;
	}
	
	public String getFname() {
		return fname;
	}
	
	public double getCgpa() {
		return cgpa;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student1 other = (Student1) obj;
		if (Double.doubleToLongBits(cgpa) != Double.doubleToLongBits(other.cgpa))
			return false;
		if (id != other.id)
			return false;
		if (fname == null) {
			if (other.fname != null)
				return false;
		} else if (!fname.equals(other.fname))
			return false;
		return true;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(cgpa);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + id;
		result = prime * result + ((fname == null) ? 0 : fname.hashCode());
		return result;
	}
}


class StudentDataComparator implements Comparator<Student1> {

	@Override
	public int compare(Student1 o1, Student1 o2) {
		if (o1.equals(o2)) {
			return 0;
		}
		if (o1.getCgpa() == o2.getCgpa()) {
			if (o1.getFname().equals(o2.getFname())) {
				return o1.getId() > o2.getId() ? 1 : -1;
			}
			return o1.getFname().compareTo(o2.getFname());
		}
		return o1.getCgpa() > o2.getCgpa() ? -1 : 1;
	}
}

public class JavaSort {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int testCases = Integer.parseInt(in.nextLine());

		List<Student1> studentList = new ArrayList<Student1>();
		while (testCases > 0) {
			int id = in.nextInt();
			String fname = in.next();
			double cgpa = in.nextDouble();

			Student1 st = new Student1(id, fname, cgpa);
			studentList.add(st);

			testCases--;
		}
		Collections.sort(studentList, new StudentDataComparator());
		for (Student1 st : studentList) {
			System.out.println(st.getFname());
		}
		
		in.close();
	}
}

/*
Problem Statement -
https://www.hackerrank.com/challenges/java-priority-queue/problem
*/

package hackerrank;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;

//Renaming Student class to Student3 since I already have same class in my package
//Change it to Student for solving hackerrank question
class Student3 {
	int id;
	String name;
	double cgpa;
	
	public Student3() {}
	
	public Student3(int id, String name, double cgpa) {
		super();
		this.id = id;
		this.name = name;
		this.cgpa = cgpa;
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public double getCgpa() {
		return cgpa;
	}
	
	public void setCgpa(double cgpa) {
		this.cgpa = cgpa;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student3 other = (Student3) obj;
		if (Double.doubleToLongBits(cgpa) != Double.doubleToLongBits(other.cgpa))
			return false;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
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
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
}

class StudentComparator implements Comparator<Student3> {

	@Override
	public int compare(Student3 o1, Student3 o2) {
		if (o1.equals(o2)) {
			return 0;
		}
		if (o1.getCgpa() == o2.getCgpa()) {
			if (o1.getName().equals(o2.getName())) {
				return o1.getId() > o2.getId() ? 1 : -1;
			}
			return o1.getName().compareTo(o2.getName());
		}
		return o1.getCgpa() > o2.getCgpa() ? -1 : 1;
	}
}

class Priorities {
	
	public List<Student3> getStudents(List<String> events) {
		List<Student3> studentList = new ArrayList<>();
		PriorityQueue<Student3> priorityQueue = new PriorityQueue<>(new StudentComparator());
		
		for (String event : events) {
			String[] query = event.split(" ");
			if (query[0].equals("ENTER")) {
				Student3 student = new Student3(Integer.parseInt(query[3]), query[1], Double.parseDouble(query[2]));
				priorityQueue.add(student);
			}
			else if (query[0].equals("SERVED")) {
				priorityQueue.poll();
			}
		}
		while (!priorityQueue.isEmpty()) {
			studentList.add(priorityQueue.poll());
		}
		return studentList;
	}
}

public class JavaPriorityQueue {

	private final static Scanner scan = new Scanner(System.in);
	private final static Priorities priorities = new Priorities();

	public static void main(String[] args) {
		int totalEvents = Integer.parseInt(scan.nextLine());
		List<String> events = new ArrayList<>();

		while (totalEvents-- != 0) {
			String event = scan.nextLine();
			events.add(event);
		}

		List<Student3> students = priorities.getStudents(events);

		if (students.isEmpty()) {
			System.out.println("EMPTY");
		} else {
			for (Student3 st : students) {
				System.out.println(st.getName());
			}
		}
	}
}

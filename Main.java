//code written by Sagar Vadalia

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// write your code here
        StudentGrades grades = new StudentGrades(4);
        System.out.println(grades.toString());
        grades.ascendingSort();
        System.out.println(grades.toString());
        System.out.println(grades.highestGrade());
        System.out.println(grades.lowestGrade());
        System.out.println(grades.medianGrade());
        System.out.println(grades.mode());
        // System.out.println(grades.getGrades());
		int [] studentGrades = grades.getGrades();
		System.out.print('[');
		for (int i = 0 ; i < studentGrades.length; i ++){
			System.out.print(studentGrades[i]);
			System.out.print(", ");
		}
		System.out.println(']');

    }
}

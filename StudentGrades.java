//code written by Sagar Vadalia
import java.util.Random;
public class StudentGrades {
    //instance variables
    private int grades[];
    private Random rand;
    //default constructor
    public StudentGrades(){
        grades = new int[0];
    }
    //overloaded constructor
    public StudentGrades(int studentNum){
        //grabs a random int between 0 and a 100
        rand = new Random();
        grades = new int[studentNum];
        for(int i = 0; i < studentNum; i++){

           int x = (rand.nextInt(100) + 1);
           this.grades[i] = x;
       }
    }
    //accessor
    public int [] getGrades(){
        int [] temp = new int[grades.length];
        for (int i = 0; i < grades.length; i++){
			temp[i] = grades[i];
		}
		return temp;
    }
    //mutator
    public void setGrades(int[] grades){
        this.grades = grades;
    }
    //toString
    public String toString(){
        String returnStr =  "the student grades are: ";
        for(int i = 0; i < this.grades.length; i++){
            returnStr += this.grades[i];
            returnStr += ",";
        }
        //removes last character of a string
        return returnStr.substring(0, returnStr.length() - 1);
    }
    //equals
    public boolean equals(StudentGrades obj) {
        return this.getGrades().equals(obj.getGrades());
    }
    //sorts the array in ascending order
    public int[]  ascendingSort(){
        int[] arr = this.grades;
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr.length -1 - i; j++){
                if(arr[j] > arr[j+1]){
                    swap(j, j+1, arr);
                }
            }
        }
        return arr;
    }
    //swaps two elements in an array
    public void swap(int idx1, int idx2, int[] arr){
        int temp = arr[idx1];
        arr[idx1] = arr[idx2];
        arr[idx2] = temp;
    }
    //find the largest number in the array
    public int highestGrade(){
        int[] arr = this.ascendingSort();
        return arr[arr.length -1];
    }
    //find the lowest number in the array
    public int lowestGrade(){
        int[] arr = this.ascendingSort();
        return arr[0];
    }
    //finds the middle value of the array
    public int medianGrade(){
        int[] arr = this.ascendingSort();
        int medianIdx = arr.length / 2;
        return arr[medianIdx];
    }
    //finds the value that repeats the most. If tie returns the first element that tied
    public int mode(){
        int[] arr = this.ascendingSort();
        int[] counter = new int[arr.length];
        counter[0] = 1;
        int currentVal = arr[0];
        for(int i = 1; i <arr.length; i++){
            if(arr[i] == currentVal){
                counter[i] = counter[i-1]++;
            }
            else {
                counter[i] = 1;
                currentVal = arr[i];
            }
        }
        int modeIdx = 0;
        int modeVal = 0;
        for(int i =0; i < counter.length; i++){
            if(counter[i] > modeVal){
                modeIdx = i;
                modeVal = counter[i];
            }
        }
        return arr[modeIdx];
    }

}

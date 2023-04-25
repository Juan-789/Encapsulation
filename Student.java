// Create a Student class with private instance variables for the student's name, ID number, and averageMark.
// The class should include public getter and setter methods for each variable.

// Next, create a main method that prompts the user to enter information for three different students,
// and then displays the information for each student.

// The main method should create three Student objects and use the setter methods to set the name, ID number, and averageMark for each student.
//Then, it should use the getter methods to display the information for each student.
import java.util.*;
public class Student {
    private String name;
    private int idNum;
    private double averageMark;
    public static void main(String[] args) {
        Scanner inputObj = new Scanner(System.in);
        System.out.println("Enter name of the first student ");     //get the first name
        String name1 = inputObj.nextLine();
        System.out.println("Enter id num of the first student ");     // get the first id
        String id1 = inputObj.nextInt();
        System.out.println("Enter average mark of the first student ");     //get the first avgMark
        String avg1 = inputObj.nextDouble();
        Student student1 = new Student(name1, id1, avg1);       //first student object

        System.out.println("Enter name of the second student ");     //get the second name
        String name2 = inputObj.nextLine();
        System.out.println("Enter id num of the second student ");     // get the second id
        String id2 = inputObj.nextInt();
        System.out.println("Enter average mark of the second student ");     
        String avg2 = inputObj.nextDouble();             //get the second avg
        Student student2 = new Student(name2, id2, avg2);       //second student object

        System.out.println("Enter name of the third student ");     //get the third name
        String name3 = inputObj.nextLine(); 
        System.out.println("Enter id num of the third student ");     // get the third id
        String id3 = inputObj.nextInt();
        System.out.println("Enter average mark of the third student ");     //get the third avgMark
        String avg3 = inputObj.nextDouble();
        Student student3 = new Student(name3, id3, avg3);       //third student object




        // for (i=1;i>3;i++) {
        //     Dictionary<Integer, String> dict= new Hashtable<>();
        //     dict.put(1,"first");
        //     dict.put(2, "second");
        //     dict.put(3, "third");
    
            // Student studObj = new Student();
        }
    
    Student(String nameA, int idNumA, double averageMarkA) {
        this.nameA = name;
        this.idNumA = idNum;
        this.averageMarkA = averageMark;
    }
    public double getAverageMark() {
        return averageMark;
    }
    public int getIdNum() {
        return idNum;
    }
    public String getName() {
        return name;
    }
    public void setAverageMark(double averageMark) {
        this.averageMark = averageMark;
    }
    public void setIdNum(int idNum) {
        this.idNum = idNum;
    }
    public void setName(String name) {
        this.name = name;
    }

}

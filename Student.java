import java.util.*;
// Create a Student class with private instance variables for the student's name, ID number, and averageMark.
// The class should include public getter and setter methods for each variable.

// Next, create a main method that prompts the user to enter information for three different students,
// and then displays the information for each student.

// The main method should create three Student objects and use the setter methods to set the name, ID number, and averageMark for each student.
//Then, it should use the getter methods to display the information for each student.

public class Main {
    //private instances created
    private String name;
    private int idNum;
    private double averageMark;
    public static void main(String[] args) {
        String[] students = {};  //Create array

        for (int i=0;i<3;i++) {
            Scanner inputObj = new Scanner(System.in);
            System.out.println("Enter name of the student ");     //get the first name
            String name1 = inputObj.nextLine();
            System.out.println("Enter id num of the student ");     // get the first id
            int id1 = inputObj.nextInt();
            System.out.println("Enter average mark of the student ");     //get the first avgMark
            double avg1 = inputObj.nextDouble();
            Main student = new Main(name1,id1,avg1);        //create object
            String student1 = (student.getName()+"(ID #"+ student.getIdNum()+"): "+ student.getAverageMark());      //ad everything to a string
            ArrayList<String> arrayList = new ArrayList<String>(Arrays.asList(students));
            arrayList.add(student1);        //add string to list
            students = arrayList.toArray(students);   
        }
        for (int i = 0; i<3;i++){
            System.out.println(students[i]);            //print each item of the list
        }
    }

  Main(String name, int idNum, double averageMark) {            //constructor
    this.name = name;
    this.idNum = idNum;
    this.averageMark = averageMark;
  }
  public double getAverageMark() {          //getters
      return averageMark;
  }
  public int getIdNum() {
      return idNum;
  }
    public String getName() {
        return name;
    }
    public void setAverageMark(double averageMark) {            //setters
        this.averageMark = averageMark;
    }
    public void setIdNum(int idNum) {
        this.idNum = idNum;
    }
    public void setName(String name) {
        this.name = name;
    }
}

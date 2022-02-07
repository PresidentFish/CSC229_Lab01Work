
package com.mycompany.homework_1;


public class Course {
    int ID;
    String Name;
    int Code;

//Default Constructor    
public Course() {
    ID = 229;
    Name = "Data structures and Algorithms 1";
    Code = 229;
        
  }
//Overload
Course(int num1, String str, int num2){
        ID = 111;
        Name = "Algebrah";
        Code = 111;
}
        
     // ID Getter
  public int getID() {
    return ID;
  }

  // ID Setter
  public void setName(int newInt) {
    this.ID = newInt;
  }
    
 // NAME Getter
  public String getName() {
    return Name;
  }

  // NAME Setter
  public void setName(String newName) {
    this.Name = newName;
  } 
  
 // CODE Getter
  public int getCode() {
    return Code;
  }

  // CODE Setter
  public void setCode(int newCode) {
    this.Code = newCode;
  } 
  
  
  public static void main(String args[] ) {
    Course course1 = new Course();
    System.out.println("Course ID is:" + course1.getID());
    System.out.println("Course name is:" + course1.getName());
    System.out.println("Course code is:" + course1.getCode());

    Course course2 = new Course(111, "BCS111", 102);
    System.out.println("Course ID is:" + course2.getID());
    System.out.println("Course name is:" + course2.getName());
    System.out.println("Course code is:" + course2.getCode());}

}
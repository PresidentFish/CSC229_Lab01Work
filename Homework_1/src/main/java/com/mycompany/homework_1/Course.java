
package com.mycompany.homework_1;


public class Course {
    int ID;
    String Name;
    int Code;
    
public Course(int id, String name, int code) {
   id = 229;
    name = "Data structures and Algorithms 1";
    code = 229;
        
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
  public String getCode() {
    return Name;
  }

  // CODE Setter
  public void setCode(int newCode) {
    this.Code = newCode;
  } 
    

}
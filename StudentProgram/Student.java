public class Student{
 
  public Student(String name, int id){
   studentName = name;
   studentID = id;
  }
 
  public String getname(){
   return studentName;
  }

  public int getID(){
   return studentID;
  }

  public void setUnits(double units){
   unitsEarned = units;
  }

  public double getUnits(){
   return unitsEarned;
  } 
  
  public void incrementUnits(double additionalUnits){
   unitsEarned += additionalUnits;
  }

  public boolean haveEnoughUnits(){
   return (unitsEarned >= UNITS_TO_GRADUATE);
  }

  public String toString(){
  return studentName+" ( #"+studentID +" )";
  }
  

 public static final double UNITS_TO_GRADUATE = 180.0;

 private String studentName;
 private int studentID;
 private double unitsEarned;
}

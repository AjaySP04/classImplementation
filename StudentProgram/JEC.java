public class JEC{
 
 public static void main(String[] args){
   System.out.println("\t---Welcome To Student Info JEC---\n");
   
   Student stud1 = new Student("Saurabh Gupta", 1001);
   stud1.setUnits(179);
   System.out.println(stud1.getname() +" has "+stud1.getUnits()+" units.");
   System.out.println(stud1.getname()+" can Graduate :"+ stud1.haveEnoughUnits());
   System.out.println(stud1.getname()+" takes Information Tehnology.");
  
   stud1.incrementUnits(5);
   System.out.println(stud1.getname() +" has "+stud1.getUnits()+" units.");
   System.out.println(stud1.getname()+" can Graduate :"+stud1.haveEnoughUnits());
   
  
   if(stud1.haveEnoughUnits()){
   System.out.println("Congratulations!! "+ stud1.toString());
    }

   //Student stud2 = new Student("Jay Verma", 1002);
   //stud2.setUnits(192);
   //System.out.println(stud2.getname() +" has "+stud2.getUnits()+" units.");
   //System.out.println(stud2.getname()+" can Graduate :"+ stud2.haveEnoughUnits());
   //System.out.println(stud2.getname()+" takes Computer Science Engineering.");
  /*
   if(stud2.haveEnoughUnits()){
   System.out.println("Congratulations!! "+ stud2.toString());
    }
  */

  }
}

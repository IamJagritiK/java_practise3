import java.util.Scanner;

class StudentMarks{



    public static void main(String[] args){  
        System.out.println("Enter the number of students:");
        Scanner scan=new Scanner(System.in);
        
        int noOfStudents =scan.nextInt();
        int[] stuGrades = new int[noOfStudents];


        for(int i=0;i<noOfStudents;i++)
        {
          System.out.println("Enter the grade for student" + i);
          int stuGradeEntry=scan.nextInt();
          if (stuGradeEntry < 0 || stuGradeEntry > 100) {
            throw new ArithmeticException("Invalid input! Out of range.");
          }
      
          stuGrades[i]=stuGradeEntry;
        }

        for(int i=0;i<noOfStudents;i++)
        {
          System.out.println("Grade for student"+ i +":" + stuGrades[i]);
        
        }
    }




}
import java.util.Scanner;
import java.util.ArrayList;

public class Main{
    static Scanner sc = new Scanner(System.in);
    static ArrayList<Student> students = new ArrayList<>();
    
        public static void main(String[] args){
            

            boolean running  = true;

            while(running){
                System.out.println("=======Student Management System=======");

                System.out.println("1.Add Student");
                System.out.println("2.View Student");
                System.out.println("3.Search Student");
                System.out.println("4.Update Student");
                System.out.println("5.Delete Student");
                System.out.println("6.Exit");

                System.out.println("Enter your choice");

                int choice = sc.nextInt();

                switch(choice){
                    case 1:
                        //addStudent();
                        break;
                    
                    case 2:
                        //viewStudents();
                        break;
                    
                    case 3:
                        //searchStudent();
                        break;

                    case 4:
                        //updateStudent();
                        break;

                    case 5:
                        //deleteStudent();
                        break;

                    case 6:
                        running = false;
                        break;
  
                    default:
                        System.out.println("Invalid choice! Please try again.");
                        
                    

                }

            }


        }
}
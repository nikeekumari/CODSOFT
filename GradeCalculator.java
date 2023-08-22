  import java.util.*;
    public class GradeCalculator {

    
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
    
            // Number of subjects
            int numSubjects = 5; // You can change this according to your needs
    System.out.println("Enter the number of subjects : ");
    numSubjects=scanner.nextInt(); 
            // Array to store marks
            int[] marks = new int[numSubjects];
    
            // Input marks for each subject
            for (int i = 0; i < numSubjects; i++) {
                System.out.print("Enter marks for Subject " + (i + 1) + ": ");
                marks[i] = scanner.nextInt();
            }
    
            // Calculate total marks
            int totalMarks = 0;
            for (int mark : marks) {
                totalMarks += mark;
            }
    
            // Calculate average percentage
            double averagePercentage = (double) totalMarks / (numSubjects);
    
            // Calculate grade based on average percentage
            String grade;
            if (averagePercentage >= 90) {
                grade = "A";
            } else if (averagePercentage >= 80) {
                grade = "B";
            } else if (averagePercentage >= 70) {
                grade = "C";
            } else if (averagePercentage >= 60) {
                grade = "D";
            } else {
                grade = "F";
            }
    
            // Display results
            System.out.println("Total Marks: " + totalMarks);
            System.out.println("Average Percentage: " + averagePercentage + "%");
            System.out.println("Grade: " + grade);
    
            // Close the scanner
            scanner.close();
        }
    }
    


package PREP2025.stage1;

import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter marks (out of 100): ");
        int marks = in.nextInt();
        in.close();

        if (marks <0 || marks>100){
            System.out.println("Invalid marks");
        } else {
            String grade = getGrade(marks);
            System.out.println("Your Grade is "+grade);
        }
    }
    private static String getGrade(int marks) {
        if (marks>=91) return "A+";
        else if (marks>=81) return "A";
        else if (marks>=71) return "B";
        else if (marks>=61) return "C";
        else if (marks>=51) return "D";
        else if (marks>=41) return "F";
        else return "Fail";
    }
}

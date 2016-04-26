import java.util.*;
import java.io.*;
import java.text.DecimalFormat;

public class Sample {
    
    public static void main(String[] args) {
        int studId = 0;
        String studName;
        int examScore;
        int examMax = 0;
        int examMin = 100;
        float examAvg;
        int numOfStud = 0;
        int sumOfExam = 0;

        Scanner inFile = new Scanner(System.in);

        System.out.println("~~~ Exam Report ~~~\n");
        System.out.println("Student ID    N a m e    Exam");
        System.out.println("----------    -------    ----");

        while(inFile.hasNextLine())
        {
            studId = inFile.nextInt();
            studName = inFile.next();
            examScore = inFile.nextInt();
            inFile.nextLine();
            ++numOfStud;
            sumOfExam = sumOfExam + examScore;

            if(examScore > examMax) {
                examMax = examScore;
            }
            
            if(examScore < examMin) {
                examMin = examScore;
            }

            System.out.printf("%-13d %-10s %-3d\n", studId, studName, examScore);
        }

        examAvg = (float)sumOfExam/numOfStud;

        System.out.printf("\nExam MAX is: %3d\n", examMax);
        System.out.printf("Exam MIN is: %3d\n\n", examMin);
        System.out.printf("Exam Average is: %6.2f\n\n", examAvg);
        System.out.printf("~~~ end ~~~");
    }
    
}
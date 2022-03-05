//importing the scanner class from the util package//
 import java.util.Scanner;

/**
 * @author Selomie Golentaw
 * @version 0.1
 */

//Creating the class 'GradeAverage'//
public class GradeAverage {

    //main method//
    public static void main(String[] args) {
        //declaring and initializing the variables required in code//
        Double TestWeight = 0.40;
        Double MidTermWeight = 0.25;
        Double FinalexamWeight = 0.35;
        Double TotalTests = 3.0;
        char Grade = 'D';
        //Creating the scanner object 'in'//
        Scanner in = new Scanner(System.in);

        //Taking inputs from user//
        System.out.print("Enter Test score #1:");
        Double Test1 = in.nextDouble();

        System.out.print("Enter Test score #2:");
        Double Test2 = in.nextDouble();

        System.out.print("Enter Test sore #3:");
        Double Test3 = in.nextDouble();

        //calculating Test average and storing in a variable//
        Double TestAverage = (Test1 + Test2 + Test3) / TotalTests;

        System.out.print("Enter MidTerm score:");
        Double MidTermScore = in.nextDouble();

        System.out.print("Enter Finalexam score:");
        Double FinalexamScore = in.nextDouble();

        //calculating TotalGradeAverage using the weights given in question
        Double TotalGradeAverage = (TestAverage * TestWeight) + (MidTermScore * MidTermWeight) + (FinalexamScore * FinalexamWeight);
        System.out.println(TotalGradeAverage);


    //if else conditions to assgin grade //
            if (TotalGradeAverage < 60){
                Grade = 'F';}
            else if(TotalGradeAverage > 60 && TotalGradeAverage < 70){
                Grade = 'D';}
            else if(TotalGradeAverage > 70 && TotalGradeAverage < 80){
                Grade = 'C';}
            else if(TotalGradeAverage > 80 && TotalGradeAverage < 90){
                Grade = 'B';}
            else {
                Grade = 'A';}

    //Rounding the TotalGradeAverage and printing Grade Average,Letter Grade and message//


      Double RoundedGradeAverage = Math.round(TotalGradeAverage*100.0)/100.0;
      System.out.println("\nGrade Average: " + RoundedGradeAverage);

      System.out.println("Letter Grade:"+Grade);


      if(Grade == 'D'|| Grade == 'F')
          System.out.println("i'm sorry.You will have to repeat the course before advancing.");

      else
          System.out.println("Good job. You have met the prerequisite for the next course.");

    }
        }

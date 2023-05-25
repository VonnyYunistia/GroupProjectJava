package class23Project;

import java.util.Scanner;

public class Marks {

    private static Scanner sc;
    public static void main(String[] args)
    {
        int totalSubjects, i;
        float Marks, total = 0, Percentage, Average;
        sc = new Scanner(System.in);

        System.out.print(" Please Enter the Total Number of Subjects : ");
        totalSubjects = sc.nextInt();

        System.out.print(" Please Enter the Subjects Marks : ");
        for(i = 0; i < totalSubjects; i++)
        {
            Marks = sc.nextInt();
            total = total + Marks;
        }

        Average = total / totalSubjects;
        Percentage = (total / (totalSubjects * 100)) * 100;

        System.out.println(" Total Marks =  " + total);
        System.out.println(" Average Marks =  " + Average);
        System.out.println(" Marks Percentage =  " + Percentage);
    }


}

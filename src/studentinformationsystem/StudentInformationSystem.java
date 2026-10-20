/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package studentinformationsystem;

/**
 *
 * @author alley
 */

public class StudentInformationSystem {

    public static void main(String[] args) {
        String studentName = "Nur Aleya Tasnim binti Mohd Radzi";
        String studentID = "S87351";

        double mark1 = 45;
        double mark2 = 40;

        double total = mark1 + mark2;

        System.out.println("Student Information System");
        System.out.println("--------------------------");
        System.out.println("Student Name: " + studentName);
        System.out.println("Student ID: " + studentID);
        System.out.println("Mark 1: " + mark1);
        System.out.println("Mark 2: " + mark2);
        System.out.println("Total Mark: " + total);

        if (total >= 80) {
            System.out.println("Result: Excellent");
        } else if (total >= 50) {
            System.out.println("Result: Good");
        } else {
            System.out.println("Result: Needs Improvement");
        }
    }
}
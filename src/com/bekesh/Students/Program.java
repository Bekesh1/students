/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bekesh.Students;

import com.bekesh.Students.obj.Details;
import java.util.Scanner;

/**
 *
 * @author bekesh
 */
public class Program {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("1. enter students");
            System.out.println("2. enter subjects");
            System.out.println("3. enter marks");
            System.out.println("4. exit");
            System.out.println("enter your choice: ");
            int choice = sc.nextInt();
            Details d = new Details();
            switch (choice) {
                case 1:
                    d.getStudentName();
                    break;
                case 2:
                    d.getSubjectName();
                    break;
                case 3:
                    d.getMarks();
                    break;
                case 4:
                    System.exit(0);

            }

        }
    }

}

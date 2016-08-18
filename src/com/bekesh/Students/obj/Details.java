/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bekesh.Students.obj;

import java.util.Scanner;

/**
 *
 * @author bekesh
 */
public class Details {

    Scanner sc = new Scanner(System.in);
    String[] Studentname = new String[5];
    String[] Subjectname = new String[5];
    float[] Marks = new float[Subjectname.length];
    int i;

    public void getStudentName() {
        for (i = 0; i < Studentname.length; i++) {

            System.out.println("enter students name");
            Studentname[i] = sc.next();

        }
    }

    public void getSubjectName() {
        for (i = 0; i < Subjectname.length; i++) {

            System.out.println("enter subjects name");
            Subjectname[i] = sc.next();
        }
    }

    public void getMarks() {

        for (i = 0; i < Subjectname.length; i++) {

            System.out.println("enter marks");
            Marks[i] = sc.nextFloat();
        }
    }

}

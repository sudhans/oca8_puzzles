package com.msd.hackerrank;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

class Student01 implements Comparable<Student01> {
    private int id;
    private String fname;
    private double cgpa;

    public Student01(int id, String fname, double cgpa) {
        super();
        this.id = id;
        this.fname = fname;
        this.cgpa = cgpa;
    }

    public int getId() {
        return id;
    }

    public String getFname() {
        return fname;
    }

    public double getCgpa() {
        return cgpa;
    }

    @Override
    public int compareTo(Student01 o) {
        if (o.cgpa > this.cgpa) {
            return 1;
        } else if (o.cgpa < this.cgpa) {
            return -1;
        } else {
            int nameResult = this.fname.compareTo(o.fname);
            if (nameResult == 0) {
                if (o.id < this.id) {
                    return -1;
                } else if (o.id > this.id) {
                    return 1;
                } else {
                    return 0;
                }
            } else {
                return nameResult;
            }
        }
    }
}

public class Sort01 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());

        List<Student01> studentList = new ArrayList<>();
        while (testCases > 0) {
            int id = in.nextInt();
            String fname = in.next();
            double cgpa = in.nextDouble();

            Student01 st = new Student01(id, fname, cgpa);
            studentList.add(st);

            testCases--;
        }

        Collections.sort(studentList);

        for (Student01 st : studentList) {
            System.out.println(st.getFname());
        }
    }
}

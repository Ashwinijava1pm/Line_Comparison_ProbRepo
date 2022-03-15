package com.infogalxy;

import java.util.Scanner;

import static java.lang.Math.sqrt;

public class Line_Comparison_Prob {
    public static void main (String args[]){
        System.out.println("Welcome To Line Comparison Computation:");
        //UC-1-Calculate Length of Line
        int x1,y1,x2,y2;
        double length_of_line;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the point x1:");
        x1 = sc.nextInt();
        System.out.println("Enter the point y1:");
        y1 = sc.nextInt();
        System.out.println("Enter the point x2:");
        x2 = sc.nextInt();
        System.out.println("Enter the point y2:");
        y2 = sc.nextInt();
        length_of_line = sqrt((x2 - x1)^2 + (y2 - y1)^2);
        System.out.println("Length of Line="+length_of_line);


    }

}

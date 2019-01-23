package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
       // double userNumInput = sc.nextDouble();
        double[] tempature = new double[6];

        System.out.println("Please avarage Temp for past 7 days ");
        for (int i = 0; i < tempature.length ; i++) {
            double numUserInput = sc.nextDouble();
            tempature[i] = numUserInput;
            System.out.println("Please Enter Next Num ");

        }
        double total = 0;
        for(int temp = 0; temp < tempature.length; temp++){
            total = total + tempature[temp];
            System.out.println(tempature[temp]);
        }
        double avarge = total/tempature.length;
        System.out.println("The Average temperature for the week is " + avarge);
	// write your code here
    }
}

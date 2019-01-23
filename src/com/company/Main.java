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
        }
        System.out.println("The Tempaturetempature[2]);
	// write your code here
    }
}

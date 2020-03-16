package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    int counter=0;
        Scanner scanner=new Scanner(System.in);
        String sir="ana are mere";
        System.out.println("Enter a character: to find its occurences in this string: Ana are mere ");
        char c = scanner.next().charAt(0);
        char[] charArr=sir.toCharArray();
        char[] cArr=sir.toCharArray();
    for(int i=0;i<sir.length();i++){
        if(charArr[i] == cArr[1]) {
            counter++;
        }
    }
    System.out.println("Caracterul "+c+" apare de "+counter+" ori");
    }
}

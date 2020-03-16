package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String nameGuess;
        int guess,counter=0;
        Scanner scanner=new Scanner(System.in);
        guessingGame obj=new guessingGame();
        System.out.println("Introdu numele secret!");
        obj.setName(scanner.nextLine());
        do{
        System.out.println("Incercati sa ghiciti numele");
        nameGuess=scanner.nextLine();
        counter++;
    }while(!nameGuess.equals(obj.getName()));
    if (counter==1){ System.out.println("Ati reusit din prima");}
        else{
            System.out.println("Ati reusit din "+counter+" incercari");
        }

    }



}

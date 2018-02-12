package com.paulgeschke;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String answerInput;
        int correctAnswers = 0;

        System.out.println("HTML and CSS are computer languages used to create what? ");
        String answer1 = "Websites";
        answerInput = input.next();

        if (answerInput.equalsIgnoreCase(answer1)){
            System.out.println("That is Correct!");
            correctAnswers += 1;
        }
        else {
            System.out.println("That is Incorrect");
        }
        System.out.println("The companies HP, Microsoft, and Apple were all started in what? ");
        String answer2 = "Garage";
        answerInput = input.next();

        if (answerInput.equalsIgnoreCase(answer2)){
            System.out.println("That is Correct!");
            correctAnswers += 1;
        }
        else {
            System.out.println("That is Incorrect");
        }
        System.out.println("Created in 2009, what was the first decentralized cryptocurrency? ");
        String answer3 = "Bitcoin";
        answerInput = input.next();

        if (answerInput.equalsIgnoreCase(answer3)){
            System.out.println("That is Correct!");
            correctAnswers += 1;
        }
        else {
            System.out.println("That is Incorrect");
        }
        System.out.println("In 1975 an engineer created the first electric camera while working for what company? ");
        String answer4 = "Kodak";
        answerInput = input.next();

        if (answerInput.equalsIgnoreCase(answer4)){
            System.out.println("That is Correct!");
            correctAnswers += 1;
        }
        else {
            System.out.println("That is Incorrect");
        }
        System.out.println("Nintendo is a consumer electronics and video game company founded in what country? ");
        String answer5 = "Japan";
        answerInput = input.next();

        if (answerInput.equalsIgnoreCase(answer5)){
            System.out.println("That is Correct!");
            correctAnswers += 1;
        }
        else {
            System.out.println("That is Incorrect");
        }
        System.out.println("You got " + correctAnswers + " question(s) correct!");
    }
}

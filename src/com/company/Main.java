package com.company;

import java.time.LocalDate;
import java.util.Scanner;

import static jdk.internal.agent.Agent.error;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        int yaerr;
        Scanner scanner = new Scanner(System.in);
        System.out.println("The date today is " + LocalDate.now().getMonth().toString() + " " + LocalDate.now().getDayOfMonth() + " " + LocalDate.now().getYear());
        System.out.println("What is your name");
        String name = scanner.next();
        System.out.println("Month");
        int date = scanner.nextInt();
        int day = scanner.nextInt();
        if (date < 0 || date > 12) {
            System.out.println("error");
        }
        switch (date) {
            case 1:
                System.out.println("Please enter the day (1-31)");
                day = scanner.nextInt();
                if (day < 0 || day > 31) {
                    error("invalid date please rerun the program and enter a valid date ");
                } else {
                    System.out.println("Good ! ");
                    int yaer = 0;
                    System.out.println("Please enter the year that you were born at");
                    yaer = scanner.nextInt();
                    System.out.println("the date is" + day + "/" + date + "/" + yaer);
                    break;
                }
            case 2:
                System.out.println("Please enter the day (1-30)");
                day = scanner.nextInt();
                if (day < 0 || day > 30) {
                    error("invalid date please rerun the program and enter a valid date ");
                } else {
                    System.out.println("Good ! ");
                    int yaer = 0;
                    System.out.println("Please enter the year that you were born at");
                    yaer = scanner.nextInt();
                    System.out.println("the date is" + day + "/" + date + "/" + yaer);
                    break;
                }
            case 3:
                System.out.println("Please enter the day (1-30)");
                day = scanner.nextInt();
                if (day < 0 || day > 29) {
                    System.out.println("Please enter the day (1-29)");
                    error("invalid date please rerun the program and enter a valid date ");
                } else {
                    System.out.println("Good ! ");
                    int yaer = 0;
                    System.out.println("Please enter the year that you were born at");
                    yaer = scanner.nextInt();
                    System.out.println("the date is" + day + "/" + date + "/" + yaer);
                    break;
                }
            case 4:
                System.out.println("Please enter the day (1-30)");
                day = scanner.nextInt();
                if (day < 0 || day > 30) {
                    error("invalid date please rerun the program and enter a valid date ");
                } else {
                    System.out.println("Good ! ");
                    int yaer = 0;
                    System.out.println("Please enter the year that you were born at");
                    yaer = scanner.nextInt();
                    System.out.println("the date is" + day + "/" + date + "/" + yaer);
                    break;
                }
            case 5:
                System.out.println("Please enter the day (1-31)");
                day = scanner.nextInt();
                if (day < 0 || day > 31) {
                    error("invalid date please rerun the program and enter a valid date ");
                } else {
                    System.out.println("Good ! ");
                    int yaer = 0;
                    System.out.println("Please enter the year that you were born at");
                    yaer = scanner.nextInt();
                    System.out.println("the date is" + day + "/" + date + "/" + yaer);
                    break;
                }
            case 6:
                System.out.println("Please enter the day (1-30)");
                day = scanner.nextInt();

                if (day < 0 || day > 30) {
                    error("invalid date please rerun the program and enter a valid date ");
                } else {
                    System.out.println("Good ! ");
                    int yaer = 0;
                    System.out.println("Please enter the year that you were born at");
                    yaer = scanner.nextInt();
                    System.out.println("the date is" + day + "/" + date + "/" + yaer);
                    break;
                }
            case 7:
                System.out.println("Please enter the day (1-30)");
                day = scanner.nextInt();
                if (day < 0 || day > 30) {
                    error("invalid date please rerun the program and enter a valid date ");
                } else {
                    System.out.println("Good ! ");
                    int yaer = 0;
                    System.out.println("Please enter the year that you were born at");
                    yaer = scanner.nextInt();
                    System.out.println("the date is" + day + "/" + date + "/" + yaer);
                    break;
                }
            case 8:
                System.out.println("Please enter the day (1-30)");
                day = scanner.nextInt();
                if (day < 0 || day > 30) {
                    error("invalid date please rerun the program and enter a valid date ");
                } else {
                    System.out.println("Good ! ");
                    int yaer = 0;
                    System.out.println("Please enter the year that you were born at");
                    yaer = scanner.nextInt();
                    System.out.println("the date is" + day + "/" + date + "/" + yaer);
                    break;
                }
            case 9:
                System.out.println("Please enter the day (1-30)");
                day = scanner.nextInt();
                if (day < 0 || day > 30) {
                    error("invalid date please rerun the program and enter a valid date ");
                } else {
                    System.out.println("Good ! ");
                    int yaer = 0;
                    System.out.println("Please enter the year that you were born at");
                    yaer = scanner.nextInt();
                    System.out.println("the date is" + day + "/" + date + "/" + yaer);
                    break;
                }
            case 10:
                System.out.println("Please enter the day (1-30)");
                day = scanner.nextInt();
                if (day < 0 || day > 30) {
                    error("invalid date please rerun the program and enter a valid date ");
                } else {
                    System.out.println("Good ! ");
                    int yaer = 0;
                    System.out.println("Please enter the year that you were born at");
                    yaer = scanner.nextInt();
                    System.out.println("the date is" + day + "/" + date + "/" + yaer);
                    break;
                }
            case 11:
                System.out.println("Please enter the day (1-30)");
                day = scanner.nextInt();
                if (day < 0 || day > 30) {
                    error("invalid date please rerun the program and enter a valid date ");
                } else {
                    System.out.println("Good ! ");
                    int yaer = 0;
                    System.out.println("Please enter the year that you were born at");
                    yaer = scanner.nextInt();
                    System.out.println("the date is" + day + "/" + date + "/" + yaer);
                    break;
                }
            case 12:
                System.out.println("Please enter the day (1-30)");
                day = scanner.nextInt();
                if (day < 0 || day > 30) {
                    error("invalid date please rerun the program and enter a valid date ");
                } else {
                    System.out.println("Good ! ");
                    int yaer = 0;
                    System.out.println("Please enter the year that you were born at");
                    yaer = scanner.nextInt();
                    System.out.println("the date is" + day + "/" + date + "/" + yaer);
                    break;
                }
        }
        learning();
    }

    public static void learning() {
        Scanner scanner = new Scanner(System.in);
        String helpful;
        String why;
        System.out.println("Ok lets start learning");
        System.out.println("What is Matlab? \nMatlab is an platform that gives you the option to make some almost impossible mathematics calculation that us as a student can't do.");
        System.out.println("Why do we need it? \nThere are some very complex calculation (specially in the different subjects of engineering),we need to use Matlab because it can help to Mathematicians do some near to impossible \ncalculations in Math and find the solution in seconds");
        System.out.println("What is this platform? \nThis platform is a non-formalistic and non-financials (According to the Privacy Policy) platform to learn that language.\nThis platform is mostly recommended for students who didn't managed to pass the Matlab exam\nor been having a difficult time learning coding in Matlab.");
        System.out.println("\n");
        System.out.println("Was it helpful?<y/n>");
        helpful = scanner.next();
        if (helpful.contains("y")){
            System.out.println("Great!\ndo you have any questions? if you have send thees to the mail - Thesun538@gmail.com");
        }
        else if (helpful.contains("n")){
            System.out.println("We will like to hear why!\nYour opinion is important to us!\npls send to to the email - Thesun538@gmail.com");
        }
    }
}
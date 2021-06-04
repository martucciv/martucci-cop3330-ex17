package ex17;
/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solutions
 *  Copyright 2021 Veronica Martucci
 */

public class Main {
    static Calculator calc = new Calculator();

    public static void main(String[] args){
        Main app = new Main();
        Input input = new Input();
        input.main();
        calc.main(input.weight, input.gender, input.drinkNum, input.percentAlc, input.hours);
        app.printOutput();
    }

    public void printOutput(){
        System.out.printf("Your BAC is %.2f\n", calc.BAC);

        if(calc.BAC >= 0.08){
            System.out.println("It is not legal for you to drive.");
        }
        else{
            System.out.println("It is legal for you to drive.");
        }
    }
}
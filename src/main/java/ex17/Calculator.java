package ex17;
/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solutions
 *  Copyright 2021 Veronica Martucci
 */
public class Calculator {
    double BAC;

    public void main(double weight, String gender, float drinkNum, double percentAlc, double hours){
        gender = gender.toLowerCase();
        double A = drinkNum * percentAlc;

        if(gender.equals("female")){
            this.BAC = (A * 5.14 / weight * 0.66) - 0.015 * hours;
        }
        else {
            this.BAC = (A * 5.14 / weight * 0.73) - 0.015 * hours;
        }

        if(this.BAC < 0){
            this.BAC = 0.00;
        }
    }
}

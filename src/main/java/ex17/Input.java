package ex17;
/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solutions
 *  Copyright 2021 Veronica Martucci
 */
import java.util.Scanner;

public class Input {
    Scanner input = new Scanner(System.in);
    double weight;
    String gender;
    float drinkNum;
    double percentAlc;
    double hours;

    public void main(){
        Input app = new Input();
        this.weight = app.inputWeight();
        this.gender = app.inputGender();
        this.drinkNum = app.inputDrinkNum();
        this.percentAlc = app.inputPercentConsumed();
        this.hours = app.inputHours();
    }

    public boolean isNum(String str){

        if(str == null || str.length() == 0){
            return false;
        }
        try{
            Double.parseDouble(str);
            return true;
        }
        catch(NumberFormatException e){
            return false;
        }
    }

    public double inputWeight(){
        boolean boo1 = true;
        String str;

        while(boo1){
            System.out.print("Enter your weight in pounds: ");
            str = input.next();

            boolean boo = isNum(str);

            if (boo1 != boo) {
                System.out.println("Error, invalid input. Try again");
            }
            else{
                this.weight = Double.parseDouble(str);
                boo1 = false;
            }
        }
        return this.weight;
    }

    public String inputGender(){
        System.out.print("Enter your gender: ");
        return input.next();
    }

    public float inputDrinkNum(){
        boolean boo1 = true;

        while(boo1) {
            System.out.print("Enter the number of drinks: ");
            String str = input.next();

            boolean boo = isNum(str);

            if (boo1 != boo) {
                System.out.println("Error, invalid input. Try again");
            }
            else{
                this.drinkNum = Float.parseFloat(str);
                boo1 = false;
            }
        }
        return this.drinkNum;
    }

    public double inputPercentConsumed(){
        boolean boo1 = true;

        while(boo1) {
            System.out.print("Enter the percent volume of drinks consumed: ");
            String str = input.next();
            boolean boo = isNum(str);

            if (boo1 != boo) {
                System.out.println("Error, invalid input. Try again");
            }
            else{
                this.percentAlc = Double.parseDouble(str);
                boo1 = false;
            }
        }
        return this.percentAlc;
    }

    public double inputHours(){
        boolean boo1 = true;

        while(boo1) {
            System.out.print("Enter how many hours since your last drink: ");
            String str5 = input.next();
            boolean boo = isNum(str5);

            if (boo1 != boo) {
                System.out.println("Error, invalid input. Try again");
            }
            else{
                this.hours = Double.parseDouble(str5);
                boo1 = false;
            }
        }
        return this.hours;
    }
}

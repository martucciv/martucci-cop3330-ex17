import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Input input = new Input();
        input.main();
        Calculator calc = new Calculator();
        calc.main(input.weight, input.gender, input.drinkNum, input.percentAlc, input.hours);

        System.out.printf("Your BAC is %.2f\n", calc.BAC);

        if(calc.BAC >= 0.08){
            System.out.println("It is not legal for you to drive.");
        }
        else{
            System.out.println("It is legal for you to drive.");
        }
    }
}

class Input{
    double weight;
    String gender;
    float drinkNum;
    double percentAlc;
    double hours;

    public void main(){

        boolean boo1 = true;
        while(boo1){
            Scanner input1 = new Scanner(System.in);
            System.out.print("Enter your weight in pounds: ");
            String str1 = input1.next();

            boolean boo = isNum(str1);

            if (boo1 != boo) {
                System.out.println("Error, invalid input. Try again");
            }
            else{
                this.weight = Double.parseDouble(str1);
                boo1 = false;
            }
        }

        Scanner input2 = new Scanner(System.in);
        System.out.print("Enter your gender: ");
        this.gender = input2.next();

        boo1 = true;
        while(boo1) {
            Scanner input3 = new Scanner(System.in);
            System.out.print("Enter the number of drinks: ");
            String str3 = input3.next();

            boolean boo = isNum(str3);

            if (boo1 != boo) {
                System.out.println("Error, invalid input. Try again");
            }
            else{
                this.drinkNum = Float.parseFloat(str3);
                boo1 = false;
            }
        }

        boo1 = true;
        while(boo1) {
            Scanner input4 = new Scanner(System.in);
            System.out.print("Enter the percent volume of drinks consumed: ");
            String str4 = input4.next();
            boolean boo = isNum(str4);

            if (boo1 != boo) {
                System.out.println("Error, invalid input. Try again");
            }
            else{
                this.percentAlc = Double.parseDouble(str4);
                boo1 = false;
            }
        }

        boo1 = true;
        while(boo1) {
            Scanner input5 = new Scanner(System.in);
            System.out.print("Enter how many hours since your last drink: ");
            String str5 = input5.next();
            boolean boo = isNum(str5);

            if (boo1 != boo) {
                System.out.println("Error, invalid input. Try again");
            }
            else{
                this.hours = Double.parseDouble(str5);
                boo1 = false;
            }
        }
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
}

class Calculator{
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

import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //q1) what will be the output
        // we will get error as in if  statement we cant use assignment operator ie if(a=11) we need to
        //use relational operator ie '==' here

        //q2) pass or fail
//        System.out.print("Enter marks of sbj1: ");
//        float sbj1 = sc.nextFloat();
//        System.out.print("Enter marks of sbj2: ");
//        float sbj2= sc.nextFloat();
//        System.out.print("Enter marks of sbj3: ");
//        float sbj3 = sc.nextFloat();
//        double avg = (sbj1 +sbj2+sbj3)/3;
//        if (sbj1>= 33  && sbj2>=33 && sbj3>=33){
//            if (avg>=40){
//                System.out.println("Passed");
//            }
//            else {
//                System.out.println("Failed");
//            }
//
//        }
//        else {
//            System.out.println("Failed");
//      }

        //q3) income tax calculator
//        System.out.println("Enter your income in Lakhs per annum");
//        float tax = 0;
//        float income = sc.nextFloat();
//        if(income<=2.5){
//            tax = tax + 0;
//        }
//        else if(income>2.5f && income <= 5f){
//            tax = tax + 0.05f * (income - 2.5f);
//        }
//        else if(income>5f && income <= 10.0f){
//            tax = tax + 0.05f * (5.0f - 2.5f);
//            tax = tax + 0.2f * (income - 5f);
//        }
//        else if(income>10.0f){
//            tax = tax + 0.05f * (5.0f - 2.5f);
//            tax = tax + 0.2f * (10.0f - 5f);
//            tax = tax + 0.3f * (income - 10.0f);
//        }
//        System.out.println("The total tax paid by the employee is: Rupees " + tax*100000);

        //q4) week day numbers
//        System.out.print("Enter a number: ");
//        int a = sc.nextInt();
//
//        switch (a) {
//            case 1 -> System.out.println("Monday");
//            case 2 -> System.out.println("Tuesday");
//            case 3 -> System.out.println("Wednesday");
//            case 4 -> System.out.println("Thursday");
//            case 5 -> System.out.println("Friday");
//            case 6 -> System.out.println("Saturday");
//            case 7 -> System.out.println("Sunday");
//        }

        //q5) leap year
//            int year = 0;
//        System.out.println("Enter year: ");
//        year =sc.nextInt();
//        if (year%4==0){
//            System.out.println("Leap Year");
//        }
//        else {
//            System.out.println("Not Leap Year");
//        }

        //q6) type of web from url
//        System.out.println("Enter a url: ");
//        String a = sc.nextLine();
//        if(a.endsWith(".com")){
//            System.out.println("Commercial Website");
//        }
//        else if (a.endsWith(".in")){
//            System.out.println("Indian Website");
//        }
//        else if((a.endsWith(".org"))){
//            System.out.println("Organization Website");
//        }
//        else {
//            System.out.println("Unknown domain");
//        }
    }
}

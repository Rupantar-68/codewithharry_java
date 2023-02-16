import java.util.Scanner;

public class proj1 {
    // cbse percentage calculator
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter marks in physics: ");
        float a =sc.nextFloat();
        System.out.print("Enter marks in chemistry: ");
        float b =sc.nextFloat();
        System.out.print("Enter marks in math ");
        float c =sc.nextFloat();
        System.out.print("Enter marks in english: ");
        float d =sc.nextFloat();
        System.out.print("Enter marks in bio: ");
        float e =sc.nextFloat();

        float total = (a+b+c+d+e);

        float percentage = (total*100)/500.0f;

        System.out.println("Percentage is "+percentage);

    }
}
import java.util.Arrays;
import java.util.Scanner;
public class ex7 {
    //for example1 sum() method
//    static int sum(int a, int b){
//        return a+b;
//    }

    //method for q1
//    static void mul(int a){
//        for (int i = 0; i < 11; i++) {
//            System.out.println(a+" * "+i+" = "+a*i);
//        }
//    }

    // method for q2 pattern
//    static void pattern(String a,int n){
//        for (int i = 0; i <n; i++) {
//            for (int j = 0; j < i+1; j++) {
//                System.out.print(a);
//            }
//            System.out.println();
//        }
//    }

    //method for q3
//    static int sumRect(int n){
//        if (n==1){
//            return 1;
//        }
//        return n + sumRect(n-1);
//    }

        //method for q4
//     static  void pattern1(String a , int n){
//         for (int i = 0; i < n; i++) {
//             for (int j = i; j < n; j++) {
//                 System.out.print(a);
//             }
//             System.out.println();
//         }
//     }

        //method for q5
//        static int Fibbo(int n){
//            if(n==1){
//                return 0;
//            }
//            else if (n==2){
//                return 1;
//            }
//            else {
//                return Fibbo(n-1)+Fibbo(n-2);
//            }
//        }

    // method for q6
//    static float avg(int ...arr){
//        float sum = 0;
//        for (int i = 0; i < arr.length; i++) {
//            sum = sum + arr[i];
//        }
//        return sum /arr.length;
//    }

        //method for q7
//        static void pattern2(String a , int n){
//            if(n>0){
//                pattern2(a,n-1);
//                for (int i = 0; i < n; i++) {
//                    System.out.print(a);
//                }
//                System.out.println();
//            }
//        }

    //method for q9
//    static float tempCon(float temp){
//        float result= ((9*temp)+160)/5;
//        return result;
//    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //main for example1
//        int a =sc.nextInt();
//        int b =sc.nextInt();
//        System.out.println(sum(a,b));
//        --    --  --  --  --  --  --  --  --  --
        //q1) multiplication table using methods
//        int a =sc.nextInt();
//
//        mul(a);

        //q2) print pattern
//        String a = sc.next();
//        int b = sc.nextInt();
//        pattern(a,b);


        //q3) sum of n natural numbers using recursion
//        int a =sc.nextInt();
//        System.out.println(sumRect(a));

        //q4) print pattern
//        String a = sc.next();
//        int b = sc.nextInt();
//        pattern1(a,b);

        //q5) nth term of fibonacci series
//        int b = sc.nextInt();
//        System.out.println(Fibbo(b));

        //q6 avg using varargs
//        int []arr = new int[10];
//        for (int i = 0; i < arr.length; i++) {
//            int s = sc.nextInt();
//            arr[i]=s;
//        }
//
//        System.out.println(avg(arr));

        //q7) repeat 4 using recursion
//        String a = sc.next();
//        int b = sc.nextInt();
//        pattern2(a,b);

        //q9) celcius to fahrenhiet
//        float a = sc.nextFloat();
//        System.out.println(tempCon(a));

        //q10) sum of n natural numbers
//        int n = sc.nextInt();
//        int sum = 0;
//        for (int i = 0; i <= n; i++) {
//            sum = sum + i;
//        }
//        System.out.println(sum);
    }
}

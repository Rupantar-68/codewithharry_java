import java.util.Scanner;

public class ex8 {
    static class Employee{
        int salary;
        String name;

        public int getSalary(){
            return salary;
        }
        public String getName(){
            return name;
        }
        public void setName(String name) {
            this.name = name;
        }
    }

        static class cellPhone{
        public void getRinging(){
            System.out.println("CellPhone is ringing!!!!");
        }

        public void getVibrating(){
                System.out.println("CellPhone is vibrating");
            }
        }

        static class Square{
        int side =0;
        public void setSide(int side){
            this.side =side;
        }

        public int getArea(){
            return side*side;
        }

        public int getSide(){
            return  side;
        }

        public int getPerimeter(){
            return side*4;
        }
        }

    static class Rectangle{
        int length =0;
        int breadth=0;
        public void setlength(int side1){
            this.length =side1;
        }

        public void setbreadth(int breadth){
            this.breadth =breadth;
        }

        public int getArea(){
            return breadth*length;
        }


        public int getPerimeter(){
            return 2*(length+breadth);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // problem 1
//        Employee e1 = new Employee();
//        e1.setName("Rupantar");
//        System.out.println(e1.getName());
//
//        e1.salary =344;
//        System.out.println(e1.getSalary());

    //problem 2
//        cellPhone c1 =new cellPhone();
//        c1.getRinging();
//        c1.getVibrating();

        //problem 3
//        Square s = new Square();
//        s.setSide(sc.nextInt());
//        System.out.println(s.getArea());
//        System.out.println(s.getPerimeter());

        //problem 4
//        Rectangle r = new Rectangle();
//        r.setlength(sc.nextInt());
//        r.setbreadth(sc.nextInt());
//        System.out.println(r.getArea());
//        System.out.println(r.getPerimeter());


    }
}

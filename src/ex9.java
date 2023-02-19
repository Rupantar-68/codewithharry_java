public class ex9 {
    static class circle{
        public int radius = 0;
        public double area(){
            return Math.PI*this.radius*this.radius;
        }

    }

    static class cylinder extends circle{
        public  int height = 0;
         public double volume(){

         }
    }
    public static void main(String[] args) {

    }
}

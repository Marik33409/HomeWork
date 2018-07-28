public class Task1 {

    public static void main(String[] args) {
        System.out.println(exp(-3,3) );//-27
        System.out.println(exp(0,2) );//0
        System.out.println(exp(3,2) );//9
        System.out.println(exp(2,-2) );//0.25
        System.out.println(exp(5,0) );//0
        System.out.println(exp(0,0) );//exception
    }

    private  static  double exp(double num, int rank) {
        if ( num == 0) {
            if (rank != 0)
                return  0;
            else
                throw new  IllegalArgumentException("Невозможно возвести в степень " + rank + " число 0");
        }
        if ( rank < 0 ) {
            return  1 / (num * exp(num, -rank - 1) );
        }
        else if (rank > 0) {
            return  num * exp(num, rank -1);
        }
        else {
            return 1;
        }
    }
}

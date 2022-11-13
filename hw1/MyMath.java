package Lessons5.hw1;

public class MyMath {
    public static final double PI=3.14;
    public static double pow(double val, int stepen) {
        double sum = 1;
        for (int i = 0; i < stepen; i++) {
            sum=sum*val;
          }
        return sum;
       }
    public static double abs(double val){
        if (val<0){
            return -val;
        }else return val;
    }
    public static double getCircleSquare(double r){
        return 2*PI*r;
    }
    }


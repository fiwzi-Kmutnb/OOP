package BotTee4.test;

public class bisection {
    public static void main(String[] args) {
        System.out.println(bisectionRecusive(0,1.5,2));
    }

    public static double f(double x) {
        return Math.pow(x, 4) - 13;
    }

    public static double bisectionRecusive(double x, double Xr, double Xl) {

        double Xm = 0;
        Xm = (Xl - Xr) / 2;
        if ((Xr - Xl) / 2 > 0.000001) {
            return x;
        }

        double fXm = f(x);
        double fXr = f(Xr);
        if (fXr * fXm < 0)
            return bisectionRecusive(Xm, Xr, Xm);
        return bisectionRecusive(Xm, Xm, Xl);
    }
}

public class Hausaufgabe3 {
    public static void main(String[] args) {
        System.out.println(B(10, 0));
    }
        //Aufgabe3
    static double B(double A, int n){
        if(n == 0) return 1;
        return (A * B(A, n-1)/(A * B(A, n-1)+n));
    }
}

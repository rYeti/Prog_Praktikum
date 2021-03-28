public class Hausaufgabe1 {
    public static void main(String[] args) {
        //2
        System.out.println(e(5));
    }

    // Aufgabe2
    static double e(int n) {
        if(n == 0) return 1;
        return 1.0/fak(n) + e(n-1);
    }

    static double fak(int n) {
        if(n <= 2) return n;
        return n*fak(n-1);
    }
}

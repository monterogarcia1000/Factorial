public class Factorial {
    public static void main(String[] args) {
       int factorial = 1;
       int numero = 5;
        while ( numero!=1) {
            factorial=factorial*numero;
            numero--;
        }
        System.out.println(factorial);
    }
}

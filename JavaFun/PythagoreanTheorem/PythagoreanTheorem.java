import java.lang.Math;
public class PythagoreanTheorem {
    int legA = 2;
    int legB = 3;
    public double calculateHypotenuse(int legA, int legB) {
        int a = Math.sqrt(legA);
        int b = Math.sqrt(legB);
        int c =  a /  b;
        return c;
    }
}
import java.util.ArrayList;

public class PuzzleJavaTest {
    public static void main(String[] args) {
        PuzzleJava puzzle = new PuzzleJava();
        ArrayList<Integer> a = puzzle.greaterThan();
        System.out.println(a);
    }

    public static void main(String[] args) {
        PuzzleJava puzzle = new PuzzleJava();
        ArrayList<String> a = puzzle.names();
        System.out.println(a);
    }

    public static void main(String[] args) {
        PuzzleJava puzzle = new PuzzleJava();
        String[] a = puzzle.alphabet();
        System.out.println(a);
    }
}

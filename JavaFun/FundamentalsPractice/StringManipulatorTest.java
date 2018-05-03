public class StringManipulatorTest {
    public static void main(String[] args) {
        StringManipulator iD = new StringManipulator();
        String manipulate = iD.trimAndConcat("  Yo  ", "  Yo  ");
        System.out.println(manipulate);
    }
}
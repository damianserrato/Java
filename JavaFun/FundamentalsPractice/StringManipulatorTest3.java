public class StringManipulatorTest {
    public static void main(String[] args) {
        StringManipulator manipulator = new StringManipulator();
            String word = "Hello";
            String subString = "llo";
            String notSubString = "world";
            Integer a = manipulator.getIndexOrNull(word, subString);
            Integer b = manipulator.getIndexOrNull(word, notSubString);
            System.out.println(a);
            System.out.println(b);
}
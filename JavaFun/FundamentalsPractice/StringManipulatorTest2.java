public class StringManipulatorTest {
    public static void main(String[] args) {
        StringManipulator manipulator = new StringManipulator();
            char letter = 'o';
            Integer a = manipulator.getIndexOrNull("Coding", letter);
            Integer b = manipulator.getIndexOrNull("Hello World", letter);
            Integer c = manipulator.getIndexOrNull("Hi", letter);
            System.out.println(a);
            System.out.println(b);
            System.out.println(c);
}
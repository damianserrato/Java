public class FizzBuzz {
        public static void main(String[] args) {
            int a = 4;
            if(a % 3 == 0) {
                System.out.println("Fizz");
            }
            else if(a % 5 == 0) {
                System.out.println("FizzBuzz");
                }
            else {
                System.out.println("Nothing to print");
            }
        }
    }

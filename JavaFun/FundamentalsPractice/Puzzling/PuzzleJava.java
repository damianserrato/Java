import java.util.ArrayList;

public class PuzzleJava {
    public ArrayList<Integer> greaterThan() {
        int[] thisarray = {3,5,1,2,7,9,8,13,25,32};
        ArrayList<Integer> myArray = new ArrayList<Integer>(10);
        Integer sum1 = 0;
        
        for(int i = 0; i< 10; i ++) {
            Integer num = thisarray[i];
            if( num > 10) {
            myArray.add(num);
            sum1 = sum1 + i;
        }
    }

        System.out.println(sum1);
        return myArray;
    }

    public ArrayList<String> names() {
        String[] thisarray = {"Damian", "Inti", "Rachael", "Cameron", "Malika", "Hasan", "Jonathan"};
        ArrayList<String> myArray = new ArrayList<String>(10);
        
        for(int i = 0; i< 7; i ++) {
            String str1 = thisarray[i];
                System.out.println(str1);
                if( str1.length() > 5) {
                    myArray.add(str1);
                }
        }

        return myArray;
    }

    public String[] alphabet() {
        String[] vowels = {"a","e","i","o","u"};
        String[] myArray = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};

        for (int i = 0; i <27; i ++) {
            String str1 = myArray[i];
            if(str1 == "a") {
                System.out.println(str1);
                for (int j = 0; i < 5; i ++) {
                    String str2 = vowels[i];
                    if(str1 == str2) {
                        System.out.println("Java is really interesting!!");
                    }
                }
            }
            else if(str1 == "z") {
                System.out.println(str1);
            }
        }
        return myArray;
    }
}
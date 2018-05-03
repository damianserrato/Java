public class StringManipulator {
        public String trimAndConcat(String str1, String str2) {
            String str3 = str1.trim();
            String str4 = str2.trim();
            return str3 + str4;
        }
        public Integer getIndexOrNull(String str1, char char1) {
            if(str1.indexOf(char1) <= 0) {
                return null;
            }
            return str1.indexOf(char1);
        }
        public Integer getIndexOrNull(String str1, String str2) {
            if(str1.indexOf(str2) <=0) {
                return null;
            }
            return str1.indexOf(str2);
        }
        public String concatSubstring(String str1, int a, int b, String str2) {
            String str3 = str1.substring(a,b);
            return str3 + str2;
        }
    }
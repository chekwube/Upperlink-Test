public class AllReapeating {
    public static void main(String[] args) {     
        //Test
        findDuplicateCharsWithCount("Joseph was jealous");
    }
    
    private static void findDuplicateCharsWithCount(String str) {
        int count;
        for(int i = 0; i < str.length(); i++) {
            count = 1;
            //Take one char at a time
            char c = str.charAt(i);
            // don't count the spaces
            if(c == ' ') 
                continue;
            for(int j = i + 1; j < str.length(); j++) {
                 if(c == str.charAt(j)) {
                     count++;
                     // remove the char so that it is not picked again in another iteration
                     str = str.substring(0, j) + str.substring(j+ 1);
                 }
            }
            if(count > 1) {
                System.out.println(c + " found " + count + " times");
            }
        }
    }
}
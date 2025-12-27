// Ternary numeric notation is quite popular in Berland. To telegraph the ternary number the Borze alphabet is used. Digit 0 is transmitted as «.», 1 as «-.» and 2 as «--». You are to decode the Borze code, i.e. to find out the ternary number given its representation in Borze alphabet.

// Input
// The first line contains a number in Borze code. The length of the string is between 1 and 200 characters. It's guaranteed that the given string is a valid Borze code of some ternary number (this number can have leading zeroes).

// Output
// Output the decoded ternary number. It can have leading zeroes.


import java.util.*;

public class Borze {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //.  0
        //-. 1
        // -- 2
        
        int n = sc.nextInt();
        
        String str = sc.next();
        StringBuilder result = new StringBuilder();
        
        for(int i=0;i<n;i++){
            if(str.charAt(i) == '.'){
                result.append("0");
                continue;
            }else if(str.charAt(i) == '-'){
                if(str.charAt(i + 1) == '.'){
                    result.append("1");
                    i++;
                }else{
                    result.append("2");
                    i++;
                }
            }
            
        }
        
        System.out.println(result.toString());
        
    }

    
}

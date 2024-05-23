package DSA;

import javax.print.DocFlavor;
import java.util.Arrays;
import java.util.Map;

public class LongestSubstring {

    public static int substring(String s){
        int[] visted= new int[256];
        Arrays.fill(visted, -1);

        int i=0, r=0;
        int maxlen= 0;

        while(r < s.length()){

            if(visted[s.charAt(r)]!= -1){
                if(visted[s.charAt(r)] >= i){
                    i= visted[s.charAt(r)]+ 1;
                }
            }
            int len= r - i +1;
            maxlen= Math.max(maxlen,  len);

            visted[s.charAt(r)]= r;
            r++;

        }
        return maxlen;
    }


    public static char subNonRepeatingString(String s){
        char maxChar= ' ';

        int i =0;
        int j= i+1;
        int len= 0;
        int maxLen= 0;

        while (j < s.length()){
            if(s.charAt(i) == s.charAt(j)){
                len++;
            }
            else {
                if( len > maxLen){
                    maxChar= s.charAt(j -1);
                    maxLen= len;
                }
                len=0;
                i = j;
            }
            j++;

            if(j == s.length()){
                if(len > maxLen)
                    maxChar= s.charAt(j-1);
            }
        }


        return maxChar;
    }

}
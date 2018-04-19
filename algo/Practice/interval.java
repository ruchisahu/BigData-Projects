import java.util.ArrayList;
import java.util.List;
import java.util.*;

class interval
{
public static List<Integer> getIntervals(String[] parent, String[] child) {
    List<Integer> intervals = new ArrayList<Integer>();
    Integer interval = new Integer();

    for (int i = 0, j = 0; i < parent.length; i++) {
        if (child[j].equals(parent[i])) {
            j++;
            if (j == 1) {
                interval.start = i;
            }
            if (j == child.length) {
                interval.end = i;
                intervals.add(interval);
                interval = new Interval();
                j = 0;
            }
        } else {
            j = 0;
        }
    }

    return intervals;
}
public static void main(STatic[] args)
{
    List<String> words =new ArrayList<String>();
            List<String> ava_words =new ArrayList<String>();
          words.add("I");
         words.add("me");
         words.add("love");
       //  words={'I','love','you'};
    //     ava_words={'me','say','love','I','can',"you"};
         
         ava_words.add("I");
          ava_words.add("say");
         ava_words.add("me");
          ava_words.add("love");
           ava_words.add("you");
       //     ava_words.add("say");
        //     ava_words.add("I");
         //    ava_words.add("me");
        //     ava_words.add("me1");
        //     ava_words.add("love");
        //     ava_words.add("say");
    getIntervals(ava_words,words); 
}
}
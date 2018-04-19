import java.util.ArrayList;
import java.util.List;
import java.util.*;

class amazon_problem2try
{
    public static void main(String[] args)
    {
      //   scenario1();
         scenario5();
    }
    
    static void scenario1()
    {
         List<String> words =new ArrayList<String>();
            List<String> ava_words =new ArrayList<String>();
          words.add("I");
         
          ava_words.add("c");
        ava_words.add("I");
     //     ava_words.add("say");
      //   ava_words.add("me");
       //   ava_words.add("love");
      //       ava_words.add("I");
            ava_words.add("me");
             
       tag_all(words,ava_words);
    }
     static void scenario2()
    {
         List<String> words =new ArrayList<String>();
            List<String> ava_words =new ArrayList<String>();
          words.add("a");
          words.add("b");
          words.add("c");
             
          ava_words.add("a");
          ava_words.add("b");
          ava_words.add("n");
          ava_words.add("c");
          ava_words.add("d");
          ava_words.add("a");
          ava_words.add("b");
          ava_words.add("c");
          
             
       tag_all(words,ava_words);
    }
      static void scenario3()
    {
         List<String> words =new ArrayList<String>();
            List<String> ava_words =new ArrayList<String>();
          words.add("java");
          words.add("is");
           words.add("great");   
           ava_words.add("java");
           ava_words.add("is");
          ava_words.add("great");
         
             
       tag_all(words,ava_words);
    }
       static void scenario4()
    {
         List<String> words =new ArrayList<String>();
            List<String> ava_words =new ArrayList<String>();
          words.add("a");
         
          ava_words.add("c");
        ava_words.add("a");
        ava_words.add("b");
        ava_words.add("a");
       //   ava_words.add("love");
      //       ava_words.add("I");
            ava_words.add("me");
             
       tag_all(words,ava_words);
    }
        static void scenario5()
    {
         List<String> words =new ArrayList<String>();
            List<String> ava_words =new ArrayList<String>();
          words.add("a");
           words.add("b");
         
          ava_words.add("a");
        ava_words.add("b");
        ava_words.add("c");
        ava_words.add("d");
       //   ava_words.add("love");
      //       ava_words.add("I");
         //   ava_words.add("me");
             
       tag_all(words,ava_words);
    }
        static void tag(List<String>words,List<String>ava_words,int index)
        {
             List<Integer> value =new ArrayList<Integer>();
             List<String> set =new ArrayList<String>();
            //  boolean[] set=new boolean[256];
            int n=words.size();
            int m=ava_words.size();
          int min_len=Integer.MAX_VALUE;
          int len;
        int max=m;
           for(int i=0;i<n;i++)
           {
                min_len=Integer.MAX_VALUE;
                len=Integer.MAX_VALUE;
               for(int j=0;j<m;j++)
               {
                   
                    //   System.out.println(j);
                        if( words.get(i).contains(ava_words.get(j)))
                                    
                               //  set.contains(words.get(i));
                               //    set.add(words.get(i));
                                  value.add(j+index);
               }
               
           }
           Collections.sort(value);
          
          len=(value.get(n-1))-(value.get(0));
          if(len<min_len)
          {
            min_len=len;
     //      System.out.println( "len="+len);
          }
    //      System.out.println( "min_len="+min_len);
          System.out.println( "min_index="+value.get(0));
          System.out.println( "max_index="+value.get(n-1));      //return 0 so added 1
        
        }
        
        static void tag_all(List<String>words,List<String>ava_words)
        {
             int n=words.size();
            int m=ava_words.size();
            int min_len=0;
             List<Integer> value1 =new ArrayList<Integer>();
         //   List<String> all_set;
            for(int i=0;i<m;i++)
            {
                  List<String> all_set =new ArrayList<String>();
                for(int j=i;j<m;j++)
                {
                  
                    all_set.add(ava_words.get(j));
              //      System.out.println("before_allset="+all_set);
             //       System.out.println("before_words="+words);
                  //    System.out.println("............");
                   // if(equalLists(words,all_set))
                    if(all_set.containsAll(words))
                    {
                       System.out.println("all set="+all_set);
                        tag(words,all_set,i);
                       // value1.add(j);
                
             //    Collections.sort(value1);
       //   System.out.println( "min="+value1.get(1));
       //   System.out.println( "max="+value.get(n-1));
          //       System.out.println("index="+value1.get(j));
                    }
                }
                
            }
        }
    }

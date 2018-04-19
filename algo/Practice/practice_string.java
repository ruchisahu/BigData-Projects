
import java.util.*;
class practice_string
{
  public static void main(String args[])
  {  
StringBuilder sb=new StringBuilder("Hello ");  
sb.append("Java");
System.out.println(sb);
sb.insert(6,"my");
System.out.println(sb);
//sb.append("Java1");
//sb.append("Java2");
//sb.append("Java3");
sb.replace(1,3,"Java");  
System.out.println(sb);
sb.delete(1,3);  
System.out.println(sb);
sb.reverse();  
System.out.println(sb);
}  
}  
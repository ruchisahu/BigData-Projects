//1.1
class isUnique
{
    public static void main(String[] args)
    {
        
        String s="aaab";
        isUnique u=new isUnique();
        System.out.println(u.isUniq(s));
    }
     boolean isUniq(String s)
    {
        boolean[] a=new boolean[128];
        for(int i=0;i<s.length();i++)
        {
            int value=s.charAt(i);
            if(a[value])
                return false;
            else
                a[value]=true;
        }
        return true;
    }
}
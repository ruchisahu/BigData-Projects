class sor
{
    public static void main(String[] args)
    {
        int[] arr;
        arr=new int[]{8,6,7,5,4,3,2,1,5,9};
        int n=arr.length;
            
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n-1-i;j++)
            {
                if(arr[i]>arr[j])
                {
                    int t=arr[j];
                    arr[j]=arr[i];
                    arr[i]=t;
                }
            }
        }
         for(int j=0;j<n;j++)
            {
        System.out.println(arr[j]);
         }
    }
}
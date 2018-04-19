class sorting1
{
    public static void main(String[] args)
    {
        int[] arr;
        arr=new int[]{8,6,7,5,4,3,2,1,5,9};
        int n=arr.length;
            
        for(int i=0;i<n-1;i++)
        {
            for(int j=0;j<n-1-i;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    int t=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=t;
                }
            }
        }
         for(int j=0;j<n;j++)
            {
        System.out.println(arr[j]);
         }
    }
}
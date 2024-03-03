public class swapingzero
{
    public static void main(String[] args)
    {
        int arr[] = {1,0,1,0,5};
        int left=0;
        int right=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[left]!=0)
            {
                left++;
                right++;
            }
            if(arr[left]== 0 && arr[right]!=0)
            {
                int temp=arr[left];
                arr[right]=arr[left];
                arr[right]=temp;
                left++;
                right++;
            }
        }
    }
}

public class reversearray
{
    public static void main(String args[])
    {
        int arr[]={5,4,3,2,10,11,1};
        int left=0;
        int right=arr.length-1;
        System.out.println(right);
        while(left<=right)
        {
            for(int i=0;i<=arr.length/2;i++)
            {
                int temp =arr[left];
                arr[left]=arr[right];
                arr[right]=temp;
                left++;
                right--;
            }
        }
        
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}

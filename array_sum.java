public class array_sum 
{

    public static void main(String [] args)
    {
        int sum = 0;
        int [] arr = {5,5,10};

        for(int i = 0;i<arr.length;i++)
        {
            sum += arr[i];
        }
        System.out.println(sum);
    }
    
}

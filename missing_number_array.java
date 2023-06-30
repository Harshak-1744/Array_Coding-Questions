public class missing_number_array
{
    public static void main(String [] args)
    {
    int [] array = {1,2,3,4,6,7,8,9,10};// pre-defined array list

    int missing_num = finding_number(array);
    System.out.println(missing_num);
    }
private static int finding_number(int [] arr)
{
    int min = Integer.MAX_VALUE;
    int max = Integer.MIN_VALUE;
    int sum = 0;

    for(int n : arr)
    {
        min = Math.min(min, n);
        max = Math.max(max,n);
        sum += n;
    }
    int e_sum = (max*(max+1)/2 - min*(min-1)/2);

    return e_sum - sum;
}
}

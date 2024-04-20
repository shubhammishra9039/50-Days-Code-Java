public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50, 60};
        int key = 50, count =0;
        for (int i = 0; i < arr.length; i++)
        {
            if (arr[i]==key)
            {
                System.out.println("index is : "+i);
                count ++;
            }
        }
        if (count==0)
        {
            System.out.println("Index Not Found !!!!!");
        }
    }
}

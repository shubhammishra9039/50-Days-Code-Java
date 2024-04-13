public class Ex11 {
    public static void main(String[] args) {
        int [] arr={10,20,30,40,50,60,70,80,90};
        int Larhest=Integer.MIN_VALUE ,Smallest=Integer.MAX_VALUE;
        for(int i=0;i< args.length;i++)
        {
            if(arr[i]>Larhest)
            {
                Larhest=arr[i];
                System.out.println(Larhest);
            }
            else if (arr[i]<Smallest)
            {
                Smallest=arr[i];
            }

        }
        System.out.println("Largest Number Is = "+Larhest);
        System.out.println("Smallest Number Is ="+Smallest);

    }
}

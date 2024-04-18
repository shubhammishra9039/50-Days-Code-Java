public class LinnerSearch {
    public static int LinnerSearch (int number[],int key){
        for (int i=0;i<number.length;i++)
        {
            if (key==number[i])
            {
                return i;
            }

        }
        return -1;
    }
    public static void main(String[] args) {
        int number[]={10,20,30,60,80,99};
        int key=100;

        if(LinnerSearch(number,key)==-1)
        {
            System.out.println("Number Is Not Found");
        }
        else
        {
            System.out.println("Index of  "+LinnerSearch(number,key));
        }


    }
}

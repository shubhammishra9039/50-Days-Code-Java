public class CountVowConso {
    public static void main(String[] args) {
        String str="shrishti";
        int vowelCount=0;
        int consoCount=0;

        for( int i=0; i<=str.length()-1; i++){
          char ch=str.charAt(i);

            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
                 vowelCount++;
            }else{
                consoCount++;
            }
        }
        System.out.println("vowel is "+vowelCount);
        System.out.println("consonent is "+consoCount);
    }
}

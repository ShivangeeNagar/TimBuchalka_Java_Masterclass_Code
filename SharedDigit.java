public class SharedDigit {
    public static boolean hasSharedDigit(int num1, int num2){
        if (((num1<10) || (num1>99)) || ((num2<10) || (num2>99)))
            return false;


        int lastdigit1= num1%10;
        int firstdigit1=num1 /10;



        int lastdigit2= num2%10;
        int firstdigit2=num2 /10;


        if ((lastdigit1==lastdigit2)||(lastdigit1==firstdigit2) || (firstdigit1==lastdigit2)||(firstdigit1==firstdigit2))
            return true;
        else return false;


    }
}
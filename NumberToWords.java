public class NumberToWords {
    public static void numberToWords( int number){
        if ( number <0)
            System.out.println("Invalid Value");
        int temp1=reverse(number);
        while(temp1>=0){
            int lastdigit = temp1%10;
            switch(lastdigit){
                case 0:
                    System.out.println("Zero");
                    break;
                case 1:
                    System.out.println("One");
                    break;
                case 2:
                    System.out.println("Two");
                    break;
                case 3:
                    System.out.println("Three");
                    break;
                case 4:
                    System.out.println("Four");
                    break;
                case 5:
                    System.out.println("Five");
                    break;
                case 6:
                    System.out.println("Six");
                    break;
                case 7:
                    System.out.println("Seven");
                    break;
                case 8:
                    System.out.println("Eight");
                    break;
                case 9:
                    System.out.println("Nine");
                    break;
            }
            temp1=temp1/10;
        }
    }

    public static int reverse(int n) {
        int sum = 0;
        int temp=Math.abs(n);
        while (temp > 0) {
            int r = n%10;
            sum=(sum*10)+r;
            temp=temp/10;
        }
        if(n<0)
            return -sum;
        else
            return sum;

        }

        public static int getDigitCount(int num2){
        int count=0;
        while(num2>0){
            num2=num2/10;
            count++;
        }
        return count;
        }
    }






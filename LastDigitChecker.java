public class LastDigitChecker {
    public static boolean hasSameLastDigit( int x, int y, int z){
        if (((x<10)||(x>1000))||((y<10)||(y>1000))|| ((z<10)||(z>1000)))
            return false;

        int lastdigitx = x%10;
        int lastdigity = y%10;
        int lastdigitz = z%10;

        if ((lastdigitx == lastdigity) || (lastdigity == lastdigitz) || (lastdigitz == lastdigitx ))
            return true;
        else return false;

    }
}

public class paintAjob {
    public static int getBucketCount( double width, double height, double areaPerBucket, int extraBuckets){
        int numberofBuckets=0;
        if( width <=0 || height <=0 || areaPerBucket <=0 || extraBuckets<0 )
            return -1;
        numberofBuckets = (int)Math.ceil(((width*height)/areaPerBucket)- extraBuckets);
        return numberofBuckets;

    }
    public static int getBucketCount( double width, double height, double areaPerBucket){
        int numberofBuckets=0;
        if( width <=0 || height <=0 || areaPerBucket <=0)
            return -1;
        numberofBuckets = (int)Math.ceil((width*height)/areaPerBucket);
        return numberofBuckets;

    }

    public static int getBucketCount(double area, double areaPerBucket){
        int numberofBuckets=0;
        if( area<=0 || areaPerBucket <=0)
            return -1;
        numberofBuckets = (int)Math.ceil((area)/areaPerBucket);
        return numberofBuckets;

    }

}

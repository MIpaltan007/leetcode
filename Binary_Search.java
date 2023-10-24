import java.util.*;
public class Binary_Search {
    public static int binarysearch(int a[],int k){
        int result=-1;
        int s=0,e=a.length-1,mid=s+((e+s)/2);
        while(s<=e){
            if(a[mid]>k){
                e=mid-1;
            }
            else if(a[mid]<k){
                s=mid+1;
            }
            else if(a[mid]==k){
                mid=s+((e+s)/2);
                result=mid;
            }
        }
        if(result==-1){
            result=-1-s;
        }
        return result;
    }
}

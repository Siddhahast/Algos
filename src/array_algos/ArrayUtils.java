package array_algos;

/**
 * Created by siddhahastmohapatra on 20/11/16.
 */
public class ArrayUtils {

    public Element[] merge_elements_list(Element[] list1, Element[] list2){
        Element[] elements = new Element[list1.length+list2.length];
        int elemIndex1 = 0; int elemIndex2 = 0; int elemIndex3 = 0;

        while(elemIndex1<list1.length && elemIndex2<list2.length){
            if(list1[elemIndex1].compareTo(list2[elemIndex2])==1){
                elements[elemIndex3++] = list2[elemIndex2++];
            } else{
                elements[elemIndex3++] = list1[elemIndex1++];
            }
        }

        while(elemIndex1<list1.length){
            elements[elemIndex3++] = list1[elemIndex1++];
        }

        while(elemIndex2<list2.length){
            elements[elemIndex3++] = list2[elemIndex2++];
        }

        return elements;
    }

    public static int[] merge_sort(int[] elements){
        sort(elements, 0, elements.length-1);
        return elements;
    }

    public static void sort(int[] arr, int lo, int hi){
        if(hi>lo){
            int mid = (hi+lo)/2;
            sort(arr, lo, mid);
            sort(arr, mid+1, hi);
            merge(arr, lo, mid, hi);
        }
    }

    public static void merge(int[] arr, int lo, int mid, int high){
        int i, j = 0;
        int l = mid+1-lo;
        int r = high-mid;

        int[] L = new int[mid-lo+1];
        int[] R = new int[high-mid];
        for(i=0;i<l;i++){
            L[i] = arr[lo+i];
        }
        for(j=0;j<r;j++){
            R[j] = arr[mid+1+j];
        }
        i = 0; j = 0;
        while(i<l && j<r){
            if(L[i]<R[j]){
                arr[lo++] = L[i++];
            } else{
                arr[lo++] = R[j++];
            }
        }
        while(i<l){
            arr[lo++] = L[i++];
        }

        while(j<r){
            arr[lo++] = R[j++];
        }
    }

}

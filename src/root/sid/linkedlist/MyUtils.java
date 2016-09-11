package root.sid.linkedlist;
import java.util.Map;
import java.util.HashMap;
import java.util.stream.Stream;


/**
 * Created by siddhahast on 24/8/16.
 */
public class MyUtils {

    /**
     * API for minimum element of an array
     * @param arr
     * @return
     */
    public static int getMinElementArray(int[] arr){
        int i = 0;
        int temp = arr[i];
        while(i<arr.length){
            if(arr[i]<=temp){
                temp = arr[i];
            }
        }
        return temp;
    }

    public static int getIndexMinElementArray(int [] arr){
        int i =0;
        int temp = i;
        while(i<arr.length){
            if(arr[i]<=arr[temp]){
                temp = i;
            }
        }
        return temp;
    }

    /**
     * API to find the factorial of a number
     * @param n
     * @return
     */
    public static int factorial(int n){
        if(n==0 || n==1){
            return 1;
        }else{
            return n*factorial(n-1);
        }
    }

    public static int fibonacci(int n){
        return 0;
    }

    /**
     *
     * @param arr
     * @return
     */
    public static Map<String, Integer> getMaxMin(int[] arr){
        Map<String, Integer> map = new HashMap<String, Integer>();
        return printMaxMin(arr, 0, arr.length-1, map);
    }

    private static Map<String,Integer> printMaxMin(int[] arr, int i, int j, Map<String, Integer> map){
        if(i==j){
            map.put("min",arr[i]);
            map.put("max",arr[i]);
            return map;
        } else if(j-i==1){
            if(arr[i]<arr[j]){
                map.put("min",arr[i]);
                map.put("max",arr[j]);
            }else{
                map.put("min",arr[j]);
                map.put("max",arr[i]);
            }
            return map;
        }else{
            int mid = (i+j)/2;
            Map<String, Integer> left = new HashMap<String, Integer>();
            left = printMaxMin(arr, i, mid, left);
            Map<String, Integer> right = new HashMap<String, Integer>();
            right = printMaxMin(arr, mid+1, j, right);
            Map<String,Integer> m = new HashMap<String, Integer>();
            if(left.get("min")<right.get("min")){
                m.put("min",left.get("min"));
            }else{
                m.put("min",right.get("min"));
            }
            if(left.get("max")<right.get("max")){
                m.put("max", right.get("max"));
            }else{
                m.put("max", left.get("max"));
            }
            return m;
        }
    }

    /*
    API for searching the correct index for inserting an element into an array
    Using binary search to identify in a sorted array
     */
    public static int searchIndex(int arr[], int data){
        return searchIndex(arr, 0, arr.length-1, data);
    }

    private static int searchIndex(int arr[], int i, int j, int data){
        if(i==j){
            return i;
        }else{
            int mid = (i+j)/2;
            if(data < arr[mid]){
                return searchIndex(arr, i,mid, data);
            }else{
                return searchIndex(arr, mid+1, j, data);
            }
        }
    }


    public static int countRightRotate(int [] arr){
        if(arr.length==0){
            return 0;
        }
        return countRightRotate(arr, 0, arr.length-1);
    }

    private static int countRightRotate(int[] arr, int i, int j) {
        if (compare(arr[i], arr[j])) {
            return i;
        } else {
            int mid = (i + j) / 2;
            if (compare(arr[i], arr[mid])) {
                return countRightRotate(arr, i, mid);
            } else {
                return countRightRotate(arr, mid + 1, j);
            }
        }
    }

    public static boolean compare(int a, int b){
        if(a<b){
            return true;
        }else{
            return false;
        }
    }


    public static void merge_sort(int[] arr, int i, int j){
        if(i<j){
            int mid = (i+j)/2;
            merge_sort(arr, i, mid);
            merge_sort(arr, mid+1, j);
            merge(arr, i, mid, j);
        }
    }

    public static void merge(int[] arr, int low, int mid, int high){
        int lowPtr = low;
        int midPtr = mid+1;
        int highPtr = high;
        int work[] = new int[high-low];
        int w = low;
        while(lowPtr<=midPtr && midPtr<=highPtr){
            if(arr[lowPtr]< arr[midPtr]){
                work[w++] = arr[lowPtr++];
            }else{
                work[w++] = arr[midPtr++];
            }
        }
        while(lowPtr<=mid){
            work[w++] = arr[lowPtr++];
        }
        while(midPtr<highPtr){
            work[w++] = arr[midPtr++];
        }
        while(low<high){
            arr[low] = work[low];
            low++;
        }
    }

    public static void display_array(int[] arr){
        for(int i:arr){
            System.out.println(i);
        }
    }

    public static int[] merge(int[] a, int[] b){
        int[] c = new int[a.length+b.length];
        int cIndex = 0;
        int aIndex = 0;
        int bIndex = 0;
        while(aIndex<a.length && bIndex<b.length){
            if(a[aIndex]<b[bIndex]){
                c[cIndex++] = a[aIndex++];
            }else{
                c[cIndex++] = b[bIndex++];
            }
        }
        while(aIndex<a.length){
            c[cIndex++]=a[aIndex++];
        }
        while(bIndex<b.length){
            c[cIndex++]= b[bIndex++];
        }
        return c;
    }
}

public class MergeSorting2 {
    static void Display(int []arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    static void Merge(int []arr,int low,int mid,int high) {
        int n = mid - low + 1;
        int m = high - mid;
        int[] left = new int[n];   // creation of new array for left part
        int[] right = new int[m];   // creation of new array for right part
        for (int i = 0; i < n; i++) left[i] = arr[low+i];  // data feeding into left array
        for (int j = 0; j < m; j++) right[j] = arr[mid+1+j];  // data feeding into right array
        int i = 0;
        int j = 0;
        int k=low;
      //  Display(left);
      //  System.out.println();
      //  Display(right);
       // System.out.println();
       while (i < n && j < m) {
            if (left[i] < right[j]) {
                arr[k++] = left[i++];
            } else {
                arr[k++] = right[j++];
            }
        }
        while (i < n) {
            arr[k++] = left[i++];
        }
         while (j < m) {
           arr[k++] = right[j++];
        }
    }
    static void MergeSort(int []arr,int low,int high) {
    if(low>=high) return ;
    int mid=(low+high)/2;
    MergeSort(arr,low,mid);
    MergeSort(arr,mid+1,high);
    Merge(arr,low,mid,high);
    }
    public static void main(String[] args) {
    int []arr={10,90,5,80,20,45,25,30};
    int n= arr.length;
    Display(arr);
        System.out.println();
    MergeSort(arr,0, n-1);
        Merge(arr,0,(0+n-1)/2,n-1);
        Display(arr);
        System.out.println();
        }
    }
    

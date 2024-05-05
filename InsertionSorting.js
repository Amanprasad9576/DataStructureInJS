function InsertionSort(arr){
    let n=arr.length;
     for(let i=1;i<n;i++){
        let element=arr[i];
        let j;
        for(j=i-1;j>=0;j--){
            if(arr[j]>element){
                arr[j+1]=arr[j];  // shifting array element
            }else {
             break;
            }
        }
        arr[j+1]=element;
     }
}
const arr=[3,4,5,2,1];
console.log(arr);
InsertionSort(arr);
console.log(arr);

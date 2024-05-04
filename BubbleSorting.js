function bubbleSorting(arr){
    let n=arr.length;
    for(let i=0;i<n;i++){
    for(let j=0;j<n-i-1;j++){
        if(arr[j]>arr[j+1]){
        let temp=arr[j];
        arr[j]=arr[j+1];
        arr[j+1]=temp;
        }
    }
  }
}
const arr=[5,4,3,2,1];
bubbleSorting(arr);
console.log(arr)

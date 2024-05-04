function selectionSorting(arr){
let n=arr.length;
for(let i=0;i<n-1;i++){  //current element 
    let min_index=findMinimumElementInArray(arr,i)
  if(min_index!=i){
   let temp=arr[i];
   arr[i]=arr[min_index];
   arr[min_index]=temp;
 }
}
}
function findMinimumElementInArray(arr,i){
    let min_index_el=i;
    for(let j=i+1;j<arr.length;j++){
     if(arr[min_index_el]>arr[j]){
     min_index_el=j;
  }
}
return min_index_el;
}
 const arr=[5,4,3,2,1];
 console.log(arr);
 selectionSorting(arr);
 console.log(arr);

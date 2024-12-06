let arr1=[2,3,4,4,5];
let arr2=[8,9,10];
let arr3=[];

for(let i=0;i<arr1.length;i++){
    arr3[i]=arr1[i];

}

for(let i=0;i<arr2.length;i++){
   arr3[arr1.length+i]=arr2[i];
}
console.log(arr3);


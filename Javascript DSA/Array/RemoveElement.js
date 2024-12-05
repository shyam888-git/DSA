function removeElement(n,arr){
    let newArr=[];
    for(let i=0;i<arr.length;i++){
        if(arr[i]!==n){
            newArr.push(arr[i]);
        }
    }

    return newArr;

}
let rElement=20;
let data=[10,20,30,40,50,60];
console.log(removeElement(rElement,data))
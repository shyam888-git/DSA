function removeElement2(pos,arr){
    for(let i=pos;i<arr.length-1;i++){
        arr[i]=arr[i+1];

    }
    arr.length=arr.length-1;
    return arr;

}
let data=[20,30,40,50,80,90];
console.log(removeElement2(3,data))
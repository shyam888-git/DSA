function searchElement(ele, arr){
    let position=undefined;
 for(let i=0;i<arr.length;i++){
    if(arr[i]===ele){
        arr[i]=ele;
        position=i;
    }
    
 }
 return position;
}
let data=[20,30,40,50,60];
console.log(searchElement(30,data));
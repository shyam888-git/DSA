const name='Rawani Rana';
const arr=name.split('');
console.log(arr);
let hashMap={};

for(let i=0;i<arr.length;i++){
    if(!hashMap[arr[i]]){
        hashMap[arr[i]]=1;
    }
    else{
        hashMap[arr[i]]+=1;
    }
}
console.log(hashMap);
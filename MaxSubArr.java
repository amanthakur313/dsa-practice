class MaxSubArr{
public static void main(String[]args){
    int arr[] = {1,2,3};
       int maxSum = MaxsubArr(arr); 
       System.out.println(maxSum);
}
public static int MaxsubArr(int arr[]){
    int Max_Sub = arr[0];
    int Max_CurrSub = arr[0];
    for(int i = 1;i<arr.length;i++){
        Max_CurrSub = Math.max(arr[i],arr[i]+Max_CurrSub);
        Max_Sub = Math.max(Max_Sub,Max_CurrSub);
    }
    return Max_Sub;
}
}


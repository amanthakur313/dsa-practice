import java.util.Arrays;
class DuplicateArr{
public static void main(String[]args){
    int arr[] = {1,1,2,2,3,3};
    int temp[] =  new int[arr.length];
    int j =0;
    for(int i =0;i<arr.length-1;i++){
        if(arr[i]!=arr[i+1]){
            temp[j] = arr[i];
            j++;
        }
    }
    temp[j] = arr[arr.length-1];
System.out.println(Arrays.toString(temp));
}
}

// import java.util.Arrays;
// class DuplicateArr{
//     public static void main(String[]args){
// int arr[] = {1,1,1,2,2,2,3};
// int temp[] = new int[arr.length];
// int j =0;
// for(int i =0;i<arr.length-1;i++){
//     if(arr[i]!=arr[i+1]){
// temp[j] = arr[i];
// j++;
//     }
// }
// temp[j] = arr[arr.length-1];
// System.out.println(Arrays.toString(temp));
// for(j = 0;j<temp.length;j++){
//     System.out.print(temp[j]+" ");
// }
//     }
// }
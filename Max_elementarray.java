class Max_elementarray{
    public static void main(String args[]){
        int arr[] = {1,2,3,4,5,6,77,7};
        int max_ele = arr[0];
        for(int i = 0;i<arr.length;i++){
if(max_ele<arr[i]){
    max_ele = arr[i];
}
        }
        System.out.println("Maximu element "+max_ele);
    }
}
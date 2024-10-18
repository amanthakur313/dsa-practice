class Min_element{
    public static void main(String[]args){
        int arr[] = {33,2,3,1,6,7};
        int Min_ele = arr[0];
        for(int i = 0;i<arr.length;i++){
            if(Min_ele>arr[i]){
                Min_ele = arr[i];
            }
        }
        System.out.println("Minimum element "+Min_ele);
    }
}
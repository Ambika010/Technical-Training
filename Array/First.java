class First {
    static void show(int []a){
        a[0] = 100;
        for(int i : a){
            System.out.println(i);
        }
    }
    public static void main(String[] args) {
        // int arr[] = new int[3]; // initially all filled with 0 i.e. {0,0,0}
        // int[] arr = {10, 20, 30};
        int [] arr = new int[]{10, 20, 30}; // creates lazy memory at run time
        show(arr);
        System.out.println("After Show Call");
        for(int i : arr){
            System.out.println(i);
        }
    }
}
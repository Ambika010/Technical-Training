public class Two_Dimensional_Array {
    public static void main(String[] args) {
        // Array within Array
        int arr[][] = new int[3][3];
        int [][]arr1 = new int[3][3];
        int []arr2[] = new int[3][3];
        int arr3[][] = new int[][] {{2,10}, {5,1}, {8,9}};

        // in this case columns vary for each row
        int d[][] = new int[3][]; // 3 rows
        d[0] = new int[5]; //1st row --> 5 columns
        d[1] = new int[10]; //2nd row --> 10 columns
        d[2] = new int[15]; //3rd row --> 15 columns
        
        // Printing 
        /*
        for(int i=0; i<d.length; i++){ //rows
            for(int j=0; j<d[i].length; j++){ //columns
                System.out.print(d[i][j]+" ");
            }
            System.out.println();
        }
        */
        // another way of printing
        for(int a[]:d){
            for(int b:a){
                System.out.print(b+" ");
            }
            System.out.println();
        }
    }
}

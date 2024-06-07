import java.util.Scanner;

class ArrayOperations {
    int arr[];
    int size;
    // capacity - how many total elements array can store
    // size - How many elements currently it has
    ArrayOperations(int capacity){
        arr = new int[capacity];
        size = 0;
    }
    // CRUD
    void insert(int position, int element){
        // Check the size does not cross the array capacity
        if(size == arr.length){
            System.out.println("Array is full, can't insert..");
            return;
        }
        // otherwise shift the elements till reach the last element, starting from the position
        int currentindex = position - 1;
        for(int i = size-1; i>=currentindex; i--){
            arr[i+1] = arr[i];
        }
        arr[currentindex] = element;
        size++; // how many elements i have

    }
    int search(int element){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == element){
                return i;
            }
        }
        return -1;
    }
    void remove(int element){
        int index = search(element);
        if(index == -1){
            System.out.println("Element not exist, can't remove");
            return;
        }
        for(int i=index; i<size-1; i++){
            arr[i] = arr[i+1];
        }
        arr[size-1]=0;
        size--;
    }
    void update(int element, int updatedValue){
        int index = search(element);
        if(index == -1){
            System.out.println("Element not exist, can't update");
            return;
        }
        arr[index] = updatedValue;
        System.out.println("Updated....");
    }
    void print(){
        for(int element : arr){
            System.out.println(element);
        }
    }
}
public class ArrayOperationsDemo {
    public static void main(String[] args) {
        int capacity = 10;
        ArrayOperations obj = new ArrayOperations(capacity);
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("1. Insertion");
            System.out.println("2. Remove");
            System.out.println("3. Update");
            System.out.println("4. Search");
            System.out.println("5. Print");
            System.out.println("6. Exit");
            System.out.println("Enter the Choice : ");
            int choice = sc.nextInt();
            switch(choice){
                case 1:
                    obj.insert(1, 100);
                    obj.insert(2, 200);
                    obj.insert(1, 900);
                    obj.insert(1, 1000);
                    break;
                case 2:
                    obj.remove(900);
                    break;
                case 3:
                    obj.update(1000, 2000);
                    break;
                case 4:
                    System.out.println(obj.search(1000)==-1?"Not Found":"Found");
                    break;
                case 5:
                    obj.print();
                    break;
                case 6:return; // System.exit(0);
            }
        }
    }
}

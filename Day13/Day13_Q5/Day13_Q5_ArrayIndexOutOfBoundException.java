package Day13_Q5;
class ArrayIndexOutOfBoundException {

    public static void main(String[] args) {

        int [] arr = new int[] {4,3,4,5,3};
//Trying to access an element with invalid index range
        for(int i=0;i<=arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
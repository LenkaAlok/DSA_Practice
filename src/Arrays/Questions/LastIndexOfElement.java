package Arrays.Questions;

public class LastIndexOfElement {
    public static void main(String[] args) {
        int[] arr = {1, 2, 9, 3, 9, 4, 9, 6, 7, 8};
        int target = 9;
        int lastindex=-1;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==target){
                lastindex=i;
            }
        }
        System.out.println("Last index of " + target + " is in index of positionm = " + lastindex);
    }
}

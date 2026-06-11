package Arrays.Questions;

public class MaximumoccuredElement {
    public static void main(String[] args) {
        int[] arr = {1, 2, 1, 3, 1,2,4, 4};
        int maxElement=arr[0];
        int minCount = arr.length;

        for (int i=0;i<arr.length;i++){
            int count=0;
            for (int j=0;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    count ++;
                }
            }
            if(count < minCount){
                minCount=count;
                maxElement=arr[i];
            }
        }
        System.out.println(maxElement + " -> " + minCount);
    }
}

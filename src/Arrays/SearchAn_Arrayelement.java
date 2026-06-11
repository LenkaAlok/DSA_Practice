package Arrays;

public class SearchAn_Arrayelement {
    public static void main(String[] args) {
        int arr[]={1,5,7,9,11,5};
int target=0;
boolean found=false;
for (int i=0;i<arr.length;i++){
    if(arr[i]==target){
        found=true;
        System.out.println("Element present at index :"+i);
        break;
    }
}

if(!found){
    System.out.println("Element not present");
}
    }
}

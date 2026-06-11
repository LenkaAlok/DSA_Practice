package Arrays;

    public class RepeatedElement {

        public static void main(String[] args) {

            int arr[] = {1,1,2,3,4,5,2,3,5,6,7};

            for(int i=0; i<arr.length; i++){

                for(int j=i+1; j<arr.length; j++){

                  if(arr[i]==arr[j]){

                        System.out.println(arr[i]); // repeated element
                        break; // avoid multiple prints for same i
                    }
                }
            }
        }
    }



package Arrays;

public class  ArrayOther_Datatypes {
    public static void main(String[] args) {
//        double []arr=new double[7];
//        for (int i=0;i<arr.length;i++){
//            System.out.print(arr[i]+" ");//default value=0.0 0.0 0.0 0.0 0.0 0.0 0.0
//        }
        char []arr=new char[7];
        for (int i=0;i<arr.length;i++){
          //  System.out.print(arr[i]+" ");//default value=0 0 0 0 0 0
        }
        char ch='\0';
        System.out.println((int)ch);//askie value=0
        int x=0;
        System.out.println((char)x);//null character
        String []str={"Alok","Deepak","Mami"};
        for (int i=0;i<str.length;i++){
            System.out.print(str[i]+" ");
        }
    }
}

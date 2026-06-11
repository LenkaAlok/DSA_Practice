package collections;

public class Merge2_Sorted_Array {
    public static void main(String[] args) {
int a[]={2,5,6,9,20};
int b[]={1,3,4,5,7,8};
int c[]=new int[a.length+b.length];
        for (int res: c){
            System.out.print(res+" ");
        }
        System.out.println();
merge(c,a,b);

for (int res: c){
    System.out.print(res+" ");
}

    }
    public static void merge(int c[],int a[],int b[]){
        int i=0,j=0,k=0;
        while (i<a.length && j<b.length){
            if(a[i]<b[j]){
                c[k]=a[i];
                i++;
                k++;
            }
            else {
                c[k]=b[j];
                j++;
                k++;
            }
            if(i==a.length){// a array khatam -> b ke  bache hue element lo
                while (j<b.length){
                    c[k]=b[j];
                    j++;
                    k++;
                }
            }
          if(j==b.length){
                while (i<a.length){
                    c[k]=a[i];
                    i++;
                    k++;
                }
            }
        }
    }

}

public class Selectionsort {
    static void selectionsort(int arr[]){
        int n=arr.length;
        for(int i=0;i<n;i++){
            int minele=arr[i];
            int minind=i;
            for(int j=i+1;j<n;j++){
                if(minele>arr[j]){
                    minele=arr[j];
                    minind=j;
                }
            }if(i!=minind){
                 int temp = arr[i];
                arr[i] = arr[minind];
                arr[minind] = temp;
            }
        }
    }
    public static void main(String[] args) {
        int arr[]={60,-3,2,0,3,1,56};
        selectionsort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

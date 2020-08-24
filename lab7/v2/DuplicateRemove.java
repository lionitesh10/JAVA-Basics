class DuplicateRemove{  
    static void bubbleSort(int arr[]){ 
        int n=arr.length; 
        for (int i=0;i<n-1;i++) 
            for (int j=0;j<n-i-1;j++) 
                if (arr[j]>arr[j+1]) { 
                    int temp=arr[j]; 
                    arr[j]=arr[j+1]; 
                    arr[j+1]=temp; 
                } 
    }
    static int remove(int arr[], int n){    
        int[] temp=new int[n];  
        int j=0;  
        for(int i=0;i<n-1;i++){  
            if (arr[i]!=arr[i+1]){  
                temp[j++]=arr[i];  
            }  
         }  
        temp[j++]=arr[n-1];       
        for(int i=0;i<j;i++){  
            arr[i]=temp[i];  
        }  
        return j;  
    }
    public static void main (String[] args) {  
        int arr[]={1,1,2,3,4,5,5,4,5,3}; 
        for(int i:arr){
            System.out.print(i+" ");
        }  
        bubbleSort(arr);
        System.out.println("");
        int length=remove(arr,arr.length);   
        for(int i=0;i<length;i++)  
           System.out.print(arr[i]+" ");  
    }  
}
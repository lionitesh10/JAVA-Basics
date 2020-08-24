class Frequency{
 	public static void main(String[] args) {  
        int arr[]={1,2,2,3,3,3,4,4,4,4,5};    
        int fr[]=new int[arr.length];  
        int flag=-1;  
        for(int i=0;i<arr.length;i++){  
            int count=1;  
            for(int j=i+1;j<arr.length;j++){  
                if(arr[i]==arr[j]){  
                    count++;  
                    fr[j]=flag;  
                }  
            }  
            if(fr[i]!=flag)  
                fr[i]=count;  
        }    
        System.out.println("E | F");  
        for(int i=0;i<fr.length;i++){  
            if(fr[i]!=flag)  
                System.out.println(arr[i]+ " | "+fr[i]);  
        }  
    }
}
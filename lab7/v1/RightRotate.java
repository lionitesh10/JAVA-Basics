class RightRotate{
	public static void main(String[] args) {     
        int arr[]={1, 2, 3, 4, 5};     
        System.out.println("Array: ");    
        for(int i=0;i<arr.length;i++) {     
            System.out.print(arr[i]+" ");     
        }  
        int j,last;      
        last=arr[arr.length-1];    
        for(j=arr.length-1;j>0;j--){        
             arr[j]=arr[j-1];    
        }      
        arr[0]=last;      
        System.out.println("\nArray after right rotation by 1 : ");    
        for(int i=0;i<arr.length;i++){    
            System.out.print(arr[i]+" ");    
        }
	}
}

/*
        for(int i = 0; i < n; i++){    
            int j, last;       
            last = arr[arr.length-1];       
            for(j = arr.length-1; j > 0; j--){     
                arr[j] = arr[j-1];    
            }   
            arr[0] = last;    
        }
*/
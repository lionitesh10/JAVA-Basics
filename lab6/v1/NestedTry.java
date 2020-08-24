class NestedTry { 
    public static void main(String args[]){  
        try{ 
            int arr[]={1,2,3,4,5}; 
            System.out.println(arr[4]); 
            try{  
                int x=arr[0]/0; 
            }catch(ArithmeticException e){ 
                System.out.println(e.getMessage()); 
            } 
        }catch(ArrayIndexOutOfBoundsException e){ 
            System.out.println(e.getMessage());
        } 
    } 
}
class OddEvenFrequency{    
    public static void main(String[] args) {    
        int ocount=0,ecount=0;    
        int mat[][] = {{1,2,3},{4,5,6},{7,8,9}};     
        for(int i=0;i<3;i++){    
            for(int j=0;j<3;j++){    
              if(mat[i][j]%2==0)    
                ecount++;    
              else    
                ocount++;    
            }    
        }    
        System.out.println("Frequency of Odd numbers : "+ocount+" Even numbers : "+ecount);    
    }    
}    
class RowColumnSum{    
    public static void main(String[] args){
        int mat[][]={{1,2,3},{4,5,6},{7,8,9}};        
        int rsum,csum;      
        for(int i=0;i<3;i++){   
            rsum=0;     
            for(int j=0;j<3;j++){    
              rsum=rsum+mat[i][j];    
            }    
            System.out.println("Sum of "+(i+1)+" row: "+rsum);    
        }  
        for(int i=0;i<3;i++){ 
            csum=0;       
            for(int j=0;j<3;j++){    
              csum=csum+mat[j][i];    
            }    
            System.out.println("Sum of "+(i+1)+" column: "+csum);    
        }    
    }    
}    
class SparseMatrix{    
    public static void main(String[] args) {    
        int mat[][]={{1,0,0},{0,2,0},{0,0,3}};   
        int count=0;        
        for(int i=0;i<3;i++){    
            for(int j=0;j<3;j++){    
                if(mat[i][j]==0)    
                    count++;    
            }    
        }        
        if(count>(9/2))    
            System.out.println("Matrix is sparse matrix");    
        else    
            System.out.println("Not a sparse matrix");    
    }    
}    
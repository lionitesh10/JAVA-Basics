class EqualMatrix{    
    public static void main(String[] args){
        int mat1[][]={{1,2,3},{4,5,6},{7,8,9}};       
        int mat2[][]={{1,2,3},{4,5,6},{7,8,9}};    
        int row1,col1,row2,col2;    
        boolean flag=true;           
        row1=mat1.length;    
        col1=mat1[0].length;    
        row2=mat2.length;    
        col2=mat2[0].length;      
        if(row1!=row2 || col1!=col2){    
            System.out.println("Matrices are not equal");    
        }else {    
            for(int i=0;i<row1;i++){    
                for(int j=0;j<col1;j++){    
                  if(mat1[i][j]!=mat2[i][j]){    
                      flag = false;    
                      break;    
                  }    
                }    
            }    
            if(flag)    
                System.out.println("Matrices are equal");    
            else    
                System.out.println("Matrices are not equal");    
        }    
    }    
}
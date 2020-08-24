class IdentityMatrix{    
    public static void main(String[] args) {    
        boolean flag = true;        
        int mat[][] ={{1, 0, 0},{0, 1, 0},{0, 0, 1}};         
        for(int i=0;i<3;i++){    
            for(int j=0;j<3;j++){    
              if(i==j && mat[i][j]!=1){    
                 flag=false;    
                  break;    
                }    
              if(i!=j && mat[i][j]!=0){    
                  flag=false;    
                  break;    
                }    
            } 
          }       
          if(flag)    
              System.out.println("Matrix is identity matrix");    
          else    
              System.out.println("Not identity matrix");    
    }    
}    

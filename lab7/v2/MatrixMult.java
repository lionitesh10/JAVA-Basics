class MatrixMult{
	public static void main(String[] args) {
		int mat1[][]={{1,2,3},{4,5,6},{7,8,9}};
		int mat2[][]={{7,8,9},{4,5,6},{1,2,3}};
		int mat3[][]=new int[3][3];
		for(int i=0;i<3;i++){
			for(int j=0;j<3;j++){
				mat3[i][j]=0;      
				for(int k=0;k<3;k++){      
					mat3[i][j]+=mat1[i][k]*mat2[k][j];      
				}
			}
		}
		System.out.println("Product = ");
		for(int i=0;i<3;i++){
			for(int j=0;j<3;j++){
				System.out.print(mat3[i][j]+" ");
			}
			System.out.println();
		}
	}
}
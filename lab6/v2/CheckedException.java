import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
class CheckedException{
	static void openFile() throws FileNotFoundException {
    	File file = new File("my_file.txt");
    	FileInputStream stream = new FileInputStream(file);
	}
	public static void main(String[] args) {
		try{
			openFile();
		}catch(FileNotFoundException e){
			System.out.println("File Not Found Exception");
			System.out.println(e);
		}
	}
}
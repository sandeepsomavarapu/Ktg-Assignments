import java.io.File;
import java.io.IOException;
class FileEx
{
public static void main(String []args)throws IOException
{
	File f=new File("notes.txt");
	System.out.println(f.exists());//false
	System.out.println(f.createNewFile());//false
	//System.out.println(f.mkdir());//true
	System.out.println(f.setReadOnly());//
	System.out.println(f.exists());//true
	System.out.println(f.isDirectory());//true
	System.out.println(f.isFile());//false
}
}







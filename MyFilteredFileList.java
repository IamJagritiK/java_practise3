import java.io.File;
import java.io.FilenameFilter;
import java.io.FileInputStream;


public class MyFilteredFileList {

	public static void main(String[] args) {
		String dir = "/home/cgi/Desktop/java_practise3";
		String extension = ".txt";
        findFiles(dir, extension);
        
        File file = new File("/home/cgi/Desktop/java_practise3/mahesh.txt");
       
        readContentIntoByteArray(file);
	}

	private static void findFiles(String dir, String extension) {
		File file = new File(dir);
		if (!file.exists())
			System.out.println(dir + " Directory doesn't exists");
		File[] listFiles = file.listFiles(new MyFileNameFilter(extension));
		// File[] listFiles = file.listFiles((d, s) -> {
		// return s.toLowerCase().endsWith(extension);
		// });

		if (listFiles.length == 0) {
			System.out.println(dir + "doesn't have any file with extension " + extension);
		} else {
			for (File f: listFiles)
				System.out.println("File: " + dir + File.separator + f.getName());
		}
    }
    
    
    
    private static byte[] readContentIntoByteArray(File file)
    {
       FileInputStream fileInputStream = null;
       byte[] bFile = new byte[(int) file.length()];
       try
       {
          //convert file into array of bytes
          fileInputStream = new FileInputStream(file);
          fileInputStream.read(bFile);
          fileInputStream.close();
          for (int i = 0; i < bFile.length; i++)
          {
             System.out.print((char) bFile[i]);
          }
       }
       catch (Exception e)
       {
          e.printStackTrace();
       }
       return bFile;
    }
 
    






	// FileNameFilter implementation
	public static class MyFileNameFilter implements FilenameFilter {

		private String extension;

		public MyFileNameFilter(String extension) {
			this.extension = extension.toLowerCase();
		}

		@Override
		public boolean accept(File dir, String name) {
			return name.toLowerCase().endsWith(extension);
		}

	}

}
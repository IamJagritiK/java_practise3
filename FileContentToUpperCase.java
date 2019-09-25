  import java.io.*;
       import java.util.*;
       class FileContentToUpperCase{

  public static void main (String[] args) {
     try
    {
     FileReader fr = new FileReader("textfile.java");
     BufferedReader br = new BufferedReader(fr);
    // PrintWriter out = (new PrintWriter(new FileWriter("mahesh.java")));
     String s="";
   while((s = br.readLine()) != null) 
   {
      System.out.println(s.toUpperCase()+"\n"); //for writing to other file  out.write(s.toUpperCase()+"\n");
    }
  out.close();
  }
    catch(Exception e)
    {
     e.printStackTrace();
    }
   }

  }
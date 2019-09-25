import java.io.*;
import java.util.*;
class WordCount
{
  public static void main(String args[]) throws Exception
  {
   Console con = System.console();
   String str;
   int i=0;
 
   HashMap map = new HashMap();
   HashSet set = new HashSet();
   System.out.println("enter the file name : ");
  
   str = con.readLine();

   FileInputStream fis = new FileInputStream(str);
  
  int ch;
  String string=new String();
  while((ch=fis.read())!=-1)
  {
  string+=(char)ch+"";
  }
  StringTokenizer st = new StringTokenizer(string);
    while(st.hasMoreTokens())
    {
     String s =st.nextToken();
  map.put(i+"",s);
    set.add(s);
     i++;
   }
   Iterator iter = set.iterator();
   System.out.println("occurance of words like this ");
   while(iter.hasNext())
   {
    String str1;
    int count=0;
   
    str1=(String)iter.next();
  
 
     for(int j=0; j<i ; j++)
     {
      String str2;
       str2=(String)map.get(j+"");
      if(str1.equals(str2))
       count++;
     }

   System.out.printf( "%10s %10d\n",str1,count);
   }
   System.out.println("total no. of words : "+i);
  }
}

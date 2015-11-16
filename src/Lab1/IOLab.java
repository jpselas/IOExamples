/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab1;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
/**
 *
 * @author John
 */
public class IOLab {
    
    public static void main(String[] args)throws IOException{
        
        
        
        File data = new File("C:"+File.separatorChar + "temp" + File.separatorChar 
                        + "lab1.txt");
//        File data = new File("C:\\temp\\lab1.txt");
        
        BufferedReader in = null;
//        try {
//	   in = new BufferedReader(new FileReader(data));
//	   String line = in.readLine();
//	   while(line != null){
//		  System.out.println(line);
//		  line = in.readLine();  // strips out any carriage return chars
//	   }
//	 
//        } catch(IOException ioe) {
//            System.out.println("Houston, we have a problem! reading this file");
//        } finally {
//            try {
//                in.close();
//            } catch(Exception e) {
//                
//            }
//        }
//        System.out.println(" ");
//        System.out.println("After Writer ");
//        System.out.println(" ");
//         boolean append = true;
//         PrintWriter out = new PrintWriter(
//						new BufferedWriter(
//						new FileWriter(data, append)));
//        
//         out.println(" ");
//         out.println("Bob Smith");
//         out.println("4353 W. Octoberville Rd");
//         out.println("Design, WI 63452");
//         out.println(" ");
//         out.close();
//         
//         System.out.println("Wrote file to: " + data.getAbsolutePath());
//         
//         
//          in = null;
//        try {
//	   in = new BufferedReader(new FileReader(data));
//	   String line = in.readLine();
//	   while(line != null){
//		  System.out.println(line);
//		  line = in.readLine();  // strips out any carriage return chars
//	   }
//	 
//        } catch(IOException ioe) {
//            System.out.println("Houston, we have a problem! reading this file");
//        } finally {
//            try {
//                in.close();
//            } catch(Exception e) {
//                
//            }
//        }
         
        List<String> stuff = new ArrayList<>();
        
         in = null;
        try {
	   in = new BufferedReader(new FileReader(data));
	   String line = in.readLine();
	   while(line != null){
		  stuff.add(line);
		  line = in.readLine();
                  // strips out any carriage return chars
	   }
	 
        } catch(IOException ioe) {
            System.out.println("Houston, we have a problem! reading this file");
        } finally {
            try {
                in.close();
            } catch(Exception e) {
                
            }
        }
        System.out.println("List: ");
        System.out.println(" ");
        for(String s : stuff){
            System.out.println(s);
            
        }
        int lineSpace = 2;
        int newLineSpace;
        int wordSpace;
        if(lineSpace == 0){
            newLineSpace = lineSpace;
            wordSpace= lineSpace +2;
            wordSpace= newLineSpace +2;
        }else{
            newLineSpace = lineSpace +3;
            wordSpace= newLineSpace +2;
        }
        
        
       
        String [] moreStuff = stuff.get(wordSpace).split(" ");
//        for(int i=0;i<moreStuff.length;i++){
//            System.out.println(moreStuff[i]);
//            
//        }
        
        System.out.println(stuff.get(newLineSpace) + " state: " + moreStuff[wordSpace-newLineSpace-1]);
        
        
//    } else
//	     System.out.println("File not found: test.txt");
    } // end main
}
        
        
        
        
        
    
    
    
    


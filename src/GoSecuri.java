import java.nio.file.*;
import java.util.List;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.lang.String;
import java.lang.reflect.Array;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;

public class GoSecuri {
	public static void main(String args) throws IOException {
		
		 String link;
		 
		FileReader staff = new FileReader("C:\\Users\\Aurélien\\eclipse-workspace\\Go-Securi\\staff.txt");
        BufferedReader br = new BufferedReader(staff);
        while ((link = br.readLine()) != null) {
        	System.out.println(link);
                }
       
        System.out.println(link);
   
         
	}

}

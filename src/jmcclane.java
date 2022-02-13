import java.nio.file.*;
import java.util.List;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.lang.String;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;

public class jmcclane {
    public static void main(String[] args) throws IOException {
        
        String line;
        
        // Creation Hash Map
        
            HashMap<String, String> materiel = new HashMap<String, String>();
            
            // Lecture fichier liste.txt
            
            FileReader liste = new FileReader("C:\\Users\\Aurélien\\eclipse-workspace\\Go-Securi\\liste.txt");
            BufferedReader br = new BufferedReader(liste);
              while ((line=br.readLine())!=null){
                 
                                   
                  String splitArray[] = line.split("\t");
                 
                     
                  materiel.put(splitArray[0], splitArray[1]);
                                  
        }
        
              // Creation HashMap
              
        HashMap<String, String> perso = new HashMap<String, String>();        
        
        // Lecture fichier cberthier.txt ADAPTER 
        
            FileReader jmcclane = new FileReader("C:\\Users\\Aurélien\\eclipse-workspace\\Go-Securi\\jmcclane.txt");
            BufferedReader br2 = new BufferedReader(jmcclane);
                for (int line2 = 0; line2<3; line2++); {
            
        perso.put("Nom", br2.readLine());
        perso.put("Prenom", br2.readLine());
        perso.put("Mission", br2.readLine());
         
          
        }
          System.out.println(perso);
        
          ArrayList<String> persoMateriel = new ArrayList<String>();
          while ((line=br2.readLine())!=null){
            
              if   (materiel.containsKey(line)) {
                persoMateriel.add(materiel.get(line));
                
            }
          }      
            System.out.println(persoMateriel);
            
            String persoHtml = new String();
            String materielstr = String.join("<br>", persoMateriel);
            
            // Lecture fichier template HTML
            
            FileReader persoTemplate = new FileReader("C:\\Users\\Aurélien\\eclipse-workspace\\Go-Securi\\persoTemplate.html");
            BufferedReader br3 = new BufferedReader(persoTemplate);
             while ((line=br3.readLine())!=null){
                persoHtml += line; 
             }          
             System.out.println(persoHtml);
             persoHtml = persoHtml.replace("var_nom", perso.get("Nom"));
             persoHtml = persoHtml.replace("var_prenom", perso.get("Prenom"));
             persoHtml = persoHtml.replace("var_mission", perso.get("Mission"));
             persoHtml = persoHtml.replace("var_materiel", materielstr);
             persoHtml = persoHtml.replace("var_carte", "C:\\Users\\Aurélien\\eclipse-workspace\\Go-Securi\\jmcclane.jpg");
             
             System.out.println(persoHtml);
             
             //Creation HTML CHANGER NOM
             
             Path pathjmcclaneHtml = Paths.get("C:\\Users\\Aurélien\\eclipse-workspace\\Go-Securi\\jmcclane.html");
             BufferedWriter br4 = Files.newBufferedWriter(pathjmcclaneHtml);
             br4.write(persoHtml);
             br4.close();
             
            
             }
             
    }
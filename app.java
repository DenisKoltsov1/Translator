import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.File;

import javax.print.DocFlavor.STRING;
class  OpenFile{

    private String filename;
    private String file;
    List<String> strings = new ArrayList<String>();
    //Функция устанавливающая   имя файла
    public  void   setFilename(String filename)
    {
        this.file=filename;
    }
    //Функция взятия имени
    public  String   getFilename()
    {
        System.out.println(filename);
        return  filename;
    }
    public    void  ReadFile(String filename)
    {    
        try {

            Scanner sc = new Scanner(new File("my.txt"));
            //Scanner sc = new Scanner(new File(filename));
            while (sc.hasNextLine()) {
                System.out.println(sc.nextLine());
                String line = sc.nextLine();
                strings.add(line);   
                
                System.out.println(line);
            }
            sc.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

       

    public class Main  {    
        public static void main(String[] args) {
        OpenFile file = new OpenFile();
        file.setFilename("my.txt");
        String  F=file.getFilename();
        System.out.println(F);
        file.getFilename();
        String failenames=file.getFilename();
        file.ReadFile(failenames);        }
    }
}
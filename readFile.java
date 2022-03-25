import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

class readFile {
  
    public static void main(String[] args)
    {

        try {
  

            FileReader fr = new FileReader("dummyin.txt");
  

            FileWriter fw = new FileWriter("dummyout.txt");

            String str = "";
  
            int i;
  

            while ((i = fr.read()) != -1) {
  

                str += (char)i;
            }

            System.out.println(str);
  
            fw.write(str);
  
            fr.close();
            fw.close();

            System.out.println(
                "File reading and writing both done");
        }
  
        catch (IOException e) {
  
  
            System.out.println("IOException");
        }
    }
}

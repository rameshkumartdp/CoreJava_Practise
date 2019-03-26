package streams;

import java.io.*;

/**
 * Created by rames on 26-03-2019.
 */
public class FileRead {
    public static void main(String[] args)throws FileNotFoundException, IOException {
        readFile();
    }

    public static void readFile() throws FileNotFoundException, IOException {
        String path = "C:\\Users\\rames\\Desktop\\Test\\sample.html";
        BufferedReader reader = null;
        BufferedWriter writer = null;
        try {
            File destination = new File("C:\\Users\\rames\\Desktop\\Test\\output.html");
            File file = new File(path);
            reader = new BufferedReader(new FileReader(file));
            writer = new BufferedWriter(new FileWriter(destination));
            String data;
            while((data=reader.readLine())!=null ){
                writer.write(data);
                System.out.println(data);
            }

            System.out.println(destination.getPath()+" "+destination.getName());

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            writer.close();
            reader.close();
        }
    }
}

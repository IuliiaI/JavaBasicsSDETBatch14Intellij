package class28Java;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class FileDemo1 {
    public static void main(String[] args) throws IOException {


        String path="Data/config.properties";//location of the file

        FileInputStream fileInputStream=new FileInputStream(path);//navigating to the file

        var properties=new Properties();//that special software which helps us read data from that file,open the file

        properties.load(fileInputStream);//loads all the data from the file inside(Memory)

        System.out.println(properties.getProperty("URL"));
        System.out.println(properties.getProperty("password"));

        fileInputStream.close(); //closes the file


    }
}

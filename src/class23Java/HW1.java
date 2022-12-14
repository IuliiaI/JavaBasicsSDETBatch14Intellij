package class23Java;
public class HW1 {
    /*Create a class File that will have the following behaviors: open, edit, close.
     Edit and close are implemented method while open is an abstract. Create 3 subclasses:
     JavaFile, WordFile, PdfFile that will provide specific implementation of open behaviour:
     Example: to open .java file we need notepad++ or sublime text,
     to open .doc file we need Microsoft word to be installed etc   */
    public static void main(String[] args) {
        File[] files = {new JavaFile(), new WordFile(), new PdfFile()};
        for (File f : files) {
            f.open();
            f.edit();
            f.close();
        }
    }
}
abstract class File{
        abstract void open();
        void edit(){
        System.out.println("To edit file you use edit file option");
        }
        void close(){
            System.out.println("To close file you need click on X button");
        }
}
class JavaFile extends File{

    @Override
    void open() {
        System.out.println("To open .java file we need notepad++ or sublime text");
    }
}
class WordFile extends File{

    @Override
    void open() {
        System.out.println("To open .doc file we need Microsoft word to be installed");
    }
}
class PdfFile extends File{

    @Override
    void open() {
        System.out.println("To open .pdf files you need Acrobat Reader or Chrome Browser to be installed");
    }
}
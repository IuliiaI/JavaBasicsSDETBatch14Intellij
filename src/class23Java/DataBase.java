package class23Java;
public abstract class DataBase {
    abstract void openDatabase();
    abstract void readData();
    abstract void writeData();
    abstract void closeDatabase();
}
/*
hover over the error and click on the implement methods option
 */
class MicrosoftDataBase extends DataBase{

    @Override
    void openDatabase() {
        System.out.println("Opening the Microsoft Database");
    }

    @Override
    void readData() {
        System.out.println("Reading the data of Microsoft");
    }

    @Override
    void writeData() {
        System.out.println("Writing the data to MSDataBase");
    }

    @Override
    void closeDatabase() {
        System.out.println("Closing the Microsoft Database");
    }
}
class Oracle extends DataBase{

    @Override
    void openDatabase() {
        System.out.println("Opening the Oracle database");
    }

    @Override
    void readData() {
        System.out.println("Reading the data from Oracle database");
    }

    @Override
    void writeData() {
        System.out.println("Writing data for Oracle DataBase");
    }

    @Override
    void closeDatabase() {
        System.out.println("Closing the Oracle database");
    }
}






/*

abstract class Oracle extends DataBase{

    @Override
    void openDatabase() {

    }

    @Override
    void readData() {

    }
}
class Test extends Oracle{

    @Override
    void writeData() {

    }

    @Override
    void closeDatabase() {

    }
}*/
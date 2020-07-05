package SDA.allan.Adapter;

public class Adapter {
    public static void main(String[] args) {
        Database database = new DatabaseToMinipadAdapter();
        //Database databaes2 = new MiniPadApplication(); this won't work, as this MiniPadApplication class is given by 3rd party company
        database.insert();
    }
}
interface Database {
    void insert();
    void delete();
    void update();
}
//This and Database interface are not compatible
class MiniPadApplication {
    //this is same logic as insert, but it's a different implementation
    public void saveObject() {
        System.out.println("Inserting records..");
    }
    public void deleteRecords() {
        System.out.println("Deleting records..");
    }
    public void updateRecords() {
        System.out.println("Updating records...");
    }
}
class DatabaseToMinipadAdapter extends MiniPadApplication implements Database {
    @Override
    public void insert() {
        saveObject();
    }
    @Override
    public void delete() {
        deleteRecords();
    }
    @Override
    public void update() {
        updateRecords();
    }
}

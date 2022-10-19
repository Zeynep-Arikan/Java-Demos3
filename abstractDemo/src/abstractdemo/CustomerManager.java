package abstractdemo;

public class CustomerManager {
    // strateji görevini görüyor
    //yani biz kullanırken hangi veri tabanı sistemini verirsek onun getDatası çalışır
    BaseDatabaseManager databaseManager;
    public void getCustomers(){
        databaseManager.getData();

                 
    }
    
}

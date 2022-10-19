/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractdemo;

/**
 *
 * @author CASPER
 */
public class AbstractDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CustomerManager customerManager = new CustomerManager();

        // bu sıkıntılı bir durum hata verir 
        //customerManager.getCustomers();
        customerManager.databaseManager = new OracleDatabaseManager();
        customerManager.getCustomers();
        customerManager.databaseManager= new MySqlDatbaseManager();
        customerManager.getCustomers();
    }

}

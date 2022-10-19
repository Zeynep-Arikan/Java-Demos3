/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

public class CustomerManager {
    private iCustomerDal customerDal;
    public CustomerManager(iCustomerDal customerDal){
        this.customerDal = customerDal;
    }
    public void add(){
    //iş kodları yazılır
        customerDal.add();
        // sistem sadece oraclede çalışır bağımlı olur yanlış kullanım
        //OracleCustomerDal oraclecustomerdal = new OracleCustomerDal();
    
    }
    
}

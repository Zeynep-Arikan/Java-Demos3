package interfaces;

public class Interfaces {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
     //böyle new olmaz
     // iCustomerDal customerDal = new iCustomerDal();
     
//        iCustomerDal cutomerdal = new OracleCustomerDal();
        CustomerManager customerManager = new CustomerManager(new OracleCustomerDal());
        customerManager.add();

    }

}

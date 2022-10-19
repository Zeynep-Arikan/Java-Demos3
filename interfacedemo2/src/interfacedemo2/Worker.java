package interfacedemo2;

// bizim çalışanımız
public class Worker implements Iworkable,IEatable,Ipayable {

    @Override
    public void work() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void eat() {
        throw new UnsupportedOperationException("Ymek."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void pay() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}

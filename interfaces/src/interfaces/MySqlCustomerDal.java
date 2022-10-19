/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

/**
 *
 * @author CASPER
 */
public class MySqlCustomerDal implements iCustomerDal, iRepository{

    @Override
    public void add() {
        System.out.println("My Sql eklendi"); //To change body of generated methods, choose Tools | Templates.
    }
    
}

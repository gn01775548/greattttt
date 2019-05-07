/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Users;

import Business.Abstract.User;
import Business.ProductDirectory;

/**
 *
 * @author harshalneelkamal
 */
public class Supplier extends User implements Comparable<Supplier>{
    
    private ProductDirectory prodDir;
    
    public Supplier(String password, String userName) {
        super(password, userName, "SUPPLIER");
        prodDir = new ProductDirectory();
    }

    public ProductDirectory getDirectory() {
        return prodDir;
    }

    public void setDirectory(ProductDirectory directory) {
        this.prodDir = directory;
    }

    @Override
    public int compareTo(Supplier s) {
        return s.getUserName().compareTo(this.getUserName());
    }

    @Override
    public String toString() {
        return getUserName(); //To change body of generated methods, choose Tools | Templates.
    }
    
    public boolean verify(String password){
        if(password.equals(getPassword()))
            return true;
        return false;
    }
    
}

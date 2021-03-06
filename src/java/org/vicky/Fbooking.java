
package org.kasim;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class Fbooking {

private String bname;
private String bemail;
private String bnumber;
private String bcomment;

    /**
     * @return the bname
     */
    public String getBname() {
        return bname;
    }

    /**
     * @param bname the bname to set
     */
    public void setBname(String bname) {
        this.bname = bname;
    }

    /**
     * @return the bemail
     */
    public String getBemail() {
        return bemail;
    }

    /**
     * @param bemail the bemail to set
     */
    public void setBemail(String bemail) {
        this.bemail = bemail;
    }

    /**
     * @return the bnumber
     */
    public String getBnumber() {
        return bnumber;
    }

    /**
     * @param bnumber the bnumber to set
     */
    public void setBnumber(String bnumber) {
        this.bnumber = bnumber;
    }

    /**
     * @return the bcomment
     */
    public String getBcomment() {
        return bcomment;
    }

    /**
     * @param bcomment the bcomment to set
     */
    public void setBcomment(String bcomment) {
        this.bcomment = bcomment;
    }
    
    
     public int store() throws ClassNotFoundException, SQLException{
        
        Class.forName("org.apache.derby.jdbc.ClientDriver");
         
        String url="jdbc:derby://localhost:1527/kk;create=true;user=kk;password=kk";
        Connection con=DriverManager.getConnection(url);

        PreparedStatement ps = con.prepareStatement("insert into finalbooking(bname,bemail,bnumber,bcomment)values (?,?,?,?)");
           
        ps.setString(1, bname);
        ps.setString(2, bemail);
        ps.setString(3, bnumber);
        ps.setString(4, bcomment);
    
        int a=ps.executeUpdate();
        
        if(a==1) {
            return a;
        }else {
            return a;
        }
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package perpustakaan;

import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Hendro
 */
public class koneksi {
    private static java.sql.Connection koneksi=null;
    public static java.sql.Connection buka_koneksi(){
        try {
            MysqlDataSource data=new MysqlDataSource();
            data.setDatabaseName("perpustakaan");
            data.setUser("root");
            data.setPassword("");
            koneksi=data.getConnection();
        }
        catch(SQLException e){
        JOptionPane.showMessageDialog(null,"Tidak Bisa Konek");
            System.out.println(e);
        }
        return koneksi;
}

public static void main(String[] args){

}
}
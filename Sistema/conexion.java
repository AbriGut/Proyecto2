package Sistema;
import java.sql.*;
import javax.swing.JOptionPane;

public class conexion {
    private Connection con=null;
    
    public Connection conexion(){
        
        try {
            Class.forName("org.gjt.mm.mysql.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/centrosalud","root","root");
            //System.out.println("conectado");
            //JOptionPane.showMessageDialog(null,"Conectado");
        
    }catch (ClassNotFoundException |SQLException e){
            System.out.println("Error");
    }  
        return con;
    }
    
    public void cerrarConexion (Connection con) {
        try {
            con.close();
        }catch (SQLException e){
            System.out.println("Error");
}
}
    public static void main(String[] args) {
        
    }

    PreparedStatement prepareStatement(String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

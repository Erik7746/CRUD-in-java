package Funciones;

import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class MostrarTabla {
    public void MostrarContTabla(JTable tb, ResultSet rs){
        
        DefaultTableModel modelo = new DefaultTableModel();
        
        modelo.addColumn("id_usuario");
        modelo.addColumn("Nombre");
        modelo.addColumn("ApellidoPaterno");
        modelo.addColumn("ApellidMaterno");
        modelo.addColumn("Ocupacion");
        modelo.addColumn("Correo");
        modelo.addColumn("Telefono");
        
        tb.setModel(modelo);
        
        //String consulta= "SELECT * FROM usuario";
        
        try {
         
            while (rs.next()){
                
                modelo.addRow(new Object[]{
                    rs.getString("id_usuario"),
                    rs.getString("nombre"),
                    rs.getString("apellidoPaterno"),
                    rs.getString("apellidoMaterno"),
                    rs.getString("ocupacion"),
                    rs.getString("correo"),
                    rs.getString("telefono")
                } );
                
            }
            
            System.out.println("[OK] Se mostro la tabla correctamente");
            
        } catch (Exception e) {
            System.out.println("[ERROR] No se pudo mostrar la tabla");
        }
    }
    
    public void MostrarContTabla(JTable tb){
        ConexionBD objConect = new ConexionBD();
        Usuario objER = new Usuario();
        
        DefaultTableModel modelo = new DefaultTableModel();
        
        modelo.addColumn("id_usuario");
        modelo.addColumn("Nombre");
        modelo.addColumn("ApellidoPaterno");
        modelo.addColumn("ApellidMaterno");
        modelo.addColumn("Ocupacion");
        modelo.addColumn("Correo");
        modelo.addColumn("Telefono");
        
        tb.setModel(modelo);
        
        String consulta= "SELECT * FROM usuario";
        
        try {
            Statement st = objConect.cn.createStatement();
            ResultSet rs = st.executeQuery(consulta);
            
            while (rs.next()){
                objER.setId_usuario(rs.getString("id_usuario"));
                objER.setNombre(rs.getString("nombre"));
                objER.setApellidoPaterno(rs.getString("apellidoPaterno"));
                objER.setApellidoMaterno(rs.getString("apellidoMaterno"));
                objER.setOcupacion(rs.getString("ocupacion"));
                objER.setCorreo(rs.getString("correo"));
                objER.setTelefono(rs.getString("telefono"));
                
                
                modelo.addRow(new Object[]{
                    objER.getId_usuario(),
                    objER.getNombre(),
                    objER.getApellidoPaterno(),
                    objER.getApellidoMaterno(),
                    objER.getOcupacion(),
                    objER.getCorreo(),
                    objER.getTelefono()
                } );
                
            }
            tb.setModel(modelo);
            System.out.println("[OK] Se mostro la tabla correctamente");
            
        } catch (Exception e) {
            System.out.println("[ERROR] No se pudo mostrar la tabla");
        }
    }
}

package Funciones;

import javax.swing.JTable;


public class BusquedaSQL {
    public void busquedaTb(String columna, String busqueda, JTable tabla){
        ConexionBD cdb = new ConexionBD();
        MostrarTabla tb = new MostrarTabla();
        String consulta = " SELECT * FROM usuario WHERE " + columna + " LIKE ? ";
        
        try {
            
            cdb.ps = cdb.cn.prepareStatement(consulta);
            cdb.ps.setString(1, "%" + busqueda + "%");

            cdb.rs = cdb.ps.executeQuery(); // SELECT => executeQuery
            tb.MostrarContTabla(tabla, cdb.rs);

//            rs.close();
//            ps.close();
            
            System.out.println("[OK] Datos de encontrados");
            
        } catch (Exception e) {
            System.out.println("[ERROR] No se pudo encontrar los datos");
        }
        
        
        
    }
}

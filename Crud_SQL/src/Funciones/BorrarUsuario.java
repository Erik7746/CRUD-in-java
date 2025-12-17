package Funciones;

import javax.swing.JTable;

public class BorrarUsuario {
    public void borrarUser(JTable tb){
        int filaSeleccionada;
        // getSelectedRow() devuelve el índice de la fila seleccionada. Si no hay ninguna, devuelve -1.
        filaSeleccionada = tb.getSelectedRow();
        
        ConexionBD cdb = new ConexionBD();
        
        if (filaSeleccionada != -1) {
            String idUsuario = String.valueOf(tb.getValueAt(filaSeleccionada, 0));
            System.out.print(idUsuario);
            
            try {
                cdb.ps = cdb.cn.prepareStatement(" DELETE FROM usuario WHERE id_usuario = ? ");
                cdb.ps.setString(1, idUsuario);
                cdb.ps.executeUpdate();
                System.out.println("[OK] Se borro el usurio correctamente");
                
            } catch (Exception e) {
                System.out.println("[ERROR] No se pudo Borrar el usuario");
            }
            
        }else{
            System.out.print("[!] No se selecciono ninguna fila");
            
        }
    }
}

package Funciones;

import javax.swing.JTable;
import javax.swing.JTextField;

public class EditarUsuario {
    private String idUsuario;
    
    public void ObtenerFormulario(JTable tb, 
            JTextField txtNombre,
            JTextField txtApellidoPaterno,
            JTextField txtApellidoMaterno,
            JTextField txtOcupacion,
            JTextField txtCorreo,
            JTextField txtTelefono){
        
        int filaSeleccionada;
        // getSelectedRow() devuelve el índice de la fila seleccionada. Si no hay ninguna, devuelve -1.
        filaSeleccionada = tb.getSelectedRow();
        
        ConexionBD cdb = new ConexionBD();
        
        if (filaSeleccionada != -1) {
            this.idUsuario = String.valueOf(tb.getValueAt(filaSeleccionada, 0));
            String nombre = String.valueOf(tb.getValueAt(filaSeleccionada, 1));
            String apelldioPaterno = String.valueOf(tb.getValueAt(filaSeleccionada, 2));
            String apelldioMaterno = String.valueOf(tb.getValueAt(filaSeleccionada, 3));
            String ocupacion = String.valueOf(tb.getValueAt(filaSeleccionada, 4));
            String correo = String.valueOf(tb.getValueAt(filaSeleccionada, 5));
            String telefono = String.valueOf(tb.getValueAt(filaSeleccionada, 6));
            
            txtNombre.setText(nombre);
            txtApellidoPaterno.setText(apelldioPaterno);
            txtApellidoMaterno.setText(apelldioMaterno);
            txtOcupacion.setText(ocupacion);
            txtCorreo.setText(correo);
            txtTelefono.setText(telefono);
            System.out.println("[OK] Se obtuvieron los datos de la seleccion");
            
        }else {
            System.out.println("[!] No se selecciono ninguna fila");
        }
        
    }

    public void ActualizarUser(String nombre, String apellidoPaterno, String apellidoMaterno , String ocupacion, String correo, String telefono){
        ConexionBD cdb = new ConexionBD();
        
        try {
            cdb.ps = cdb.cn.prepareStatement(" UPDATE usuario SET nombre = ?, apellidoPaterno = ?, apellidoMaterno = ?, ocupacion = ?, correo = ?, telefono = ? WHERE id_usuario = ? ");
            cdb.ps.setString(1, nombre);
            cdb.ps.setString(2, apellidoPaterno);
            cdb.ps.setString(3, apellidoMaterno);
            cdb.ps.setString(4, ocupacion);
            cdb.ps.setString(5, correo);
            cdb.ps.setString(6, telefono);
            cdb.ps.setString(7, idUsuario);
            
            cdb.ps.executeUpdate();
            System.out.println("[OK] Datos de usuario Actualizados");
        } catch (Exception e) {
            System.out.println("[ERROR] No se pudo actuaizar los datos");
        }   
    }
}

package Funciones;

public class AgregarUsuario {
    public int REusuario(String nombre, String apellidoPaterno, String apellidoMaterno, String ocupacion, String correo, String telefono){
        ConexionBD cdb = new ConexionBD();
        int res = 0;
        
        try {
            cdb.ps = cdb.cn.prepareStatement(" INSERT INTO usuario(nombre, apellidoPaterno, apellidoMaterno, ocupacion, correo, telefono) VALUES(?,?,?,?,?,?) ");
            cdb.ps.setString(1, nombre);
            cdb.ps.setString(2, apellidoPaterno);
            cdb.ps.setString(3, apellidoMaterno);
            cdb.ps.setString(4, ocupacion);
            cdb.ps.setString(5, correo);
            cdb.ps.setString(6, telefono);
            
            res = cdb.ps.executeUpdate();
            System.out.println("[OK] Datos de usuario registrados correctamente");
            
        } catch (Exception e) {
            System.out.println("[ERROR] No se pudo registrar el  usuario");
        }
        
        return res;
    }
}

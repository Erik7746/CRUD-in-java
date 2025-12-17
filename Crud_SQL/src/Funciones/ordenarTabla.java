/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Funciones;

import javax.swing.JTable;

/**
 *
 * @author Erik
 */
public class ordenarTabla {
    public void Desc(String colum, JTable tabla){
        MostrarTabla tb = new MostrarTabla();
        ConexionBD cdb = new ConexionBD();
        String consulta = "SELECT * FROM usuario ORDER BY " + colum + " DESC ";
        
        try {
            
            cdb.ps = cdb.cn.prepareStatement(consulta);

            cdb.rs = cdb.ps.executeQuery(); // SELECT => executeQuery
            tb.MostrarContTabla(tabla, cdb.rs);

//            rs.close();
//            ps.close();
            
        } catch (Exception e) {
            System.out.println("[ERROR] No se pudo ordenar - DESC");
        }
        
    }
    public void Asc(String colum, JTable tabla){
        MostrarTabla tb = new MostrarTabla();
        ConexionBD cdb = new ConexionBD();
        String consulta = "SELECT * FROM usuario ORDER BY " + colum + " ASC ";
        
        try {
            
            cdb.ps = cdb.cn.prepareStatement(consulta);

            cdb.rs = cdb.ps.executeQuery(); // SELECT => executeQuery
            tb.MostrarContTabla(tabla, cdb.rs);

//            rs.close();
//            ps.close();
            
        } catch (Exception e) {
            System.out.println("[ERROR] No se pudo ordenar - DESC");
        }
    }
}

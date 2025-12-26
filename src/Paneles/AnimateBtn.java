/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Paneles;

import InterfazGUI.VentanaPrincipal;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author Erik
 */
public class AnimateBtn {
    
    private void MostrarColor(PanelBtn pane, JLabel lbl, String url){
        pane.setGradientColors(
            new Color(0, 82, 212),     // color 1 del degradado activo
            new Color(156, 236, 251)      // color 2 del degradado activo
        );

        lbl.setForeground(Color.WHITE);
        lbl.setIcon(new ImageIcon(getClass().getResource(url)));
    }

    private void EstablecerColor(PanelBtn pane, JLabel lbl, String url){
        pane.setGradientColors(
            new Color(0, 0, 0),       // color 1 inactivo
            new Color(0, 0, 0)        // mismo color = sin degradado
        );

        lbl.setForeground(new Color(166, 166, 166));
        lbl.setIcon(new ImageIcon(getClass().getResource(url)));
    }
//    private void MostrarColorSelct(PanelBtn pane, JLabel lbl, String url){
//        pane.setGradientColors(
//            new Color(210, 210, 210),     // color 1 del degradado activo
//            new Color(210, 210, 210)      // color 2 del degradado activo
//        );
//
//        lbl.setForeground(Color.WHITE);
//        lbl.setIcon(new ImageIcon(getClass().getResource(url)));
//    }

    public void AnimateRepo(){
        EstablecerColor(VentanaPrincipal.BtnAgregar, VentanaPrincipal.jLabel1, "/iconos/agregar.png");
        EstablecerColor(VentanaPrincipal.BtnVer, VentanaPrincipal.jLabel2, "/iconos/usuario.png");
        EstablecerColor(VentanaPrincipal.BtnActualizar, VentanaPrincipal.jLabel3, "/iconos/editar.png");
        EstablecerColor(VentanaPrincipal.BtnBorrar, VentanaPrincipal.jLabel4, "/iconos/borrar.png");
    }
    
    public void AnimateAgregar(){
        MostrarColor(VentanaPrincipal.BtnAgregar, VentanaPrincipal.jLabel1, "/iconos/agregar.png");
        EstablecerColor(VentanaPrincipal.BtnVer, VentanaPrincipal.jLabel2, "/iconos/usuario.png");
        EstablecerColor(VentanaPrincipal.BtnActualizar, VentanaPrincipal.jLabel3, "/iconos/editar.png");
        EstablecerColor(VentanaPrincipal.BtnBorrar, VentanaPrincipal.jLabel4, "/iconos/borrar.png");
    }
//    public void AnimateAgregarB(){
//        MostrarColorSelct(VentanaPrincipal.BtnAgregar, VentanaPrincipal.jLabel1, "/iconos/agregar.png");
//        
//    }
    public void AnimateVer(){
        MostrarColor(VentanaPrincipal.BtnVer, VentanaPrincipal.jLabel2, "/iconos/usuario.png");
        EstablecerColor(VentanaPrincipal.BtnAgregar, VentanaPrincipal.jLabel1, "/iconos/agregar.png");
        EstablecerColor(VentanaPrincipal.BtnActualizar, VentanaPrincipal.jLabel3, "/iconos/editar.png");
        EstablecerColor(VentanaPrincipal.BtnBorrar, VentanaPrincipal.jLabel4, "/iconos/borrar.png");
    }
    public void AnimateActualizar(){
        MostrarColor(VentanaPrincipal.BtnActualizar, VentanaPrincipal.jLabel3, "/iconos/editar.png");
        EstablecerColor(VentanaPrincipal.BtnVer, VentanaPrincipal.jLabel2, "/iconos/usuario.png");
        EstablecerColor(VentanaPrincipal.BtnAgregar, VentanaPrincipal.jLabel1, "/iconos/agregar.png");
        EstablecerColor(VentanaPrincipal.BtnBorrar, VentanaPrincipal.jLabel4, "/iconos/borrar.png");
    }
    public void AnimateBorrar(){
        MostrarColor(VentanaPrincipal.BtnBorrar, VentanaPrincipal.jLabel4, "/iconos/borrar.png");
        EstablecerColor(VentanaPrincipal.BtnVer, VentanaPrincipal.jLabel2, "/iconos/usuario.png");
        EstablecerColor(VentanaPrincipal.BtnActualizar, VentanaPrincipal.jLabel3, "/iconos/editar.png");
        EstablecerColor(VentanaPrincipal.BtnAgregar, VentanaPrincipal.jLabel1, "/iconos/agregar.png");
    }
    
}

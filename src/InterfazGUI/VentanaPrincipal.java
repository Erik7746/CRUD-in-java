package InterfazGUI;

import Funciones.*;
import Paneles.AnimateBtn;
import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;

public class VentanaPrincipal extends javax.swing.JFrame {
    AnimateBtn anim = new AnimateBtn();
    EditarUsuario edit = new EditarUsuario();
    MostrarTabla tb = new MostrarTabla();
    BorrarUsuario br = new BorrarUsuario();
    BusquedaSQL bsq = new BusquedaSQL();
    ordenarTabla ord = new ordenarTabla();
    
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName());

    public VentanaPrincipal() {
        initComponents();
        setBackground(new Color(0,0,0,0));//ocultar jframe
        
        

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        border1 = new Paneles.Border();
        menu1 = new Paneles.Menu();
        BtnAgregar = new Paneles.PanelBtn();
        jLabel1 = new javax.swing.JLabel();
        BtnVer = new Paneles.PanelBtn();
        jLabel2 = new javax.swing.JLabel();
        BtnActualizar = new Paneles.PanelBtn();
        jLabel3 = new javax.swing.JLabel();
        BtnBorrar = new Paneles.PanelBtn();
        jLabel4 = new javax.swing.JLabel();
        BtnSalir = new Paneles.PanelBtn();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        contenedor1 = new Paneles.Contenedor();
        PanelInicio = new Paneles.Contenedor();
        PanelRegistrar = new Paneles.Contenedor();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txtNombreU = new Paneles.textPanel();
        txtApellidoPaternoU = new Paneles.textPanel();
        txtApellidoMaternoU = new Paneles.textPanel();
        txtOcupacionU = new Paneles.textPanel();
        txtCorreoU = new Paneles.textPanel();
        txtTelefonoU = new Paneles.textPanel();
        btnGuardar = new Paneles.Boton();
        jLabel14 = new javax.swing.JLabel();
        PanelVer = new Paneles.Contenedor();
        jComboBox1 = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        BtnBuscar = new Paneles.Boton();
        jLabel18 = new javax.swing.JLabel();
        BusquedaTxt = new Paneles.Busqueda();
        PanelEditar = new Paneles.Contenedor();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        txtNombreE = new Paneles.textPanel();
        txtApellidoPaternoE = new Paneles.textPanel();
        txtApellidoMaternoE = new Paneles.textPanel();
        txtOcupacionE = new Paneles.textPanel();
        txtCorreoE = new Paneles.textPanel();
        txtTelefonoE = new Paneles.textPanel();
        btnActualizar = new Paneles.Boton();
        jLabel16 = new javax.swing.JLabel();
        botonAtras = new Paneles.Boton();
        jLabel19 = new javax.swing.JLabel();
        PanelActualizar = new Paneles.Contenedor();
        jLabel15 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        btnEditar = new Paneles.Boton();
        jLabel25 = new javax.swing.JLabel();
        PanelBorrrar = new Paneles.Contenedor();
        jLabel17 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        btnBorrar = new Paneles.Boton();
        jLabel26 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setUndecorated(true);

        border1.setBackground(new java.awt.Color(255, 255, 255));
        border1.setPreferredSize(new java.awt.Dimension(800, 450));
        border1.setLayout(new java.awt.BorderLayout());

        menu1.setPreferredSize(new java.awt.Dimension(180, 390));
        menu1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BtnAgregar.setBackground(new java.awt.Color(0, 0, 0));
        BtnAgregar.setPreferredSize(new java.awt.Dimension(160, 50));
        BtnAgregar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BtnAgregarMouseEntered(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                BtnAgregarMousePressed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/agregar.png"))); // NOI18N
        jLabel1.setText("Agregar");

        javax.swing.GroupLayout BtnAgregarLayout = new javax.swing.GroupLayout(BtnAgregar);
        BtnAgregar.setLayout(BtnAgregarLayout);
        BtnAgregarLayout.setHorizontalGroup(
            BtnAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BtnAgregarLayout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );
        BtnAgregarLayout.setVerticalGroup(
            BtnAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BtnAgregarLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        menu1.add(BtnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 86, -1, -1));

        BtnVer.setPreferredSize(new java.awt.Dimension(160, 50));
        BtnVer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                BtnVerMousePressed(evt);
            }
        });

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/usuario.png"))); // NOI18N
        jLabel2.setText("Ver");

        javax.swing.GroupLayout BtnVerLayout = new javax.swing.GroupLayout(BtnVer);
        BtnVer.setLayout(BtnVerLayout);
        BtnVerLayout.setHorizontalGroup(
            BtnVerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BtnVerLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );
        BtnVerLayout.setVerticalGroup(
            BtnVerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BtnVerLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        menu1.add(BtnVer, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 136, -1, -1));

        BtnActualizar.setPreferredSize(new java.awt.Dimension(160, 50));
        BtnActualizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                BtnActualizarMousePressed(evt);
            }
        });

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/editar.png"))); // NOI18N
        jLabel3.setText("Actualizar");

        javax.swing.GroupLayout BtnActualizarLayout = new javax.swing.GroupLayout(BtnActualizar);
        BtnActualizar.setLayout(BtnActualizarLayout);
        BtnActualizarLayout.setHorizontalGroup(
            BtnActualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BtnActualizarLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );
        BtnActualizarLayout.setVerticalGroup(
            BtnActualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BtnActualizarLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        menu1.add(BtnActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 186, -1, -1));

        BtnBorrar.setPreferredSize(new java.awt.Dimension(160, 50));
        BtnBorrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                BtnBorrarMousePressed(evt);
            }
        });

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/borrar.png"))); // NOI18N
        jLabel4.setText("Borrar");

        javax.swing.GroupLayout BtnBorrarLayout = new javax.swing.GroupLayout(BtnBorrar);
        BtnBorrar.setLayout(BtnBorrarLayout);
        BtnBorrarLayout.setHorizontalGroup(
            BtnBorrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BtnBorrarLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        BtnBorrarLayout.setVerticalGroup(
            BtnBorrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BtnBorrarLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        menu1.add(BtnBorrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 236, -1, -1));

        BtnSalir.setPreferredSize(new java.awt.Dimension(160, 50));
        BtnSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                BtnSalirMousePressed(evt);
            }
        });

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/salida.png"))); // NOI18N
        jLabel5.setText("Salir");
        jLabel5.setPreferredSize(new java.awt.Dimension(120, 20));

        javax.swing.GroupLayout BtnSalirLayout = new javax.swing.GroupLayout(BtnSalir);
        BtnSalir.setLayout(BtnSalirLayout);
        BtnSalirLayout.setHorizontalGroup(
            BtnSalirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BtnSalirLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );
        BtnSalirLayout.setVerticalGroup(
            BtnSalirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        menu1.add(BtnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 360, -1, -1));

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Comic Sans MS", 3, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("CRUD Java");
        menu1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, 40));

        border1.add(menu1, java.awt.BorderLayout.LINE_START);

        contenedor1.setBackground(new java.awt.Color(255, 255, 255));
        contenedor1.setLayout(new java.awt.CardLayout());

        javax.swing.GroupLayout PanelInicioLayout = new javax.swing.GroupLayout(PanelInicio);
        PanelInicio.setLayout(PanelInicioLayout);
        PanelInicioLayout.setHorizontalGroup(
            PanelInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 620, Short.MAX_VALUE)
        );
        PanelInicioLayout.setVerticalGroup(
            PanelInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 450, Short.MAX_VALUE)
        );

        contenedor1.add(PanelInicio, "card7");

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Sans Serif Collection", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Agregar Usuario");

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Sans Serif Collection", 0, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Nombre:");

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setFont(new java.awt.Font("Sans Serif Collection", 0, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Apellido Paterno:");

        jLabel10.setBackground(new java.awt.Color(255, 255, 255));
        jLabel10.setFont(new java.awt.Font("Sans Serif Collection", 0, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Apellido Materno:");

        jLabel11.setBackground(new java.awt.Color(255, 255, 255));
        jLabel11.setFont(new java.awt.Font("Sans Serif Collection", 0, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Correo:");

        jLabel12.setBackground(new java.awt.Color(255, 255, 255));
        jLabel12.setFont(new java.awt.Font("Sans Serif Collection", 0, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Ocupacion:");

        jLabel13.setBackground(new java.awt.Color(255, 255, 255));
        jLabel13.setFont(new java.awt.Font("Sans Serif Collection", 0, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Telefono:");

        btnGuardar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnGuardarMousePressed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Microsoft JhengHei", 0, 12)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Guardar");

        javax.swing.GroupLayout btnGuardarLayout = new javax.swing.GroupLayout(btnGuardar);
        btnGuardar.setLayout(btnGuardarLayout);
        btnGuardarLayout.setHorizontalGroup(
            btnGuardarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnGuardarLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel14)
                .addContainerGap(27, Short.MAX_VALUE))
        );
        btnGuardarLayout.setVerticalGroup(
            btnGuardarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnGuardarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, 18, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout PanelRegistrarLayout = new javax.swing.GroupLayout(PanelRegistrar);
        PanelRegistrar.setLayout(PanelRegistrarLayout);
        PanelRegistrarLayout.setHorizontalGroup(
            PanelRegistrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelRegistrarLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addGap(231, 231, 231))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelRegistrarLayout.createSequentialGroup()
                .addGroup(PanelRegistrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(PanelRegistrarLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PanelRegistrarLayout.createSequentialGroup()
                        .addGap(170, 170, 170)
                        .addGroup(PanelRegistrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PanelRegistrarLayout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addGroup(PanelRegistrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel12)
                                    .addComponent(jLabel11)
                                    .addComponent(txtNombreU, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
                                    .addComponent(txtApellidoPaternoU, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtApellidoMaternoU, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtOcupacionU, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtCorreoU, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addComponent(jLabel13)
                            .addComponent(txtTelefonoU, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(146, 146, 146))
        );
        PanelRegistrarLayout.setVerticalGroup(
            PanelRegistrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelRegistrarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNombreU, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtApellidoPaternoU, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtApellidoMaternoU, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtOcupacionU, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCorreoU, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtTelefonoU, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        contenedor1.add(PanelRegistrar, "card6");

        jComboBox1.setBackground(new java.awt.Color(255, 255, 255));
        jComboBox1.setForeground(new java.awt.Color(153, 153, 153));
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "id_usuario", "nombre", "apellidoPaterno", "apellidoMaterno", "ocupacion", "correo", "telefono" }));
        jComboBox1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox1ItemStateChanged(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jTable1);

        BtnBuscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                BtnBuscarMousePressed(evt);
            }
        });

        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Buscar");

        javax.swing.GroupLayout BtnBuscarLayout = new javax.swing.GroupLayout(BtnBuscar);
        BtnBuscar.setLayout(BtnBuscarLayout);
        BtnBuscarLayout.setHorizontalGroup(
            BtnBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BtnBuscarLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel18)
                .addContainerGap(24, Short.MAX_VALUE))
        );
        BtnBuscarLayout.setVerticalGroup(
            BtnBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BtnBuscarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, 18, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout PanelVerLayout = new javax.swing.GroupLayout(PanelVer);
        PanelVer.setLayout(PanelVerLayout);
        PanelVerLayout.setHorizontalGroup(
            PanelVerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelVerLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelVerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelVerLayout.createSequentialGroup()
                        .addComponent(BusquedaTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 394, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BtnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 610, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PanelVerLayout.setVerticalGroup(
            PanelVerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelVerLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(PanelVerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BusquedaTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 379, Short.MAX_VALUE)
                .addGap(14, 14, 14))
        );

        contenedor1.add(PanelVer, "card5");

        jLabel27.setBackground(new java.awt.Color(255, 255, 255));
        jLabel27.setFont(new java.awt.Font("Sans Serif Collection", 0, 18)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(255, 255, 255));
        jLabel27.setText("Editar Usuario");

        jLabel28.setBackground(new java.awt.Color(255, 255, 255));
        jLabel28.setFont(new java.awt.Font("Sans Serif Collection", 0, 12)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(255, 255, 255));
        jLabel28.setText("Nombre:");

        jLabel29.setBackground(new java.awt.Color(255, 255, 255));
        jLabel29.setFont(new java.awt.Font("Sans Serif Collection", 0, 12)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(255, 255, 255));
        jLabel29.setText("Apellido Paterno:");

        jLabel30.setBackground(new java.awt.Color(255, 255, 255));
        jLabel30.setFont(new java.awt.Font("Sans Serif Collection", 0, 12)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(255, 255, 255));
        jLabel30.setText("Apellido Materno:");

        jLabel31.setBackground(new java.awt.Color(255, 255, 255));
        jLabel31.setFont(new java.awt.Font("Sans Serif Collection", 0, 12)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(255, 255, 255));
        jLabel31.setText("Correo:");

        jLabel32.setBackground(new java.awt.Color(255, 255, 255));
        jLabel32.setFont(new java.awt.Font("Sans Serif Collection", 0, 12)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(255, 255, 255));
        jLabel32.setText("Ocupacion:");

        jLabel33.setBackground(new java.awt.Color(255, 255, 255));
        jLabel33.setFont(new java.awt.Font("Sans Serif Collection", 0, 12)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(255, 255, 255));
        jLabel33.setText("Telefono:");

        btnActualizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnActualizarMousePressed(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Microsoft JhengHei", 0, 12)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Actualizar");

        javax.swing.GroupLayout btnActualizarLayout = new javax.swing.GroupLayout(btnActualizar);
        btnActualizar.setLayout(btnActualizarLayout);
        btnActualizarLayout.setHorizontalGroup(
            btnActualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnActualizarLayout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addComponent(jLabel16)
                .addGap(18, 18, 18))
        );
        btnActualizarLayout.setVerticalGroup(
            btnActualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnActualizarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel16)
                .addContainerGap(8, Short.MAX_VALUE))
        );

        botonAtras.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                botonAtrasMousePressed(evt);
            }
        });

        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("Atras");

        javax.swing.GroupLayout botonAtrasLayout = new javax.swing.GroupLayout(botonAtras);
        botonAtras.setLayout(botonAtrasLayout);
        botonAtrasLayout.setHorizontalGroup(
            botonAtrasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(botonAtrasLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel19)
                .addContainerGap(33, Short.MAX_VALUE))
        );
        botonAtrasLayout.setVerticalGroup(
            botonAtrasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(botonAtrasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel19)
                .addContainerGap(8, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout PanelEditarLayout = new javax.swing.GroupLayout(PanelEditar);
        PanelEditar.setLayout(PanelEditarLayout);
        PanelEditarLayout.setHorizontalGroup(
            PanelEditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelEditarLayout.createSequentialGroup()
                .addGroup(PanelEditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelEditarLayout.createSequentialGroup()
                        .addGap(246, 246, 246)
                        .addComponent(jLabel27))
                    .addGroup(PanelEditarLayout.createSequentialGroup()
                        .addGap(172, 172, 172)
                        .addGroup(PanelEditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelEditarLayout.createSequentialGroup()
                                .addComponent(botonAtras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel33)
                            .addComponent(jLabel31)
                            .addComponent(jLabel32)
                            .addComponent(jLabel30)
                            .addComponent(txtNombreE, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
                            .addComponent(jLabel28)
                            .addComponent(jLabel29)
                            .addComponent(txtApellidoPaternoE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtApellidoMaternoE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtOcupacionE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtCorreoE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtTelefonoE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(148, Short.MAX_VALUE))
        );
        PanelEditarLayout.setVerticalGroup(
            PanelEditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelEditarLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNombreE, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtApellidoPaternoE, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtApellidoMaternoE, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtOcupacionE, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCorreoE, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtTelefonoE, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(PanelEditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonAtras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(11, Short.MAX_VALUE))
        );

        contenedor1.add(PanelEditar, "card2");

        jLabel15.setBackground(new java.awt.Color(255, 255, 255));
        jLabel15.setFont(new java.awt.Font("Sans Serif Collection", 0, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Actualizar Usuario");

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(jTable2);

        btnEditar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnEditarMousePressed(evt);
            }
        });

        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setText("Editar");

        javax.swing.GroupLayout btnEditarLayout = new javax.swing.GroupLayout(btnEditar);
        btnEditar.setLayout(btnEditarLayout);
        btnEditarLayout.setHorizontalGroup(
            btnEditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnEditarLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel25)
                .addContainerGap(28, Short.MAX_VALUE))
        );
        btnEditarLayout.setVerticalGroup(
            btnEditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnEditarLayout.createSequentialGroup()
                .addContainerGap(9, Short.MAX_VALUE)
                .addComponent(jLabel25)
                .addContainerGap())
        );

        javax.swing.GroupLayout PanelActualizarLayout = new javax.swing.GroupLayout(PanelActualizar);
        PanelActualizar.setLayout(PanelActualizarLayout);
        PanelActualizarLayout.setHorizontalGroup(
            PanelActualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelActualizarLayout.createSequentialGroup()
                .addGap(230, 230, 230)
                .addComponent(jLabel15)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelActualizarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelActualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 608, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelActualizarLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        PanelActualizarLayout.setVerticalGroup(
            PanelActualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelActualizarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 362, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(9, Short.MAX_VALUE))
        );

        contenedor1.add(PanelActualizar, "card4");

        jLabel17.setBackground(new java.awt.Color(0, 0, 0));
        jLabel17.setFont(new java.awt.Font("Sans Serif Collection", 0, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Borrar Usuario");

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane3.setViewportView(jTable3);

        btnBorrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnBorrarMousePressed(evt);
            }
        });

        jLabel26.setForeground(new java.awt.Color(255, 255, 255));
        jLabel26.setText("Borrar");

        javax.swing.GroupLayout btnBorrarLayout = new javax.swing.GroupLayout(btnBorrar);
        btnBorrar.setLayout(btnBorrarLayout);
        btnBorrarLayout.setHorizontalGroup(
            btnBorrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnBorrarLayout.createSequentialGroup()
                .addContainerGap(30, Short.MAX_VALUE)
                .addComponent(jLabel26)
                .addGap(34, 34, 34))
        );
        btnBorrarLayout.setVerticalGroup(
            btnBorrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnBorrarLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel26)
                .addContainerGap())
        );

        javax.swing.GroupLayout PanelBorrrarLayout = new javax.swing.GroupLayout(PanelBorrrar);
        PanelBorrrar.setLayout(PanelBorrrarLayout);
        PanelBorrrarLayout.setHorizontalGroup(
            PanelBorrrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelBorrrarLayout.createSequentialGroup()
                .addGap(235, 235, 235)
                .addComponent(jLabel17)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(PanelBorrrarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelBorrrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 608, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelBorrrarLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        PanelBorrrarLayout.setVerticalGroup(
            PanelBorrrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelBorrrarLayout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        contenedor1.add(PanelBorrrar, "card3");

        border1.add(contenedor1, java.awt.BorderLayout.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(border1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(border1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
    
    private boolean[] encendido = new boolean[7];
    
    private void toggle(int col, String colum, JTable tabla) {
    if (encendido[col]) {
        ord.Desc(colum, tabla);
        encendido[col] = false;
    } else {
        ord.Asc(colum, tabla);
        encendido[col] = true;
    }
}
    public void ordenar(JTable jtb){
        jtb.getTableHeader().addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                int columna = jtb.columnAtPoint(evt.getPoint());
                
                switch (columna) {
                    case 0:
                        toggle(columna, "id_usuario", jtb);
                        break;
                    case 1:
                        toggle(columna, "nombre", jtb);
                        break;
                    case 2:
                        toggle(columna, "apellidoPaterno", jtb);
                        break;
                    case 3:
                        toggle(columna, "apellidoMaterno", jtb);
                        break;
                    case 4:
                        toggle(columna, "ocupacion", jtb);
                        break;
                    case 5:
                        toggle(columna, "correo", jtb);
                        break;
                    case 6:
                        toggle(columna, "telefono", jtb);
                        break;    
                }
            }
        });
    }
    
    public void mostrarVentana(JPanel panel){
        contenedor1.removeAll();
        contenedor1.add(panel);
        contenedor1.repaint();
        contenedor1.revalidate();
    }
    
    private void BtnAgregarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnAgregarMousePressed
        // TODO add your handling code here:
        anim.AnimateAgregar();
        mostrarVentana(PanelRegistrar);
        
    }//GEN-LAST:event_BtnAgregarMousePressed

    private void BtnVerMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnVerMousePressed
        // TODO add your handling code here:
        anim.AnimateVer();
        mostrarVentana(PanelVer);
        tb.MostrarContTabla(jTable1);
        
        String seleccionado = (String) jComboBox1.getSelectedItem();
        String busq = "Buscar "+ seleccionado;
        //jLabel14.setText(busq);
        BusquedaTxt.setHHint(busq);
        
        ordenar(jTable1);
    }//GEN-LAST:event_BtnVerMousePressed

    private void BtnActualizarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnActualizarMousePressed
        // TODO add your handling code here:
        anim.AnimateActualizar();
        mostrarVentana(PanelActualizar);
        tb.MostrarContTabla(jTable2);
    }//GEN-LAST:event_BtnActualizarMousePressed

    private void BtnBorrarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnBorrarMousePressed
        // TODO add your handling code here:
        anim.AnimateBorrar();
        mostrarVentana(PanelBorrrar);
        tb.MostrarContTabla(jTable3);
    }//GEN-LAST:event_BtnBorrarMousePressed

    private void BtnSalirMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnSalirMousePressed
        // TODO add your handling code here:
        dispose();
        System.exit(0);
    }//GEN-LAST:event_BtnSalirMousePressed

    private void BtnBuscarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnBuscarMousePressed
        // TODO add your handling code here:
        String seleccionado = (String) jComboBox1.getSelectedItem();
        String busqueda = BusquedaTxt.obtenerText();
        //System.out.println(busqueda);
        
        bsq.busquedaTb(seleccionado, busqueda, jTable1);
    }//GEN-LAST:event_BtnBuscarMousePressed

    private void jComboBox1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox1ItemStateChanged
        // TODO add your handling code here:
        String seleccionado = (String) jComboBox1.getSelectedItem();
        String busq = "Buscar "+ seleccionado;
        //jLabel14.setText(busq);
        BusquedaTxt.setHHint(busq);
        
    }//GEN-LAST:event_jComboBox1ItemStateChanged

    private void btnGuardarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGuardarMousePressed
        // TODO add your handling code here:
        String nombre = txtNombreU.getText();
        String apellidoPaterno = txtApellidoPaternoU.getText();
        String apellidoMaterno = txtApellidoMaternoU.getText();
        String ocupacion = txtOcupacionU.getText();
        String correo = txtCorreoU.getText();
        String telefono = txtTelefonoU.getText();
        
        ConexionBD co = new ConexionBD();
        AgregarUsuario ag = new AgregarUsuario();
        
        int respuesta = ag.REusuario(nombre, apellidoPaterno, apellidoMaterno, ocupacion, correo, telefono);
        
        if (respuesta==1) {
            JOptionPane.showMessageDialog(null, "Usuario registrado correctamente");
        } else {
            JOptionPane.showMessageDialog(null, "Error al registrar usuario");
        }
    }//GEN-LAST:event_btnGuardarMousePressed

    private void btnEditarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEditarMousePressed
        // TODO add your handling code here:
        mostrarVentana(PanelEditar);
        edit.ObtenerFormulario(jTable2, txtNombreE, txtApellidoPaternoE, txtApellidoMaternoE, txtOcupacionE, txtCorreoE, txtTelefonoE);
    }//GEN-LAST:event_btnEditarMousePressed

    private void btnBorrarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBorrarMousePressed
        // TODO add your handling code here:
        br.borrarUser(jTable3);
        tb.MostrarContTabla(jTable3);
    }//GEN-LAST:event_btnBorrarMousePressed

    private void btnActualizarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnActualizarMousePressed
        // TODO add your handling code here:
        mostrarVentana(PanelActualizar);

        String nombre = txtNombreE.getText();
        String apellidoPaterno = txtApellidoPaternoE.getText();
        String apellidoMaterno = txtApellidoMaternoE.getText();
        String ocupacion = txtOcupacionE.getText();
        String correo = txtCorreoE.getText();
        String telefono = txtTelefonoE.getText();
        edit.ActualizarUser(nombre, apellidoPaterno, apellidoMaterno, ocupacion, correo, telefono);
        tb.MostrarContTabla(jTable2);
    }//GEN-LAST:event_btnActualizarMousePressed

    private void botonAtrasMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonAtrasMousePressed
        // TODO add your handling code here:
        mostrarVentana(PanelActualizar);
    }//GEN-LAST:event_botonAtrasMousePressed

    private void BtnAgregarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnAgregarMouseEntered
        // TODO add your handling code here:
        
    }//GEN-LAST:event_BtnAgregarMouseEntered

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new VentanaPrincipal().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static Paneles.PanelBtn BtnActualizar;
    public static Paneles.PanelBtn BtnAgregar;
    public static Paneles.PanelBtn BtnBorrar;
    private Paneles.Boton BtnBuscar;
    public static Paneles.PanelBtn BtnSalir;
    public static Paneles.PanelBtn BtnVer;
    private Paneles.Busqueda BusquedaTxt;
    private Paneles.Contenedor PanelActualizar;
    private Paneles.Contenedor PanelBorrrar;
    private Paneles.Contenedor PanelEditar;
    public Paneles.Contenedor PanelInicio;
    private Paneles.Contenedor PanelRegistrar;
    private Paneles.Contenedor PanelVer;
    private Paneles.Border border1;
    private Paneles.Boton botonAtras;
    private Paneles.Boton btnActualizar;
    private Paneles.Boton btnBorrar;
    private Paneles.Boton btnEditar;
    private Paneles.Boton btnGuardar;
    private Paneles.Contenedor contenedor1;
    private javax.swing.JComboBox<String> jComboBox1;
    public static javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    public static javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    public static javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    public static javax.swing.JLabel jLabel4;
    public static javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private Paneles.Menu menu1;
    private Paneles.textPanel txtApellidoMaternoE;
    private Paneles.textPanel txtApellidoMaternoU;
    private Paneles.textPanel txtApellidoPaternoE;
    private Paneles.textPanel txtApellidoPaternoU;
    private Paneles.textPanel txtCorreoE;
    private Paneles.textPanel txtCorreoU;
    private Paneles.textPanel txtNombreE;
    private Paneles.textPanel txtNombreU;
    private Paneles.textPanel txtOcupacionE;
    private Paneles.textPanel txtOcupacionU;
    private Paneles.textPanel txtTelefonoE;
    private Paneles.textPanel txtTelefonoU;
    // End of variables declaration//GEN-END:variables
}

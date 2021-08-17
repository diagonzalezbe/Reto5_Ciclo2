package Vista;

import Controlador.ElControladorDeRequerimientos;
import Modelo.vo.Requerimiento_1;
import Modelo.vo.Requerimiento_2;
import Modelo.vo.Requerimiento_3;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;


public class FrameRequerimiento extends javax.swing.JFrame {
    
    private javax.swing.JButton BtnRequerimiento1;
    private javax.swing.JButton BtnRequerimiento2;
    private javax.swing.JButton BtnRequerimiento3;
    private javax.swing.JPanel Panel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;

    public FrameRequerimiento() {
        initComponents();
    }


    
    private void initComponents() {

        //Objetos
        jScrollPane1 = new javax.swing.JScrollPane();
        Panel = new javax.swing.JPanel();
        BtnRequerimiento1 = new javax.swing.JButton();
        BtnRequerimiento2 = new javax.swing.JButton();
        BtnRequerimiento3 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTable1 = new javax.swing.JTable();
        

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title5"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        Panel.setBorder(javax.swing.BorderFactory.createTitledBorder("CONSULTAR REQUERIMIENTOS"));

        BtnRequerimiento1.setText("Requerimiento 1");
        BtnRequerimiento1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnRequerimiento1(evt);
            }
        });

        BtnRequerimiento2.setText("Requerimiento 2");
        BtnRequerimiento2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnRequerimiento2(evt);
            }
        });

        BtnRequerimiento3.setText("Requerimiento 3");
        BtnRequerimiento3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnRequerimiento3(evt);
            }
        });

        javax.swing.GroupLayout PanelLayout = new javax.swing.GroupLayout(Panel);
        Panel.setLayout(PanelLayout);
        PanelLayout.setHorizontalGroup(
            PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(BtnRequerimiento1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(BtnRequerimiento2, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addComponent(BtnRequerimiento3, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        PanelLayout.setVerticalGroup(
            PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnRequerimiento1)
                    .addComponent(BtnRequerimiento2)
                    .addComponent(BtnRequerimiento3))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("TABLA DE RESULTADOS");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(123, 123, 123))
        );

        Panel.getAccessibleContext().setAccessibleName("CONSULTAR REQUERIMIENTOS");

        pack();
    }

    private void BtnRequerimiento1(java.awt.event.ActionEvent evt) {
        //String[][] mostrar() throws SQLException{
        String[]nombres={"Ciudad", "Acabados", "Clasificación", "Banco Vinculado", "Constructora"};
        ElControladorDeRequerimientos controlador = new ElControladorDeRequerimientos();
        ArrayList<Requerimiento_1> lista; 
        
        try{
            lista = controlador.consultarRequerimiento1();
            Object[][] matriz = new String [lista.size()][5];
            for (int i = 0; i < lista.size(); i++){
                matriz[i][0] = lista.get(i).getCiudad();
                matriz[i][1] = lista.get(i).getAcabados();
                matriz[i][2] = lista.get(i).getClasificacion();
                matriz[i][3] = lista.get(i).getBanco_Vinculado();
                matriz[i][4] = lista.get(i).getConstructora();
        }
        DefaultTableModel tabla = new DefaultTableModel(matriz, nombres);
        jTable1.setModel(tabla);
        } catch (SQLException e){
            System.err.println(e);
        } 
    }

    private void BtnRequerimiento2(java.awt.event.ActionEvent evt) {                                   
        String[]nombres={"Nombre","Primer Apellido","Ciudad Residencia", "Cargo","Salario"};
        ElControladorDeRequerimientos controlador = new ElControladorDeRequerimientos();
        ArrayList<Requerimiento_2> lista; 
        
        try{
            lista = controlador.consultarRequerimiento2();
            Object[][] matriz = new String [lista.size()][5];
            for (int i = 0; i < lista.size(); i++){
                matriz[i][0] = lista.get(i).getNombre();
                matriz[i][1] = lista.get(i).getPrimer_Apellido();
                matriz[i][2] = lista.get(i).getCiudad_Residencia();
                matriz[i][3] = lista.get(i).getCargo();
                matriz[i][4] = lista.get(i).getSalario();
        }
        DefaultTableModel tabla = new DefaultTableModel(matriz, nombres);
        jTable1.setModel(tabla);
        } catch (SQLException e){
            System.err.println(e);
        } 
    } 
    
    private void BtnRequerimiento3(java.awt.event.ActionEvent evt) {                                   
        String[]nombres={"Proveedor","Pagado","Constructora"};
        ElControladorDeRequerimientos controlador = new ElControladorDeRequerimientos();
        ArrayList<Requerimiento_3> lista; 
        
        try{
            lista = controlador.consultarRequerimiento3();
            Object[][] matriz = new String [lista.size()][3];
            for (int i = 0; i < lista.size(); i++){
                matriz[i][0] = lista.get(i).getProveedor();
                matriz[i][1] = lista.get(i).getPagado();
                matriz[i][2] = lista.get(i).getConstructora();
        }
        DefaultTableModel tabla = new DefaultTableModel(matriz, nombres);
        jTable1.setModel(tabla);
        } catch (SQLException e){
            System.err.println(e);
        } 
    } 
    
    public static void main(String args[]) throws SQLException{
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrameRequerimiento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrameRequerimiento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrameRequerimiento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrameRequerimiento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            
            public void run() {
                new FrameRequerimiento().setVisible(true);
            }
        });
    }


}

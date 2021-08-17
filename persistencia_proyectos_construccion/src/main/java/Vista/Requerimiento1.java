package Vista;

import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import java.awt.BorderLayout;

//import Modelo.dao.*;
import Controlador.ElControladorDeRequerimientos;
import Modelo.vo.Requerimiento_1;

public class Requerimiento1 extends JFrame{
    public Requerimiento1() throws SQLException{
        initUI();
    }
    private void initUI() throws SQLException{
        setLayout(new BorderLayout());
        String[]nombres={"Ciudad","Acabados","Clasificación", "Banco_Vinculado","Constructora"};
        JTable tabla = new JTable(mostrar(), nombres );
        JScrollPane panel = new JScrollPane(tabla);
        add(panel, BorderLayout.CENTER);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setSize(800,150);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public String[][] mostrar() throws SQLException{
        ArrayList<Requerimiento_1> lista = new ArrayList<Requerimiento_1>();
        //Requerimiento_1Dao requerimiento_1 = new Requerimiento_1Dao();
        ElControladorDeRequerimientos controlador = new ElControladorDeRequerimientos();
        lista = controlador.consultarRequerimiento1();

        //lista = requerimiento_1.requerimiento1();

        String matriz[][] = new String [lista.size()][5];
        for (int i = 0; i < lista.size(); i++){
            //matriz[i][0]= String.valueOf(lista.get(i).getCiudad());
            matriz[i][0] = lista.get(i).getCiudad();
            matriz[i][1] = lista.get(i).getAcabados();
            matriz[i][2] = lista.get(i).getClasificacion();
            matriz[i][3] = lista.get(i).getBanco_Vinculado();
            matriz[i][4] = lista.get(i).getConstructora();
        }
        return matriz;
    }
}

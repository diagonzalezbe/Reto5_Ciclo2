package Vista;

import java.util.ArrayList;

import Controlador.ElControladorDeRequerimientos;

import Modelo.vo.Requerimiento_1;
import Modelo.vo.Requerimiento_2;
import Modelo.vo.Requerimiento_3;

public class VistaRequerimientos {

    public static final ElControladorDeRequerimientos controlador = new ElControladorDeRequerimientos();

    public static void requerimiento1(){
        
        try {
            // Su código
            ArrayList<Requerimiento_1> lista1 = controlador.consultarRequerimiento1();
            for (Requerimiento_1 re : lista1){
                System.out.printf("%s %s %s %s %s %n",
                re.getCiudad(),
                re.getAcabados(),
                re.getClasificacion(),
                re.getBanco_Vinculado(),
                re.getConstructora());
            }
        } catch (Exception e) {
            System.err.println("Ha ocurrido un error!"+e.getMessage());
        }
    }

    public static void requerimiento2(){
        
        try {
            // Su código
            ArrayList<Requerimiento_2> lista2 = controlador.consultarRequerimiento2();
            for (Requerimiento_2 re : lista2){
                System.out.printf("%s %s %s %s %s %n",
                re.Nombre,
                re.Primer_Apellido,
                re.Ciudad_Residencia,
                re.Cargo,
                re.Salario);
            }
        } catch (Exception e) {
            System.err.println("Ha ocurrido un error!"+e.getMessage());
        }
    }

    public static void requerimiento3(){
        try {
           // Su código
            ArrayList<Requerimiento_3> lista3 = controlador.consultarRequerimiento3();
            for (Requerimiento_3 re : lista3){
                System.out.printf("%s %s %s %n",
                re.Proveedor,
                re.Pagado,
                re.Constructora);
            }
        } catch (Exception e) {
            System.err.println("Ha ocurrido un error!"+e.getMessage());
        }
    }
}

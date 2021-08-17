/*
// Importaciones necesarias en iMaster
//para poder hacer conexion con jdbc
import java.sql.DriverManager; //mensajero que solicita permiso de acceso, url de acceso, contraseña, usuario, puerto
import java.sql.Connection; //recibe el enlace de conexion al db
import java.sql.Statement; //Preconsulta
import java.sql.PreparedStatement; //Consulta
import java.sql.ResultSet; //recibe la consulta en tipo tablas 
import java.sql.SQLException;

import java.util.ArrayList;

// Util (No modificar)
class JDBCUtilities {
    private static final String DATABASE_LOCATION = "ProyectosConstruccion.db";

    public static Connection getConnection() throws SQLException {
        String url = "jdbc:sqlite:"+DATABASE_LOCATION;

        return DriverManager.getConnection(url);
    }
}

// Remplace en adelante por las clases de sus archivos .java
// Vista
class VistaRequerimientos {
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

// Controlador
class ElControladorDeRequerimientos {
    private final Requerimiento_1Dao REQUERIMIENTO_1DAO;
    private final Requerimiento_2Dao REQUERIMIENTO_2DAO;
    private final Requerimiento_3Dao REQUERIMIENTO_3DAO;

    public ElControladorDeRequerimientos(){
        this.REQUERIMIENTO_1DAO= new Requerimiento_1Dao();
        this.REQUERIMIENTO_2DAO= new Requerimiento_2Dao();
        this.REQUERIMIENTO_3DAO= new Requerimiento_3Dao();
    }
    
        public ArrayList<Requerimiento_1> consultarRequerimiento1() throws SQLException {
            // Su código
            return this.REQUERIMIENTO_1DAO.requerimiento1();
            
        }
    
        public ArrayList<Requerimiento_2> consultarRequerimiento2() throws SQLException {
            // Su código
            return this.REQUERIMIENTO_2DAO.requerimiento2();
        }
    
        public ArrayList<Requerimiento_3> consultarRequerimiento3() throws SQLException {
            // Su código
            return this.REQUERIMIENTO_3DAO.requerimiento3();
        } 
}

// Modelo
// VO
class Requerimiento_1 {
    public String Ciudad;
    public String Acabados;
    public String Clasificacion;
    public String Banco_Vinculado;
    public String Constructora;
    
    public Requerimiento_1() {
    }

    public Requerimiento_1(String ciudad, String acabados) {
        Ciudad = ciudad;
        Acabados = acabados;
    }

    public String getCiudad() {
        return Ciudad;
    }
    public void setCiudad(String ciudad) {
        Ciudad = ciudad;
    }
    public String getAcabados() {
        return Acabados;
    }
    public void setAcabados(String acabados) {
        Acabados = acabados;
    }
    public String getClasificacion() {
        return Clasificacion;
    }
    public void setClasificacion(String clasificacion) {
        Clasificacion = clasificacion;
    }
    public String getBanco_Vinculado() {
        return Banco_Vinculado;
    }
    public void setBanco_Vinculado(String banco_Vinculado) {
        Banco_Vinculado = banco_Vinculado;
    }
    public String getConstructora() {
        return Constructora;
    }
    public void setConstructora(String constructora) {
        Constructora = constructora;
    }
}

class Requerimiento_2 {
    public String Nombre;
    public String Primer_Apellido;
    public String Ciudad_Residencia;
    public String Cargo;
    public String Salario;
    
    
    public Requerimiento_2() {
    }

    public Requerimiento_2(String nombre, String primer_Apellido, String ciudad_Residencia, String cargo, String salario) {
        Nombre = nombre;
        Primer_Apellido = primer_Apellido;
        Ciudad_Residencia = ciudad_Residencia;
        Cargo = cargo;
        Salario = salario;
    }

    public String getNombre() {
        return Nombre;
    }
    public void setNombre(String nombre) {
        Nombre = nombre;
    }
    public String getPrimer_Apellido() {
        return Primer_Apellido;
    }
    public void setPrimer_Apellido(String primer_Apellido) {
        Primer_Apellido = primer_Apellido;
    }
    public String getCiudad_Residencia() {
        return Ciudad_Residencia;
    }
    public void setCiudad_Residencia(String ciudad_Residencia) {
        Ciudad_Residencia = ciudad_Residencia;
    }
    public String getCargo() {
        return Cargo;
    }
    public void setCargo(String cargo) {
        Cargo = cargo;
    }
    public String getSalario() {
        return Salario;
    }
    public void setSalario(String salario) {
        Salario = salario;
    }
}

class Requerimiento_3 {
    public String Proveedor;
    public String Pagado;
    public String Constructora;
    
    public Requerimiento_3() {
    }
    
    public Requerimiento_3(String proveedor, String pagado, String constructora) {
        Proveedor = proveedor;
        Pagado = pagado;
        Constructora = constructora;
    }

    public String getProveedor() {
        return Proveedor;
    }
    public void setProveedor(String proveedor) {
        Proveedor = proveedor;
    }
    public String getPagado() {
        return Pagado;
    }
    public void setPagado(String pagado) {
        Pagado = pagado;
    }
    public String getConstructora() {
        return Constructora;
    }
    public void setConstructora(String constructora) {
        Constructora = constructora;
    }

}

// DAO
class Requerimiento_1Dao {
        public ArrayList<Requerimiento_1> requerimiento1()  throws SQLException {
        // Su código
        ArrayList<Requerimiento_1> respuesta = new ArrayList<Requerimiento_1>();
        Connection conexion = JDBCUtilities.getConnection();

        try{
            String Consulta =   "SELECT Proyecto.Ciudad, Proyecto.Acabados, Proyecto.Clasificacion, Proyecto.Banco_Vinculado, Proyecto.Constructora "+
                                "FROM Proyecto "+
                                "WHERE Proyecto.Ciudad = 'Bogota'; ";
            PreparedStatement statement = conexion.prepareStatement(Consulta);
            ResultSet resultSet = statement.executeQuery();

        while(resultSet.next()){
            Requerimiento_1 requerimiento_1 = new Requerimiento_1();
            
            requerimiento_1.setCiudad(resultSet.getString("Ciudad"));
            requerimiento_1.setAcabados(resultSet.getString("Acabados"));
            requerimiento_1.setClasificacion(resultSet.getString("Clasificacion"));
            requerimiento_1.setBanco_Vinculado(resultSet.getString("Banco_Vinculado"));
            requerimiento_1.setConstructora(resultSet.getString("Constructora"));

            respuesta.add(requerimiento_1);
        }
        resultSet.close();
        statement.close();
        } catch(SQLException e){
            System.err.println("Error consultando: "+e);
        } finally{
            if(conexion != null){
                conexion.close();
            }
        }
        return respuesta;
    }
}

class Requerimiento_2Dao {
    public ArrayList<Requerimiento_2> requerimiento2()  throws SQLException {
        // Su código
        /*
        select Nombre , Primer_Apellido,Ciudad_Residencia ,Cargo , Salario "Ingreso mensual" 
from Lider l 
where (Cargo = 'Asesor' OR Cargo='Coordinador')
AND Salario <=250000 ;
        
            // Su código
        ArrayList<Requerimiento_2> respuesta = new ArrayList<Requerimiento_2>();
        Connection conexion = JDBCUtilities.getConnection();
    
            try{
                String Consulta =   "SELECT Lider.Nombre, Lider.Primer_Apellido, Lider.Ciudad_Residencia, Lider.Cargo, Lider.Salario "+
                                    "FROM Lider "+
                                    "WHERE (Lider.Cargo = 'Asesor' OR Lider.Cargo = 'Coordinador') AND Lider.Salario < 250000; ";
                PreparedStatement statement = conexion.prepareStatement(Consulta);
                ResultSet resultSet = statement.executeQuery();
    
            while(resultSet.next()){
                Requerimiento_2 requerimiento_2 = new Requerimiento_2();
                
                requerimiento_2.setNombre(resultSet.getString("Nombre"));
                requerimiento_2.setPrimer_Apellido(resultSet.getString("Primer_Apellido"));
                requerimiento_2.setCiudad_Residencia(resultSet.getString("ciudad_Residencia"));
                requerimiento_2.setCargo(resultSet.getString("cargo"));
                requerimiento_2.setSalario(resultSet.getString("salario"));
    
                respuesta.add(requerimiento_2);
            }
            resultSet.close();
            statement.close();
            } catch(SQLException e){
                System.err.println("Error consultando: "+e);
            } finally{
                if(conexion != null){
                    conexion.close();
                }
            }
            return respuesta;
    } 
}

class Requerimiento_3Dao {
        public ArrayList<Requerimiento_3> requerimiento3()  throws SQLException {
        // Su código
        /*
        select c.Proveedor, c.Pagado ,   p.Constructora 
from compra c
inner join Proyecto p
on c.ID_Proyecto  = p.ID_Proyecto
where c.Pagado = 'No'
and c.Proveedor = 'JUMBO';
Resultado5:

ArrayList<Requerimiento_3> respuesta = new ArrayList<Requerimiento_3>();
        Connection conexion = JDBCUtilities.getConnection();
    
            try{
                String Consulta =   "SELECT Compra.Proveedor, Compra.Pagado, Proyecto.Constructora "+
                                    "FROM Proyecto "+
                                    "INNER JOIN Compra ON Compra.ID_Proyecto = Proyecto.ID_Proyecto "+
                                    "WHERE Compra.Proveedor = 'JUMBO' AND Compra.Pagado = 'No'; ";
                PreparedStatement statement = conexion.prepareStatement(Consulta);
                ResultSet resultSet = statement.executeQuery();
    
            while(resultSet.next()){
                Requerimiento_3 requerimiento_3 = new Requerimiento_3();
                
                requerimiento_3.setProveedor(resultSet.getString("proveedor"));
                requerimiento_3.setPagado(resultSet.getString("pagado"));
                requerimiento_3.setConstructora(resultSet.getString("constructora"));
                
                respuesta.add(requerimiento_3);
            }
            resultSet.close();
            statement.close();
            } catch(SQLException e){
                System.err.println("Error consultando: "+e);
            } finally{
                if(conexion != null){
                    conexion.close();
                }
            }
            return respuesta;
    }
}
*/

package Modelo.vo;

public class Requerimiento_1 {
    // Su código
    /*
    SELECT Proyecto.Ciudad, Proyecto.Acabados, Proyecto.Clasificacion, Proyecto.Banco_Vinculado, Proyecto.Constructora
FROM Proyecto
WHERE Proyecto.Ciudad = "Bogota";
    */
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

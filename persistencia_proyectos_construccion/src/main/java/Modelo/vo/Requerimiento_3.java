package Modelo.vo;

public class Requerimiento_3 {
// Su código
/*
SELECT Compra.Proveedor, Compra.Pagado, Proyecto.Constructora
FROM Proyecto
INNER JOIN Compra ON Compra.ID_Proyecto = Proyecto.ID_Proyecto
WHERE Compra.Proveedor = "JUMBO" AND Compra.Pagado = "No";
*/
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

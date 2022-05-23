/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mundo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author juanf
 */
public class accesoDB {
    
    Connection conexion;
    
    public void conectar(){
        try {
            conexion = DriverManager.getConnection("jdbc:postgresql://localhost:5432/Interactiva","postgres","univalle");
        } catch (SQLException ex) {
            Logger.getLogger(accesoDB.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void insertar(Plato plato){
        try {
            Statement stmt = conexion.createStatement();
            String consulta = "INSERT INTO public.\"Plato\"(\n" +
"	\"Nombre\", \"Descripcion\", \"Costo\", \"Tiempo preparacion\", \"Tipo Plato\")\n" +
"	VALUES ('"+plato.getNombre()+"', '"+plato.getDescripcion()+"', '"+plato.getCosto()+"', '"+plato.getTiempoPreparacion()+"', '"+plato.getTipoPlato()+"');";
            stmt.executeUpdate(consulta);
        } catch (SQLException ex) {
            Logger.getLogger(accesoDB.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void modificar(Plato plato){
        try {
            Statement stmt = conexion.createStatement();
            String consulta = "UPDATE public.\"Plato\"\n" +
"	SET \"Descripcion\"='"+plato.getDescripcion()+"', \"Costo\"='"+plato.getCosto()+"', \"Tiempo preparacion\"='"+plato.getTiempoPreparacion()+"', \"Tipo Plato\"='"+plato.getTipoPlato()+"'\n" +
"	WHERE \"Nombre\" = '"+plato.getNombre()+"';";
            stmt.executeUpdate(consulta);
        } catch (SQLException ex) {
            Logger.getLogger(accesoDB.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void eliminar(Plato plato){
        try {
            Statement stmt = conexion.createStatement();
            String consulta = "DELETE FROM public.\"Plato\"\n" +
"           WHERE \"Nombre\" = '"+plato.getNombre()+"';";
            stmt.executeUpdate(consulta);
        } catch (SQLException ex) {
            Logger.getLogger(accesoDB.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void consultar(){
        try {
            Statement stmt = conexion.createStatement();
            String consulta = "SELECT \"Nombre\", \"Descripcion\", \"Costo\", \"Tiempo preparacion\", \"Tipo Plato\"\n" +
"	FROM public.\"Plato\";";
            ResultSet resultado = stmt.executeQuery(consulta);
            DefaultTableModel modelo = new DefaultTableModel();
            modelo.addColumn("Nombre");
            modelo.addColumn("Descripción");
            modelo.addColumn("Costo");
            modelo.addColumn("Tiempo de preparación");
            modelo.addColumn("Tipo de plato");            
            while(resultado.next()){
                Object[] fila = new Object[5];
                for (int i = 0; i < fila.length; i++) {
                    fila[i] = resultado.getObject(i+1);   
                }
                modelo.addRow(fila);
            }
            JTable table = new JTable(modelo);
            JScrollPane scroll = new JScrollPane(table);
            JOptionPane.showMessageDialog(null, scroll);
        } catch (SQLException ex) {
            Logger.getLogger(accesoDB.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}

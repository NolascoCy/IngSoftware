
package com.ues.ingsoftware.util;

import com.ues.ingsoftware.util.Propiedades;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;

/* @author JL Desk */
public final class Conexion {
    /* DATOS PARA LA CONEXION */
    /** usuario */
    private String user;
    /** contraseña de MySql*/
    private String password;
    /** Cadena de conexion */
    private String url;
    /** Servidor */
    private String servidor;
    /** Puerto del servidor*/
    private String puerto;
    /** base de datos por defecto es test*/
    private String db;
    /** variable para trabajar con la conexion a la base de datos */
    private Connection conexion;
    /** variable para capturar el error*/
    private String error;
    Propiedades prop = new Propiedades();
    
    /** Constructor de clase */ 
    public Conexion(){
        setUser(prop.getUser());
        setPassword(prop.getPass());
        setServidor(prop.getServer());
        setPuerto(prop.getPort());
        setDb(prop.getDatabase());
    }
    
    public Conexion(String user, String pass, String servidor, String puerto, String database){
        setUser(user);
        setPassword(pass);
        setServidor(servidor);
        setPuerto(puerto);
        setDb(database);
    }
    
    public Connection getConexion(){
        return this.conexion;
    }
    
    /**
     * @param conexion the conexion to set
     */
    public void setConexion(Connection conexion) {
        this.conexion = conexion;
    }
    
    /**
     * @return the url
     */
    public String getUrl() {
        return url;
    }

    /**
     * @param url the url to set
     */
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * @return the user
     */
    public String getUser() {
        return user;
    }

    /**
     * @param user the user to set
     */
    public void setUser(String user) {
        this.user = user;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * @return the servidor
     */
    public String getServidor() {
        return servidor;
    }

    /**
     * @param servidor the servidor to set
     */
    public void setServidor(String servidor) {
        this.servidor = servidor;
    }

    /**
     * @return the puerto
     */
    public String getPuerto() {
        return puerto;
    }

    /**
     * @param puerto the puerto to set
     */
    public void setPuerto(String puerto) {
        this.puerto = puerto;
    }

    /**
     * @return the db
     */
    public String getDb() {
        return db;
    }

    /**
     * @param db the db to set
     */
    public void setDb(String db) {
        this.db = db;
    }
    
    public void conectar(){
        setUrl("jdbc:postgresql://"+getServidor()+":"+getPuerto()+"/"+getDb());
        try{
            //obtenemos el driver de para mysql
            Class.forName("org.postgresql.Driver");
            //obtenemos la conexión
            setConexion(DriverManager.getConnection(getUrl(), getUser() , getPassword() )); 
        }catch(SQLException | ClassNotFoundException e){
            System.out.println(e.getMessage());
            //new Mensajes().mensajeError("Error de conexión a base de datos");
            setConexion(null);
        }
    }
    
    public void desconectar(){
        try {
            getConexion().close();
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * @return the error
     */
    public String getError() {
        return error;
    }

    /**
     * @param error the error to set
     */
    public void setError(String error) {
        this.error = error;
    }
    
}

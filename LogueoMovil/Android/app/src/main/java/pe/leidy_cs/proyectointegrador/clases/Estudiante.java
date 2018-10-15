package pe.leidy_cs.proyectointegrador.clases;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.ArrayList;

public class Estudiante {
    String id_est;
    String nombre_est;
    String correo_est;
    String password_est;

    public String getId_est() {
        return id_est;
    }

    public void setId_est(String id_est) {
        this.id_est = id_est;
    }

    public String getNombre_est() {
        return nombre_est;
    }

    public void setNombre_est(String nombre_est) {
        this.nombre_est = nombre_est;
    }

    public String getCorreo_est() {
        return correo_est;
    }

    public void setCorreo_est(String correo_est) {
        this.correo_est = correo_est;
    }

    public String getPassword_est() {
        return password_est;
    }

    public void setPassword_est(String password_est) {
        this.password_est = password_est;
    }

    public static ArrayList<Estudiante> obtenerEstudiantes(String json){
        Gson gson = new Gson();
        Type type = new TypeToken<ArrayList<Estudiante>>(){}.getType();
        return gson.fromJson(json, type);
    }
}

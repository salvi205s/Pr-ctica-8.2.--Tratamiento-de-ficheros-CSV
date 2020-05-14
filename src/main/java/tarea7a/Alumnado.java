/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea7a;

import java.time.LocalDate;
import java.util.Objects;

/**
 * A) Una clase Alumnado con los atributos necesarios para guardar cada uno de
 * los campos de los registros del archivo. Añade constructores, getters,
 * setters, toString, equals, hashcode.
 *
 * @author Salva
 */
public class Alumnado {

    private String alumno;
    private String direccion;
    private String codigoPostal;
    private String locResidencia;
    private LocalDate fechNacimiento;
    private String curso;
    private String unidad;
    private int edad;
    private String sexo;
    private String provinciaNacimiento;
    private String paisNacimiento;
    private String nacionalidad;

    public Alumnado(String alumno, String direccion, String codigoPostal, String locResidencia, LocalDate fechNacimiento, String curso, String unidad, int edad, String sexo, String provinciaNacimiento, String paisNacimiento, String nacionalidad) {
        this.alumno = alumno;
        this.direccion = direccion;
        this.codigoPostal = codigoPostal;
        this.locResidencia = locResidencia;
        this.fechNacimiento = fechNacimiento;
        this.curso = curso;
        this.unidad = unidad;
        this.edad = edad;
        this.sexo = sexo;
        this.provinciaNacimiento = provinciaNacimiento;
        this.paisNacimiento = paisNacimiento;
        this.nacionalidad = nacionalidad;
    }

    public String getAlumno() {
        return alumno;
    }

    public void setAlumno(String alumno) {
        this.alumno = alumno;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCodigoPostal() {
        return codigoPostal;
    }

    public void setCodigoPostal(String codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    public String getLocResidencia() {
        return locResidencia;
    }

    public void setLocResidencia(String locResidencia) {
        this.locResidencia = locResidencia;
    }

    public LocalDate getFechNacimiento() {
        return fechNacimiento;
    }

    public void setFechNacimiento(LocalDate fechNacimiento) {
        this.fechNacimiento = fechNacimiento;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getUnidad() {
        return unidad;
    }

    public void setUnidad(String unidad) {
        this.unidad = unidad;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getProvinciaNacimiento() {
        return provinciaNacimiento;
    }

    public void setProvinciaNacimiento(String provinciaNacimiento) {
        this.provinciaNacimiento = provinciaNacimiento;
    }

    public String getPaisNacimiento() {
        return paisNacimiento;
    }

    public void setPaisNacimiento(String paisNacimiento) {
        this.paisNacimiento = paisNacimiento;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 83 * hash + Objects.hashCode(this.alumno);
        hash = 83 * hash + Objects.hashCode(this.direccion);
        hash = 83 * hash + Objects.hashCode(this.codigoPostal);
        hash = 83 * hash + Objects.hashCode(this.locResidencia);
        hash = 83 * hash + Objects.hashCode(this.fechNacimiento);
        hash = 83 * hash + Objects.hashCode(this.curso);
        hash = 83 * hash + Objects.hashCode(this.unidad);
        hash = 83 * hash + this.edad;
        hash = 83 * hash + Objects.hashCode(this.sexo);
        hash = 83 * hash + Objects.hashCode(this.provinciaNacimiento);
        hash = 83 * hash + Objects.hashCode(this.paisNacimiento);
        hash = 83 * hash + Objects.hashCode(this.nacionalidad);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Alumnado other = (Alumnado) obj;
        if (this.edad != other.edad) {
            return false;
        }
        if (!Objects.equals(this.alumno, other.alumno)) {
            return false;
        }
        if (!Objects.equals(this.direccion, other.direccion)) {
            return false;
        }
        if (!Objects.equals(this.codigoPostal, other.codigoPostal)) {
            return false;
        }
        if (!Objects.equals(this.locResidencia, other.locResidencia)) {
            return false;
        }
        if (!Objects.equals(this.curso, other.curso)) {
            return false;
        }
        if (!Objects.equals(this.unidad, other.unidad)) {
            return false;
        }
        if (!Objects.equals(this.sexo, other.sexo)) {
            return false;
        }
        if (!Objects.equals(this.provinciaNacimiento, other.provinciaNacimiento)) {
            return false;
        }
        if (!Objects.equals(this.paisNacimiento, other.paisNacimiento)) {
            return false;
        }
        if (!Objects.equals(this.nacionalidad, other.nacionalidad)) {
            return false;
        }
        if (!Objects.equals(this.fechNacimiento, other.fechNacimiento)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Alumnado{" + "alumno=" + alumno + ", direccion=" + direccion + ", codigoPostal=" + codigoPostal + ", locResidencia=" + locResidencia + ", fechNacimiento=" + fechNacimiento + ", curso=" + curso + ", unidad=" + unidad + ", edad=" + edad + ", sexo=" + sexo + ", provinciaNacimiento=" + provinciaNacimiento + ", paisNacimiento=" + paisNacimiento + ", nacionalidad=" + nacionalidad + '}';
    }

}

package org.example;

import java.util.*;

public class Classroom {
    public String nombreAsignatura ;
    public ArrayList<clase2> alumnado;
    public static final int MAX_ALUMNO = 50;
    public static int ALUMNOS_MATRICULADOS = 0;

    public Classroom(String nombreAsignatura, ArrayList<clase2> alumnado) {
        this.nombreAsignatura = nombreAsignatura;
        this.alumnado = alumnado;
    }

    public int anyadirPersona(clase2 classeo) {
        if (ALUMNOS_MATRICULADOS < 50) {
            alumnado[ALUMNOS_MATRICULADOS] = classeo;
            ALUMNOS_MATRICULADOS++;
            return 1;
        } else {
            return 0;
        }
    }

    public clase2 nombrarAlumno(int n) throws Exception {
        if (alumnado[n] == null)
            return alumnado[n];
        else
            throw new Exception("excepcion");
    }

    public boolean darDeBajaAlumno(String nombre) {
        int i = 0;
        for(clase2 c4 : alumnado) {
            if(alumnado[i].equals(new clase2(nombre)))
                break;
            i++;
        }
        if(i==50) {
            return false;
        } else {
            alumnado[i] = null;
            return false;
        }
    }
}

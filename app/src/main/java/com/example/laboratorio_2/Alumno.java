package com.example.laboratorio_2;

public class Alumno {
    String aPaterno,aMaterno,nombres,fecNacimiento,colProcedencia,Postula;
    public Alumno(){}
    public Alumno(String ap, String am, String name, String fecNac, String colPro, String Postula){
        this.aPaterno = ap;
        this.aMaterno = am;
        this.nombres = name;
        this.fecNacimiento = fecNac;
        this.colProcedencia = colPro;
        this.Postula = Postula;
    }
    @Override
    public String toString(){
        return this.aPaterno+", "+this.aMaterno+", "+this.nombres+", "+this.fecNacimiento+", "+this.colProcedencia+", "+this.Postula;
    }

}
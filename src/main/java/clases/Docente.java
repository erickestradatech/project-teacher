package clases;

import java.text.DecimalFormat;

public class Docente {

    private String codigo;
    private String nombre;
    private double horas;
    private double tarifa;

    static int cuenta = 1;

    public Docente(String nombre, double horas, double tarifa) {

        DecimalFormat sd = new DecimalFormat("0000");
        this.codigo = "D" + sd.format(cuenta);
        this.nombre = nombre;
        this.horas = horas;
        this.tarifa = tarifa;
        cuenta++;
    }

    public double sueldo() {

        return tarifa * horas;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getHoras() {
        return horas;
    }

    public void setHoras(double horas) {
        this.horas = horas;
    }

    public double getTarifa() {
        return tarifa;
    }

    public void setTarifa(double tarifa) {
        this.tarifa = tarifa;
    }

}

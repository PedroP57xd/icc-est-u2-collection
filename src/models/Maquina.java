package models;

import java.util.List;

public class Maquina implements Comparable<Maquina> {
    private String nombre;
    private String ip;
    private List<Integer> codigos;
    private int subred;
    private int riesgo;

    public Maquina() {
    }

    public Maquina(String nombre, String ip, int subred, int riesgo) {
        this.nombre = nombre;
        this.ip = ip;
        this.subred = calcularSubred();
        this.riesgo = riesgo;
    }

    // IP: conjunto de bits que identifica la red, ej: 190.168.10.1 La subred seria
    // el tercer octeto -> 10
    private int calcularSubred() {
        String[] octetos = ip.split("\\.");
        String subred = octetos[2];
        return Integer.parseInt(subred);
    }

    private int calcularRiesgo() {
        return 0;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public int getSubred() {
        return subred;
    }

    public void setSubred(int subred) {
        this.subred = subred;
    }

    public int getRiesgo() {
        return riesgo;
    }

    public void setRiesgo(int riesgo) {
        this.riesgo = riesgo;
    }

    @Override
    public int compareTo(Maquina o) {
        int comSubR = Integer.compare(this.subred, o.getSubred());

        if (comSubR == 0) {
            return this.getNombre().compareToIgnoreCase(o.getNombre());
        } else {
            return comSubR;
        }
    }

}

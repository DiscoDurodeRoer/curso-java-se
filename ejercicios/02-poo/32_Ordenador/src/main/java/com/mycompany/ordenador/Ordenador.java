package com.mycompany.ordenador;

import java.util.Objects;

public class Ordenador {

    // Atributos
    private String marca;
    private String modelo;
    private int gbRam;
    private int capacidadDiscoDuro;
    private int espacioUtilizado;
    private boolean encendido;

    // Constructores
    public Ordenador() {
        this("", "", 4, 50);
    }

    public Ordenador(int gbRam) {
        this("", "", gbRam, 50);
    }

    public Ordenador(int gbRam, int capacidadDiscoDuro) {
        this("", "", gbRam, capacidadDiscoDuro);
    }

    public Ordenador(String marca, String modelo, int gbRam, int capacidadDiscoDuro) {

        // Valido si los GB son potencia de 2
        if (!esPotenciaDe2(gbRam)) {
            throw new IllegalArgumentException("La RAM no es potencia de 2");
        }

        this.marca = marca;
        this.modelo = modelo;
        this.gbRam = gbRam;
        this.capacidadDiscoDuro = capacidadDiscoDuro;
    }

    // Getters y setters
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getGbRam() {
        return gbRam;
    }

    public void setGbRam(int gbRam) {
        // Valido si los GB son potencia de 2
        if (!esPotenciaDe2(gbRam)) {
            throw new IllegalArgumentException("La RAM no es potencia de 2");
        }
        this.gbRam = gbRam;
    }

    public int getCapacidadDiscoDuro() {
        return capacidadDiscoDuro;
    }

    public void setCapacidadDiscoDuro(int capacidadDiscoDuro) {
        this.capacidadDiscoDuro = capacidadDiscoDuro;
    }

    public int getEspacioUtilizado() {
        return espacioUtilizado;
    }

    public void setEspacioUtilizado(int espacioUtilizado) {
        this.espacioUtilizado = espacioUtilizado;
    }

    public boolean isEncendido() {
        return encendido;
    }

    public void setEncendido(boolean encendido) {
        this.encendido = encendido;
    }

    // Metodos
    public void encender() {
        // Compruebo si esta encendido
        if (this.encendido) {
            System.out.println("El ordenador ya esta encendido");
        } else {
            // Enciendo el ordenador
            this.encendido = true;
            System.out.println("El ordenador se ha encendido");
        }
    }

    public void apagar() {
        // Compruebo si esta apagado
        if (!this.encendido) {
            System.out.println("El ordenador ya esta apagado");
        } else {
            // Apago el ordenador
            this.encendido = false;
            System.out.println("El ordenador se ha apagado");
        }
    }

    public void transferirArchivos(int gb) {
        // Compruebo si esta apagado
        if (this.encendido) {

            // Compruebo si hay espacio
            if (this.espacioUtilizado + gb <= this.capacidadDiscoDuro) {
                // Aumentamos el espacio
                this.espacioUtilizado += gb;
                System.out.println("Transferidos " + gb + " GB. Espacio actual: " + this.espacioUtilizado);
            } else {
                System.out.println("No hay espacio suficiente");
            }

        } else {
            System.out.println("El ordenador esta apagado");
        }
    }

    public void eliminarArchivos(int gb) {
        // Compruebo si esta apagado
        if (this.encendido) {

            // Compruebo si el espacio resultante es negativo para dejarlo a 0
            if (this.espacioUtilizado - gb < 0) {
                this.espacioUtilizado = 0;
            } else {
                // Disminuimos el espacio
                this.espacioUtilizado -= gb;
            }
            System.out.println("Eliminados " + gb + " GB. Espacio actual: " + this.espacioUtilizado);

        } else {
            System.out.println("El ordenador esta apagado");
        }
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + Objects.hashCode(this.marca);
        hash = 29 * hash + Objects.hashCode(this.modelo);
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
        final Ordenador other = (Ordenador) obj;
        if (!Objects.equals(this.marca, other.marca)) {
            return false;
        }
        return Objects.equals(this.modelo, other.modelo);
    }

    @Override
    public String toString() {

        // Convirtiendo el estado del atributo encendido
        String estadoEncendido = "no";

        if (this.encendido) {
            estadoEncendido = "si";
        }

        return "Ordenador{" + "marca=" + marca + ", modelo=" + modelo + ", gbRam=" + gbRam + ", capacidadDiscoDuro=" + capacidadDiscoDuro + ", espacioUtilizado=" + espacioUtilizado + ", encendido=" + estadoEncendido + '}';
    }

    // Privado, solo se puede llamar desde dentro de la clase
    private boolean esPotenciaDe2(int numero) {
        // Si es negativo, no es potencias de 2
        if (numero <= 0) {
            return false;
        }

        // Obtenemos el logaritmo del numero y lo dividimos entre el logaritmo de 2
        // Si es logaritmo de 2 no debe tener decimales
        double logBase2 = Math.log(numero) / Math.log(2);
        return logBase2 == (int) logBase2;

    }

}

package com.mycompany.modificadores_acesso;

public class Persona {

    /*
        private: solo accesible dentro de la clase (RECOMENDADO)
    
        protected: solo accesible dentro la clase y sus hijas
    
        public: accesible desde cualquier clase de cualquier paquete
    
        friendly o "sin modificador": accesible a cualquier clase dentro de su paquete
     */
    private String nombre;
    private String apellidos;
    private int edad;

}

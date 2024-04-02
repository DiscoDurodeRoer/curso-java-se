package com.mycompany.empleado;

public class Validator {

    public static void validarDNI(String DNI) throws Exception {

        if(!DNI.matches("^[0-9]{7,8}[T|R|W|A|G|M|Y|F|P|D|X|B|N|J|Z|S|Q|V|H|L|C|K|E]$")){
            throw new Exception("El formato del DNI es incorrecto");
        }
        
    }

}

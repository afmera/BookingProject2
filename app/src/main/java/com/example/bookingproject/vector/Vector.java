package com.example.bookingproject.vector;

import com.example.bookingproject.model.Persona;

public class Vector {
    private Persona[] persona;

    public Persona[] getPersona() {
        return persona;
    }

    public void setPersona(Persona[] persona) {
        this.persona = persona;
    }

    /**
     * Metodo para generar espacion en memoria al vector de tipo persona.
     */
    public void crearPersona() {
        this.persona = new Persona[1];
    }

    /**
     * Metodo para agregar el tipo persona al vector.
     *
     * @param persona
     */
    public void agregarPersona(Persona persona) {
        this.persona[0] = persona;
    }

    /**
     * Metodo para obtener el nombre del usuario.
     *
     * @return de tipo String.
     */
    public String getNombrePersona() {
        return this.persona[0].getNombreCompleto();
    }
}

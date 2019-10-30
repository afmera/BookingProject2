package com.example.bookingproject.vector;

import com.example.bookingproject.model.Persona;

public class Vector {
    private Persona[] persona;

    public Vector() {
        this.persona=new Persona[1];
    }

    public Persona[] getPersona() {
        return persona;
    }

    public void setPersona(Persona[] persona) {
        this.persona = persona;
    }

    public void crear(Persona p)
    {
        persona[0]=p;
    }
}

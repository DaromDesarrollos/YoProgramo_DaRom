package com.portafolio.Darom.Interface;

import com.portafolio.Darom.Entity.Persona;
import java.util.List;

public interface IPersonaService {
    
    //Lista de Personas
    public List<Persona> getPersona();
    
    //Guardar
    public void savePersona(Persona persona);
    
    //Eliminar
    public void deletePersona(Long id);
    
    public Persona findPersona(Long id);
    
    
}

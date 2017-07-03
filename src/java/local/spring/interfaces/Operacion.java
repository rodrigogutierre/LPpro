/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package local.spring.interfaces;

import java.util.List;

/**
 *
 * @author rodrigo gutierrez
 */
public interface Operacion <Entidad>{
    public int create (Entidad d);
    public int update (Entidad d);
    public int delete (int id);
    public List<Entidad> readAll();
    public List<Entidad> buscar(int id);
    
    
}

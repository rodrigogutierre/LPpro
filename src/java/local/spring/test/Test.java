/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package local.spring.test;

import java.sql.Connection;
import java.util.List;
import javax.persistence.EntityManager;
import local.spring.dao.UsuarioDAO;
import local.spring.model.Usuario;

/**
 *static Usuario us = new Usuario();
    static UsuarioDAO ud = new UsuarioDAO();
    static Connection cx;
 * @author rodrigo gutierrez
 */
    public class Test {
      private static UsuarioDAO ud = new UsuarioDAO();
      private static Usuario u = new Usuario();
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        crear();
        //eliminar();
        //editar();
        //listar();
    }
    public static void conex(EntityManager f){
        System.out.println("F: "+f.isOpen());
       
    }
    
    public static void crear(){
        Usuario u = new Usuario();
        u.setUser("rodrigo");
        u.setPass("hola123");
        u.setEstado(0);
        u.setContador(1);
        if(ud.create(u)==1){
            System.out.println("si");
        }else{
            System.out.println("no");
        }
    }
    public static void editar(){
        Usuario u = new Usuario();
        int x = 2;
        u.setUser("gatokun");
        u.setPass("Colt");
        if(ud.update(u)==1){
            System.out.println("si");
        }else{
            System.out.println("no");
        }
    }
    public static void eliminar(){
        int x = 0;        
        if(ud.delete(x)==1){
            System.out.println("si");
        }else{
            System.out.println("no");
        }
    }
    public static void listar(){
        List<Usuario> lista = ud.readAll();
        for(Usuario us:lista){
            System.out.println(us.getUser()+"\t"+us.getIdusuario()+"\t"+us.getEstado());
        }
    }
}
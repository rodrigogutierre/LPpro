/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package local.spring.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import local.spring.interfaces.Operacion;
import local.spring.model.Usuario;
import local.spring.util.Conexion;
import org.hibernate.Session;


/**
 *
 * @author rodrigo gutierrez
 */
public class UsuarioDAO implements  Operacion<Usuario>{
//    private PreparedStatement ps;
//    private ResultSet rs;
//    private Connection cx;
//    
//  
//    private final static String SQL_VALIDA = "SELECT * FROM usuario WHERE user=? AND clave=?";

    @Override
    public int create(Usuario d) {
        Session session = Conexion.getSessionFactory().openSession(); 
        int x = 0;
        try {
            session.beginTransaction();
            session.merge(d);
            session.flush();
            session.getTransaction().commit();
            x =1;            
        } catch (Exception e) {
            e.printStackTrace();
            session.getTransaction().rollback();
        }finally{
        session.close();
        }
       return x;}

    @Override
    public int update(Usuario d) {
        int x = 0;
        Session session = Conexion.getSessionFactory().openSession();
        Usuario p1 = new Usuario();
        try {
            session.beginTransaction();
            session.update(d);
            session.getTransaction().commit();
            x = 1;
        } catch (Exception e) {
            e.printStackTrace();
            session.getTransaction().rollback();
        } finally {
            session.close();
        }
        return x; 
    }

    @Override
    public int delete(int id) {
        int x = 0;
        Session session = Conexion.getSessionFactory().openSession();
        try {
             session.beginTransaction();
             Usuario u = (Usuario) session.get(Usuario.class,id);
             session.delete(u);
             session.getTransaction().commit();
             x = 1;
        } catch (Exception e) {
            e.printStackTrace();
            session.getTransaction().rollback();
        }finally{
            session.close();
        }
        return x;
    }

    @Override
    public List<Usuario> readAll() {
List<Usuario> lista = new ArrayList<>(); 
        Session session = Conexion.getSessionFactory().openSession();
        try {
            session.beginTransaction();
            lista = session.createCriteria(Usuario.class).list();
            int count = lista.size();
            session.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
            session.getTransaction().rollback();
        }finally{
            session.close();
        }        
        return lista;}

    @Override
    public List<Usuario> buscar(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public int validar(String user, String clave){throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
//        int op=0;
//        try {
//            Session session = Conexion.getSessionFactory().openSession();
//            ps = cx.prepareStatement(SQL_VALIDA);
//            ps.setString(1, user);
//            ps.setString(2, clave);
//            rs = ps.executeQuery();
//            while(rs.next()){
//                op = 1;
//            }
//        } catch (Exception e) {
//            System.out.println("Error: "+e);
//        }
//        return op;
//    }
}
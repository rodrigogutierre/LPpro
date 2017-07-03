/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package local.spring.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import local.spring.dao.UsuarioDAO;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author rodrigo gutierrez
 */
public class ControllerHome {
    
    UsuarioDAO ud = new UsuarioDAO();
    
    @RequestMapping(value="/hola")
    public String listar(){	
            return "Login";
    }
    @RequestMapping("/user")
    public String user() {
        return "user";
    }

    @RequestMapping("/v")
    public String principal(HttpServletRequest request, HttpServletResponse response) {
        String url = "index";
        String user = request.getParameter("user");
        String clave = request.getParameter("clave");
        try {
            if (ud.validar(user, clave) == 1) {
                request.setAttribute("user", user);
                url = "principal";
            }
        } catch (Exception e) {
            System.out.println("Error:" + e);
        }

        return url;
    }
}

package solunar.portfolio.server.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletResponse;

/**
 * Created by dhjung on 2018. 6. 20..
 */
@Controller
public class PageController {
    @RequestMapping(value = "/")
    public void directPage(HttpServletResponse response){
        try {
            response.sendRedirect("/view/index.html");
        }catch (Exception e){

        }
    }
}

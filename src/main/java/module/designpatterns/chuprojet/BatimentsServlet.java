package module.designpatterns.chuprojet;

import com.fasterxml.jackson.databind.ObjectMapper;
import jakarta.inject.Inject;
import jakarta.persistence.EntityManager;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import module.designpatterns.chuprojet.Batiment.modal.Batiment;

import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "helloServlet", value = "/batiments")
public class BatimentsServlet extends HttpServlet {

    private String message;
    @Inject
    private ObjectMapper objectMapper;
    @Inject
    private EntityManager entityManager;

    public void init() {
        message = "Hello World!";
    }

    @Produces(MediaType.APPLICATION_JSON)
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        PrintWriter out = response.getWriter();
        out.print(objectMapper.writeValueAsString(
                entityManager.createQuery("select b from Batiment b", Batiment.class).getResultList()));
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        //create Batiments
    }

    public void destroy() {
    }
}
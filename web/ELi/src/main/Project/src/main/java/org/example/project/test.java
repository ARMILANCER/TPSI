package org.example.project;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import java.io.PrintWriter;
import java.io.IOException;
import java.io.FileWriter;

@WebServlet(name = "test", value="/test")
public class test extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String name = request.getParameter("name");
        String surname = request.getParameter("surname");
        String taxIDCode = request.getParameter("taxIDCode");
        String course = request.getParameter("course");
        saveToCsv(name, surname, taxIDCode, course);
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h2>Registration has been made</h2>");
        out.println("<p><strong>Name: </strong> " + name + "</p>");
        out.println("<p><strong>Surname: </strong> " + surname + "</p>");
        out.println("<p><strong>Tax ID Code: </strong> " + taxIDCode + "</p>");
        out.println("<p><strong>Course: </strong> " + course + "</p>");
        out.println("</body></html>");
    }

    private void saveToCsv(String nome, String cognome, String codiceFiscale, String classe) throws IOException {
        try (FileWriter writer = new FileWriter("/Users/christianbrito/Documents/Eli/Informatica/Project/src/main/java/org/example/project/data.csv", true)) {
            writer.append(nome).append(";");
            writer.append(cognome).append(";");
            writer.append(codiceFiscale).append(";");
            writer.append(classe).append("\n");
        }
    }
}

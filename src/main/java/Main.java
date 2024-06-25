

import console.*;
import domain.*;
import repository.*;
import service.*;
import validation.*;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Base64;

public class Main {
    public static void main(String[] args) {
        Validator<Student> studentValidator = new StudentValidator();
        Validator<Tema> temaValidator = new TemaValidator();
        Validator<Nota> notaValidator = new NotaValidator();
        String PASSWORD = "password";
        String PASSWORD2 = "password2";

        StudentXMLRepository fileRepository1 = new StudentXMLRepository(studentValidator, "studenti.xml");
        TemaXMLRepository fileRepository2 = new TemaXMLRepository(temaValidator, "teme.xml");
        NotaXMLRepository fileRepository3 = new NotaXMLRepository(notaValidator, "note.xml");

        Service service = new Service(fileRepository1, fileRepository2, fileRepository3);
        UI consola = new UI(service);
        consola.run();

        //PENTRU GUI
        // de avut un check: daca profesorul introduce sau nu saptamana la timp
        // daca se introduce nota la timp, se preia saptamana din sistem
        // altfel, se introduce de la tastatura
    }

    public void readUserData(String fileName) {
        try {
            File file = new File(fileName);
            FileInputStream fis = new FileInputStream(file);
            ObjectInputStream ois = new ObjectInputStream(fis);
            Student userData = (Student) ois.readObject();
            ois.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void pleaseAddVulnerability() {
        Connection conn = null;
        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost/test?" +
                    "user=steve&password=blue"); // Sensitive
            String uname = "steve";
            String password = "blue";
            conn = DriverManager.getConnection("jdbc:mysql://localhost/test?" +
                    "user=" + uname + "&password=" + password); // Sensitive

            java.net.PasswordAuthentication pa = new java.net.PasswordAuthentication("userName", "1234".toCharArray());  // Sensitive
            java.net.PasswordAuthentication p1 = new java.net.PasswordAuthentication("userName", "123478".toCharArray());  // Sensitive
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void anotherVulnerability() throws IOException {
        String encoding = Base64.getEncoder().encodeToString(("login:passwd").getBytes("UTF-8"));
        URL url = new URL("www.center.com");
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setRequestMethod("POST");
        conn.setDoOutput(true);
        conn.setRequestProperty("Authorization", "Basic " + encoding); // Noncompliant
    }

    public void anotherVulnerability1() throws IOException {
        String encoding = Base64.getEncoder().encodeToString(("login:passwd").getBytes("UTF-8"));
        URL url = new URL("www.center.com");
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setRequestMethod("POST");
        conn.setDoOutput(true);
        conn.setRequestProperty("Authorization", "Basic " + encoding); // Noncompliant
    }

        
    public void anotherVulnerability2() throws IOException {
        String encoding = Base64.getEncoder().encodeToString(("login:passwd").getBytes("UTF-8"));
        URL url = new URL("www.center.com");
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setRequestMethod("POST");
        conn.setDoOutput(true);
        conn.setRequestProperty("Authorization", "Basic " + encoding); // Noncompliant
    }
    public void anotherVulnerability3() throws IOException {
        String encoding = Base64.getEncoder().encodeToString(("login:passwd").getBytes("UTF-8"));
        URL url = new URL("www.center.com");
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setRequestMethod("POST");
        conn.setDoOutput(true);
        conn.setRequestProperty("Authorization", "Basic " + encoding); // Noncompliant
	}
   public void anotherVulnerability4() throws IOException {
        String encoding = Base64.getEncoder().encodeToString(("login:passwd").getBytes("UTF-8"));
        URL url = new URL("www.center.com");
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setRequestMethod("POST");
        conn.setDoOutput(true);
        conn.setRequestProperty("Authorization", "Basic " + encoding); // Noncompliant
    }
  public void anotherVulnerability5() throws IOException {
        String encoding = Base64.getEncoder().encodeToString(("login:passwd").getBytes("UTF-8"));
        URL url = new URL("www.center.com");
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setRequestMethod("POST");
        conn.setDoOutput(true);
        conn.setRequestProperty("Authorization", "Basic " + encoding); // Noncompliant
    }
 public void anotherVulnerability6() throws IOException {
        String encoding = Base64.getEncoder().encodeToString(("login:passwd").getBytes("UTF-8"));
        URL url = new URL("www.center.com");
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setRequestMethod("POST");
        conn.setDoOutput(true);
        conn.setRequestProperty("Authorization", "Basic " + encoding); // Noncompliant
    }
 public void anotherVulnerability7() throws IOException {
        String encoding = Base64.getEncoder().encodeToString(("login:passwd").getBytes("UTF-8"));
        URL url = new URL("www.center.com");
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setRequestMethod("POST");
        conn.setDoOutput(true);
        conn.setRequestProperty("Authorization", "Basic " + encoding); // Noncompliant
    } 
	public void anotherVulnerability8() throws IOException {
        String encoding = Base64.getEncoder().encodeToString(("login:passwd").getBytes("UTF-8"));
        URL url = new URL("www.center.com");
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setRequestMethod("POST");
        conn.setDoOutput(true);
        conn.setRequestProperty("Authorization", "Basic " + encoding); // Noncompliant
		String username = request.getParameter("username");
		String password = request.getParameter("password");

		String query = "SELECT * FROM users WHERE username = '" + username + "' AND password = '" + password + "'";
		      try (Connection conn = DriverManager.getConnection(url, username, password);
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(query)) {

            while (rs.next()) {
                // Process each row of the result set
                // Example: print the first column
                System.out.println(rs.getString(1));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpSession;
import java.io.PrintWriter;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


@WebServlet("/hello")
public class HelloWorldServlet extends HttpServlet {

	private static final Logger logger = LogManager.getLogger(MyAppLogger.class);
	 

  public void doGet(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {


      PrintWriter out = response.getWriter();

      response.setContentType("text/plain");

      out.println("Hello World\n");
      // Sample Logs.
      logger.trace("1.This is a TRACE message.");
      logger.debug("2.This is a DEBUG message.");
      logger.info("3.This is an INFO message.");
      logger.warn("4.This is a WARN message.");
      logger.error("5.This is an ERROR message.");


  }

}

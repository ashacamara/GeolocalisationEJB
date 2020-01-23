package sn.localisation.metier;

import java.io.IOException;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.geolocalisation.entities.Localite;
import com.geolocalisation.metier.ILocalite;

/**
 * Servlet implementation class LocaliteServlet
 */
@WebServlet("/Localite")
public class LocaliteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       @EJB
	private ILocalite localitedao;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LocaliteServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Localite localite = new Localite();
		localite.setNom("Thies");
		localite.setLatitude(14.7914);
		localite.setLongetitude(-16.9257);
		int ok = localitedao.add(localite);
		response.getWriter();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

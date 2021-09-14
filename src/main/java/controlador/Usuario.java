package controlador;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.JOptionPane;

import modelo.UsuarioDAO;
import modelo.UsuarioDTO;

@WebServlet("/Usuario")
public class Usuario extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Usuario() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String e,n,p,u;
		long d;
		boolean dat;
		UsuarioDTO usdto;
		UsuarioDAO usdao;
		if(request.getParameter("btnins")!=null) {
			d=Long.parseLong(request.getParameter("doc"));
			e=request.getParameter("ema");
			n=request.getParameter("nom");
			p=request.getParameter("cla");
			u=request.getParameter("usu");
			usdto=new UsuarioDTO(d, n, p, e, u);
			usdao=new UsuarioDAO();
			dat=usdao.insertrusuario(usdto);
			if(dat) {
				JOptionPane.showMessageDialog(null, "El usuario fue registrado");
				response.sendRedirect("usuarios.jsp");
			}
			
			else {
				JOptionPane.showMessageDialog(null, "El usuario  no fue registrado");
				response.sendRedirect("usuarios.jsp");
			}
		}
		
		if(request.getParameter("btncon")!=null) {
			
			d=Long.parseLong(request.getParameter("doc"));
			usdto=new UsuarioDTO(d);
			usdao=new UsuarioDAO();
			usdto=usdao.consultarusario(usdto);
			d=usdto.getDocumento();
			n=usdto.getNombre();
			e=usdto.getEmail();
			p=usdto.getClave();
			u=usdto.getUsuario();
			response.sendRedirect("usuarios.jsp?d="+d+"&&n="+n+"&&e="+e+"&&p="+p+"&&u="+u);
					
		}
		
		if(request.getParameter("btnact")!=null) {
					
		}
       if(request.getParameter("btneli")!=null) {
			
		}
		
		
		
	}

}

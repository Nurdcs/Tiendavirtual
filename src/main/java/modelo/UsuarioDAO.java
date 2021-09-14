package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import controlador.Conexion;

public class UsuarioDAO {
	Conexion con=new Conexion();
	Connection cnn=con.conexionbd();
	PreparedStatement ps;
	ResultSet rs;
	
	
	public boolean insertrusuario(UsuarioDTO us) {
		int x;
		boolean dat=false;
		try {
			ps=cnn.prepareStatement("INSERT INTO usuarios values(?,?,?,?,?)");
			ps.setLong(1, us.getDocumento());
			ps.setString(2, us.getEmail());
			ps.setString(3, us.getNombre());
			ps.setString(4, us.getClave());
			ps.setString(5, us.getUsuario());
			x=ps.executeUpdate();
			if(x>0) {
				dat=true;
			}
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		
		return dat;
	}
	
	public UsuarioDTO consultarusario(UsuarioDTO us) {
		
		JOptionPane.showMessageDialog(null, us.getDocumento());
		
		try {
			ps=cnn.prepareStatement("SELECT *FROM usuarios WHERE cedula_usuario=?");
			ps.setLong(1, us.getDocumento());
			rs=ps.executeQuery();
			if(rs.next()){
	             us=new UsuarioDTO(rs.getLong(1), rs.getString(2), rs.getString(3), rs.getString(4),rs.getString(5));
	            
	         }
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return us;
		
	}
	
	
	
	
	
}

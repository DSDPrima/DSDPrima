package primaafp.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;

import primaafp.excepcion.DAOExcepcion;
import primaafp.modelo.ContratoAfiliacion;
import primaafp.util.ConexionBD;

public class ContratoAfiliacionDAO extends BaseDAO {

	public ContratoAfiliacion insertar(ContratoAfiliacion vo) throws DAOExcepcion {
		//System.out.println("ContratoAfiliacionDAO: insertar()");
		System.out.println("ContratoAfiliacionDAO: Contrato Insertado");

		String query = "INSERT INTO ContratoAfiliacion (NroFormulario, FechaSuscripcion, TipoDocumento, NroDocumento, CodigoPromotor, PrimerNombre, SegundoNombre, ApellidoPaterno, ApellidoMaterno, DepartamentoNacimiento, ProvinciaNacimiento, DistritoNacimiento, Direccion, Departamento, Provincia, Distrito, Referencia, Telefono) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
		
		Connection con = null;
		PreparedStatement stmt = null;
		try {
			con = ConexionBD.obtenerConexion();
			stmt = con.prepareStatement(query);
			//stmt.setInt(1, vo.getIdResidente());
			stmt.setInt(1, vo.getNroFormulario());
			stmt.setString(2, vo.getFechaSuscripcion());
			stmt.setString(3, vo.getTipoDocumento());
			stmt.setString(4, vo.getNroDocumento());
			stmt.setString(5, vo.getCodigoPromotor());
			stmt.setString(6, vo.getPrimerNombre());
			stmt.setString(7, vo.getSegundoNombre());
			stmt.setString(8, vo.getApellidoPaterno());
			stmt.setString(9, vo.getApellidoMaterno());
			stmt.setString(10, vo.getDepartamentoNacimiento());
			stmt.setString(11, vo.getProvinciaNacimiento());
			stmt.setString(12, vo.getDistritoNacimiento());
			stmt.setString(13, vo.getDireccion());
			stmt.setString(14, vo.getDepartamento());
			stmt.setString(15, vo.getProvincia());
			stmt.setString(16, vo.getDistrito());
			stmt.setString(17, vo.getReferencia());
			stmt.setString(18, vo.getTelefono());
			
			
			int i = stmt.executeUpdate();
			if (i != 1) {
				throw new SQLException("No se pudo insertar");
			}
		} catch (SQLException e) {
			System.err.println(e.getMessage());
			throw	 new DAOExcepcion(e.getMessage());
		} finally {
			this.cerrarStatement(stmt);
			this.cerrarConexion(con);
		}
		return vo;
	}

	public Collection<ContratoAfiliacion> listar(int NroFormulario) throws DAOExcepcion {
		Collection<ContratoAfiliacion> c = new ArrayList<ContratoAfiliacion>();
		Connection con = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		try {
			con = ConexionBD.obtenerConexion();
			String query = "select NroFormulario,FechaSuscripcion,TipoDocumento,NroDocumento,CodigoPromotor,PrimerNombre,SegundoNombre,ApellidoPaterno,ApellidoMaterno,DepartamentoNacimiento,ProvinciaNacimiento,DistritoNacimiento,Direccion,Departamento,Provincia,Distrito,Referencia,Telefono from ContratoAfiliacion where NroFormulario = " + NroFormulario + " ";
			stmt = con.prepareStatement(query);
			rs = stmt.executeQuery();
			while (rs.next()) {
				ContratoAfiliacion vo = new ContratoAfiliacion();
				vo.setNroFormulario(rs.getInt("NroFormulario"));
				vo.setFechaSuscripcion(rs.getString("FechaSuscripcion"));
				vo.setTipoDocumento(rs.getString("TipoDocumento"));
				vo.setNroDocumento(rs.getString("NroDocumento"));
				vo.setCodigoPromotor(rs.getString("CodigoPromotor"));
				vo.setPrimerNombre(rs.getString("PrimerNombre"));
				vo.setSegundoNombre(rs.getString("SegundoNombre"));
				vo.setApellidoPaterno(rs.getString("ApellidoPaterno"));
				vo.setApellidoMaterno(rs.getString("ApellidoMaterno"));
				vo.setDepartamentoNacimiento(rs.getString("DepartamentoNacimiento"));
				vo.setProvinciaNacimiento(rs.getString("ProvinciaNacimiento"));	
				vo.setDistritoNacimiento(rs.getString("DistritoNacimiento"));
				vo.setDireccion(rs.getString("Direccion"));
				vo.setDepartamento(rs.getString("Departamento"));
				vo.setProvincia(rs.getString("Provincia"));
				vo.setDistrito(rs.getString("Distrito"));
				vo.setReferencia(rs.getString("Referencia"));
				vo.setTelefono(rs.getString("Telefono"));
				c.add(vo);
			}

		} catch (SQLException e) {
			System.err.println(e.getMessage());
			throw new DAOExcepcion(e.getMessage());
		} finally {
			this.cerrarResultSet(rs);
			this.cerrarStatement(stmt);
			this.cerrarConexion(con);
		}
		return c;
	}

	public ContratoAfiliacion actualizar(ContratoAfiliacion vo) throws DAOExcepcion {
		String query = "update contratoafiliacion set NroFormulario=?,FechaSuscripcion=?,TipoDocumento=?,NroDocumento=?,CodigoPromotor=?,PrimerNombre=?,SegundoNombre=?,ApellidoPaterno=?,ApellidoMaterno=?,DepartamentoNacimiento=?,ProvinciaNacimiento=?,DistritoNacimiento=?,Direccion=?,Departamento=?,Provincia=?,Distrito=?,Referencia=?,Telefono=?  ";
		Connection con = null;
		PreparedStatement stmt = null;
		try {
			con = ConexionBD.obtenerConexion();
			stmt = con.prepareStatement(query);
			stmt.setInt(1, vo.getNroFormulario());
			stmt.setString(2, vo.getFechaSuscripcion());
			stmt.setString(3, vo.getTipoDocumento());
			stmt.setString(4, vo.getNroDocumento());
			stmt.setString(5, vo.getCodigoPromotor());
			stmt.setString(6, vo.getPrimerNombre());
			stmt.setString(7, vo.getSegundoNombre());
			stmt.setString(8, vo.getApellidoPaterno());
			stmt.setString(9, vo.getApellidoMaterno());
			stmt.setString(10, vo.getDepartamentoNacimiento());
			stmt.setString(11, vo.getProvinciaNacimiento());
			stmt.setString(12, vo.getDistritoNacimiento());
			stmt.setString(13, vo.getDireccion());
			stmt.setString(14, vo.getDepartamento());
			stmt.setString(15, vo.getProvincia());
			stmt.setString(16, vo.getDistrito());
			stmt.setString(17, vo.getReferencia());
			stmt.setString(18, vo.getTelefono());
			int i = stmt.executeUpdate();
			if (i != 1) {
				throw new SQLException("No se pudo actualizar");
			}
		} catch (SQLException e) {
			System.err.println(e.getMessage());
			throw new DAOExcepcion(e.getMessage());
		} finally {
			this.cerrarStatement(stmt);
			this.cerrarConexion(con);
		}
		return vo;
	}
	
	public void eliminar(int nroformulario) throws DAOExcepcion {
		String query = "delete from contratoafiliacion WHERE nroformulario=?";
		Connection con = null;
		PreparedStatement stmt = null;
		try {
			con = ConexionBD.obtenerConexion();
			stmt = con.prepareStatement(query);
			stmt.setInt(1, nroformulario);
			int i = stmt.executeUpdate();
			if (i != 1) {
				throw new SQLException("No se pudo eliminar");
			}
		} catch (SQLException e) {
			System.err.println(e.getMessage());
			throw new DAOExcepcion(e.getMessage());
		} finally {
			this.cerrarStatement(stmt);
			this.cerrarConexion(con);
		}
	}

}


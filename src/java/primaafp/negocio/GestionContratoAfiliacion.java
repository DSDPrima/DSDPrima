package primaafp.negocio;

import java.util.Collection;

import primaafp.dao.ContratoAfiliacionDAO;
import primaafp.excepcion.DAOExcepcion;
import primaafp.modelo.ContratoAfiliacion;

public class GestionContratoAfiliacion {

	public ContratoAfiliacion insertar(int nroformulario, String fechasuscripcion, String tipodocumento, String nrodocumento, String codigopromotor, String primernombre, String segundonombre, String apellidopaterno, String apellidomaterno, String departamentonacimiento, String provincianacimiento, String distritonacimiento, String direccion, String departamento, String provincia, String distrito, String referencia, String telefono )
			throws DAOExcepcion {
		ContratoAfiliacionDAO dao = new ContratoAfiliacionDAO();

		ContratoAfiliacion vo = new ContratoAfiliacion();
		//vo.setIdResidente (id);
		vo.setNroFormulario(nroformulario);
		vo.setFechaSuscripcion(fechasuscripcion);
		vo.setTipoDocumento(tipodocumento);
		vo.setNroDocumento(nrodocumento);
		vo.setCodigoPromotor(codigopromotor);
		vo.setPrimerNombre(primernombre);
		vo.setSegundoNombre(segundonombre);
		vo.setApellidoPaterno(apellidopaterno);
		vo.setApellidoMaterno(apellidomaterno);
		vo.setDepartamentoNacimiento(departamentonacimiento);
		vo.setProvinciaNacimiento(provincianacimiento);
		vo.setDistritoNacimiento(distritonacimiento);
		vo.setDireccion(direccion);
		vo.setDepartamento(departamento);
		vo.setProvincia(provincia);
		vo.setDistrito(distrito);
		vo.setReferencia(referencia);
		vo.setTelefono(telefono);
		
		
		//System.out.println("ResidenteDAO: insertar()");
		//return vo;
		return dao.insertar(vo);
	}

	public Collection<ContratoAfiliacion> listar(int nroformulario) throws DAOExcepcion {
		ContratoAfiliacionDAO dao = new ContratoAfiliacionDAO();

		return dao.listar(nroformulario);
	}

	public ContratoAfiliacion actualizar(int nroformulario, String fechasuscripcion, String tipodocumento, String nrodocumento, String codigopromotor, String primernombre, String segundonombre, String apellidopaterno, String apellidomaterno, String departamentonacimiento, String provincianacimiento, String distritonacimiento, String direccion, String departamento, String provincia, String distrito, String referencia, String telefono ) throws DAOExcepcion {
		ContratoAfiliacionDAO dao = new ContratoAfiliacionDAO();

		ContratoAfiliacion vo = new ContratoAfiliacion();
		vo.setNroFormulario(nroformulario);
		vo.setFechaSuscripcion(fechasuscripcion);
		vo.setTipoDocumento(tipodocumento);
		vo.setNroDocumento(nrodocumento);
		vo.setCodigoPromotor(codigopromotor);
		vo.setPrimerNombre(primernombre);
		vo.setSegundoNombre(segundonombre);
		vo.setApellidoPaterno(apellidopaterno);
		vo.setApellidoMaterno(apellidomaterno);
		vo.setDepartamentoNacimiento(departamentonacimiento);
		vo.setProvinciaNacimiento(provincianacimiento);
		vo.setDistritoNacimiento(distritonacimiento);
		vo.setDireccion(direccion);
		vo.setDepartamento(departamento);
		vo.setProvincia(provincia);
		vo.setDistrito(distrito);
		vo.setReferencia(referencia);
		vo.setTelefono(telefono);

		return dao.actualizar(vo);
	}

	public void eliminar(int nroformulario) throws DAOExcepcion {
		ContratoAfiliacionDAO dao = new ContratoAfiliacionDAO();
		dao.eliminar(nroformulario);
	}
}



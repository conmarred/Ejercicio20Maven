package modelo.negocio;

import java.util.List;

import modelo.entidad.Coche;
import modelo.persistencia.DaoCocheMySQL;
import modelo.persistencia.interfaces.DaoCoche;

public class GestorCoche {
	private DaoCoche daoCoche = new DaoCocheMySQL();
	
	
	public int alta(Coche c){
		if(c.getMatricula().length()==7 && c.getKilometros()>0) {
			boolean alta = daoCoche.alta(c);
			if(alta) {
				return 0;
			}else {
				return 1;
			}
		}else {
			return 2;
		}
	}
	
	public boolean baja(int id){
		boolean baja = daoCoche.baja(id);
		return baja;
	}
	
	
	public int modificar(Coche c){
		//aplicamos la regla de negocio
		if(c.getMatricula().length()==7 && c.getKilometros()>0) {
			int modificada = daoCoche.modificar(c);
			return modificada;
		
		}else {
			return 0;
		}
	}
	
	public Coche obtener(int id){
		Coche coche = daoCoche.obtener(id);
		return coche;
	}
	
	public List<Coche> listar(){
		List<Coche> listarCoches = daoCoche.listar();
		return listarCoches;
	}	
	
	public Coche buscaMatricula(String Matricula){
		Coche c1 = daoCoche.buscaMatricula(Matricula);
		return c1;
	}
	
	public List<Coche> listarMarca(String Marca){
		List<Coche> listaMarca = daoCoche.listarMarca(Marca);
		return listaMarca;
	}
	
	public List<Coche> listarModelo(String Modelo){
		List<Coche> listaModelo = daoCoche.listarModelo(Modelo);
		return listaModelo;
	}
	
	
}

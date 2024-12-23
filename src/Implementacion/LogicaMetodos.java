package Implementacion;

import java.util.ArrayList;
import java.util.List;

import Dominio.Casas;
import Interface.Metodos;

public class LogicaMetodos implements Metodos {

	private List<Casas> lista = new ArrayList<Casas>();

	@Override
	public void guardar(Casas casa) {
		// TODO Auto-generated method stub
		lista.add(casa);
	}

	@Override
	public List<Casas> mostrar() {
		// TODO Auto-generated method stub
		return lista;
	}

	@Override
	public Casas buscar(int indice) {
		// TODO Auto-generated method stub
		return lista.get(indice);
	}

	@Override
	public void editar(int idnice, Casas casa) {
		// TODO Auto-generated method stub
		lista.set(idnice, casa);
	}

	@Override
	public void eliminar(int indice) {
		// TODO Auto-generated method stub
		lista.remove(indice);
	}

}

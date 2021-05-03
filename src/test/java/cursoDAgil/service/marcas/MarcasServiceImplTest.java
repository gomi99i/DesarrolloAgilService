package cursoDAgil.service.marcas;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.inject.Inject;

import org.junit.Ignore;
import org.junit.Test;


import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import cursoDAgil.bd.domain.Marcas;
import cursoDAgil.service.marcas.MarcasService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"/applicationContext.xml"})


public class MarcasServiceImplTest {
	@Inject
	MarcasService marcasService;
	
	@Test
	public void desplegarTodasMarcar(){
		System.out.println("Prueba unitaria de listarTodasMarcas");
		try{
			int numRegistros;
			List<Marcas> marcas = marcasService.listarTodasMarcas();
			numRegistros = marcas.size();
			System.out.println("Total de registros en Marcas: " + numRegistros);
			for(Marcas aux : marcas){
				System.out.println("id: " + aux.getIdMarca() + "  nombre: " + aux.getNombreMarca());
			}
		} catch(Exception ex){
			System.out.println("Error: " + ex);
		}
		System.out.println("Fin prueba unitaria listarTodasMarcas");
		System.out.println();
	}
	
	@Ignore
	public void desplegarMarcaPorId(){
		System.out.println("Prueba unitaria de obtenerMarcaPorId");
		Map <String,Integer> mapMarca = new HashMap<>();
		mapMarca.put("idMarca", 1);
		try{
			Marcas marca = marcasService.obtenerMarcaPorId(mapMarca);
			assertNotNull(marca);
			System.out.println("ID: " + marca.getIdMarca() + "   nombreMarca: " + marca.getNombreMarca());
		} catch(Exception ex){
			System.out.println("Error: " + ex);
		}
		System.out.println("Fin prueba unitaria obtenerMarcaPorId");
		System.out.println();
	}
	
	@Ignore
	public void ingresarNuevaMarca(){
		System.out.println("Prueba unitaria de nuevaMarca");
		Marcas marca = new Marcas();
		try{
			marca.setNombreMarca("La costeña");
			marcasService.nuevaMarca(marca);
		} catch(Exception ex) {
			System.out.println("Error: " + ex);
		}
		System.out.println("Fin prueba unitaria nuevaMarca");
		System.out.println();
	}
	
	@Ignore
	public void pruebaEliminarMarca(){
		System.out.println("Prueba unitaria de eliminarMarca");
		Map<String,Integer> mapMarca = new HashMap<>();
		mapMarca.put("idMarca", 4);
		try{
			marcasService.eliminarMarca(mapMarca);
		} catch(Exception ex){
			System.out.println("Error: " + ex);
		}
		System.out.println("Fin prueba unitaria eliminarMarca");
		System.out.println();
	}
	
	@Ignore
	public void pruebaActualizarMarca(){
		System.out.println("Prueba unitaria de actualizarMarca");
		Marcas marca = new Marcas();
		try{
			marca.setIdMarca(3);
			marca.setNombreMarca("Totis");
			marcasService.actualizarMarca(marca);
		} catch(Exception ex){
			System.out.println("Error: " + ex);
		}
		System.out.println("Fin prueba unitaria actualizarMarca");
		System.out.println();
	}
	
	
}

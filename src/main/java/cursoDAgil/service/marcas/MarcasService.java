package cursoDAgil.service.marcas;

import java.util.List;
import java.util.Map;

import cursoDAgil.bd.domain.Marcas;

public interface MarcasService {
	List <Marcas> listarTodasMarcas();
	Integer nuevaMarca(Marcas marca);
	Marcas obtenerMarcaPorId(Map<String, Integer> mapMarca);
	Integer eliminarMarca(Map<String, Integer> mapMarca);
	Integer actualizarMarca(Marcas marca);
}

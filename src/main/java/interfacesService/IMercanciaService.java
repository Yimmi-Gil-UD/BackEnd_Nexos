package interfacesService;

import java.util.List;

import com.yimmy.demo.entity.Mercancia;

public interface IMercanciaService {

		public List<Mercancia> Listar();
		public String save(Mercancia m);
		public void delete(int id);
		public String Validacion(Mercancia m);
	
}

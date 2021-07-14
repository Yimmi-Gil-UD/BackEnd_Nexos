package interfacesService;

import java.util.List;

import com.yimmy.demo.entity.Usuario;

public interface IUsuarioService {

	public List<Usuario> Listar();
	public Usuario save (Usuario u);
	public void delete(int id);
}

package interfacesService;

import java.util.List;

import com.yimmy.demo.entity.Cargo;

public interface IcargoService {

	public List<Cargo> Listar();
	public int save (Cargo c);
	//public Cargo update(int id, Cargo c);
	public void delete (int id);
}


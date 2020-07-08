package mapService;

import java.util.Set;


import model.Vet;
import service.CrudService;

public class VetMapService extends AbstractMapService<Vet, Long> implements CrudService<Vet, Long>{

	@Override
	public Vet save(Vet vet) {
		// TODO Auto-generated method stub
		 super.save(vet.getId(), vet);
		 return vet;
	}
	
	@Override
	public Set<Vet> findAll(){
		return super.findAll();
	}
	
	@Override
	public Vet findById(Long id) {
		return super.findById(id);
	}
	
	@Override
	public void delete(Vet vet) {
		super.delete(vet);
	}
	
	@Override
	public void deleteById(Long id) {
		super.deleteById(id);
	}

}

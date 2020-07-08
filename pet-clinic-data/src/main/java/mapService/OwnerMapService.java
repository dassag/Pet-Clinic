package mapService;

import java.util.Set;

import model.Owner;
import service.CrudService;

public class OwnerMapService extends AbstractMapService<Owner, Long> implements CrudService<Owner, Long>{

	@Override
	public Owner save(Owner owner) {
		super.save(owner.getId(), owner);
		return owner;
	}
	
	@Override
	public Set<Owner> findAll(){
		return super.findAll();
	}
	
	@Override
	public Owner findById(Long id) {
		return super.findById(id);
	}
	
	@Override
	public void delete(Owner owner) {
		super.delete(owner);
	}
	
	@Override
	public void deleteById(Long id) {
		super.deleteById(id);
	}

}

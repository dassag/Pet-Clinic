package mapService;

import java.util.Set;


import model.Pet;
import service.CrudService;

public class PetMapService extends AbstractMapService<Pet, Long> implements CrudService<Pet, Long> {
	
	@Override
	public Pet save(Pet pet) {
		super.save(pet.getId(), pet);
		return pet;
	}
	
	@Override
	public Set<Pet> findAll(){
		return super.findAll();
	}
	
	@Override
	public Pet findById(Long id) {
		return super.findById(id);
	}
	
	@Override
	public void delete(Pet pet) {
		super.delete(pet);
	}
	
	@Override
	public void deleteById(Long id) {
		super.deleteById(id);
	}

}

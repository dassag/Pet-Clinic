package mapService;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public abstract class AbstractMapService<T, ID> {

	Map<ID, T> map = new HashMap<>();

	Set<T> findAll() {
		return new HashSet<>(map.values());
	}

	T save(ID id, T object) {
		return map.put(id, object);
	}

	T findById(ID id) {
		return map.get(id);
	}

	void delete(T object) {
		map.entrySet().removeIf(s -> s.getValue().equals(object));
	}

	void deleteById(ID id) {
		map.remove(id);
	}

}

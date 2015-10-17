package py.com.aipotapirapire.repository;


import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import py.com.aipotapirapire.model.Operacion;

@RepositoryRestResource(collectionResourceRel = "operacion", path = "operacion")
public interface OperacionRepository extends
		PagingAndSortingRepository<Operacion, Long> {

}

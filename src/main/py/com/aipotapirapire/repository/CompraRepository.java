package py.com.aipotapirapire.repository;


import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import py.com.aipotapirapire.model.Compra;

@RepositoryRestResource(collectionResourceRel = "compra", path = "compra")
public interface CompraRepository extends
		PagingAndSortingRepository<Compra, Long> {

}

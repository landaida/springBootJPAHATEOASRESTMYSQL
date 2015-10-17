package py.com.aipotapirapire.repository;


import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import py.com.aipotapirapire.model.Venta;

@RepositoryRestResource(collectionResourceRel = "venta", path = "venta")
public interface VentaRepository extends
		PagingAndSortingRepository<Venta, Long> {

}

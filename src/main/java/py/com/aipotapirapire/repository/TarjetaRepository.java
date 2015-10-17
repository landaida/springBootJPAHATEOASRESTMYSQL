package py.com.aipotapirapire.repository;


import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import py.com.aipotapirapire.model.Tarjeta;

@RepositoryRestResource(collectionResourceRel = "tarjeta", path = "tarjeta")
public interface TarjetaRepository extends
		PagingAndSortingRepository<Tarjeta, Long> {

}

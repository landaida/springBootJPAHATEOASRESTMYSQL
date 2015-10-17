package py.com.aipotapirapire.repository;


import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import py.com.aipotapirapire.model.Oferta;

@RepositoryRestResource(collectionResourceRel = "oferta", path = "oferta")
public interface OfertaRepository extends
		PagingAndSortingRepository<Oferta, Long> {

}

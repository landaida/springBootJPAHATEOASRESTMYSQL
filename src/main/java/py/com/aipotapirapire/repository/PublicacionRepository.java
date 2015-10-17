package py.com.aipotapirapire.repository;


import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import py.com.aipotapirapire.model.Publicacion;

@RepositoryRestResource(collectionResourceRel = "publicacion", path = "publicacion")
public interface PublicacionRepository extends
		PagingAndSortingRepository<Publicacion, Long> {

}

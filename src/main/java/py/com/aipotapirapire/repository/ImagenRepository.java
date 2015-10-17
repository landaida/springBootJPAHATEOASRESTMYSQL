package py.com.aipotapirapire.repository;


import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import py.com.aipotapirapire.model.Imagen;

@RepositoryRestResource(collectionResourceRel = "imagen", path = "imagen")
public interface ImagenRepository extends
		PagingAndSortingRepository<Imagen, Long> {

}

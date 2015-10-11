package py.com.aipotapirapire.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import py.com.aipotapirapire.model.Calificacion;

@RepositoryRestResource(collectionResourceRel = "calificacion", path = "calificacion")
public interface CalificacionRepository extends
		PagingAndSortingRepository<Calificacion, Long> {

}

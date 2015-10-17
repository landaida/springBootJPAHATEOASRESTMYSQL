package py.com.aipotapirapire.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import py.com.aipotapirapire.model.ParentEntity;

@RepositoryRestResource(collectionResourceRel = "parentEntity", path = "parentEntity")
public interface ParentEntityRepository extends
		PagingAndSortingRepository<ParentEntity, Long> {

}

package py.com.aipotapirapire.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import py.com.aipotapirapire.model.ChildEntity;

@RepositoryRestResource(collectionResourceRel = "childEntity", path = "childEntity")
public interface ChildEntityRepository extends
		PagingAndSortingRepository<ChildEntity, Long> {

}

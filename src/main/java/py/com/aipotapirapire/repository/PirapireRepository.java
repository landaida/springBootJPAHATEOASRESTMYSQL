package py.com.aipotapirapire.repository;


import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import py.com.aipotapirapire.model.Pirapire;

@RepositoryRestResource(collectionResourceRel = "pirapire", path = "pirapire")
public interface PirapireRepository extends
		PagingAndSortingRepository<Pirapire, Long> {

}

package py.com.aipotapirapire.repository;


import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import py.com.aipotapirapire.model.Demanda;

@RepositoryRestResource(collectionResourceRel = "demanda", path = "demanda")
public interface DemandaRepository extends
		PagingAndSortingRepository<Demanda, Long> {

}

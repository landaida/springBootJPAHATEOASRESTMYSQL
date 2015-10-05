package py.com.aipotapirapire.repository;


import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import py.com.aipotapirapire.model.FormaPago;

@RepositoryRestResource(collectionResourceRel = "formaPago", path = "formaPago")
public interface FormaPagoRepository extends
		PagingAndSortingRepository<FormaPago, Long> {

}

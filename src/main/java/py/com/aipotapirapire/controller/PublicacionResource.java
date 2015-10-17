package py.com.aipotapirapire.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import py.com.aipotapirapire.model.Publicacion;
import py.com.aipotapirapire.repository.PublicacionRepository;

@RestController
@RequestMapping("/api")
public class PublicacionResource {

	@Autowired
	private PublicacionRepository repository;

	@RequestMapping("/publicacion")
	public Iterable<Publicacion> listaPublicaciones() {
		return repository.findAll();
	}

	@RequestMapping("/publicacion/{id}")
	public Publicacion findById(@PathVariable long id) {
		return repository.findOne(id);
	}

	@RequestMapping(value = "/publicacion", method = RequestMethod.POST)
	public Publicacion createPublicacion(@RequestBody final Publicacion publicacion) {
		publicacion.getDemanda().setPublicacion(publicacion);
		Publicacion entity = repository.save(publicacion);
		return entity;
	}

	@RequestMapping(value = "/publicacion", method = RequestMethod.PUT)
	public Publicacion updatePublicacion(@RequestBody final Publicacion publicacion) {
		Publicacion entity = repository.save(publicacion);
		return entity;
	}

	@RequestMapping(value = "/publicacion/{id}", method = RequestMethod.DELETE)
	public void deletePublicacion(@PathVariable final long id) {
		repository.delete(id);
	}

}
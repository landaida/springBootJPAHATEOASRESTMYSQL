package py.com.aipotapirapire;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import py.com.aipotapirapire.model.ChildEntity;
import py.com.aipotapirapire.model.ParentEntity;
import py.com.aipotapirapire.repository.ChildEntityRepository;
import py.com.aipotapirapire.repository.ParentEntityRepository;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext app = SpringApplication.run(
				DemoApplication.class, args);
		ParentEntityRepository repo = app.getBean(ParentEntityRepository.class);
		ParentEntity p = new ParentEntity();
		p.setDescription("Papa");
		p = repo.save(p);
		
		ChildEntity children = new ChildEntity();
		children.setDescription("hijo");
		children.setParent(p);
		ChildEntityRepository repoChildren = app.getBean(ChildEntityRepository.class);
		repoChildren.save(children);
		
		
	}
}

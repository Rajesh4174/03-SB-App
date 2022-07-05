package in.raj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.raj.entity.UserEntity;
import in.raj.repository.UserRepository;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		UserRepository bean = context.getBean(UserRepository.class);
		System.out.println(bean.getClass().getName());
		UserEntity entity=new UserEntity();
		entity.setUserId(101);
		entity.setUserName("Rajesh");
		entity.setAge(27);
		entity.setUserEmail("Rajesh@gmail.com");
		
		bean.save(entity);
		
		
		
		
		
		
	}

}

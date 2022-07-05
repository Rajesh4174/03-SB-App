package in.raj.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import in.raj.entity.UserEntity;

public interface UserRepository extends  JpaRepository<UserEntity, Serializable>{
	public UserEntity findByUserEmail(String email);
	public UserEntity findByAge(Integer age);
}



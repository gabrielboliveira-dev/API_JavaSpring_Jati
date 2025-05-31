package curso.api.teste.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import curso.api.teste.entity.UserEntity;

@Repository
public interface UserRepository extends JpaRepository <UserEntity, Long> {
    
}

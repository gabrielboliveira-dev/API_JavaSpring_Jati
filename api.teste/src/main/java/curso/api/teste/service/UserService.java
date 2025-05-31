package curso.api.teste.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import curso.api.teste.entity.UserEntity;
import curso.api.teste.repository.UserRepository;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public UserEntity cadastrarUser(UserEntity userEntity) {
        return userRepository.save(userEntity);
    }

    public Optional<UserEntity> buscarUser(Long id) {
        return userRepository.findById(id);
    }
    public void deletaruser(Long id) {
        userRepository.deleteById(id);
    }
}

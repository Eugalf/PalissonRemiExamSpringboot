package fr.rpalisson.exam.service;

import fr.rpalisson.exam.entity.User;
import fr.rpalisson.exam.exception.NotFoundCentralishException;
import fr.rpalisson.exam.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class UserService implements DAOServiceInterface<User> {

    public UserRepository userRepository;
    @Override
    public List<User> findAll() {
        return userRepository.findAll();
    }

    @Override
    public User getObjectById(Long id) {
        Optional<User> user =userRepository.findById(id);
        if (user.isEmpty()){
            throw new NotFoundCentralishException("User", "id", id);
        }
        return user.get();
    }

    @Override
    public User findBySlug(String slug) {
        return null;
    }
}
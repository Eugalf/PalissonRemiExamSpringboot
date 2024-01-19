package fr.rpalisson.exam.service;

import fr.rpalisson.exam.entity.Model;
import fr.rpalisson.exam.exception.NotFoundCentralishException;
import fr.rpalisson.exam.repository.ModelRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class ModelService implements DAOServiceInterface<Model> {

    public ModelRepository modelRepository;
    @Override
    public List<Model> findAll() {
        return modelRepository.findAll();
    }

    @Override
    public Model getObjectById(Long id) {
        Optional<Model> mod = modelRepository.findById(id);
        if (mod.isEmpty()){
            throw new NotFoundCentralishException("Model","id",id);
        }
        return mod.get();
    }

    @Override
    public Model findBySlug(String slug) {
        return null;
    }
}
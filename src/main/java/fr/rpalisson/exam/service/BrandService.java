package fr.rpalisson.exam.service;

import fr.rpalisson.exam.entity.Brand;
import fr.rpalisson.exam.exception.NotFoundCentralishException;
import fr.rpalisson.exam.repository.BrandRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class BrandService implements DAOServiceInterface<Brand> {

    public BrandRepository brandRepository;
    @Override
    public List<Brand> findAll() {
        return brandRepository.findAll();
    }

    @Override
    public Brand getObjectById(Long id) {
        Optional<Brand> brand = brandRepository.findById(id);
        if (brand.isEmpty()){
            throw new NotFoundCentralishException("Brand", "id", id);
        }
        return brand.get();
    }

    @Override
    public Brand findBySlug(String slug) {
        return null;
    }
}
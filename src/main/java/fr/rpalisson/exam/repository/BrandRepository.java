package fr.rpalisson.exam.repository;

import fr.rpalisson.exam.entity.Brand;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BrandRepository extends JpaRepository<Brand, Long>, EntityNameRepository<Brand> {

}
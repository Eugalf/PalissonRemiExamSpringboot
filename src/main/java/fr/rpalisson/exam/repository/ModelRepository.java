package fr.rpalisson.exam.repository;

import fr.rpalisson.exam.entity.Model;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ModelRepository extends JpaRepository<Model, Long>, EntityNameRepository<Model> {

}
package fr.rpalisson.exam.repository;

import fr.rpalisson.exam.entity.Listing;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ListingRepository extends JpaRepository<Listing, Long>{

    List<Object> findTop12ByOrderByCreatedAtDesc();
}
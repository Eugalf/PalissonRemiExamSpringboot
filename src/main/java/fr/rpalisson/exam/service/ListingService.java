package fr.rpalisson.exam.service;

import fr.rpalisson.exam.entity.Listing;
import fr.rpalisson.exam.exception.NotFoundCentralishException;
import fr.rpalisson.exam.repository.ListingRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class ListingService implements DAOServiceInterface<Listing> {

    public ListingRepository listingRepository;
    @Override
    public List<Listing> findAll() {
        return listingRepository.findAll();
    }

    @Override
    public Listing getObjectById(Long id) {
        Optional<Listing> lis = listingRepository.findById(id);
        if (lis.isEmpty()){
            throw new NotFoundCentralishException("Listing", "id", id);
        }
        return lis.get();
    }

    @Override
    public Listing findBySlug(String slug) {
        return null;
    }

    public List<Object> findTop12ByOrderByPublishedAtDesc() {
        return listingRepository.findTop12ByOrderByCreatedAtDesc();
    }
}
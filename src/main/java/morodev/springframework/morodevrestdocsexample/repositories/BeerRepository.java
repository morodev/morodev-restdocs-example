package morodev.springframework.morodevrestdocsexample.repositories;

import morodev.springframework.morodevrestdocsexample.domain.Beer;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.UUID;

/**
 * Created by Luca Moro on 17/01/2021.
 */
public interface BeerRepository extends PagingAndSortingRepository<Beer, UUID> {
}

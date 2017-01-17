package mil.cm.navy.repository;

import mil.cm.navy.domain.Country;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by patricktchankue on 1/17/17.
 */
public interface CountryRepository extends CrudRepository<Country, Long> {
}

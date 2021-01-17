package morodev.springframework.morodevrestdocsexample.web.mappers;

import morodev.springframework.morodevrestdocsexample.domain.Beer;
import morodev.springframework.morodevrestdocsexample.web.model.BeerDto;
import org.mapstruct.Mapper;

/**
 * Created by Luca Moro on 17/01/2021.
 */
@Mapper(uses = {DateMapper.class})
public interface BeerMapper {

    BeerDto BeerToBeerDto(Beer beer);

    Beer BeerDtoToBeer(BeerDto dto);
}

package morodev.springframework.morodevrestdocsexample.web.model;


import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;

import java.util.List;

/**
 * Created by Luca Moro on 17/01/2021.
 */
public class BeerPagedList extends PageImpl<BeerDto> {

    public BeerPagedList(List<BeerDto> content, Pageable pageable, long total) {
        super(content, pageable, total);
    }

    public BeerPagedList(List<BeerDto> content) {
        super(content);
    }
}

package s4got10dev.imdb.service;

import s4got10dev.imdb.service.dto.ActorTypecastDTO;
import s4got10dev.imdb.service.dto.TitleShortDTO;
import s4got10dev.imdb.service.dto.TitleRatingDTO;

import java.util.List;

public interface SearchService {

    List<TitleRatingDTO> findTopRatedByGenre(String genre, int limit);

    ActorTypecastDTO isActorTypeCasted(String name);

    List<TitleShortDTO> findByTitle(String title);

    List<TitleShortDTO> findByActors(String... names);

    int findDegreeOfSeparation(String name1, String name2);

}

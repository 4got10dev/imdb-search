package s4got10dev.imdb.service.dto;

import lombok.Data;

@Data
public class TitleRatingDTO {

    private String titleId;
    private String primaryTitle;
    private String originalTitle;
    private Double averageRating;
    private Long numVotes;

}

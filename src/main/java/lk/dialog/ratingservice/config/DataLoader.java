package lk.dialog.ratingservice.config;

import lk.dialog.ratingservice.model.Rating;
import lk.dialog.ratingservice.service.RatingService;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

/**
 * @Author DILAN on 2018-03-19
 */
@Component
public class DataLoader implements ApplicationRunner {

    private RatingService ratingService;

    public DataLoader(RatingService ratingService) {
        this.ratingService = ratingService;
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        this.ratingService.createRating(new Rating(1L, 1));
        this.ratingService.createRating(new Rating(1L, 2));
        this.ratingService.createRating(new Rating(2L, 3));
        this.ratingService.createRating(new Rating(2L, 4));
    }
}

package lk.dialog.ratingservice.repository;

import lk.dialog.ratingservice.model.Rating;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @Author DILAN on 2018-03-19
 */
public interface RatingRepository extends JpaRepository<Rating, Long> {

    List<Rating> findRatingsByBookId(Long bookId);
}

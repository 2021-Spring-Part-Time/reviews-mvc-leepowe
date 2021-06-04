package org.wecancoeit.reviews;

import org.junit.jupiter.api.Test;

import java.util.Collection;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReviewRepositoryTest {

    //can be run in any test without having to list for every test
    private ReviewRepository underTest;
    private Review reviewOne = new Review(1L, "Review one Name", "Decription", "");
    private Review reviewTwo = new Review(2L, "Review two Name", "Decription", "");

    @Test
    public void shouldFindReviewOne(){
        //Review reviewOne = new Review(1L, "Review one Name", "Decription");
        underTest = new ReviewRepository(reviewOne);
        Review foundReview = underTest.findOne(1L);
        assertEquals(reviewOne, foundReview);
    }

    @Test
    public void shouldFindReviewOneAndReviewTwo(){
        //Review reviewOne = new Review(1L, "Review one Name", "Decription");
        //Review reviewTwo = new Review(2L, "Review two Name", "Decription");
        underTest = new ReviewRepository(reviewOne, reviewTwo);
        Collection<Review> foundReviews = underTest.findAll();
        assertThat(foundReviews).contains(reviewOne, reviewTwo);
    }
}

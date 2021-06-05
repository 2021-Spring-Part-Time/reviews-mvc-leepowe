package org.wecancoeit.reviews;

import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Repository
public class ReviewRepository {

    Map<Long, Review> reviewsList = new HashMap<>();

    //constructor to handle our database
    public ReviewRepository(){
        Review babyShark = new Review(1L, "Baby Shark", "Great for annoying people " +
                "who aren't parents.  Parents have become immune.",
                "resources/static/baby shark.png",
                "https://youtu.be/XqZsoesa55w");
        Review downByTheBay = new Review(2L, "Down By The Bay", "I song that I " +
                "sent out to my mother for mothers day because she would say the things in this song.",
                "https://supersimple.com/wp-content/uploads/down-by-the-bay-800-800-300x300.jpg",
                "https://youtu.be/cAMbqRWqLXQ?t=3");
        Review peekaboo = new Review(3L, "Peekaboo", "A very fun, effective and " +
                "catchy song that can easily be stuck in your head all day.",
                "https://i.ytimg.com/vi/lVFj91Z1AfM/maxresdefault.jpg",
                "https://youtu.be/lVFj91Z1AfM?t=3");

        reviewsList.put(babyShark.getId(), babyShark);
        reviewsList.put(downByTheBay.getId(), downByTheBay);
        reviewsList.put(peekaboo.getId(), peekaboo);
    }

// constructor for testing purposes only...uses varArgs to add none or as many objects as we want
    public ReviewRepository(Review ...reviewsToAdd) {
        for(Review review: reviewsToAdd){
            reviewsList.put(review.getId(), review);
        }
    }

    public Review findOne(long id) {
        return reviewsList.get(id);
    }

    public Collection<Review> findAll() {
        return reviewsList.values();
    }
}

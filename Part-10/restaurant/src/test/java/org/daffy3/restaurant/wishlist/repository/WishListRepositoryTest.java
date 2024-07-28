package org.daffy3.restaurant.wishlist.repository;

import org.daffy3.restaurant.wishlist.entity.WishListEntity;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class WishListRepositoryTest {

    @Autowired
    private WishListRepository wishListRepository;


    private WishListEntity create() {
        var wishlist = new WishListEntity();
        wishlist.setTitle("title");
        wishlist.setCategory("category");
        wishlist.setAddress("address");
        wishlist.setRoadAddress("roadAddress");
        wishlist.setPageUrl("");
        wishlist.setImageUrl("");
        wishlist.setVisit(false);
        wishlist.setVisitCount(0);
        wishlist.setLastVisitDate(null);

        return wishlist;
    }


    @Test
    public void saveTest() {
        var wishlistEntity = create();
        var expected = wishListRepository.save(wishlistEntity);

        Assertions.assertNotNull(expected);
        Assertions.assertEquals(1, expected.getIndex());

    }

    @Test
    public void updateTest() {
        var wishlistEntity = create();
        var expected = wishListRepository.save(wishlistEntity);

        expected.setTitle("update title");
        var savedEntity = wishListRepository.save(expected);

        Assertions.assertEquals("update title", savedEntity.getTitle());
        Assertions.assertEquals(1, wishListRepository.listAll().size());
    }

    @Test
    public void findByIdTest() {
        var wishlistEntity = create();
        wishListRepository.save(wishlistEntity);

        var expected = wishListRepository.findById(1);

        Assertions.assertEquals(true, expected.isPresent());
        Assertions.assertEquals(1, expected.get().getIndex());

    }

    @Test
    public void deleteByIdTest() {
        var wishlistEntity = create();
        wishListRepository.save(wishlistEntity);

        wishListRepository.deleteById(1);

        int count = wishListRepository.listAll().size();
        Assertions.assertEquals(0, count);
    }

    @Test
    public void findAllTest() {
        var wishlistEntity1 = create();
        wishListRepository.save(wishlistEntity1);

        var wishlistEntity2 = create();
        wishListRepository.save(wishlistEntity2);

        int count = wishListRepository.listAll().size();
        Assertions.assertEquals(2, count);
    }
}

package org.daffy3.restaurant.wishlist.repository;

import org.daffy3.restaurant.db.MemoryDBRepositoryAbstract;
import org.daffy3.restaurant.wishlist.entity.WishListEntity;
import org.springframework.stereotype.Repository;

@Repository
public class WishListRepository extends MemoryDBRepositoryAbstract<WishListEntity> {
}

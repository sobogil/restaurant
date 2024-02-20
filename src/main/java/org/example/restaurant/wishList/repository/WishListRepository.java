package org.example.restaurant.wishList.repository;

import org.example.restaurant.db.MemoryDbRepositoryAbstract;
import org.example.restaurant.wishList.entity.WishListEntity;
import org.springframework.stereotype.Repository;

@Repository
public class WishListRepository extends MemoryDbRepositoryAbstract<WishListEntity> {

}

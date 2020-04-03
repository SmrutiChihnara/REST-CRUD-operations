package com.src.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.src.Item.Item;
@Repository
public interface ItemRepository extends JpaRepository<Item, Integer>{

}

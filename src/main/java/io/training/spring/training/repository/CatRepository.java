package io.training.spring.training.repository;

import org.springframework.data.repository.CrudRepository;
import io.training.spring.training.model.Cat;

public interface CatRepository extends CrudRepository<Cat, Long> {
}

package com.example.laboratorio4.Repositories.Interfaces;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

import com.example.laboratorio4.Repositories.Entities.MovieEntity;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface MoviesRepository extends JpaRepository<MovieEntity, Long> {

    @Query(value = "SELECT p " + " FROM Movies p " + "WHERE id = :id")
    Optional<MovieEntity> findById(
        @Param("id") Long id);

  
    @Query(value = "SELECT p " + " FROM Movies p " + "WHERE year = :year")
    Collection<MovieEntity> findByYear(
        @Param("year") String year);

    @Query(value = "SELECT p " + " FROM Movies p " + "WHERE title = :title")
        Collection<MovieEntity> findByTitle(
            @Param("title") String title);
}

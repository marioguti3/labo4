package com.example.laboratorio4.Services;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

import com.example.laboratorio4.Repositories.Entities.MovieEntity;
import com.example.laboratorio4.Repositories.Interfaces.MoviesRepository;
import com.example.laboratorio4.Services.Models.MovieDTO;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;

public class MoviesService {

    @Autowired
    private MoviesRepository moviesRepository;
    @Autowired
    private ModelMapper modelMapper;

      public List<MovieDTO> getAll() {
        return moviesRepository.findAll().stream()
        .map(x -> modelMapper.map(x, MovieDTO.class))
              .collect(Collectors.toList());
    }  

    public MovieDTO add(MovieDTO movie) {
        MovieEntity entityToInsert = modelMapper.map(movie, MovieEntity.class);
        MovieEntity result = moviesRepository.save(entityToInsert);
        return modelMapper.map(result, MovieDTO.class);
    }

    public MovieDTO update(Long ID, MovieDTO movie) {
        MovieEntity entityToUpdate = modelMapper.map(movie, MovieEntity.class);
        MovieEntity result = moviesRepository.save(entityToUpdate);
        return modelMapper.map(result, MovieDTO.class);

    }

    public void delete(Long ID) {
        Optional<MovieEntity> entityToDelete = moviesRepository.findById(ID);
        if (entityToDelete.isPresent())
            moviesRepository.delete(entityToDelete.get());
    }

    public Optional<MovieDTO> findById(Long id){
        Optional<MovieEntity> entity = moviesRepository.findById(id);
        if(entity.isPresent())
        return Optional.of(modelMapper.map(entity.get(), MovieDTO.class));
        else
        return Optional.empty();
    }

    public List<MovieDTO> getByYear(String year) {
        return moviesRepository.findByYear(year).stream()
        .map(x -> modelMapper.map(x, MovieDTO.class))
              .collect(Collectors.toList());
    }

    public List<MovieDTO> getByTitle(String title) {
        return moviesRepository.findByTitle(title).stream()
        .map(x -> modelMapper.map(x, MovieDTO.class))
              .collect(Collectors.toList());
    }

    public List<MovieDTO> getById(Long id) {
        return moviesRepository.findById(id).stream()
        .map(x -> modelMapper.map(x, MovieDTO.class))
              .collect(Collectors.toList());
    }

}


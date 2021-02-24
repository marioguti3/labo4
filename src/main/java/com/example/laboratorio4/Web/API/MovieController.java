package com.example.laboratorio4.Web.API;

import com.example.laboratorio4.Services.MoviesService;
import com.example.laboratorio4.Services.Models.MovieDTO;


import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v2/movies")
public class MovieController {

    private final MoviesService moviesService;

    MovieController(MoviesService moviesService) {
        this.moviesService = moviesService;

    }

     @GetMapping()
    public List<MovieDTO> GetMovies(@RequestParam(name = "title",
     required = false, defaultValue = "")String title, 
     @RequestParam(name = "year", required = false,defaultValue = "")String year) {
       if(!title.equals("") && year.equals("") ){
           return moviesService.getByTitle(title);
           
       }
        
       if(!year.equals("") && title.equals("")){
           return moviesService.getByYear(year);
       }
        if(year.equals("") && title.equals("")){
            return moviesService.getAll();
        }
        return null;

    } 

    @PostMapping
    public MovieDTO AddMovie(@RequestBody MovieDTO movie) {
        return moviesService.add(movie);
    }

    @PutMapping("/{id}")
    public MovieDTO UpdateMovie(@RequestBody MovieDTO movie, @PathVariable("id") Long id) {
        return moviesService.update(id, movie);
    }

    @DeleteMapping("/{id}")
    public  void  DeleteMovie(@PathVariable("id") Long id) {
        moviesService.delete(id);
    }

    @GetMapping("/{id}")
    public List <MovieDTO> GetById(@PathVariable("id") Long id){
       return  moviesService.getById(id);

    }

  
        }
     

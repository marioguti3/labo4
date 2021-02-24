
package com.example.laboratorio4.Web.View;

import com.example.laboratorio4.Services.Models.MovieDTO;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
@Controller
@RequestMapping("peliculas")
public class MoviesViewController {
    
  /*   private final MoviesService moviesService;
    
    MoviesViewController(MoviesService moviesService){
        this.moviesService = moviesService;
    }

    @GetMapping
    public ModelAndView MoviesV2(){
        ModelAndView mv = new ModelAndView("listMovies");
       mv.addObject("movies", moviesService.getAll());
        return mv;
    }

    @GetMapping("/new")
    public ModelAndView CreateMovie(){
        ModelAndView mv = new ModelAndView("detailMovies");
        mv.addObject("movie", new MovieDTO());
        return mv;
    }
    
    @GetMapping("/edit/{id}")
    public ModelAndView EditMovie(@PathVariable("id") Long id){
        ModelAndView mv = new ModelAndView("detailMovies");
    var movieOrEmpty = moviesService.findById(id);

    MovieDTO movie = new MovieDTO();
    if(movieOrEmpty.isPresent())
    movie = movieOrEmpty.get();
    mv.addObject("movie", movie);
        return mv;
    }  */
}

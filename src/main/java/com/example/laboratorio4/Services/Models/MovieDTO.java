
package com.example.laboratorio4.Services.Models;

public class MovieDTO {


 private Long id;
 private String title; 
 private String year;
private String poster;
private String descripcion;

public MovieDTO() {
}

public MovieDTO(Long id, String title, String year, String poster, String descripcion) {
    this.id = id;
    this.title = title;
    this.year = year;
    this.poster = poster;
    this.descripcion = descripcion;
}




public Long getId() {
    return id;
}

public void setId(Long id) {
    this.id = id;
}

public String getTitle() {
    return title;
}

public void setTitle(String title) {
    this.title = title;
}

public String getYear() {
    return year;
}

public void setYear(String year) {
    this.year = year;
}

public String getPoster() {
    return poster;
}

public void setPoster(String poster) {
    this.poster = poster;
}

public String getDescripcion() {
    return descripcion;
}

public void setDescripcion(String descripcion) {
    this.descripcion = descripcion;
}




}

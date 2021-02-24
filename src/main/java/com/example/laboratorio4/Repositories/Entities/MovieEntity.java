
package com.example.laboratorio4.Repositories.Entities;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
    

   @Table(name="Movies")
    @Entity(name="Movies")
    public class MovieEntity {
     
    
        private @Id @GeneratedValue Long id;
        private String title;
        private String year;
        private String poster;
        private String descripcion;

        public MovieEntity(){}

        
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

        public MovieEntity(Long id, String title, String year, String poster, String descripcion) {
            this.id = id;
            this.title = title;
            this.year = year;
            this.poster = poster;
            this.descripcion = descripcion;
        }
       
       
      


}

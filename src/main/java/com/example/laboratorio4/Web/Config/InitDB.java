
package com.example.laboratorio4.Web.Config;

import com.example.laboratorio4.Repositories.Entities.MovieEntity;
import com.example.laboratorio4.Repositories.Interfaces.MoviesRepository;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class InitDB {
    @Bean
    CommandLineRunner initDatabase(MoviesRepository repository){
        return args ->{

            repository.save(new MovieEntity(1L,"EL PADRINO","2005","https://especiales.elperiodicodearagon.com/recursos_comunes/86662_g.JPG","lorem ipsum"));
            repository.save(new MovieEntity(2L,"AVATAR","2008","https://www.carteleraargentina.com.ar/wp-content/uploads/2020/06/avatar.jpg","lorem ipsum"));
            repository.save(new MovieEntity(3L,"HASTA EL ULTIMO HOMBRE","2017","https://cartelera.laverdad.es/img/carteles/2016/12/5847f77809dc5__310x443.jpg","lorem ipsum"));
            repository.save(new MovieEntity(4L,"EL LOBO DE WALL STREET","2017","https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcS92bVGDGZUlPKuDr_vxPOO91AJ8p9up84l4Q&usqp=CAU","lorem ipsum"));
            
        };
        };
    }

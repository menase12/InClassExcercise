package com.example.demo;


import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Actor {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String name;
    private String realName;
    private String headShot;

    @ManyToMany(mappedBy = "cast")
    private Set<Movie> movies;
    public Actor()
    {
        movies=new HashSet<Movie> (  );
    }
    public void addMovie (Movie m)
    {
        movies.add(m);
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id=id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name=name;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName=realName;
    }

    public String getHeadShot() {
        return headShot;
    }

    public void setHeadShot(String headShot) {
        this.headShot=headShot;
    }

    public Set<Movie> getMovies() {
        return movies;
    }

    public void setMovies(Set<Movie> movies) {
        this.movies=movies;
    }
}

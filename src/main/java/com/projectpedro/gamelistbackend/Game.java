package com.projectpedro.gamelistbackend;

import jakarta.persistence.*;
import org.springframework.boot.autoconfigure.web.WebProperties;

import java.util.Objects;

@Entity
@Table(name = "tb_game")
public class Game {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;

    @Column(name = "game_year")
    private Integer year;
    private String genre;
    private String platform;
    private String imgUrl;
    private Double score;
    private String shortDescription;
    private String longDescription;

    public Game (){

    }

    public Game (long id, String title, Integer year, String genre, String platform, String imgUrl, Double score, String shortDescription, String longDescription) {
        this.id = id;
        this.title = title;
        this.year = year;
        this.genre = genre;
        this.platform = platform;
        this.imgUrl = imgUrl;
        this.score = score;
        this.shortDescription = shortDescription;
        this.longDescription = longDescription;
    }

    public String getShortDescription() {
        return shortDescription;
    }

    public void setShortDescription(String shortDescription){
        this.shortDescription = shortDescription;
    }

    public String getLongDescription() {
        return longDescription;
    }

    public void setLongDescription(String longDescription){
        this.longDescription = longDescription;
    }

    @Override
    public int hashCode (){
        return Objects.hash(id);
    }

    @Override
    public boolean equals (Object obj){
        if (this == obj){
            return true;
        }
        if (obj == null){
            return false;
        }
        if (getClass() != obj.getClass()){
            return false;
        }
        Game other = (Game) obj;
        return Objects.equals(id, other.id);
    }



}

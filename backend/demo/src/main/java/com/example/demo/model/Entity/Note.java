package com.example.demo.model.Entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import java.util.List;

@Getter
@Setter
@Entity
public class Note {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String titulo;
    private String contenido;
    private boolean archived=false;


    public Note() {
    }

    public Note(Long id, String titulo, String contenido, boolean archived) {
        this.id = id;
        this.titulo = titulo;
        this.contenido = contenido;
        this.archived = archived;
    }
}

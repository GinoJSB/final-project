package com.example.demo.controller;

import com.example.demo.model.DTO.NoteReqDTO;
import com.example.demo.model.DTO.NoteResponseDTO;
import com.example.demo.model.Entity.Note;
import com.example.demo.service.INoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class NoteController {

    @Autowired
    private INoteService notiServ;

    @GetMapping("/notes")
    public List<NoteResponseDTO> getNotas() {
        return notiServ.getNotas();
    }

    @PostMapping("/notes")
    public String saveNotas(@RequestBody NoteReqDTO noteReqDTO) {
        notiServ.saveNotas(noteReqDTO);
        return "La nota fue creada correctamente";
    }

    @DeleteMapping("/notes/{id}")
    public String deleteNotas(@PathVariable Long id) {
        notiServ.deleteNotas(id);
        return "La nota fue eliminada correctamente";
    }

    @PutMapping("/notes/{id}")
    public NoteResponseDTO updateNotas(@PathVariable Long id, @RequestBody NoteReqDTO noteReqDTO) {
        return notiServ.updateNote(id, noteReqDTO);
    }

    @PutMapping("/notes/{id}")
    public String archiveNotas(@PathVariable Long id, @RequestParam(required = true) boolean archived) {
        notiServ.archiveNotas(id, archived);
        return archived ? "La nota fue archivada correctamente" : "La nota fue desarchivada correctamente";
    }
}


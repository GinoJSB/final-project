package com.example.demo.service;

import com.example.demo.model.DTO.NoteReqDTO;
import com.example.demo.model.DTO.NoteResponseDTO;
import com.example.demo.model.Entity.Note;

import java.util.List;

public interface INoteService  {


    public void saveNotas (NoteReqDTO dto);


    public void deleteNotas (Long id);

    public NoteResponseDTO findNotas(Long id);



    public void archiveNotas (Long id, boolean archived);


    NoteResponseDTO updateNote(Long id, NoteReqDTO notiReqDTO);

    List<NoteResponseDTO> getNotas();
}

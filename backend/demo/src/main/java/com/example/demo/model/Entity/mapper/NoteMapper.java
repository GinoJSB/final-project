package com.example.demo.model.Entity.mapper;
import com.example.demo.model.DTO.NoteReqDTO;
import com.example.demo.model.DTO.NoteResponseDTO;
import com.example.demo.model.Entity.Note;
import org.mapstruct.*;

import java.util.List;

@Mapper
public interface NoteMapper {
    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    Note updateNoteReqDTOToNote(NoteReqDTO dto, @MappingTarget Note note);
    NoteResponseDTO noteToNoteResponseDTO(Note note);
    List<NoteResponseDTO> notesToNotesResponseDTO(List<Note> notes);
}

package com.pt.pires.persistence;

import org.springframework.data.repository.CrudRepository;

import com.pt.pires.domain.Note;

public interface INoteRepository extends CrudRepository<Note, Long> {

}

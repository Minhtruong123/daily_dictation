package com.example.daily_dictation.repository;

import com.example.daily_dictation.model.Transcript;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TranscriptRepository extends JpaRepository<Transcript,Integer> {
}

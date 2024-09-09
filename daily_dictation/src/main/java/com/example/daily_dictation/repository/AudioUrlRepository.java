package com.example.daily_dictation.repository;

import com.example.daily_dictation.model.AudioUrl;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AudioUrlRepository extends JpaRepository<AudioUrl, Integer> {
}

package com.example.daily_dictation.service.impl;

import com.example.daily_dictation.model.Transcript;
import com.example.daily_dictation.repository.TranscriptRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@RequiredArgsConstructor
public class TranscriptService implements com.example.daily_dictation.service.TranscriptService {
    @Autowired
    private TranscriptRepository transcriptRepository;
    @Override
    public List<Transcript> getAllTranscript() {
        return transcriptRepository.findAll();
    }
}

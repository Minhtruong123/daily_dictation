package com.example.daily_dictation.service.impl;

import com.example.daily_dictation.model.AudioUrl;
import com.example.daily_dictation.repository.AudioUrlRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@RequiredArgsConstructor
public class AudioUrlService implements com.example.daily_dictation.service.AudioUrlService {
    @Autowired
    private AudioUrlRepository audioUrlRepository;
    @Override
    public List<AudioUrl> getAllAudioUrl() {
        return audioUrlRepository.findAll();
    }

    @Override
    public AudioUrl addAudioUrl(String url) {
        AudioUrl audioUrl = new AudioUrl(url);
        return audioUrlRepository.save(audioUrl);
    }
}

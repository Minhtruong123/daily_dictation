package com.example.daily_dictation.service;

import com.example.daily_dictation.model.AudioUrl;

import java.util.List;

public interface AudioUrlService {
    List<AudioUrl> getAllAudioUrl();
    AudioUrl addAudioUrl(String url);
}

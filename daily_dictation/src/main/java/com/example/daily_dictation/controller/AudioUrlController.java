package com.example.daily_dictation.controller;

import com.example.daily_dictation.dto.request.ApiResponse;
import com.example.daily_dictation.dto.response.UserResponse;
import com.example.daily_dictation.service.impl.AudioUrlService;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/audio-url")
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE,makeFinal = true)
public class AudioUrlController {
    @Autowired
    AudioUrlService audioUrlService;

}

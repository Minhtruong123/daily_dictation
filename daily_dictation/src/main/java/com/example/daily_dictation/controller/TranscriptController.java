package com.example.daily_dictation.controller;

import com.example.daily_dictation.dto.request.ApiResponse;
import com.example.daily_dictation.dto.response.UserResponse;
import com.example.daily_dictation.model.Transcript;
import com.example.daily_dictation.service.impl.TranscriptService;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/transcript")
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE,makeFinal = true)
public class TranscriptController {
    @Autowired
    TranscriptService transcriptService;
    @GetMapping
    ApiResponse<List<Transcript>> getAllTranscript(){
        return ApiResponse.<List<Transcript>>builder()
                .result(transcriptService.getAllTranscript())
                .build();
    }
}

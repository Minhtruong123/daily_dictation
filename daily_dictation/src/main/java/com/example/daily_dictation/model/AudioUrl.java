package com.example.daily_dictation.model;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@FieldDefaults(level = AccessLevel.PRIVATE)
@Table(name = "audio_url")
public class AudioUrl {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;
    String url;

    public AudioUrl(String url) {
        this.url = url;
    }

    @ManyToOne
    @JoinColumn(referencedColumnName = "id")
    Exercise exercise;
}

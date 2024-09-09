package com.example.daily_dictation.model;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.time.LocalDateTime;
import java.util.Set;

@Builder
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
@Table(name = "exercise")
public class Exercise {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;
    String title;
    LocalDateTime createAt;
    @ManyToOne
    @JoinColumn(referencedColumnName = "id")
    Topic topic;
    @OneToOne(mappedBy = "exercise", cascade = CascadeType.ALL)
    Transcript transcript;
    @OneToMany(mappedBy = "exercise",cascade = CascadeType.ALL)
    Set<UserExercise> userExercises;
    @OneToMany(mappedBy = "exercise",cascade = CascadeType.ALL)
    Set<AudioUrl> audioUrls;
}

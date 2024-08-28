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
@Table(name = "user_exercise")
public class UserExercise {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;
    Integer attempts;
    Double score;
    LocalDateTime lastAttempted;
    @ManyToOne
    @JoinColumn(referencedColumnName = "id")
    User user;
    @ManyToOne
    @JoinColumn(referencedColumnName = "id")
    Exercise exercise;
    @OneToMany(mappedBy = "userExercise",cascade = CascadeType.ALL)
    Set<UserAnswer> userAnswers;
}

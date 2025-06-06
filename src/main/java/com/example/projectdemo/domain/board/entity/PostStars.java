package com.example.projectdemo.domain.board.entity;

import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class PostStars {

    private Integer id;
    private Integer empId;
    private Integer postId;
    private LocalDateTime createdAt;

}

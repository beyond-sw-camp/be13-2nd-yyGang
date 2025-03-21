package com.beyond3.yyGang.nutrientAnswer;

import com.beyond3.yyGang.EntityDate;
import com.beyond3.yyGang.nutrientQuestion.NQuestion;
import com.beyond3.yyGang.user.domain.User;
import jakarta.persistence.*;
import lombok.Getter;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;

@Entity
@Getter
@Table(name = "n_answer")
public class NAnswer extends EntityDate {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "answer_id")
    private Long answerId;  // 답변 ID

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "question_id")
    private NQuestion question; // 질문 ID - 외래키

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "seller_id")
    private User user; // 대답자 ID - 판매자 ID

    @Column(columnDefinition = "TEXT")
    private String aContent; // 응답 내용

}
package com.project1.quizapp.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.project1.quizapp.model.Question;

@Repository
public interface QuestionDao extends JpaRepository<Question, Integer>  {
    List<Question> findByCategory(String category);
    // @Query(value = "SELECT * FROM question q WHERE q.category =: category ORDER BY RANDOM() LIMIT :numQ", nativeQuery = true)
    // List<Question> findRandomQuestionsByCategory(String category, int numQ);
    @Query(value = "SELECT q FROM Question q WHERE q.category = :category ORDER BY RANDOM() LIMIT :numQ", nativeQuery = true)
    List<Question> findRandomQuestionsByCategory(@Param("category") String category, @Param("numQ") int numQ);

}

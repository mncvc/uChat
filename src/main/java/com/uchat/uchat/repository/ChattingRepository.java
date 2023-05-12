package com.uchat.uchat.repository;

import com.uchat.uchat.model.Chatting;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ChattingRepository extends JpaRepository<Chatting, Long> {
}

package com.uchat.uchat.repository;

import com.uchat.uchat.model.Member;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface MemberRepository extends JpaRepository<Member,Integer> {

    Optional<Member> findById(String id);
    Optional<Member> findByIdAndPassword(String id, String pwd);

}

package com.example.lookie.member.repository;

import com.example.lookie.grouprequest.domain.GroupRequest;
import com.example.lookie.member.domain.Member;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface MemberRepository extends JpaRepository<Member,Long> {

    Optional<Member> findByEmail(String Email);



}

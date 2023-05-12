package com.uchat.uchat.services;

import com.uchat.uchat.model.Member;

import java.util.List;

public interface MemberService {

    Member findMemberById(String id,String pwd);
    List<Member> findAll();

    Member findByIdAndPwd(String id, String pwd);
    Void save(Member mem);

}

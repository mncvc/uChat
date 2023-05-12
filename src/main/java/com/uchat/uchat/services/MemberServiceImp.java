package com.uchat.uchat.services;

import com.uchat.uchat.model.Member;
import com.uchat.uchat.repository.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class MemberServiceImp implements MemberService{
    @Autowired
    private MemberRepository mr;

    @Override
    public Member findMemberById(String id, String pwd) {
        // index로 로근인 하는게 좋을까 ? 아님 여기서 하나씩 하는게 좋을까?
        Member mem = mr.findById(id).orElseThrow(RuntimeException::new);

            if(!mem.getPassword().equals(pwd)){

            }


        return mem;
    }

    @Override
    public List<Member> findAll() {
        List<Member> mem = new ArrayList<>();
        mr.findAll().forEach(e->mem.add(e));


        return mem;
    }

    @Override
    public Member findByIdAndPwd(String id, String pwd) {
        Member mem = mr.findByIdAndPassword(id,pwd).orElseThrow(RuntimeException::new);

        return mem;
    }

    @Override
    public Void save(Member mem) {
         mr.save(mem);

        return null;
    }
}

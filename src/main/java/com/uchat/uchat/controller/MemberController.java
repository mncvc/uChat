package com.uchat.uchat.controller;

import com.uchat.uchat.model.Member;
import com.uchat.uchat.services.MemberService;
import org.springframework.beans.NotReadablePropertyException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/member")
public class MemberController {
    // 회원가입 , 로그인 , 회원정보 조회, 회원 탈퇴

    @Autowired
    private MemberService ms;

    @GetMapping()
    public ResponseEntity<List<Member>> getMember(){
        List<Member> mem = ms.findAll();


        return new ResponseEntity<>(mem,HttpStatus.OK);
    }


// 로그인 수정필요 보안 부족
    @GetMapping(value="/login", produces = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<Member> login(@RequestParam("userId")String id,@RequestParam("pwd")String pwd) {
       Member member = new Member();
        Member mem = ms.findByIdAndPwd(id,pwd);

        return new ResponseEntity<>(mem, HttpStatus.OK);
    };

    // 회원 가입
    // 회원정보 확인 회원 정보 계정 갯수가 3 미만이면 회원가입 가능 3개 이상이면 회원 찾기 추천.
    //
@PostMapping("/signup")
    public ResponseEntity<Void> signUp(@RequestBody Member mem){

        // 회원정보 확인


        return new ResponseEntity<>(ms.save(mem),HttpStatus.OK);
}




}

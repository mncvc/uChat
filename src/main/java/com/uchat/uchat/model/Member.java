package com.uchat.uchat.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "member")
@Entity
public class Member {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idx;
    private String id;
    private String password;
//    private String user_info_idx;


}


@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name="user")
@Entity
class User{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idx;
    private String name;
    private String eMail;
    private String phoneNumber;
    private String birth;
    private Integer haveAccount;

}

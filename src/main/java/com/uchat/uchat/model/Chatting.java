package com.uchat.uchat.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="chat_Room")
@Entity
public class Chatting implements Serializable { // 방 정보와 메시지 정보

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idx;
    private String roomName;
    private String create_at;
    private String makeId;
    private String joinId;

}
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="chat_Log")
@Entity
class Chat_Log{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idx;
    private String chatRoom;
    private String id;
    private String content;
    private String regdate;

}
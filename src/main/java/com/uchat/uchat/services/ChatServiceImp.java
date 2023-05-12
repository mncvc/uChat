package com.uchat.uchat.services;

import com.uchat.uchat.model.Chatting;
import com.uchat.uchat.repository.ChattingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ChatServiceImp implements ChatService{

    @Autowired
    private ChattingRepository cr;


    @Override
    public List<Chatting> findAll() {


        return null;
    }
}

package com.showproject.hospital.service;

import com.showproject.hospital.pojo.Message;

import java.util.List;

public interface MessageService {
    int insertMessage(Message message);
    List<Message> getMessagesByReceiver(Integer receiverId, String receiverRole);
    List<Message> getSystemMessages();
    int markAsRead(Integer msgId);
    int deleteMessage(Integer msgId);
    int adminDeleteMessage(Integer msgId);
}

package com.showproject.hospital.service.serviceImpl;

import com.showproject.hospital.mapper.MessageMapper;
import com.showproject.hospital.pojo.Message;
import com.showproject.hospital.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MessageServiceImpl implements MessageService {
    @Autowired
    private MessageMapper messageMapper;

    @Override
    public int insertMessage(Message message) {
        return messageMapper.insertMessage(message);
    }

    @Override
    public List<Message> getMessagesByReceiver(Integer receiverId, String receiverRole) {
        return messageMapper.getMessagesByReceiver(receiverId, receiverRole);
    }

    @Override
    public List<Message> getSystemMessages() {
        return messageMapper.getSystemMessages();
    }

    @Override
    public int markAsRead(Integer msgId) {
        return messageMapper.markAsRead(msgId);
    }

    @Override
    public int deleteMessage(Integer msgId) {
        return messageMapper.deleteMessage(msgId);
    }

    @Override
    public int adminDeleteMessage(Integer msgId) {
        return messageMapper.adminDeleteMessage(msgId);
    }
}

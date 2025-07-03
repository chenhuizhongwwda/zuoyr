package com.showproject.hospital.mapper;

import com.showproject.hospital.pojo.Message;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface MessageMapper {
    // 管理员发布消息
    int insertMessage(Message message);

    // 医生/管理员获取消息列表
    List<Message> getMessagesByReceiver(@Param("receiverId") Integer receiverId, @Param("receiverRole") String receiverRole);

    // 获取系统公告
    List<Message> getSystemMessages();

    // 标记已读
    int markAsRead(@Param("msgId") Integer msgId);

    // 删除消息
    int deleteMessage(@Param("msgId") Integer msgId);

    // 管理员删除公告
    int adminDeleteMessage(@Param("msgId") Integer msgId);
}


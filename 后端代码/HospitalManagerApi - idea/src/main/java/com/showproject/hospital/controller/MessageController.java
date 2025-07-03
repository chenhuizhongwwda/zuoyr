package com.showproject.hospital.controller;

import com.showproject.hospital.pojo.Message;
import com.showproject.hospital.service.MessageService;
import com.showproject.hospital.utils.ResponseData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/message")
public class MessageController {
    @Autowired
    private MessageService messageService;

    // 管理员发布消息
    @PostMapping("/publish")
    public ResponseData publishMessage(@RequestBody Message message) {
        message.setMsgTime(new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new java.util.Date()));
        int result = messageService.insertMessage(message);
        return result > 0 ? ResponseData.success("发布成功") : ResponseData.fail("发布失败");
    }

    // 医生/管理员获取消息
    @GetMapping("/list")
    public ResponseData getMessages(@RequestParam Integer receiverId, @RequestParam String receiverRole) {
        List<Message> messages = messageService.getMessagesByReceiver(receiverId, receiverRole);
        return ResponseData.success("查询成功", messages);
    }

    // 获取系统公告
    @GetMapping("/system")
    public ResponseData getSystemMessages() {
        List<Message> messages = messageService.getSystemMessages();
        return ResponseData.success("查询成功", messages);
    }

    // 标记已读
    @PostMapping("/read/{msgId}")
    public ResponseData markAsRead(@PathVariable Integer msgId) {
        int result = messageService.markAsRead(msgId);
        return result > 0 ? ResponseData.success("标记已读") : ResponseData.fail("操作失败");
    }

    // 删除消息
    @DeleteMapping("/delete/{msgId}")
    public ResponseData deleteMessage(@PathVariable Integer msgId) {
        int result = messageService.deleteMessage(msgId);
        return result > 0 ? ResponseData.success("删除成功") : ResponseData.fail("删除失败");
    }

    // 管理员删除公告
    @DeleteMapping("/admin/delete/{msgId}")
    public ResponseData adminDeleteMessage(@PathVariable Integer msgId) {
        int result = messageService.adminDeleteMessage(msgId);
        return result > 0 ? ResponseData.success("删除成功") : ResponseData.fail("删除失败");
    }
}




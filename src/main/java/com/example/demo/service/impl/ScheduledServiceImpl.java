package com.example.demo.service.impl;

import com.example.demo.model.EmailModel;
import com.example.demo.service.MailService;
import com.example.demo.service.ScheduledService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;


public class ScheduledServiceImpl implements ScheduledService {

    @Autowired
    MailService mailService;

    @Scheduled(cron = "0/1 * * * * ? ") // 시간당 1회 실행
    public void sendSimpleMail() {

        mailService.sendSimpleMail(EmailModel.builder()
                .email("your_mail@naver.com")
                .subject("test")
                .content("시간당 1회 스케줄 메일 입니다.(테스트)!")
                .build());
    }
}

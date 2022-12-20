package com.example.demo;

import com.example.demo.service.MailService;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootEmailApplicationTests {

    @Autowired
    MailService mailService;
//	@Test
//	public void contextLoads() {
//		EmailModel emailModel = new EmailModel();
//		emailModel.setEmail("your_mail@naver.com");
//		emailModel.setSubject("test 제목입니다.");
//		emailModel.setContent("메일에 보낼 실제 내용입니다.");
//		mailService.sendSimpleMail(emailModel);
//	}

//	@Test
//	public void sendInlineResourceMailTest() {
//		EmailModel emailModel = new EmailModel();
//		emailModel.setEmail("your_mail@naver.com");
//		emailModel.setSubject("test 제목입니다.");
//		emailModel.setContent("메일에 보낼 실제 내용입니다.");
//		emailModel.setResourceName("나의 이미지");
//		emailModel.setResourcePath("upload/image.jpg");
//		mailService.sendInlineResourceMail(emailModel);
//
//	}

//	@Test
//	public void sendHtmlMailTest() {
//		EmailModel emailModel = new EmailModel();
//		emailModel.setEmail("your_mail@naver.com");
//		emailModel.setSubject("test 제목입니다.");
//		emailModel.setContent("<html><body><h1>메일에 보낼 실제 내용입니다.</h1></body></html>");
//		mailService.sendHtmlMail(emailModel);
//	}

//	@Test
//	public void sendAttachmentMailTest() {
//		EmailModel emailModel = new EmailModel();
//		emailModel.setEmail("your_mail@naver.com");
//		emailModel.setSubject("test 제목입니다.");
//		emailModel.setContent("<html><body><h1>메일에 보낼 실제 내용입니다.</h1></body></html>");
//		emailModel.setAttachFilePath("upload/image.jpg");
//		mailService.sendAttachmentMail(emailModel);
//	}

}

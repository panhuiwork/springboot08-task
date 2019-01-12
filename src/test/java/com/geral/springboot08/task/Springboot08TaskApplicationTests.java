package com.geral.springboot08.task;

import java.io.File;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Springboot08TaskApplicationTests {

	@Autowired
	JavaMailSenderImpl mailSender;
	
	/**
	 * 简单的邮件
	 */
	@Test
	public void contextLoads() {
		SimpleMailMessage mailMessage=new SimpleMailMessage();
		mailMessage.setSubject("通知-今晚。。");//标题
		mailMessage.setText("测试内容。。。。");//内容
		mailMessage.setTo("917345325@qq.com");//接收人
		mailMessage.setFrom("717006413@qq.com");//发送人
		mailSender.send(mailMessage);
	}
	
	
	/**
	 * 复杂的邮件
	 * @throws MessagingException 
	 */
	@Test
	public void sendmostmsg() throws MessagingException 
	{
		//创建一个复杂的消息邮件：
		MimeMessage mimeMessage= mailSender.createMimeMessage();
		MimeMessageHelper helper=new MimeMessageHelper(mimeMessage,true);//上传附件
		helper.setSubject("!!通知-今晚。。");//标题
		//第二个参数设置为true就可以读取html标签
		helper.setText("<h1>测试内容。。。</h1><font color='red'>红色哈哈哈哈哈哈哈哈哈</font><br/><div style='color:red;font-weight:bold;'>这段数据不知道有像是每页偶</div>",true);//内容
		helper.setTo("917345325@qq.com");//接收人
		helper.setFrom("717006413@qq.com");//发送人
		//上传文件
		helper.addAttachment("1.jpg", new File("E:\\java\\myeclipsespring项目\\shank7server\\flash\\闪客快打7客服等问题\\logo.jpg"));
		helper.addAttachment("2.jpg",  new File("E:\\\\java\\\\myeclipsespring项目\\\\shank7server\\\\flash\\\\闪客快打7客服等问题\\\\图片\\\\QQ图片20181226163410.png"));
		mailSender.send(mimeMessage);
	}
		
	

}


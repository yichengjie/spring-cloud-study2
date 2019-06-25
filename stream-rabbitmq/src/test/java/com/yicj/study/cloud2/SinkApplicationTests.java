package com.yicj.study.cloud2;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.test.context.junit4.SpringRunner;

import com.yicj.study.cloud2.service.SinkSender;

@RunWith(SpringRunner.class)
@EnableBinding(value = {SinkSender.class})
@SpringBootTest(classes=SinkApplication.class)
public class SinkApplicationTests {
	
	@Autowired
	private SinkSender sinkSender;

	@Test
	public void sindMessage(){
	   sinkSender.output().send(MessageBuilder.withPayload("啥").build());
	}
}

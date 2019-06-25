package com.yicj.study.cloud2;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@SpringBootTest(classes=SinkSenderApplication.class)
@EnableBinding(value = {SinkSenderApplicationTests.SinkSender.class})
public class SinkSenderApplicationTests {
	@Autowired
	private SinkSender sinkSender;

	@Test
	public void sindMessage(){
	   sinkSender.output().send(MessageBuilder
			.withPayload("produce a message ："
			   		+ "http://blog.didispace.com")
			.build());
	}

	public interface SinkSender {
		String OUTPUT = "input";
		@Output(SinkSender.OUTPUT)
		MessageChannel output();
	}
}

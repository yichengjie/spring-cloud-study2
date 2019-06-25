package com.yicj.study.cloud2.service;

import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;


//这里不需要@Component
public interface SinkSender {
	String OUTPUT = "input";
	
	@Output(SinkSender.OUTPUT)
	MessageChannel output();
}
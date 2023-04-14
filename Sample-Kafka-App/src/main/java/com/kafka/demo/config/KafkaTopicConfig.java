package com.kafka.demo.config;

import com.kafka.demo.constants.AppConstants;
import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaTopicConfig {

//    @Bean
//    public NewTopic firstKafkaTopic(){
//        return TopicBuilder.name(AppConstants.TOPIC_NAME)
//                .build();
//    }
}


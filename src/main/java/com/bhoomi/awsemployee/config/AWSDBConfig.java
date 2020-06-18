package com.bhoomi.awsemployee.config;

import org.springframework.cloud.aws.jdbc.config.annotation.EnableRdsInstance;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration
@ImportResource("classpath:/aws-config.xml")
@EnableRdsInstance(dbInstanceIdentifier = "", 
				   password = "", readReplicaSupport=true)
public class AWSDBConfig {

}
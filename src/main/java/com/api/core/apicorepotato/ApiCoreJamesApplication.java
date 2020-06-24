package com.api.core.apicorepotato;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class ApiCoreJamesApplication  {

/*
	static final String topicExchangeName = "api-core-exchange";

	static final String queueName = "api-core";
*/

	public static void main(String[] args) throws InterruptedException {
		SpringApplication.run(ApiCoreJamesApplication.class, args);
	}


/*	@Bean
	Queue queue() {
		return new Queue(queueName, false);
	}

	@Bean
    TopicExchange exchange() {
		return new TopicExchange(topicExchangeName);
	}

	@Bean
    Binding binding(Queue queue, TopicExchange exchange) {
        return BindingBuilder.bind(queue).to(exchange).with("foo.bar.#");
    }

    @Bean
    SimpleMessageListenerContainer container(ConnectionFactory connectionFactory,
                                             MessageListenerAdapter listenerAdapter) {
        SimpleMessageListenerContainer container = new SimpleMessageListenerContainer();
        container.setConnectionFactory(connectionFactory);
        container.setQueueNames(queueName);
        container.setMessageListener(listenerAdapter);
        return container;
    }

	@Bean
	MessageListenerAdapter listenerAdapter(Receiver receiver) {
		return new MessageListenerAdapter(receiver, "receiveMessage");
	}*/
}



package com.example.api_gateway.filter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;

@Configuration
public class LogFilter implements GlobalFilter {

    private static final Logger logger =
            LoggerFactory.getLogger(LogFilter.class);

    @Override
    public Mono<Void> filter(
            ServerWebExchange exchange,
            GatewayFilterChain chain) {

        logger.info(
                "Incoming Request : {}",
                exchange.getRequest().getURI());

        return chain.filter(exchange);
    }
}
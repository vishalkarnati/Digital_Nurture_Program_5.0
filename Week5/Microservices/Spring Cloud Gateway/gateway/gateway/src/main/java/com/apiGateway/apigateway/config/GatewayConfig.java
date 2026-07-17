package com.apiGateway.apigateway.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.function.RouterFunction;
import org.springframework.web.servlet.function.ServerResponse;

import static org.springframework.cloud.gateway.server.mvc.filter.BeforeFilterFunctions.stripPrefix;
import static org.springframework.cloud.gateway.server.mvc.filter.BeforeFilterFunctions.uri;
import static org.springframework.cloud.gateway.server.mvc.handler.GatewayRouterFunctions.route;
import static org.springframework.cloud.gateway.server.mvc.handler.HandlerFunctions.http;

@Configuration
public class GatewayConfig {

    @Bean
    RouterFunction<ServerResponse> gatewayRoutes() {

        return route("microservice1")
                .GET("/serviceA/**", http())
                .before(uri("http://localhost:8081"))
                .before(stripPrefix(1))

                .build()

                .and(route("service-b")
                        .GET("/serviceB/**", http())
                        .before(uri("http://localhost:8082"))
                        .before(stripPrefix(1))
                        .build());
    }
}
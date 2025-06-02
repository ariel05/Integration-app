package com.arnat.microflow;

import java.sql.SQLException;

import org.h2.tools.Server;
import org.springframework.context.annotation.Configuration;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Configuration
public class H2ServerConfig {


    private Server tcpServer;

    @PostConstruct
    public void startTcpServer() throws SQLException {
        this.tcpServer = Server.createTcpServer("-tcp", "-tcpAllowOthers", "-tcpPort", "9092").start();
        System.out.println("H2 TCP server started at port 9092");
    }

    @PreDestroy
    public void stopTcpServer() {
        if (tcpServer != null) {
            tcpServer.stop();
        }
    }
}

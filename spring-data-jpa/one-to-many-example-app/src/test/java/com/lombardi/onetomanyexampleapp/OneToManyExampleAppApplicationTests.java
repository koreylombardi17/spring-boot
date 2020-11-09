package com.lombardi.onetomanyexampleapp;

import com.lombardi.onetomanyexampleapp.beans.HighTop;
import com.lombardi.onetomanyexampleapp.beans.Server;
import com.lombardi.onetomanyexampleapp.repositories.ServerRepository;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.junit.Test;

@RunWith(SpringRunner.class)
@SpringBootTest
public class OneToManyExampleAppApplicationTests {

    @Autowired
    ServerRepository serverRepository;

    @Test
    public void populateDatabase() {
        Server server1 = new Server("Connor");
        Server server2 = new Server("Kyle");
        Server server3 = new Server("Jamie");

        HighTop highTop1 = new HighTop(6);
        HighTop highTop2 = new HighTop(4);
        HighTop highTop3 = new HighTop(5);

        HighTop highTop4 = new HighTop(4);
        HighTop highTop5 = new HighTop(4);
        HighTop highTop6 = new HighTop(5);
        HighTop highTop7 = new HighTop(7);

        HighTop highTop8 = new HighTop(8);
        HighTop highTop9 = new HighTop(2);
        HighTop highTop10 = new HighTop(5);

        highTop1.setServer(server1);
        highTop2.setServer(server1);
        highTop3.setServer(server1);

        highTop4.setServer(server2);
        highTop5.setServer(server2);
        highTop6.setServer(server2);
        highTop7.setServer(server2);

        highTop8.setServer(server3);
        highTop9.setServer(server3);
        highTop10.setServer(server3);

        server1.addHighTop(highTop1);
        server1.addHighTop(highTop2);
        server1.addHighTop(highTop3);

        server2.addHighTop(highTop4);
        server2.addHighTop(highTop5);
        server2.addHighTop(highTop6);
        server2.addHighTop(highTop7);

        server3.addHighTop(highTop8);
        server3.addHighTop(highTop9);
        server3.addHighTop(highTop10);

        serverRepository.save(server1);
        serverRepository.save(server2);
        serverRepository.save(server3);
    }

    @Test
    public void printServerAndHighTops() {
        int serverCounter = 1;
        int highTopCounter = 1;
        Iterable servers = serverRepository.findAll();

        for (Object serverObj : servers) {
            Server server = (Server)serverObj;
            System.out.println("=================================");
            System.out.println("Server " + serverCounter++ + ": ");
            System.out.println("Server name: " + server.getName());
            System.out.println("Server id: " + server.getServerID());
            System.out.println("Number of hightops: " + server.getHighTops().size());
            System.out.println("=================================");

            for(HighTop highTop : server.getHighTops()) {
                System.out.println("Table " + highTopCounter++ + ": ");
                System.out.println("Hightop id: " + highTop.gethighTopID());
                System.out.println("Total guest: " + highTop.getNumberGuest());
                System.out.println("Server: " + highTop.getServer().getName() + "\n");
            }
            highTopCounter = 1;
        }
    }
}

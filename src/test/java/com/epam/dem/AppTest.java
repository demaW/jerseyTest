package com.epam.dem;


import org.junit.Test;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Invocation;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;


public class AppTest{


    @Test
    public void jerseyTest(){
        String repspString = ClientBuilder.newClient().target("http://api.konvert.me").path("ip-country/216.58.214.238").request().get(String.class);
        System.out.println(repspString);
    }
}

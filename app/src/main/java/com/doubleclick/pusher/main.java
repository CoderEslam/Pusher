package com.doubleclick.pusher;

import com.pusher.rest.Pusher;

import java.util.Collections;

/**
 * Created By Eslam Ghazy on 1/17/2023
 */
public class main {

    public static void run() {
        Pusher pusher = new Pusher("1539856", "7a60d0e3a5ebf6d57a23", "3dadbbe8dc9e95b0bd9a");
        pusher.setCluster("ap1");
        pusher.setEncrypted(true);
        pusher.trigger("my-channel", "my-event", Collections.singletonMap("message", "hello world"));
    }


}

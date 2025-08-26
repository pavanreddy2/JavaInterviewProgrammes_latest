package com.ar.java8;

import java.util.*;
import java.util.stream.Collectors;

public class OccuredIPAddress {
    public static void main(String[] args) {
        String[] ipAddress = {
                "64 bytes from 128.113.1.5: ttl=333 time=2 ms",
                "64 bytes from 128.116.1.5: ttl=555 time=3 ms",
                "64 bytes from 128.114.1.5: ttl=123 time=2 ms",
                "64 bytes from 128.116.1.5: ttl=999 time=2 ms"
        };

        List<String> expectedIps = new ArrayList<>();
        for (String line: ipAddress) {
           String[] parts =  line.split("from ");
           if (parts.length > 1) {
               String[] ipParts = parts[1].split(":");
               expectedIps.add(ipParts[0]);
           }
        }
        System.out.println("Extracted IPs:");
        for (String ip : expectedIps) {
            System.out.println(ip);
        }

        System.out.println("*******************");
       String mostCommonIp = Arrays.stream(ipAddress)
                .map(line -> {
                  String[] parts = line.split("from ");
                  if (parts.length > 1) {
                      String[] ipParts = parts[1].split(":");
                      return ipParts[0];
                  }
                  return null;
                })
                .filter(Objects::nonNull)
                .collect(Collectors.groupingBy(ip -> ip, Collectors.counting()))
                .entrySet()
                .stream()
                //.max(Map.Entry.comparingByValue())
                .filter(ip -> ip.getValue() > 1)
                .map(Map.Entry::getKey)
               .findFirst()
                .orElse("NO IP found");

        System.out.println(mostCommonIp);
    }
}

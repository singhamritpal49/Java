package com.amritpalsingh;

public class Browser {
    public void navigate(String address) {
      String ip = findIpAddress(address);
      String html = sendHTTPRequest(ip);
        System.out.println(html);
    }

    private String sendHTTPRequest(String ip) {
        return "<html> HELLO </html>";
    }

    private String findIpAddress(String address) {
            return "127.2.3.4";
    };


}

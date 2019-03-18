package com.example.smsDemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Service {

    private final TwilioSmsSender twilioSmsSender;

    @Autowired
    public Service(@Qualifier("twilio") TwilioSmsSender twilioSmsSender){
        this.twilioSmsSender = twilioSmsSender;
    }

    public void sendSms(SmsRequest smsRequest){
        twilioSmsSender.sendSms(smsRequest);
    }
}

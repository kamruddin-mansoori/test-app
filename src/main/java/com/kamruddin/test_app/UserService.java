package com.kamruddin.test_app;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    private static final Logger logger = LoggerFactory.getLogger(UserService.class);
    public boolean sendMail(User user) {
        // Dummy implementation to send mail
        logger.info("Sending mail to: {}", user.getEmail());
        return true;
    }
}

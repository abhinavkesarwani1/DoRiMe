package com.example.geektrust.service;

import com.example.geektrust.model.Subscription;
import com.example.geektrust.model.TopUp;
import com.example.geektrust.model.User;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;

public interface ICommandService {
    void execute(Map<String, Subscription> userSubscriptions, List<String> parameters,
                 Map<String, LocalDate> userSubscriptionDate, User user, Map<String, TopUp> userTopUp) throws Exception;
}

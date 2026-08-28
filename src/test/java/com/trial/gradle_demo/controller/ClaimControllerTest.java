package com.trial.gradle_demo.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.webmvc.test.autoconfigure.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(ClaimController.class)
public class ClaimControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    void getClaimDetails_shouldReturnClaim() throws Exception {

        mockMvc.perform(get("/claim/get/1"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.claimId").value(1))
                .andExpect(jsonPath("$.claimType").value("CANCER"))
                .andExpect(jsonPath("$.customerId").value(12345));
    }
}

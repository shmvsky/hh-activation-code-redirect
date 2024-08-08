package ru.shmvsky.hhactivationcoderedirect;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ActivationController {

    @PostMapping("/activate")
    public String getAuthToken(@RequestParam(name = "code") String activationCode) {
        return activationCode;
    }

    @GetMapping("/ping")
    public String ping() {
        return "pong";
    }

}

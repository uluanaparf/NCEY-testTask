package com.testtask.ynp.controller;

import com.testtask.ynp.dto.UnpInfoDto;
import com.testtask.ynp.service.UnpInfoService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/info")
public class UnpInfoController {

    private final UnpInfoService unpInfoService;

    public UnpInfoController(UnpInfoService unpInfoService) {
        this.unpInfoService = unpInfoService;
    }

    @GetMapping
    public ResponseEntity<UnpInfoDto> getInfo(@RequestParam String unp) {
        UnpInfoDto dto = unpInfoService.getInfoByUnp(unp);
        return ResponseEntity.ok(dto);
    }
}


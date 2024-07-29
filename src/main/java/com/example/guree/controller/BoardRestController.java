package com.example.guree.controller;

import com.example.guree.service.BoardService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class BoardRestController {
    @Autowired
    private BoardService bSer;





}

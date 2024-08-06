package com.github.xiaoymin.boot3.web;

import com.github.xiaoymin.boot3.model.User;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author <a href="xiaoymin@foxmail.com">xiaoymin@foxmail.com</a>
 * 2023/8/6 10:44
 * @since knife4j-spring-boot3-demo
 */
@Tag(name = "Accept")
@RequestMapping(value = "/accept",produces = "application/vnd.dim.s.v1+json")
@RestController
public class AcceptController {

    @Operation(summary = "测试Accept",description = "GitHub:https://github.com/xiaoymin/knife4j/issues/597")
    @GetMapping("/get")
    public ResponseEntity<User> get(User user){
        return ResponseEntity.ok(user);
    }
}

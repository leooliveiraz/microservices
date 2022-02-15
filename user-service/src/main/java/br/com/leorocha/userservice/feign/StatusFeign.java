package br.com.leorocha.userservice.feign;

import br.com.leorocha.userservice.dto.StatusDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name = "status-service")
public interface StatusFeign {
    @GetMapping(value = "/status/user/{userId}")
    StatusDTO findByUserId(@PathVariable Long userId);

    @PostMapping(value = "/status")
    StatusDTO save(StatusDTO dto);
}

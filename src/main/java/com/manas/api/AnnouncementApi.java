package com.manas.api;

import com.manas.dto.request.AnnouncementRequest;
import com.manas.dto.response.SimpleResponse;
import com.manas.service.AnnouncementService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/announcements")
public class AnnouncementApi {
    private final AnnouncementService announcementService;

    public AnnouncementApi(AnnouncementService announcementService) {
        this.announcementService = announcementService;
    }

    @PostMapping
    public SimpleResponse save(@RequestBody AnnouncementRequest announcementRequest){
        return announcementService.save(announcementRequest);
    }
}

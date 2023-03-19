package com.manas.service;

import com.manas.dto.request.AnnouncementRequest;
import com.manas.dto.response.SimpleResponse;

public interface AnnouncementService {

    SimpleResponse save(AnnouncementRequest announcementRequest);
}
